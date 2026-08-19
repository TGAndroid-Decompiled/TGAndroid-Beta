package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextRightIconCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public class UniversalAdapter extends AdapterWithDiffUtils {
    private boolean allowReorder;
    private boolean applyBackground;
    private BaseChartView.SharedUiComponents chartSharedUI;
    private final int classGuid;
    private final Context context;
    public final int currentAccount;
    private Section currentReorderSection;
    private Section currentWhiteSection;
    private final boolean dialog;
    protected Utilities.Callback2 fillItems;
    private final ArrayList items;
    public int itemsOffset;
    protected final RecyclerListView listView;
    private final ArrayList oldItems;
    private Utilities.Callback2 onReordered;
    private boolean orderChanged;
    private int orderChangedId;
    private final ArrayList reorderSections;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList whiteSections;

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        this(recyclerListView, context, i, i2, false, callback2, resourcesProvider);
    }

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Theme.ResourcesProvider resourcesProvider) {
        this.applyBackground = true;
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.itemsOffset = 0;
        this.whiteSections = new ArrayList();
        this.reorderSections = new ArrayList();
        this.listView = recyclerListView;
        this.context = context;
        this.currentAccount = i;
        this.classGuid = i2;
        this.dialog = z;
        this.fillItems = callback2;
        this.resourcesProvider = resourcesProvider;
        update(false);
    }

    public void setApplyBackground(boolean z) {
        this.applyBackground = z;
    }

    private static class Section {
        public int end;
        public int start;

        private Section() {
        }

        public boolean contains(int i) {
            return i >= this.start && i <= this.end;
        }
    }

    public void whiteSectionStart() {
        Section section = new Section();
        this.currentWhiteSection = section;
        section.start = this.itemsOffset + this.items.size();
        Section section2 = this.currentWhiteSection;
        section2.end = -1;
        this.whiteSections.add(section2);
    }

    public void whiteSectionEnd() {
        Section section = this.currentWhiteSection;
        if (section != null) {
            section.end = Math.max(0, (this.itemsOffset + this.items.size()) - 1);
            Section section2 = this.currentWhiteSection;
            if (section2.start == section2.end) {
                this.whiteSections.remove(section2);
            }
            this.currentWhiteSection = null;
        }
    }

    public int reorderSectionStart() {
        Section section = new Section();
        this.currentReorderSection = section;
        section.start = this.items.size();
        Section section2 = this.currentReorderSection;
        section2.end = -1;
        this.reorderSections.add(section2);
        return this.reorderSections.size() - 1;
    }

    public void reorderSectionEnd() {
        Section section = this.currentReorderSection;
        if (section != null) {
            section.end = Math.max(0, this.items.size() - 1);
        }
    }

    private void updateReorderSections() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null) {
            return;
        }
        ArrayList arrayList = recyclerListView.forcedSections;
        if (arrayList == null) {
            recyclerListView.forcedSections = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.whiteSections;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Section section = (Section) obj;
            this.listView.forcedSections.add(Long.valueOf(AndroidUtilities.pack(section.start, section.end)));
        }
    }

    public boolean isReorderItem(int i) {
        return getReorderSectionId(i) >= 0;
    }

    public int getReorderSectionId(int i) {
        for (int i2 = 0; i2 < this.reorderSections.size(); i2++) {
            if (((Section) this.reorderSections.get(i2)).contains(i)) {
                return i2;
            }
        }
        return -1;
    }

    public void swapElements(int i, int i2) {
        int i3;
        if (this.onReordered == null) {
            return;
        }
        int reorderSectionId = getReorderSectionId(i);
        int reorderSectionId2 = getReorderSectionId(i2);
        if (reorderSectionId < 0 || reorderSectionId != reorderSectionId2) {
            return;
        }
        boolean zHasDivider = hasDivider(i);
        boolean zHasDivider2 = hasDivider(i2);
        this.items.add(i2, (UItem) this.items.remove(i));
        notifyItemMoved(i, i2);
        if (hasDivider(i2) != zHasDivider) {
            notifyItemChanged(i2, 3);
        }
        if (hasDivider(i) != zHasDivider2) {
            notifyItemChanged(i, 3);
        }
        if (this.orderChanged && (i3 = this.orderChangedId) != reorderSectionId) {
            callReorder(i3);
        }
        this.orderChanged = true;
        this.orderChangedId = reorderSectionId;
    }

    private void callReorder(int i) {
        if (i < 0 || i >= this.reorderSections.size()) {
            return;
        }
        Section section = (Section) this.reorderSections.get(i);
        this.onReordered.run(Integer.valueOf(i), new ArrayList(this.items.subList(section.start, section.end + 1)));
        this.orderChanged = false;
    }

    public void reorderDone() {
        if (this.orderChanged) {
            callReorder(this.orderChangedId);
        }
    }

    public void listenReorder(Utilities.Callback2 callback2) {
        this.onReordered = callback2;
    }

    public void updateReorder(boolean z) {
        this.allowReorder = z;
    }

    public void drawWhiteSections(Canvas canvas, RecyclerListView recyclerListView) {
        for (int i = 0; i < this.whiteSections.size(); i++) {
            Section section = (Section) this.whiteSections.get(i);
            int i2 = section.end;
            if (i2 >= 0) {
                recyclerListView.drawSectionBackground(canvas, section.start, i2, getThemedColor(this.dialog ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite));
            }
        }
    }

    public void update(final boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null && recyclerListView.isComputingLayout()) {
            this.listView.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateInternal(z);
                }
            });
        } else {
            updateInternal(z);
        }
    }

    public void updateInternal(boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || !recyclerListView.isComputingLayout()) {
            this.oldItems.clear();
            this.oldItems.addAll(this.items);
            this.items.clear();
            this.currentWhiteSection = null;
            this.whiteSections.clear();
            this.reorderSections.clear();
            Utilities.Callback2 callback2 = this.fillItems;
            if (callback2 != null) {
                callback2.run(this.items, this);
                updateReorderSections();
                if (z) {
                    setItems(this.oldItems, this.items);
                } else {
                    notifyDataSetChanged();
                }
            }
        }
    }

    public void updateWithoutNotify() {
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.whiteSections.clear();
        this.reorderSections.clear();
        Utilities.Callback2 callback2 = this.fillItems;
        if (callback2 != null) {
            callback2.run(this.items, this);
        }
        updateReorderSections();
    }

    public boolean shouldApplyBackground(int i) {
        if (!this.applyBackground) {
            return false;
        }
        if (i >= UItem.factoryViewTypeStartsWith) {
            return true;
        }
        switch (i) {
            case -3:
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return true;
            case -2:
            case -1:
            case 2:
            case 7:
            case 8:
            case 26:
            case 31:
            case 38:
            default:
                return false;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HeaderCell headerCell;
        View universalChartCell;
        View notificationsCheckCell;
        int i2;
        View headerCell2;
        boolean z = this.dialog;
        int i3 = z ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite;
        if (i >= UItem.factoryViewTypeStartsWith) {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
            if (uItemFactoryFindFactory != null) {
                universalChartCell = uItemFactoryFindFactory.createView(this.context, this.listView, this.currentAccount, this.classGuid, this.resourcesProvider);
            } else {
                universalChartCell = new View(this.context);
            }
        } else {
            switch (i) {
                case -4:
                case -1:
                    FrameLayout frameLayout = new FrameLayout(this.context) {
                        @Override
                        protected void onMeasure(int i4, int i5) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824), i5);
                        }
                    };
                    universalChartCell = frameLayout;
                    if (i == -4) {
                        frameLayout.setTag(-33024);
                        universalChartCell = frameLayout;
                    }
                    break;
                case -3:
                    universalChartCell = new FullscreenCustomFrameLayout(this.context);
                    break;
                case -2:
                    universalChartCell = new FrameLayout(this.context) {
                        @Override
                        protected void onMeasure(int i4, int i5) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824);
                            measureChildren(iMakeMeasureSpec, i5);
                            int iMax = 0;
                            for (int i6 = 0; i6 < getChildCount(); i6++) {
                                iMax = Math.max(iMax, getChildAt(i6).getMeasuredHeight());
                            }
                            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
                        }
                    };
                    break;
                case 0:
                    if (z) {
                        headerCell = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, this.resourcesProvider);
                        universalChartCell = headerCell;
                    } else {
                        universalChartCell = new HeaderCell(this.context, this.resourcesProvider);
                    }
                    break;
                case 1:
                    headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, false, this.resourcesProvider);
                    universalChartCell = headerCell2;
                    break;
                case 2:
                    universalChartCell = new TopViewCell(this.context, this.resourcesProvider);
                    break;
                case 3:
                    universalChartCell = new TextCell(this.context, this.resourcesProvider);
                    break;
                case 4:
                case 9:
                    TextCheckCell textCheckCell = new TextCheckCell(this.context, this.resourcesProvider);
                    headerCell2 = textCheckCell;
                    if (i == 9) {
                        textCheckCell.setDrawCheckRipple(true);
                        textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                        textCheckCell.setTypeface(AndroidUtilities.bold());
                        textCheckCell.setHeight(56);
                        headerCell2 = textCheckCell;
                    }
                    universalChartCell = headerCell2;
                    break;
                case 5:
                case 6:
                    notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                    universalChartCell = notificationsCheckCell;
                    break;
                case 7:
                case 8:
                default:
                    universalChartCell = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                    break;
                case 10:
                    universalChartCell = new DialogRadioCell(this.context);
                    break;
                case 11:
                case 12:
                    UserCell userCell = new UserCell(this.context, 6, i == 12 ? 3 : 0, false);
                    userCell.setSelfAsSavedMessages(true);
                    universalChartCell = userCell;
                    break;
                case 13:
                    headerCell2 = new UserCell(this.context, 6, 0, false, true);
                    universalChartCell = headerCell2;
                    break;
                case 14:
                    universalChartCell = new SlideChooseView(this.context, this.resourcesProvider);
                    break;
                case 15:
                    universalChartCell = new SlideIntChooseView(this.context, this.resourcesProvider);
                    break;
                case 16:
                    universalChartCell = new QuickRepliesActivity.QuickReplyView(this.context, this.onReordered != null, this.resourcesProvider);
                    break;
                case 17:
                    universalChartCell = new QuickRepliesActivity.LargeQuickReplyView(this.context, this.resourcesProvider);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.chartSharedUI == null) {
                        this.chartSharedUI = new BaseChartView.SharedUiComponents();
                    }
                    universalChartCell = new StatisticActivity.UniversalChartCell(this.context, this.currentAccount, i - 18, this.chartSharedUI, this.classGuid);
                    break;
                case 24:
                    universalChartCell = new ChannelMonetizationLayout.ProceedOverviewCell(this.context, this.resourcesProvider);
                    break;
                case 25:
                    universalChartCell = new ChannelMonetizationLayout.TransactionCell(this.context, this.resourcesProvider);
                    break;
                case 26:
                    headerCell = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 20, 0, false, this.resourcesProvider);
                    headerCell.setTextSize(20.0f);
                    universalChartCell = headerCell;
                    break;
                case 27:
                    StoryPrivacyBottomSheet.UserCell userCell2 = new StoryPrivacyBottomSheet.UserCell(this.context, this.resourcesProvider);
                    userCell2.setIsSendAs(false, false);
                    universalChartCell = userCell2;
                    break;
                case 28:
                    universalChartCell = new SpaceView(this.context);
                    break;
                case 29:
                    universalChartCell = new BusinessLinksActivity.BusinessLinkView(this.context, this.resourcesProvider);
                    break;
                case 30:
                    universalChartCell = new TextRightIconCell(this.context, this.resourcesProvider);
                    break;
                case 31:
                    RecyclerListView recyclerListView = this.listView;
                    if (recyclerListView != null && recyclerListView.hasSections()) {
                        GraySectionCell graySectionCell = new GraySectionCell(this.context, 28, this.resourcesProvider);
                        graySectionCell.setNoBackground(true);
                        universalChartCell = graySectionCell;
                    } else {
                        universalChartCell = new GraySectionCell(this.context, this.resourcesProvider);
                    }
                    break;
                case 32:
                    universalChartCell = new ProfileSearchCell(this.context);
                    break;
                case 33:
                    universalChartCell = new DialogCell(null, this.context, false, true);
                    break;
                case 34:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.context, this.resourcesProvider);
                    flickerLoadingView.setIsSingleCell(true);
                    universalChartCell = flickerLoadingView;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i == 35) {
                        i2 = 4;
                    } else if (i == 36) {
                        i2 = 6;
                    } else if (i == 37) {
                        i2 = 7;
                    } else {
                        i2 = i == 41 ? 8 : 0;
                    }
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.context, i2, 21, true, this.resourcesProvider);
                    checkBoxCell.getCheckBoxRound().setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    notificationsCheckCell = checkBoxCell;
                    universalChartCell = notificationsCheckCell;
                    break;
                case 38:
                    universalChartCell = new CollapseTextCell(this.context, this.resourcesProvider);
                    break;
                case 39:
                case 40:
                    universalChartCell = new TextCheckCell2(this.context);
                    break;
                case 42:
                    headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, true, this.resourcesProvider);
                    universalChartCell = headerCell2;
                    break;
                case 43:
                    universalChartCell = new TextSettingsCell(this.context, this.resourcesProvider);
                    break;
                case 44:
                    universalChartCell = new RadioButtonCell(this.context);
                    break;
            }
        }
        if (shouldApplyBackground(i)) {
            universalChartCell.setBackgroundColor(getThemedColor(i3));
        }
        return new RecyclerListView.Holder(universalChartCell);
    }

    @Override
    public int getItemViewType(int i) {
        UItem item = getItem(i);
        if (item == null) {
            return 0;
        }
        return item.viewType;
    }

    private boolean hasDivider(int i) {
        UItem item = getItem(i);
        UItem item2 = getItem(i + 1);
        return (item == null || item.hideDivider || item2 == null || isShadow(item2.viewType) != isShadow(item.viewType)) ? false : true;
    }

    public static boolean isShadow(int i) {
        if (i < UItem.factoryViewTypeStartsWith) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == -4 || i == 28 || i == 2 || i == -2;
        }
        UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
        return uItemFactoryFindFactory != null && uItemFactoryFindFactory.isShadow();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        FrameLayout.LayoutParams layoutParamsCreateFrame;
        View view;
        boolean z;
        boolean z2;
        int i2;
        CollapseTextCell collapseTextCell;
        String publicUsername;
        CharSequence charSequenceConcat;
        String pluralStringSpaced;
        int i3;
        final UItem item = getItem(i);
        UItem item2 = getItem(i + 1);
        UItem item3 = getItem(i - 1);
        if (item == null) {
            return;
        }
        int itemViewType = viewHolder.getItemViewType();
        boolean zHasDivider = hasDivider(i);
        updateColors(viewHolder);
        if (itemViewType >= UItem.factoryViewTypeStartsWith) {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(itemViewType);
            if (uItemFactoryFindFactory != null) {
                View view2 = viewHolder.itemView;
                RecyclerListView recyclerListView = this.listView;
                uItemFactoryFindFactory.bindView(view2, item, zHasDivider, this, recyclerListView instanceof UniversalRecyclerView ? (UniversalRecyclerView) recyclerListView : null);
            }
        } else {
            String userName = "";
            switch (itemViewType) {
                case -4:
                case -2:
                case -1:
                    FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                    frameLayout.setClipChildren(!item.checked);
                    frameLayout.setClipToPadding(!item.checked);
                    if (frameLayout.getChildCount() != (item.view != null) || frameLayout.getChildAt(0) != item.view) {
                        frameLayout.removeAllViews();
                        View view3 = item.view;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            if (itemViewType == -1 || itemViewType == -4) {
                                layoutParamsCreateFrame = LayoutHelper.createFrame(-1, item.intValue);
                            } else {
                                layoutParamsCreateFrame = LayoutHelper.createFrame(-2, -2.0f);
                            }
                            frameLayout.addView(item.view, layoutParamsCreateFrame);
                        }
                    }
                    break;
                case -3:
                    FullscreenCustomFrameLayout fullscreenCustomFrameLayout = (FullscreenCustomFrameLayout) viewHolder.itemView;
                    fullscreenCustomFrameLayout.setMinusHeight(item.intValue);
                    fullscreenCustomFrameLayout.setMinusPadding(BitwiseUtils.hasFlag(item.flags, 1));
                    if (fullscreenCustomFrameLayout.getChildCount() != (item.view != null) || fullscreenCustomFrameLayout.getChildAt(0) != item.view) {
                        fullscreenCustomFrameLayout.removeAllViews();
                        View view4 = item.view;
                        if (view4 != null) {
                            AndroidUtilities.removeFromParent(view4);
                            fullscreenCustomFrameLayout.addView(item.view, LayoutHelper.createFrame(-1, -1.0f));
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    ((HeaderCell) viewHolder.itemView).setText(item.text);
                    ((HeaderCell) viewHolder.itemView).setEnabled(item.enabled, true);
                    break;
                case 2:
                    TopViewCell topViewCell = (TopViewCell) viewHolder.itemView;
                    int i4 = item.iconResId;
                    if (i4 != 0) {
                        if (item.accent) {
                            topViewCell.setEmojiStatic(i4);
                        } else {
                            topViewCell.setEmoji(i4);
                        }
                    } else {
                        int i5 = item.intValue;
                        if (i5 != 0) {
                            topViewCell.setEmojiSize(i5);
                        }
                        topViewCell.setEmoji(item.subtext.toString(), item.textValue.toString());
                    }
                    if (TextUtils.isEmpty(item.animatedText)) {
                        topViewCell.setText(item.text);
                    } else {
                        topViewCell.setText(item.text, item.animatedText);
                    }
                    break;
                case 3:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    Object obj = item.object;
                    if (obj instanceof TLRPC.Document) {
                        textCell.setTextAndSticker(item.text, (TLRPC.Document) obj, zHasDivider);
                    } else if (obj instanceof String) {
                        textCell.setTextAndSticker(item.text, (String) obj, zHasDivider);
                    } else if (TextUtils.isEmpty(item.textValue)) {
                        Object obj2 = item.object;
                        if (obj2 instanceof Drawable) {
                            textCell.setTextAndIcon(item.text, (Drawable) obj2, zHasDivider);
                        } else {
                            int i6 = item.iconResId;
                            if (i6 == 0) {
                                textCell.setText(item.text, zHasDivider);
                            } else {
                                textCell.setTextAndIcon(item.text, i6, zHasDivider);
                            }
                        }
                    } else {
                        Object obj3 = item.object;
                        if (obj3 instanceof Drawable) {
                            textCell.setTextAndValueAndIcon(item.text, item.textValue, (Drawable) obj3, zHasDivider);
                        } else {
                            int i7 = item.iconResId;
                            if (i7 == 0) {
                                textCell.setTextAndValue(item.text, item.textValue, zHasDivider);
                            } else {
                                textCell.setTextAndValueAndIcon(item.text, item.textValue, i7, zHasDivider);
                            }
                        }
                    }
                    if (item.accent) {
                        int i8 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i8, i8);
                    } else if (item.red) {
                        textCell.setColors(Theme.key_text_RedBold, Theme.key_text_RedRegular);
                    } else {
                        textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    }
                    textCell.setEnabled(item.enabled, true);
                    break;
                case 4:
                case 9:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (textCheckCell.itemId == item.id) {
                        textCheckCell.setChecked(item.checked);
                    }
                    textCheckCell.setEnabled(item.enabled, null);
                    textCheckCell.setTextAndCheck(item.text, item.checked, zHasDivider);
                    textCheckCell.itemId = item.id;
                    if (itemViewType == 9) {
                        viewHolder.itemView.setBackgroundColor(Theme.getColor(item.checked ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    }
                    break;
                case 5:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                    CharSequence charSequence = item.subtext;
                    notificationsCheckCell.setTextAndValueAndCheck(item.text, item.subtext, item.checked, 0, charSequence != null && charSequence.toString().contains("\n"), zHasDivider);
                    break;
                case 6:
                    ((NotificationsCheckCell) viewHolder.itemView).setTextAndValueAndCheck(item.text, item.subtext, item.checked, zHasDivider);
                    break;
                case 7:
                case 8:
                case 38:
                    if (itemViewType == 7 || itemViewType == 8) {
                        TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                        if (TextUtils.isEmpty(item.text)) {
                            textInfoPrivacyCell.setFixedSize(itemViewType == 8 ? 220 : 12);
                            textInfoPrivacyCell.setText("");
                        } else {
                            textInfoPrivacyCell.setFixedSize(0);
                            textInfoPrivacyCell.setText(item.text);
                        }
                        if (item.accent) {
                            textInfoPrivacyCell.setTextGravity(17);
                            textInfoPrivacyCell.getTextView().setWidth(Math.min(HintView2.cutInFancyHalf(textInfoPrivacyCell.getText(), textInfoPrivacyCell.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            textInfoPrivacyCell.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                        } else {
                            textInfoPrivacyCell.setTextGravity(8388611);
                            textInfoPrivacyCell.getTextView().setMinWidth(0);
                            textInfoPrivacyCell.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            textInfoPrivacyCell.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                        }
                        view = textInfoPrivacyCell;
                    } else if (itemViewType == 38) {
                        collapseTextCell = (CollapseTextCell) viewHolder.itemView;
                        collapseTextCell.set(item.animatedText, item.collapsed);
                        if (item.accent) {
                            collapseTextCell.setColor(Theme.key_windowBackgroundWhiteBlueText4);
                        } else if (item.red) {
                            collapseTextCell.setColor(Theme.key_text_RedRegular);
                        } else {
                            collapseTextCell.setColor(Theme.key_windowBackgroundWhiteBlackText);
                        }
                    } else {
                        view = null;
                    }
                    if (item3 != null) {
                        view = collapseTextCell;
                        view = collapseTextCell;
                        if (isShadow(item3.viewType)) {
                            view = collapseTextCell;
                            view = collapseTextCell;
                            view = collapseTextCell;
                            view = collapseTextCell;
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        view = collapseTextCell;
                        view = collapseTextCell;
                        view = collapseTextCell;
                        view = collapseTextCell;
                        z = false;
                    }
                    if (item2 == null || isShadow(item2.viewType)) {
                        view = collapseTextCell;
                        view = collapseTextCell;
                        z2 = false;
                    } else {
                        view = collapseTextCell;
                        z2 = true;
                    }
                    if (this.listView.hasSections()) {
                        view.setBackground(null);
                    } else {
                        if (z && z2) {
                            i2 = R.drawable.greydivider;
                        } else if (z) {
                            i2 = R.drawable.greydivider_bottom;
                        } else if (z2) {
                            i2 = R.drawable.greydivider_top;
                        } else {
                            i2 = R.drawable.field_carret_empty;
                        }
                        Drawable themedDrawableByKey = Theme.getThemedDrawableByKey(this.context, i2, Theme.key_windowBackgroundGrayShadow, this.resourcesProvider);
                        if (this.dialog) {
                            view.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(getThemedColor(Theme.key_dialogBackgroundGray)), themedDrawableByKey}));
                        } else {
                            view.setBackground(themedDrawableByKey);
                        }
                    }
                    break;
                case 10:
                    DialogRadioCell dialogRadioCell = (DialogRadioCell) viewHolder.itemView;
                    if (dialogRadioCell.itemId == item.id) {
                        dialogRadioCell.setChecked(item.checked, true);
                        dialogRadioCell.setEnabled(item.enabled, true);
                    } else {
                        dialogRadioCell.setEnabled(item.enabled, false);
                    }
                    if (TextUtils.isEmpty(item.textValue)) {
                        dialogRadioCell.setText(item.text, item.checked, zHasDivider);
                    } else {
                        dialogRadioCell.setTextAndValue(item.text, item.textValue, item.checked, zHasDivider);
                    }
                    dialogRadioCell.itemId = item.id;
                    break;
                case 11:
                case 12:
                    UserCell userCell = (UserCell) viewHolder.itemView;
                    userCell.setFromUItem(this.currentAccount, item, zHasDivider);
                    if (itemViewType == 12) {
                        userCell.setChecked(item.checked, false);
                    }
                    break;
                case 13:
                    UserCell userCell2 = (UserCell) viewHolder.itemView;
                    userCell2.setFromUItem(this.currentAccount, item, zHasDivider);
                    CharSequence charSequence2 = item.textValue;
                    userCell2.setQuery(charSequence2 != null ? charSequence2.toString().toLowerCase() : null);
                    userCell2.setAddButtonVisible(!item.checked);
                    userCell2.setCloseIcon(item.clickCallback);
                    break;
                case 14:
                    SlideChooseView slideChooseView = (SlideChooseView) viewHolder.itemView;
                    slideChooseView.setOptions(item.intValue, item.texts);
                    slideChooseView.setMinAllowedIndex((int) item.longValue);
                    slideChooseView.setCallback(new SlideChooseView.Callback() {
                        @Override
                        public final void onOptionSelected(int i9) {
                            UniversalAdapter.$r8$lambda$zkYqYy_dtBSQIc15WzODxdmLimw(item, i9);
                        }

                        @Override
                        public void onTouchEnd() {
                            SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                        }
                    });
                    break;
                case 15:
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                    slideIntChooseView.set(item.intValue, (SlideIntChooseView.Options) item.object, item.intCallback);
                    slideIntChooseView.setMinValueAllowed((int) item.longValue);
                    break;
                case 16:
                    QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                    quickReplyView.setChecked(item.checked, false);
                    quickReplyView.setReorder(this.allowReorder);
                    Object obj4 = item.object;
                    if (obj4 instanceof QuickRepliesController.QuickReply) {
                        quickReplyView.set((QuickRepliesController.QuickReply) obj4, null, zHasDivider);
                    }
                    break;
                case 17:
                    QuickRepliesActivity.LargeQuickReplyView largeQuickReplyView = (QuickRepliesActivity.LargeQuickReplyView) viewHolder.itemView;
                    largeQuickReplyView.setChecked(item.checked, false);
                    Object obj5 = item.object;
                    if (obj5 instanceof QuickRepliesController.QuickReply) {
                        largeQuickReplyView.set((QuickRepliesController.QuickReply) obj5, zHasDivider);
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    ((StatisticActivity.UniversalChartCell) viewHolder.itemView).set(item.intValue, (StatisticActivity.ChartViewData) item.object, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            return UniversalAdapter.$r8$lambda$2uPIrsaVq0AF0234k0rcGHRdLO0(this.f$0, item);
                        }
                    });
                    break;
                case 24:
                    ((ChannelMonetizationLayout.ProceedOverviewCell) viewHolder.itemView).set((ChannelMonetizationLayout.ProceedOverview) item.object);
                    break;
                case 25:
                    ((ChannelMonetizationLayout.TransactionCell) viewHolder.itemView).set((TL_stats.BroadcastRevenueTransaction) item.object, zHasDivider);
                    break;
                case 27:
                    StoryPrivacyBottomSheet.UserCell userCell3 = (StoryPrivacyBottomSheet.UserCell) viewHolder.itemView;
                    long j = userCell3.dialogId;
                    Object obj6 = item.object;
                    boolean z3 = j == (obj6 instanceof TLRPC.User ? ((TLRPC.User) obj6).id : obj6 instanceof TLRPC.Chat ? -((TLRPC.Chat) obj6).id : 0L);
                    userCell3.setIsSendAs(false, true);
                    userCell3.set(item.object);
                    userCell3.checkBox.setVisibility(8);
                    userCell3.radioButton.setVisibility(0);
                    userCell3.setChecked(item.checked, z3);
                    userCell3.setDivider(zHasDivider);
                    break;
                case 28:
                    if (item.transparent) {
                        viewHolder.itemView.setBackgroundColor(0);
                    } else {
                        int i9 = item.iconResId;
                        if (i9 != 0) {
                            viewHolder.itemView.setBackgroundColor(i9);
                        }
                    }
                    viewHolder.itemView.setId(item.id);
                    ((SpaceView) viewHolder.itemView).setHeight(item.intValue);
                    break;
                case 29:
                    BusinessLinksActivity.BusinessLinkView businessLinkView = (BusinessLinksActivity.BusinessLinkView) viewHolder.itemView;
                    Object obj7 = item.object;
                    if (obj7 instanceof BusinessLinksActivity.BusinessLinkWrapper) {
                        businessLinkView.set((BusinessLinksActivity.BusinessLinkWrapper) obj7, zHasDivider);
                    }
                    break;
                case 30:
                    TextRightIconCell textRightIconCell = (TextRightIconCell) viewHolder.itemView;
                    textRightIconCell.setTextAndIcon(item.text, item.iconResId);
                    textRightIconCell.setDivider(zHasDivider);
                    textRightIconCell.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
                    break;
                case 31:
                    GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                    if (TextUtils.equals(graySectionCell.getText(), item.text)) {
                        graySectionCell.setRightText(item.subtext, true, item.clickCallback);
                    } else {
                        graySectionCell.setText(item.text, item.subtext, item.clickCallback);
                    }
                    break;
                case 32:
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                    Object obj8 = item.object;
                    if (item.accent && (obj8 instanceof TLRPC.User) && (i3 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i3 != 0) {
                            charSequenceConcat = LocaleController.formatPluralStringSpaced("BotUsers", i3);
                        } else {
                            charSequenceConcat = "";
                        }
                    } else if (item.withUsername) {
                        if (obj8 instanceof TLRPC.User) {
                            publicUsername = UserObject.getPublicUsername((TLRPC.User) obj8);
                        } else {
                            publicUsername = obj8 instanceof TLRPC.Chat ? ChatObject.getPublicUsername((TLRPC.Chat) obj8) : null;
                        }
                        if (publicUsername != null) {
                            charSequenceConcat = ((Object) "") + "@" + publicUsername;
                        } else {
                            charSequenceConcat = "";
                        }
                    } else {
                        charSequenceConcat = "";
                    }
                    if (obj8 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) obj8;
                        if (chat.participants_count != 0) {
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                pluralStringSpaced = LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                            } else {
                                pluralStringSpaced = LocaleController.formatPluralStringSpaced("Members", chat.participants_count);
                            }
                            charSequenceConcat = !TextUtils.isEmpty(charSequenceConcat) ? TextUtils.concat(charSequenceConcat, ", ", pluralStringSpaced) : pluralStringSpaced;
                        }
                        userName = chat.title;
                    } else if (obj8 instanceof TLRPC.User) {
                        userName = UserObject.getUserName((TLRPC.User) obj8);
                    }
                    String str = userName;
                    boolean z4 = item.locked;
                    Object obj9 = item.object2;
                    profileSearchCell.allowBotOpenButton(z4, obj9 instanceof Utilities.Callback ? (Utilities.Callback) obj9 : null);
                    profileSearchCell.setRectangularAvatar(item.red);
                    CharSequence charSequence3 = item.subtext;
                    profileSearchCell.setData(obj8, null, str, charSequence3 != null ? charSequence3 : charSequenceConcat, false, false);
                    profileSearchCell.setChecked(item.checked, false);
                    profileSearchCell.useSeparator = zHasDivider;
                    break;
                case 33:
                    DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                    Object obj10 = item.object;
                    MessageObject messageObject = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    dialogCell.useSeparator = zHasDivider;
                    if (messageObject == null) {
                        dialogCell.setDialog(0L, null, 0, false, false);
                    } else {
                        dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    }
                    break;
                case 34:
                    ((FlickerLoadingView) viewHolder.itemView).setViewType(item.intValue);
                    break;
                case 35:
                case 36:
                case 41:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) viewHolder.itemView;
                    checkBoxCell.setPad(item.pad);
                    checkBoxCell.setText(item.text, "", item.checked, zHasDivider, checkBoxCell.itemId == item.id);
                    checkBoxCell.itemId = item.id;
                    checkBoxCell.setIcon(item.locked ? R.drawable.permission_locked : 0);
                    if (itemViewType == 36 || itemViewType == 41) {
                        checkBoxCell.setCollapseButton(item.collapsed, item.animatedText, item.clickCallback);
                    }
                    break;
                case 37:
                    CheckBoxCell checkBoxCell2 = (CheckBoxCell) viewHolder.itemView;
                    checkBoxCell2.setPad(item.pad);
                    checkBoxCell2.setUserOrChat((TLObject) item.object);
                    checkBoxCell2.setChecked(item.checked, checkBoxCell2.itemId == item.id);
                    checkBoxCell2.itemId = item.id;
                    checkBoxCell2.setNeedDivider(zHasDivider);
                    break;
                case 39:
                case 40:
                    final TextCheckCell2 textCheckCell2 = (TextCheckCell2) viewHolder.itemView;
                    textCheckCell2.setTextAndCheck(item.text.toString(), item.checked, zHasDivider, textCheckCell2.id == item.id);
                    textCheckCell2.getCheckBox().setDrawIconType(item.intValue);
                    Switch checkBox = textCheckCell2.getCheckBox();
                    int i10 = item.intValue == 0 ? Theme.key_switchTrack : Theme.key_fill_RedNormal;
                    int i11 = Theme.key_switchTrackChecked;
                    int i12 = Theme.key_windowBackgroundWhite;
                    checkBox.setColors(i10, i11, i12, i12);
                    textCheckCell2.id = item.id;
                    textCheckCell2.setIcon(item.locked ? R.drawable.permission_locked : 0);
                    if (itemViewType == 40) {
                        if (TextUtils.isEmpty(item.animatedText)) {
                            textCheckCell2.hideCollapseArrow();
                        } else {
                            textCheckCell2.setCollapseArrow(item.animatedText.toString(), item.collapsed, new Runnable() {
                                @Override
                                public final void run() {
                                    item.clickCallback.onClick(textCheckCell2);
                                }
                            });
                        }
                    }
                    break;
                case 42:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    headerCell.setText(item.animatedText, headerCell.id == item.id);
                    headerCell.id = item.id;
                    break;
                case 43:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    textSettingsCell.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence4 = item.text;
                    if (charSequence4 != null) {
                        CharSequence charSequence5 = item.subtext;
                        if (charSequence5 != null) {
                            textSettingsCell.setTextAndValue(charSequence4, charSequence5, zHasDivider);
                        } else {
                            textSettingsCell.setText(charSequence4, zHasDivider);
                        }
                    }
                    textSettingsCell.setIcon(item.iconResId);
                    break;
                case 44:
                    RadioButtonCell radioButtonCell = (RadioButtonCell) viewHolder.itemView;
                    radioButtonCell.setTextAndValue(item.text.toString(), item.textValue.toString(), zHasDivider, item.checked);
                    radioButtonCell.itemId = item.id;
                    break;
            }
        }
        Utilities.Callback callback = item.bind;
        if (callback != null) {
            callback.run(viewHolder.itemView);
        }
    }

    public static void $r8$lambda$zkYqYy_dtBSQIc15WzODxdmLimw(UItem uItem, int i) {
        Utilities.Callback callback = uItem.intCallback;
        if (callback != null) {
            callback.run(Integer.valueOf(i));
        }
    }

    public static StatisticActivity.BaseChartCell $r8$lambda$2uPIrsaVq0AF0234k0rcGHRdLO0(UniversalAdapter universalAdapter, UItem uItem) {
        universalAdapter.getClass();
        View viewFindViewByItemObject = universalAdapter.findViewByItemObject(uItem.object);
        if (viewFindViewByItemObject instanceof StatisticActivity.UniversalChartCell) {
            return (StatisticActivity.UniversalChartCell) viewFindViewByItemObject;
        }
        return null;
    }

    private View findViewByItemObject(Object obj) {
        int i = 0;
        while (true) {
            if (i >= getItemCount()) {
                i = -1;
                break;
            }
            UItem item = getItem(i);
            if (item != null && item.object == obj) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return null;
        }
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        updateReorder(viewHolder, this.allowReorder);
        updateColors(viewHolder);
    }

    private void updateColors(RecyclerView.ViewHolder viewHolder) {
        KeyEvent.Callback callback = viewHolder.itemView;
        if (callback instanceof Theme.Colorable) {
            ((Theme.Colorable) callback).updateColors();
            if (shouldApplyBackground(viewHolder.getItemViewType())) {
                viewHolder.itemView.setBackgroundColor(getThemedColor(this.dialog ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite));
            }
        }
    }

    public void updateReorder(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder == null) {
            return;
        }
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType < UItem.factoryViewTypeStartsWith) {
            if (itemViewType != 16) {
                return;
            }
            ((QuickRepliesActivity.QuickReplyView) viewHolder.itemView).setReorder(z);
        } else {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(itemViewType);
            if (uItemFactoryFindFactory != null) {
                uItemFactoryFindFactory.attachedView(this.listView, viewHolder.itemView, getItem(viewHolder.getAdapterPosition()));
            }
        }
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        UItem item = getItem(viewHolder.getAdapterPosition());
        if (itemViewType >= UItem.factoryViewTypeStartsWith) {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(itemViewType);
            if (uItemFactoryFindFactory == null || !uItemFactoryFindFactory.isClickable()) {
                return false;
            }
        } else if (itemViewType != 3 && itemViewType != 5 && itemViewType != 6 && itemViewType != 30 && itemViewType != 4 && itemViewType != 10 && itemViewType != 44 && itemViewType != 11 && itemViewType != 12 && itemViewType != 17 && itemViewType != 16 && itemViewType != 29 && itemViewType != 25 && itemViewType != 27 && itemViewType != 32 && itemViewType != 33 && itemViewType != 35 && itemViewType != 36 && itemViewType != 37 && itemViewType != 41 && itemViewType != 39 && itemViewType != 40 && itemViewType != 38) {
            return false;
        }
        return item == null || item.enabled;
    }

    public UItem getItem(int i) {
        if (i < 0 || i >= this.items.size()) {
            return null;
        }
        return (UItem) this.items.get(i);
    }

    protected int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private static class FullscreenCustomFrameLayout extends FrameLayout {
        private int minusHeight;
        private boolean minusPadding;

        public FullscreenCustomFrameLayout(Context context) {
            super(context);
            this.minusHeight = 0;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int paddingTop = this.minusHeight;
            View view = getParent() instanceof View ? (View) getParent() : null;
            if (this.minusPadding && view != null) {
                paddingTop = paddingTop + view.getPaddingTop() + view.getPaddingBottom();
            }
            if (view != null && view.getMeasuredHeight() > 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - paddingTop, 1073741824));
                return;
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - paddingTop, 1073741824));
                return;
            }
            int size = View.MeasureSpec.getSize(i2);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            measureChildren(iMakeMeasureSpec, i2);
            int iMin = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                iMin = Math.max(iMin, getChildAt(i3).getMeasuredHeight());
            }
            if (size > 0) {
                iMin = Math.min(iMin, size - paddingTop);
            }
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        }

        public void setMinusHeight(int i) {
            this.minusHeight = i;
        }

        public void setMinusPadding(boolean z) {
            this.minusPadding = z;
        }
    }

    public static class SpaceView extends View {
        private int height;

        public SpaceView(Context context) {
            super(context);
            setTag(-33024);
        }

        public void setHeight(int i) {
            if (this.height == i) {
                return;
            }
            this.height = i;
            requestLayout();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
        }
    }
}
