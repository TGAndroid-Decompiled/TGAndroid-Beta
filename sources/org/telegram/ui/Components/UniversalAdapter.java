package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;
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
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.VoIPEllipsizeSpan;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public class UniversalAdapter extends AdapterWithDiffUtils {
    public static final int VIEW_TYPE_ANIMATED_HEADER = 42;
    public static final int VIEW_TYPE_BLACK_HEADER = 1;
    public static final int VIEW_TYPE_BUSINESS_LINK = 29;
    public static final int VIEW_TYPE_CHART_BAR = 21;
    public static final int VIEW_TYPE_CHART_DOUBLE_LINEAR = 19;
    public static final int VIEW_TYPE_CHART_LINEAR = 18;
    public static final int VIEW_TYPE_CHART_LINEAR_BAR = 23;
    public static final int VIEW_TYPE_CHART_STACK_BAR = 20;
    public static final int VIEW_TYPE_CHART_STACK_LINEAR = 22;
    public static final int VIEW_TYPE_CHECK = 4;
    public static final int VIEW_TYPE_CHECKRIPPLE = 9;
    public static final int VIEW_TYPE_CUSTOM = -1;
    public static final int VIEW_TYPE_CUSTOM_SHADOW = -4;
    public static final int VIEW_TYPE_EXPANDABLE_SWITCH = 40;
    public static final int VIEW_TYPE_FILTER_CHAT = 11;
    public static final int VIEW_TYPE_FILTER_CHAT_CHECK = 12;
    public static final int VIEW_TYPE_FLICKER = 34;
    public static final int VIEW_TYPE_FULLSCREEN_CUSTOM = -3;
    public static final int VIEW_TYPE_FULLY_CUSTOM = -2;
    public static final int VIEW_TYPE_GRAY_SECTION = 31;
    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_ICON_TEXT_CHECK = 6;
    public static final int VIEW_TYPE_INTSLIDE = 15;
    public static final int VIEW_TYPE_LARGE_HEADER = 26;
    public static final int VIEW_TYPE_LARGE_QUICK_REPLY = 17;
    public static final int VIEW_TYPE_LARGE_SHADOW = 8;
    public static final int VIEW_TYPE_PROCEED_OVERVIEW = 24;
    public static final int VIEW_TYPE_PROFILE_CELL = 32;
    public static final int VIEW_TYPE_QUICK_REPLY = 16;
    public static final int VIEW_TYPE_RADIO = 10;
    public static final int VIEW_TYPE_RADIO_2 = 44;
    public static final int VIEW_TYPE_RADIO_USER = 27;
    public static final int VIEW_TYPE_RIGHT_ICON_TEXT = 30;
    public static final int VIEW_TYPE_ROUND_CHECKBOX = 35;
    public static final int VIEW_TYPE_ROUND_GROUP_CHECKBOX = 41;
    public static final int VIEW_TYPE_SEARCH_MESSAGE = 33;
    public static final int VIEW_TYPE_SHADOW = 7;
    public static final int VIEW_TYPE_SHADOW_COLLAPSE_BUTTON = 38;
    public static final int VIEW_TYPE_SLIDE = 14;
    public static final int VIEW_TYPE_SPACE = 28;
    public static final int VIEW_TYPE_SWITCH = 39;
    public static final int VIEW_TYPE_TEXT = 3;
    public static final int VIEW_TYPE_TEXT_CHECK = 5;
    public static final int VIEW_TYPE_TEXT_SETTINGS = 43;
    public static final int VIEW_TYPE_TOPVIEW = 2;
    public static final int VIEW_TYPE_TRANSACTION = 25;
    public static final int VIEW_TYPE_USER_ADD = 13;
    public static final int VIEW_TYPE_USER_CHECKBOX = 37;
    public static final int VIEW_TYPE_USER_GROUP_CHECKBOX = 36;
    private boolean allowReorder;
    private boolean applyBackground;
    private BaseChartView.SharedUiComponents chartSharedUI;
    private final int classGuid;
    private final Context context;
    public final int currentAccount;
    private Section currentReorderSection;
    private Section currentWhiteSection;
    private final boolean dialog;
    protected Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> fillItems;
    private final ArrayList<UItem> items;
    public int itemsOffset;
    protected final RecyclerListView listView;
    private final ArrayList<UItem> oldItems;
    private Utilities.Callback2<Integer, ArrayList<UItem>> onReordered;
    private boolean orderChanged;
    private int orderChangedId;
    private final ArrayList<Section> reorderSections;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList<Section> whiteSections;

    public static class FullscreenCustomFrameLayout extends FrameLayout {
        private int minusHeight;
        private boolean minusPadding;

        public FullscreenCustomFrameLayout(Context context) {
            super(context);
            this.minusHeight = 0;
        }

        @Override
        public void onMeasure(int i, int i2) {
            int paddingBottom = this.minusHeight;
            View view = getParent() instanceof View ? (View) getParent() : null;
            if (this.minusPadding && view != null) {
                paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + paddingBottom;
            }
            if (view != null && view.getMeasuredHeight() > 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - paddingBottom, 1073741824));
                return;
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - paddingBottom, 1073741824));
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
                iMin = Math.min(iMin, size - paddingBottom);
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

    public static class Section {
        public int end;
        public int start;

        private Section() {
        }

        public boolean contains(int i) {
            return i >= this.start && i <= this.end;
        }
    }

    public static class SpaceView extends View {
        private int height;

        public SpaceView(Context context) {
            super(context);
            setTag(-33024);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
        }

        public void setHeight(int i) {
            if (this.height == i) {
                return;
            }
            this.height = i;
            requestLayout();
        }
    }

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Theme.ResourcesProvider resourcesProvider) {
        this(recyclerListView, context, i, i2, false, callback2, resourcesProvider);
    }

    private void callReorder(int i) {
        if (i < 0 || i >= this.reorderSections.size()) {
            return;
        }
        Section section = this.reorderSections.get(i);
        this.onReordered.run(Integer.valueOf(i), new ArrayList<>(this.items.subList(section.start, section.end + 1)));
        this.orderChanged = false;
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

    private boolean hasDivider(int i) {
        UItem item = getItem(i);
        UItem item2 = getItem(i + 1);
        return (item == null || item.hideDivider || item2 == null || isShadow(item2.viewType) != isShadow(item.viewType)) ? false : true;
    }

    public static boolean isShadow(int i) {
        if (i < UItem.factoryViewTypeStartsWith) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == -4 || i == 28 || i == 2 || i == -2;
        }
        UItem.UItemFactory<?> uItemFactoryFindFactory = UItem.findFactory(i);
        return uItemFactoryFindFactory != null && uItemFactoryFindFactory.isShadow();
    }

    public static void lambda$onBindViewHolder$1(UItem uItem, int i) {
        Utilities.Callback<Integer> callback = uItem.intCallback;
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

    private void updateColors(RecyclerView.ViewHolder viewHolder) {
        KeyEvent.Callback callback = viewHolder.itemView;
        if (callback instanceof Theme.Colorable) {
            ((Theme.Colorable) callback).updateColors();
            if (shouldApplyBackground(viewHolder.getItemViewType())) {
                viewHolder.itemView.setBackgroundColor(getThemedColor(this.dialog ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite));
            }
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
            Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2 = this.fillItems;
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

    private void updateReorderSections() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null) {
            return;
        }
        ArrayList<Long> arrayList = recyclerListView.forcedSections;
        if (arrayList == null) {
            recyclerListView.forcedSections = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        ArrayList<Section> arrayList2 = this.whiteSections;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Section section = arrayList2.get(i);
            i++;
            Section section2 = section;
            this.listView.forcedSections.add(Long.valueOf(AndroidUtilities.pack(section2.start, section2.end)));
        }
    }

    public void drawWhiteSections(Canvas canvas, RecyclerListView recyclerListView) {
        for (int i = 0; i < this.whiteSections.size(); i++) {
            Section section = this.whiteSections.get(i);
            int i2 = section.end;
            if (i2 >= 0) {
                recyclerListView.drawSectionBackground(canvas, section.start, i2, getThemedColor(this.dialog ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite));
            }
        }
    }

    public UItem findItem(int i) {
        for (int i2 = 0; i2 < this.items.size(); i2++) {
            UItem uItem = this.items.get(i2);
            if (uItem != null && uItem.id == i) {
                return uItem;
            }
        }
        return null;
    }

    public UItem getItem(int i) {
        if (i < 0 || i >= this.items.size()) {
            return null;
        }
        return this.items.get(i);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int i) {
        UItem item = getItem(i);
        if (item == null) {
            return 0;
        }
        return item.viewType;
    }

    public int getReorderSectionId(int i) {
        for (int i2 = 0; i2 < this.reorderSections.size(); i2++) {
            if (this.reorderSections.get(i2).contains(i)) {
                return i2;
            }
        }
        return -1;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        UItem item = getItem(viewHolder.getAdapterPosition());
        if (itemViewType >= UItem.factoryViewTypeStartsWith) {
            UItem.UItemFactory<?> uItemFactoryFindFactory = UItem.findFactory(itemViewType);
            if (uItemFactoryFindFactory == null || !uItemFactoryFindFactory.isClickable()) {
                return false;
            }
        } else if (itemViewType != 3 && itemViewType != 5 && itemViewType != 6 && itemViewType != 30 && itemViewType != 4 && itemViewType != 10 && itemViewType != 44 && itemViewType != 11 && itemViewType != 12 && itemViewType != 17 && itemViewType != 16 && itemViewType != 29 && itemViewType != 25 && itemViewType != 27 && itemViewType != 32 && itemViewType != 33 && itemViewType != 35 && itemViewType != 36 && itemViewType != 37 && itemViewType != 41 && itemViewType != 39 && itemViewType != 40 && itemViewType != 38) {
            return false;
        }
        return item == null || item.enabled;
    }

    public boolean isReorderItem(int i) {
        return getReorderSectionId(i) >= 0;
    }

    public void listenReorder(Utilities.Callback2<Integer, ArrayList<UItem>> callback2) {
        this.onReordered = callback2;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TextInfoPrivacyCell textInfoPrivacyCell;
        View view;
        boolean z;
        int i2;
        CharSequence charSequence;
        TLRPC.Document document;
        long j;
        ImageLocation imageLocation;
        String str;
        TLRPC.Photo photo;
        CharSequence charSequenceConcat;
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
        if (itemViewType < UItem.factoryViewTypeStartsWith) {
            String userName = "";
            switch (itemViewType) {
                case -4:
                case -2:
                case -1:
                    FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                    frameLayout.setClipChildren(!item.checked);
                    frameLayout.setClipToPadding(!item.checked);
                    if (frameLayout.getChildCount() != (item.view == null ? 0 : 1) || frameLayout.getChildAt(0) != item.view) {
                        frameLayout.removeAllViews();
                        View view2 = item.view;
                        if (view2 != null) {
                            AndroidUtilities.removeFromParent(view2);
                            frameLayout.addView(item.view, (itemViewType == -1 || itemViewType == -4) ? LayoutHelper.createFrame(-1, item.intValue) : LayoutHelper.createFrame(-2, -2.0f));
                        }
                    }
                    break;
                case -3:
                    FullscreenCustomFrameLayout fullscreenCustomFrameLayout = (FullscreenCustomFrameLayout) viewHolder.itemView;
                    fullscreenCustomFrameLayout.setMinusHeight(item.intValue);
                    fullscreenCustomFrameLayout.setMinusPadding(BitwiseUtils.hasFlag(item.flags, 1));
                    if (fullscreenCustomFrameLayout.getChildCount() != (item.view == null ? 0 : 1) || fullscreenCustomFrameLayout.getChildAt(0) != item.view) {
                        fullscreenCustomFrameLayout.removeAllViews();
                        View view3 = item.view;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
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
                    if (i4 == 0) {
                        int i5 = item.intValue;
                        if (i5 != 0) {
                            topViewCell.setEmojiSize(i5);
                        }
                        topViewCell.setEmoji(item.subtext.toString(), item.textValue.toString());
                    } else if (item.accent) {
                        topViewCell.setEmojiStatic(i4);
                    } else {
                        topViewCell.setEmoji(i4);
                    }
                    if (!TextUtils.isEmpty(item.animatedText)) {
                        topViewCell.setText(item.text, item.animatedText);
                    } else {
                        topViewCell.setText(item.text);
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
                        viewHolder.itemView.setBackgroundColor(Theme.getColor(null, item.checked ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
                    }
                    break;
                case 5:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                    CharSequence charSequence2 = item.subtext;
                    notificationsCheckCell.setTextAndValueAndCheck(item.text, item.subtext, item.checked, 0, charSequence2 != null && charSequence2.toString().contains("\n"), zHasDivider);
                    break;
                case 6:
                    ((NotificationsCheckCell) viewHolder.itemView).setTextAndValueAndCheck(item.text, item.subtext, item.checked, zHasDivider);
                    break;
                case 7:
                case 8:
                case 38:
                    if (itemViewType == 7 || itemViewType == 8) {
                        textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
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
                    } else if (itemViewType == 38) {
                        CollapseTextCell collapseTextCell = (CollapseTextCell) viewHolder.itemView;
                        CharSequence charSequence3 = item.animatedText;
                        boolean z2 = item.collapsed;
                        collapseTextCell.textView.setText(charSequence3);
                        View view4 = collapseTextCell.collapsedArrow;
                        view4.animate().cancel();
                        view4.animate().rotation(z2 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                        if (item.accent) {
                            collapseTextCell.setColor(Theme.key_windowBackgroundWhiteBlueText4);
                        } else if (item.red) {
                            collapseTextCell.setColor(Theme.key_text_RedRegular);
                        } else {
                            collapseTextCell.setColor(Theme.key_windowBackgroundWhiteBlackText);
                        }
                        view = collapseTextCell;
                    } else {
                        view = null;
                    }
                    if (item3 != null) {
                        view = textInfoPrivacyCell;
                        view = textInfoPrivacyCell;
                        if (isShadow(item3.viewType)) {
                            view = textInfoPrivacyCell;
                            view = textInfoPrivacyCell;
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        view = textInfoPrivacyCell;
                        view = textInfoPrivacyCell;
                        z = false;
                    }
                    boolean z3 = (item2 == null || isShadow(item2.viewType)) ? false : true;
                    if (!this.listView.hasSections()) {
                        if (z && z3) {
                            i2 = R.drawable.greydivider;
                        } else if (z) {
                            i2 = R.drawable.greydivider_bottom;
                        } else {
                            i2 = z3 ? R.drawable.greydivider_top : R.drawable.field_carret_empty;
                        }
                        Drawable themedDrawable = Theme.getThemedDrawable(this.context, i2, Theme.getColor(Theme.key_windowBackgroundGrayShadow, this.resourcesProvider));
                        if (!this.dialog) {
                            view.setBackground(themedDrawable);
                        } else {
                            view.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(getThemedColor(Theme.key_dialogBackgroundGray)), themedDrawable}));
                        }
                    } else {
                        view.setBackground(null);
                    }
                    break;
                case 10:
                    DialogRadioCell dialogRadioCell = (DialogRadioCell) viewHolder.itemView;
                    int i9 = dialogRadioCell.itemId;
                    int i10 = item.id;
                    RadioButton radioButton = dialogRadioCell.radioButton;
                    if (i9 == i10) {
                        radioButton.setChecked(item.checked, true);
                        dialogRadioCell.setEnabled(item.enabled, true);
                    } else {
                        dialogRadioCell.setEnabled(item.enabled, false);
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(item.textValue);
                    TextView textView = dialogRadioCell.valueTextView;
                    TextView textView2 = dialogRadioCell.textView;
                    if (zIsEmpty) {
                        CharSequence charSequence4 = item.text;
                        boolean z4 = item.checked;
                        textView.setVisibility(8);
                        textView2.setText(charSequence4);
                        radioButton.setChecked(z4, false);
                        dialogRadioCell.needDivider = zHasDivider;
                        dialogRadioCell.updateLayout();
                        dialogRadioCell.setWillNotDraw(!zHasDivider);
                    } else {
                        CharSequence charSequence5 = item.text;
                        CharSequence charSequence6 = item.textValue;
                        boolean z5 = item.checked;
                        textView.setVisibility(0);
                        textView.setText(charSequence6);
                        textView2.setText(charSequence5);
                        radioButton.setChecked(z5, false);
                        dialogRadioCell.needDivider = zHasDivider;
                        dialogRadioCell.updateLayout();
                        dialogRadioCell.setWillNotDraw(!zHasDivider);
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
                    CharSequence charSequence7 = item.textValue;
                    userCell2.setQuery(charSequence7 == null ? null : charSequence7.toString().toLowerCase());
                    userCell2.setAddButtonVisible(!item.checked);
                    userCell2.setCloseIcon(item.clickCallback);
                    break;
                case 14:
                    SlideChooseView slideChooseView = (SlideChooseView) viewHolder.itemView;
                    slideChooseView.setOptions(item.intValue, item.texts);
                    slideChooseView.setMinAllowedIndex((int) item.longValue);
                    slideChooseView.setCallback(new ColorPicker$$ExternalSyntheticLambda5(item, 22));
                    break;
                case 15:
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                    slideIntChooseView.set(item.intValue, (SlideIntChooseView.Options) item.object, item.intCallback);
                    slideIntChooseView.setMinValueAllowed((int) item.longValue);
                    break;
                case 16:
                    QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                    quickReplyView.checkBox.setChecked(item.checked, false);
                    quickReplyView.setReorder(this.allowReorder);
                    Object obj4 = item.object;
                    if (obj4 instanceof QuickRepliesController.QuickReply) {
                        quickReplyView.set((QuickRepliesController.QuickReply) obj4, null, zHasDivider);
                    }
                    break;
                case 17:
                    QuickRepliesActivity.LargeQuickReplyView largeQuickReplyView = (QuickRepliesActivity.LargeQuickReplyView) viewHolder.itemView;
                    largeQuickReplyView.checkBox.setChecked(item.checked, false);
                    Object obj5 = item.object;
                    if (obj5 instanceof QuickRepliesController.QuickReply) {
                        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj5;
                        int i11 = UserConfig.selectedAccount;
                        largeQuickReplyView.titleView.setText(MessagesController.getInstance(i11).getPeerName(UserConfig.getInstance(i11).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = quickReply.topMessage;
                        TextView textView3 = largeQuickReplyView.textView;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        if (quickReply.getMessagesCount() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int messagesCount = quickReply.getMessagesCount() - 1;
                            int i12 = VoIPEllipsizeSpan.$r8$clinit;
                            SpannableString spannableString = new SpannableString("+");
                            VoIPEllipsizeSpan voIPEllipsizeSpan = new VoIPEllipsizeSpan(messagesCount);
                            int currentWidth = (int) (((Text) voIPEllipsizeSpan.parents).getCurrentWidth() + AndroidUtilities.dp(10.0f));
                            int[] iArr = largeQuickReplyView.spanWidth;
                            iArr[0] = currentWidth;
                            spannableString.setSpan(voIPEllipsizeSpan, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (iDp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            charSequence = spannableStringBuilder2;
                        } else {
                            charSequence = spannableStringBuilder;
                        }
                        textView3.setText(charSequence);
                        TLRPC.MessageMedia media = MessageObject.getMedia(quickReply.topMessage);
                        ImageReceiver imageReceiver = largeQuickReplyView.imageReceiver;
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = quickReply.topMessage;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            AvatarDrawable avatarDrawable = largeQuickReplyView.avatarDrawable;
                            avatarDrawable.setInfo(UserConfig.getInstance(i11).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i11).getCurrentUser(), avatarDrawable);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                            if (closestPhotoSizeWithSize2 == null) {
                                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                                j = media.document.size;
                                str = "g";
                                imageLocation = forDocument;
                            } else {
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                                j = closestPhotoSizeWithSize2.size;
                                imageLocation = forObject2;
                                str = "36_36";
                            }
                            long j2 = j;
                            MessageObject messageObject3 = quickReply.topMessage;
                            imageReceiver.setImage(imageLocation, str, messageObject3.strippedThumb, j2, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        largeQuickReplyView.needDivider = zHasDivider;
                        largeQuickReplyView.invalidate();
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
                            return this.f$0.lambda$onBindViewHolder$2(item);
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
                    long j3 = userCell3.dialogId;
                    Object obj6 = item.object;
                    boolean z6 = j3 == (obj6 instanceof TLRPC.User ? ((TLRPC.User) obj6).id : obj6 instanceof TLRPC.Chat ? -((TLRPC.Chat) obj6).id : 0L);
                    userCell3.setIsSendAs(false, true);
                    userCell3.set(item.object);
                    userCell3.checkBox.setVisibility(8);
                    userCell3.radioButton.setVisibility(0);
                    userCell3.setChecked(item.checked, z6);
                    userCell3.setDivider(zHasDivider);
                    break;
                case 28:
                    if (item.transparent) {
                        viewHolder.itemView.setBackgroundColor(0);
                    } else {
                        int i13 = item.iconResId;
                        if (i13 != 0) {
                            viewHolder.itemView.setBackgroundColor(i13);
                        }
                    }
                    viewHolder.itemView.setId(item.id);
                    ((SpaceView) viewHolder.itemView).setHeight(item.intValue);
                    break;
                case 29:
                    BusinessLinksActivity.BusinessLinkView businessLinkView = (BusinessLinksActivity.BusinessLinkView) viewHolder.itemView;
                    Object obj7 = item.object;
                    if (obj7 instanceof BusinessLinksActivity.BusinessLinkWrapper) {
                        businessLinkView.needDivider = zHasDivider;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((BusinessLinksActivity.BusinessLinkWrapper) obj7).link;
                        businessLinkView.businessLink = tL_businessChatLink;
                        boolean zIsEmpty2 = TextUtils.isEmpty(tL_businessChatLink.title);
                        SimpleTextView simpleTextView = businessLinkView.titleTextView;
                        if (zIsEmpty2) {
                            String strSubstring = businessLinkView.businessLink.link;
                            BusinessLinksController[] businessLinksControllerArr = BusinessLinksController.Instance;
                            if (strSubstring.startsWith("https://")) {
                                strSubstring = strSubstring.substring(8);
                            }
                            simpleTextView.setText(strSubstring);
                        } else {
                            simpleTextView.setText(businessLinkView.businessLink.title);
                        }
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(businessLinkView.businessLink.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = businessLinkView.businessLink;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder3);
                        SpoilersTextView spoilersTextView = businessLinkView.messagePreviewTextView;
                        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder3, spoilersTextView.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, businessLinkView.businessLink.entities, spoilersTextView.getPaint().getFontMetricsInt());
                        spoilersTextView.setText(charSequenceReplaceEmoji);
                        int i14 = businessLinkView.businessLink.views;
                        SimpleTextView simpleTextView2 = businessLinkView.clicksCountTextView;
                        if (i14 == 0) {
                            simpleTextView2.setText(LocaleController.formatString(R.string.NoClicks, new Object[0]));
                        } else {
                            simpleTextView2.setText(LocaleController.formatPluralString("Clicks", i14, new Object[0]));
                        }
                        simpleTextView2.requestLayout();
                        businessLinkView.invalidate();
                    }
                    break;
                case 30:
                    TextRightIconCell textRightIconCell = (TextRightIconCell) viewHolder.itemView;
                    CharSequence charSequence8 = item.text;
                    int i15 = item.iconResId;
                    textRightIconCell.textView.setText(charSequence8);
                    textRightIconCell.ivIcon.setImageResource(i15);
                    textRightIconCell.setDivider(zHasDivider);
                    textRightIconCell.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
                    break;
                case 31:
                    GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                    if (!TextUtils.equals(graySectionCell.getText(), item.text)) {
                        graySectionCell.setText(item.text, item.subtext, item.clickCallback);
                    } else {
                        graySectionCell.setRightText(item.subtext, item.clickCallback);
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
                        String publicUsername = obj8 instanceof TLRPC.User ? UserObject.getPublicUsername((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? ChatObject.getPublicUsername((TLRPC.Chat) obj8) : null;
                        if (publicUsername != null) {
                            charSequenceConcat = "@".concat(publicUsername);
                        } else {
                            charSequenceConcat = "";
                        }
                    } else {
                        charSequenceConcat = "";
                    }
                    if (obj8 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) obj8;
                        if (chat.participants_count != 0) {
                            String pluralStringSpaced = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                            charSequenceConcat = !TextUtils.isEmpty(charSequenceConcat) ? TextUtils.concat(charSequenceConcat, ", ", pluralStringSpaced) : pluralStringSpaced;
                        }
                        userName = chat.title;
                    } else if (obj8 instanceof TLRPC.User) {
                        userName = UserObject.getUserName((TLRPC.User) obj8);
                    }
                    String str2 = userName;
                    boolean z7 = item.locked;
                    Object obj9 = item.object2;
                    Utilities.Callback callback = obj9 instanceof Utilities.Callback ? (Utilities.Callback) obj9 : null;
                    profileSearchCell.allowBotOpenButton = z7;
                    profileSearchCell.onOpenButtonClick = callback;
                    profileSearchCell.setRectangularAvatar(item.red);
                    CharSequence charSequence9 = item.subtext;
                    profileSearchCell.setData(obj8, null, str2, charSequence9 != null ? charSequence9 : charSequenceConcat, false, false);
                    boolean z8 = item.checked;
                    CheckBox2 checkBox2 = profileSearchCell.checkBox;
                    if (checkBox2 != null) {
                        checkBox2.setChecked(z8, false);
                    }
                    profileSearchCell.useSeparator = zHasDivider;
                    break;
                case 33:
                    DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                    Object obj10 = item.object;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    dialogCell.useSeparator = zHasDivider;
                    if (messageObject4 != null) {
                        dialogCell.setDialog(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                    } else {
                        dialogCell.setDialog(0L, null, 0, false, false);
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
                        boolean z9 = item.collapsed;
                        CharSequence charSequence10 = item.animatedText;
                        View.OnClickListener onClickListener = item.clickCallback;
                        CheckBoxCell.CollapseButton collapseButton = checkBoxCell.collapseButton;
                        if (collapseButton != null) {
                            AnimatedTextView animatedTextView = collapseButton.textView;
                            animatedTextView.cancelAnimation();
                            animatedTextView.setText(charSequence10);
                            View view5 = collapseButton.collapsedArrow;
                            view5.animate().cancel();
                            view5.animate().rotation(z9 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                            if (onClickListener != null) {
                                collapseButton.setOnClickListener(onClickListener);
                            }
                        }
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
                    TextCheckCell2 textCheckCell2 = (TextCheckCell2) viewHolder.itemView;
                    textCheckCell2.setTextAndCheck(item.text.toString(), item.checked, zHasDivider, textCheckCell2.id == item.id);
                    textCheckCell2.getCheckBox().setDrawIconType(item.intValue);
                    Switch checkBox = textCheckCell2.getCheckBox();
                    int i16 = item.intValue == 0 ? Theme.key_switchTrack : Theme.key_fill_RedNormal;
                    int i17 = Theme.key_switchTrackChecked;
                    int i18 = Theme.key_windowBackgroundWhite;
                    checkBox.setColors(i16, i17, i18, i18);
                    textCheckCell2.id = item.id;
                    textCheckCell2.setIcon(item.locked ? R.drawable.permission_locked : 0);
                    if (itemViewType == 40) {
                        if (!TextUtils.isEmpty(item.animatedText)) {
                            textCheckCell2.setCollapseArrow(item.animatedText.toString(), item.collapsed, new UndoView$$ExternalSyntheticLambda3(25, item, textCheckCell2));
                        } else {
                            LinearLayout linearLayout = textCheckCell2.collapseViewContainer;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
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
                    CharSequence charSequence11 = item.text;
                    if (charSequence11 != null) {
                        CharSequence charSequence12 = item.subtext;
                        if (charSequence12 != null) {
                            textSettingsCell.setTextAndValue(charSequence11, charSequence12, false, zHasDivider);
                        } else {
                            textSettingsCell.setText(charSequence11, zHasDivider);
                        }
                    }
                    textSettingsCell.setIcon(item.iconResId);
                    break;
                case 44:
                    ((RadioButtonCell) viewHolder.itemView).setTextAndValue(item.text.toString(), item.textValue.toString(), zHasDivider, item.checked);
                    break;
            }
        } else {
            UItem.UItemFactory<?> uItemFactoryFindFactory = UItem.findFactory(itemViewType);
            if (uItemFactoryFindFactory != null) {
                View view6 = viewHolder.itemView;
                RecyclerListView recyclerListView = this.listView;
                uItemFactoryFindFactory.bindView(view6, item, zHasDivider, this, recyclerListView instanceof UniversalRecyclerView ? (UniversalRecyclerView) recyclerListView : null);
            }
        }
        Utilities.Callback<View> callback2 = item.bind;
        if (callback2 != null) {
            callback2.run(viewHolder.itemView);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View headerCell;
        View fullscreenCustomFrameLayout;
        View dialogCell;
        View notificationsCheckCell;
        int i2;
        View headerCell2;
        boolean z = this.dialog;
        int i3 = z ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite;
        if (i < UItem.factoryViewTypeStartsWith) {
            switch (i) {
                case -4:
                case -1:
                    FrameLayout frameLayout = new FrameLayout(this.context) {
                        @Override
                        public void onMeasure(int i4, int i5) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824), i5);
                        }
                    };
                    fullscreenCustomFrameLayout = frameLayout;
                    if (i == -4) {
                        frameLayout.setTag(-33024);
                        fullscreenCustomFrameLayout = frameLayout;
                    }
                    break;
                case -3:
                    fullscreenCustomFrameLayout = new FullscreenCustomFrameLayout(this.context);
                    break;
                case -2:
                    fullscreenCustomFrameLayout = new FrameLayout(this.context) {
                        @Override
                        public void onMeasure(int i4, int i5) {
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
                    if (!z) {
                        fullscreenCustomFrameLayout = new HeaderCell(this.context, this.resourcesProvider);
                    } else {
                        headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, false, this.resourcesProvider);
                        fullscreenCustomFrameLayout = headerCell2;
                    }
                    break;
                case 1:
                    headerCell = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, 0, false, false, this.resourcesProvider);
                    fullscreenCustomFrameLayout = headerCell;
                    break;
                case 2:
                    fullscreenCustomFrameLayout = new TopViewCell(this.context, this.resourcesProvider);
                    break;
                case 3:
                    headerCell2 = new TextCell(23, this.context, this.resourcesProvider, false, false);
                    fullscreenCustomFrameLayout = headerCell2;
                    break;
                case 4:
                case 9:
                    TextCheckCell textCheckCell = new TextCheckCell(this.context, 21, false, this.resourcesProvider);
                    headerCell = textCheckCell;
                    if (i == 9) {
                        textCheckCell.setDrawCheckRipple(true);
                        textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                        textCheckCell.setTypeface(AndroidUtilities.bold());
                        textCheckCell.setHeight(56);
                        headerCell = textCheckCell;
                    }
                    fullscreenCustomFrameLayout = headerCell;
                    break;
                case 5:
                case 6:
                    notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                    fullscreenCustomFrameLayout = notificationsCheckCell;
                    break;
                case 7:
                case 8:
                default:
                    fullscreenCustomFrameLayout = new TextInfoPrivacyCell(this.context, 24, this.resourcesProvider);
                    break;
                case 10:
                    fullscreenCustomFrameLayout = new DialogRadioCell(this.context);
                    break;
                case 11:
                case 12:
                    UserCell userCell = new UserCell(6, i == 12 ? 3 : 0, this.context, null, false, false);
                    userCell.setSelfAsSavedMessages(true);
                    dialogCell = userCell;
                    fullscreenCustomFrameLayout = dialogCell;
                    break;
                case 13:
                    headerCell = new UserCell(6, 0, this.context, null, false, true);
                    fullscreenCustomFrameLayout = headerCell;
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
                        this.chartSharedUI = new BaseChartView.SharedUiComponents(null);
                    }
                    headerCell = new StatisticActivity.UniversalChartCell(this.context, this.currentAccount, i - 18, this.chartSharedUI, this.classGuid);
                    fullscreenCustomFrameLayout = headerCell;
                    break;
                case 24:
                    fullscreenCustomFrameLayout = new ChannelMonetizationLayout.ProceedOverviewCell(this.context, this.resourcesProvider);
                    break;
                case 25:
                    fullscreenCustomFrameLayout = new ChannelMonetizationLayout.TransactionCell(this.context, this.resourcesProvider);
                    break;
                case 26:
                    HeaderCell headerCell3 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 20, 0, false, false, this.resourcesProvider);
                    headerCell3.setTextSize(20.0f);
                    headerCell2 = headerCell3;
                    fullscreenCustomFrameLayout = headerCell2;
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
                    } else {
                        fullscreenCustomFrameLayout = new GraySectionCell(this.context, 16, this.resourcesProvider);
                    }
                    break;
                case 32:
                    fullscreenCustomFrameLayout = new ProfileSearchCell(this.context, null);
                    break;
                case 33:
                    dialogCell = new DialogCell(null, this.context, true, UserConfig.selectedAccount, null);
                    fullscreenCustomFrameLayout = dialogCell;
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
                    fullscreenCustomFrameLayout = notificationsCheckCell;
                    break;
                case 38:
                    fullscreenCustomFrameLayout = new CollapseTextCell(this.context, this.resourcesProvider);
                    break;
                case 39:
                case 40:
                    fullscreenCustomFrameLayout = new TextCheckCell2(this.context);
                    break;
                case 42:
                    headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, true, this.resourcesProvider);
                    fullscreenCustomFrameLayout = headerCell2;
                    break;
                case 43:
                    fullscreenCustomFrameLayout = new TextSettingsCell(this.context, this.resourcesProvider, 0);
                    break;
                case 44:
                    fullscreenCustomFrameLayout = new RadioButtonCell(this.context, false);
                    break;
            }
        } else {
            UItem.UItemFactory<?> uItemFactoryFindFactory = UItem.findFactory(i);
            fullscreenCustomFrameLayout = uItemFactoryFindFactory != null ? uItemFactoryFindFactory.createView(this.context, this.listView, this.currentAccount, this.classGuid, this.resourcesProvider) : new View(this.context);
        }
        if (shouldApplyBackground(i)) {
            fullscreenCustomFrameLayout.setBackgroundColor(getThemedColor(i3));
        }
        return new RecyclerListView.Holder(fullscreenCustomFrameLayout);
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        updateReorder(viewHolder, this.allowReorder);
        updateColors(viewHolder);
    }

    public void reorderDone() {
        if (this.orderChanged) {
            callReorder(this.orderChangedId);
        }
    }

    public void reorderSectionEnd() {
        Section section = this.currentReorderSection;
        if (section != null) {
            section.end = Math.max(0, this.items.size() - 1);
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

    public void setApplyBackground(boolean z) {
        this.applyBackground = z;
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
        this.items.add(i2, this.items.remove(i));
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

    public void update(boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || !recyclerListView.isComputingLayout()) {
            lambda$update$0(z);
        } else {
            this.listView.post(new MediaActivity$$ExternalSyntheticLambda5(this, z, 12));
        }
    }

    public void updateReorder(boolean z) {
        this.allowReorder = z;
    }

    public void updateWithoutNotify() {
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.whiteSections.clear();
        this.reorderSections.clear();
        Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2 = this.fillItems;
        if (callback2 != null) {
            callback2.run(this.items, this);
        }
        updateReorderSections();
    }

    public void whiteSectionEnd() {
        Section section = this.currentWhiteSection;
        if (section != null) {
            section.end = Math.max(0, (this.items.size() + this.itemsOffset) - 1);
            Section section2 = this.currentWhiteSection;
            if (section2.start == section2.end) {
                this.whiteSections.remove(section2);
            }
            this.currentWhiteSection = null;
        }
    }

    public void whiteSectionStart() {
        Section section = new Section();
        this.currentWhiteSection = section;
        section.start = this.items.size() + this.itemsOffset;
        Section section2 = this.currentWhiteSection;
        section2.end = -1;
        this.whiteSections.add(section2);
    }

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Theme.ResourcesProvider resourcesProvider) {
        this.applyBackground = true;
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
        this.itemsOffset = 0;
        this.whiteSections = new ArrayList<>();
        this.reorderSections = new ArrayList<>();
        this.listView = recyclerListView;
        this.context = context;
        this.currentAccount = i;
        this.classGuid = i2;
        this.dialog = z;
        this.fillItems = callback2;
        this.resourcesProvider = resourcesProvider;
        update(false);
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
            UItem.UItemFactory<?> uItemFactoryFindFactory = UItem.findFactory(itemViewType);
            if (uItemFactoryFindFactory != null) {
                uItemFactoryFindFactory.attachedView(this.listView, viewHolder.itemView, getItem(viewHolder.getAdapterPosition()));
            }
        }
    }
}
