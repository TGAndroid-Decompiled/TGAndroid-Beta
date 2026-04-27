package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ProfileSearchCell;
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
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.StatisticActivity;
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
        Iterator it = this.whiteSections.iterator();
        while (it.hasNext()) {
            Section section = (Section) it.next();
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
        UItem uItem = (UItem) this.items.get(i);
        UItem uItem2 = (UItem) this.items.get(i2);
        boolean zHasDivider = hasDivider(i);
        boolean zHasDivider2 = hasDivider(i2);
        this.items.set(i, uItem2);
        this.items.set(i2, uItem);
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
                    this.f$0.lambda$update$0(z);
                }
            });
        } else {
            lambda$update$0(z);
        }
    }

    public void lambda$update$0(boolean z) {
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
        View fullscreenCustomFrameLayout;
        boolean z = this.dialog;
        int i2 = z ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite;
        if (i >= UItem.factoryViewTypeStartsWith) {
            UItem.UItemFactory uItemFactoryFindFactory = UItem.findFactory(i);
            if (uItemFactoryFindFactory != null) {
                fullscreenCustomFrameLayout = uItemFactoryFindFactory.createView(this.context, this.listView, this.currentAccount, this.classGuid, this.resourcesProvider);
            } else {
                fullscreenCustomFrameLayout = new View(this.context);
            }
        } else {
            switch (i) {
                case -4:
                case -1:
                    View view = new FrameLayout(this.context) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
                        }
                    };
                    fullscreenCustomFrameLayout = view;
                    if (i == -4) {
                        view.setTag(-33024);
                        fullscreenCustomFrameLayout = view;
                        break;
                    }
                    break;
                case -3:
                    fullscreenCustomFrameLayout = new FullscreenCustomFrameLayout(this.context);
                    break;
                case -2:
                    fullscreenCustomFrameLayout = new FrameLayout(this.context) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
                            measureChildren(iMakeMeasureSpec, i4);
                            int iMax = 0;
                            for (int i5 = 0; i5 < getChildCount(); i5++) {
                                iMax = Math.max(iMax, getChildAt(i5).getMeasuredHeight());
                            }
                            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
                        }
                    };
                    break;
                case 0:
                    if (z) {
                        fullscreenCustomFrameLayout = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, this.resourcesProvider);
                        break;
                    } else {
                        fullscreenCustomFrameLayout = new HeaderCell(this.context, this.resourcesProvider);
                        break;
                    }
                case 1:
                    fullscreenCustomFrameLayout = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, false, this.resourcesProvider);
                    break;
                case 2:
                    fullscreenCustomFrameLayout = new TopViewCell(this.context, this.resourcesProvider);
                    break;
                case 3:
                    fullscreenCustomFrameLayout = new TextCell(this.context, this.resourcesProvider);
                    break;
                case 4:
                case 9:
                    TextCheckCell textCheckCell = new TextCheckCell(this.context, this.resourcesProvider);
                    fullscreenCustomFrameLayout = textCheckCell;
                    if (i == 9) {
                        textCheckCell.setDrawCheckRipple(true);
                        textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                        textCheckCell.setTypeface(AndroidUtilities.bold());
                        textCheckCell.setHeight(56);
                        fullscreenCustomFrameLayout = textCheckCell;
                        break;
                    }
                    break;
                case 5:
                case 6:
                    fullscreenCustomFrameLayout = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                    break;
                case 7:
                case 8:
                default:
                    fullscreenCustomFrameLayout = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                    break;
                case 10:
                    fullscreenCustomFrameLayout = new DialogRadioCell(this.context);
                    break;
                case 11:
                case 12:
                    UserCell userCell = new UserCell(this.context, 6, i == 12 ? 3 : 0, false);
                    userCell.setSelfAsSavedMessages(true);
                    fullscreenCustomFrameLayout = userCell;
                    break;
                case 13:
                    fullscreenCustomFrameLayout = new UserCell(this.context, 6, 0, false, true);
                    break;
                case 14:
                    fullscreenCustomFrameLayout = new SlideChooseView(this.context, this.resourcesProvider);
                    break;
                case 15:
                    fullscreenCustomFrameLayout = new SlideIntChooseView(this.context, this.resourcesProvider);
                    break;
                case 16:
                    fullscreenCustomFrameLayout = new QuickRepliesActivity.QuickReplyView(this.context, this.onReordered != null, this.resourcesProvider);
                    break;
                case 17:
                    fullscreenCustomFrameLayout = new QuickRepliesActivity.LargeQuickReplyView(this.context, this.resourcesProvider);
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
                    fullscreenCustomFrameLayout = new StatisticActivity.UniversalChartCell(this.context, this.currentAccount, i - 18, this.chartSharedUI, this.classGuid);
                    break;
                case 24:
                    fullscreenCustomFrameLayout = new ChannelMonetizationLayout.ProceedOverviewCell(this.context, this.resourcesProvider);
                    break;
                case 25:
                    fullscreenCustomFrameLayout = new ChannelMonetizationLayout.TransactionCell(this.context, this.resourcesProvider);
                    break;
                case 26:
                    HeaderCell headerCell = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 20, 0, false, this.resourcesProvider);
                    headerCell.setTextSize(20.0f);
                    fullscreenCustomFrameLayout = headerCell;
                    break;
                case 27:
                    StoryPrivacyBottomSheet.UserCell userCell2 = new StoryPrivacyBottomSheet.UserCell(this.context, this.resourcesProvider);
                    userCell2.setIsSendAs(false, false);
                    fullscreenCustomFrameLayout = userCell2;
                    break;
                case 28:
                    fullscreenCustomFrameLayout = new SpaceView(this.context);
                    break;
                case 29:
                    fullscreenCustomFrameLayout = new BusinessLinksActivity.BusinessLinkView(this.context, this.resourcesProvider);
                    break;
                case 30:
                    fullscreenCustomFrameLayout = new TextRightIconCell(this.context, this.resourcesProvider);
                    break;
                case 31:
                    RecyclerListView recyclerListView = this.listView;
                    if (recyclerListView != null && recyclerListView.hasSections()) {
                        GraySectionCell graySectionCell = new GraySectionCell(this.context, 28, this.resourcesProvider);
                        graySectionCell.setNoBackground(true);
                        fullscreenCustomFrameLayout = graySectionCell;
                        break;
                    } else {
                        fullscreenCustomFrameLayout = new GraySectionCell(this.context, this.resourcesProvider);
                        break;
                    }
                    break;
                case 32:
                    fullscreenCustomFrameLayout = new ProfileSearchCell(this.context);
                    break;
                case 33:
                    fullscreenCustomFrameLayout = new DialogCell(null, this.context, false, true);
                    break;
                case 34:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.context, this.resourcesProvider);
                    flickerLoadingView.setIsSingleCell(true);
                    fullscreenCustomFrameLayout = flickerLoadingView;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.context, i == 35 ? 4 : i == 36 ? 6 : i == 37 ? 7 : i == 41 ? 8 : 0, 21, true, this.resourcesProvider);
                    checkBoxCell.getCheckBoxRound().setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    fullscreenCustomFrameLayout = checkBoxCell;
                    break;
                case 38:
                    fullscreenCustomFrameLayout = new CollapseTextCell(this.context, this.resourcesProvider);
                    break;
                case 39:
                case 40:
                    fullscreenCustomFrameLayout = new TextCheckCell2(this.context);
                    break;
                case 42:
                    fullscreenCustomFrameLayout = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, true, this.resourcesProvider);
                    break;
                case 43:
                    fullscreenCustomFrameLayout = new TextSettingsCell(this.context, this.resourcesProvider);
                    break;
            }
        }
        if (shouldApplyBackground(i)) {
            fullscreenCustomFrameLayout.setBackgroundColor(getThemedColor(i2));
        }
        return new RecyclerListView.Holder(fullscreenCustomFrameLayout);
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
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UniversalAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public static void lambda$onBindViewHolder$1(UItem uItem, int i) {
        Utilities.Callback callback = uItem.intCallback;
        if (callback != null) {
            callback.run(Integer.valueOf(i));
        }
    }

    public StatisticActivity.BaseChartCell lambda$onBindViewHolder$2(UItem uItem) {
        View viewFindViewByItemObject = findViewByItemObject(uItem.object);
        if (viewFindViewByItemObject instanceof StatisticActivity.UniversalChartCell) {
            return (StatisticActivity.UniversalChartCell) viewFindViewByItemObject;
        }
        return null;
    }

    public static void lambda$onBindViewHolder$3(UItem uItem, TextCheckCell2 textCheckCell2) {
        uItem.clickCallback.onClick(textCheckCell2);
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
        UItem.UItemFactory uItemFactoryFindFactory;
        int itemViewType = viewHolder.getItemViewType();
        UItem item = getItem(viewHolder.getAdapterPosition());
        if (itemViewType < UItem.factoryViewTypeStartsWith ? itemViewType == 3 || itemViewType == 5 || itemViewType == 6 || itemViewType == 30 || itemViewType == 4 || itemViewType == 10 || itemViewType == 11 || itemViewType == 12 || itemViewType == 17 || itemViewType == 16 || itemViewType == 29 || itemViewType == 25 || itemViewType == 27 || itemViewType == 32 || itemViewType == 33 || itemViewType == 35 || itemViewType == 36 || itemViewType == 37 || itemViewType == 41 || itemViewType == 39 || itemViewType == 40 || itemViewType == 38 : (uItemFactoryFindFactory = UItem.findFactory(itemViewType)) != null && uItemFactoryFindFactory.isClickable()) {
            if (item == null || item.enabled) {
                return true;
            }
        }
        return false;
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
