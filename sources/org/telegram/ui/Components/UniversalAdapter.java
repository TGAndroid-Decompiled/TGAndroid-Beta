package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPController;
import org.telegram.ui.ActionBar.ActionBar;
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
    private BaseChartView.SharedUiComponents chartSharedUI;
    private final int classGuid;
    private final Context context;
    private final int currentAccount;
    private Section currentReorderSection;
    private Section currentWhiteSection;
    private final boolean dialog;
    protected Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> fillItems;
    private final ArrayList<UItem> items;
    protected final RecyclerListView listView;
    private final ArrayList<UItem> oldItems;
    private Utilities.Callback2<Integer, ArrayList<UItem>> onReordered;
    private boolean orderChanged;
    private int orderChangedId;
    private final ArrayList<Section> reorderSections;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList<Section> whiteSections;

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Theme.ResourcesProvider resourcesProvider) {
        this(recyclerListView, context, i, i2, false, callback2, resourcesProvider);
    }

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Theme.ResourcesProvider resourcesProvider) {
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
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

    public static class Section {
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
        section.start = this.items.size();
        Section section2 = this.currentWhiteSection;
        section2.end = -1;
        this.whiteSections.add(section2);
    }

    public void whiteSectionEnd() {
        Section section = this.currentWhiteSection;
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

    public void reorderSectionEnd() {
        Section section = this.currentReorderSection;
        if (section != null) {
            section.end = Math.max(0, this.items.size() - 1);
        }
    }

    public boolean isReorderItem(int i) {
        return getReorderSectionId(i) >= 0;
    }

    public int getReorderSectionId(int i) {
        for (int i2 = 0; i2 < this.reorderSections.size(); i2++) {
            if (this.reorderSections.get(i2).contains(i)) {
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
        boolean hasDivider = hasDivider(i);
        boolean hasDivider2 = hasDivider(i2);
        this.items.set(i, this.items.get(i2));
        this.items.set(i2, this.items.get(i));
        notifyItemMoved(i, i2);
        if (hasDivider(i2) != hasDivider) {
            notifyItemChanged(i2, 3);
        }
        if (hasDivider(i) != hasDivider2) {
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
        Section section = this.reorderSections.get(i);
        this.onReordered.run(Integer.valueOf(i), new ArrayList<>(this.items.subList(section.start, section.end + 1)));
        this.orderChanged = false;
    }

    public void reorderDone() {
        if (this.orderChanged) {
            callReorder(this.orderChangedId);
        }
    }

    public void listenReorder(Utilities.Callback2<Integer, ArrayList<UItem>> callback2) {
        this.onReordered = callback2;
    }

    public void updateReorder(boolean z) {
        this.allowReorder = z;
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

    public void update(final boolean z) {
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.whiteSections.clear();
        this.reorderSections.clear();
        Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2 = this.fillItems;
        if (callback2 != null) {
            callback2.run(this.items, this);
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null && recyclerListView.isComputingLayout()) {
                this.listView.post(new Runnable() {
                    @Override
                    public final void run() {
                        UniversalAdapter.this.lambda$update$0(z);
                    }
                });
            } else if (z) {
                setItems(this.oldItems, this.items);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public void lambda$update$0(boolean z) {
        if (z) {
            setItems(this.oldItems, this.items);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View headerCell;
        View view;
        FlickerLoadingView flickerLoadingView;
        boolean z = this.dialog;
        int i2 = z ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite;
        if (i >= UItem.factoryViewTypeStartsWith) {
            UItem.UItemFactory<?> findFactory = UItem.findFactory(i);
            if (findFactory != null) {
                ?? createView = findFactory.createView(this.context, this.currentAccount, this.classGuid, this.resourcesProvider);
                flickerLoadingView = createView;
                if (!findFactory.isShadow()) {
                    createView.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = createView;
                }
            } else {
                flickerLoadingView = new View(this.context);
            }
        } else {
            switch (i) {
                case VoIPController.ERROR_LOCALIZED:
                    View view2 = new FrameLayout(this, this.context) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            int size = View.MeasureSpec.getSize(i4);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
                            measureChildren(makeMeasureSpec, i4);
                            int i5 = 0;
                            for (int i6 = 0; i6 < getChildCount(); i6++) {
                                i5 = Math.max(i5, getChildAt(i6).getMeasuredHeight());
                            }
                            if (size > 0) {
                                i5 = Math.min(i5, size - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight()));
                            }
                            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        }
                    };
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    flickerLoadingView = view2;
                    break;
                case VoIPController.ERROR_PRIVACY:
                    flickerLoadingView = new FrameLayout(this, this.context) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
                            measureChildren(makeMeasureSpec, i4);
                            int i5 = 0;
                            for (int i6 = 0; i6 < getChildCount(); i6++) {
                                i5 = Math.max(i5, getChildAt(i6).getMeasuredHeight());
                            }
                            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        }
                    };
                    break;
                case -1:
                    flickerLoadingView = new FrameLayout(this, this.context) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i4);
                        }
                    };
                    break;
                case 0:
                    if (z) {
                        headerCell = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, this.resourcesProvider);
                    } else {
                        headerCell = new HeaderCell(this.context, this.resourcesProvider);
                    }
                    View view3 = headerCell;
                    view3.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = view3;
                    break;
                case 1:
                    View headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, false, this.resourcesProvider);
                    headerCell2.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = headerCell2;
                    break;
                case 2:
                    flickerLoadingView = new TopViewCell(this.context, this.resourcesProvider);
                    break;
                case 3:
                    View textCell = new TextCell(this.context, this.resourcesProvider);
                    textCell.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = textCell;
                    break;
                case 4:
                case 9:
                    TextCheckCell textCheckCell = new TextCheckCell(this.context, this.resourcesProvider);
                    if (i == 9) {
                        textCheckCell.setDrawCheckRipple(true);
                        textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                        textCheckCell.setTypeface(AndroidUtilities.bold());
                        textCheckCell.setHeight(56);
                    }
                    textCheckCell.setBackgroundColor(getThemedColor(i2));
                    view = textCheckCell;
                    flickerLoadingView = view;
                    break;
                case 5:
                case 6:
                    View notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                    notificationsCheckCell.setBackgroundColor(getThemedColor(i2));
                    view = notificationsCheckCell;
                    flickerLoadingView = view;
                    break;
                case 7:
                case 8:
                default:
                    flickerLoadingView = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                    break;
                case 10:
                    View dialogRadioCell = new DialogRadioCell(this.context);
                    dialogRadioCell.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = dialogRadioCell;
                    break;
                case 11:
                case 12:
                    UserCell userCell = new UserCell(this.context, 6, i == 12 ? 3 : 0, false);
                    userCell.setSelfAsSavedMessages(true);
                    userCell.setBackgroundColor(getThemedColor(i2));
                    view = userCell;
                    flickerLoadingView = view;
                    break;
                case 13:
                    UserCell userCell2 = new UserCell(this.context, 6, 0, false, true);
                    userCell2.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = userCell2;
                    break;
                case 14:
                    View slideChooseView = new SlideChooseView(this.context, this.resourcesProvider);
                    slideChooseView.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = slideChooseView;
                    break;
                case 15:
                    View slideIntChooseView = new SlideIntChooseView(this.context, this.resourcesProvider);
                    slideIntChooseView.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = slideIntChooseView;
                    break;
                case 16:
                    View quickReplyView = new QuickRepliesActivity.QuickReplyView(this.context, this.onReordered != null, this.resourcesProvider);
                    quickReplyView.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = quickReplyView;
                    break;
                case 17:
                    View largeQuickReplyView = new QuickRepliesActivity.LargeQuickReplyView(this.context, this.resourcesProvider);
                    largeQuickReplyView.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = largeQuickReplyView;
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
                    View universalChartCell = new StatisticActivity.UniversalChartCell(this.context, this.currentAccount, i - 18, this.chartSharedUI, this.classGuid);
                    universalChartCell.setBackgroundColor(getThemedColor(i2));
                    view = universalChartCell;
                    flickerLoadingView = view;
                    break;
                case 24:
                    View proceedOverviewCell = new ChannelMonetizationLayout.ProceedOverviewCell(this.context, this.resourcesProvider);
                    proceedOverviewCell.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = proceedOverviewCell;
                    break;
                case 25:
                    View transactionCell = new ChannelMonetizationLayout.TransactionCell(this.context, this.resourcesProvider);
                    transactionCell.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = transactionCell;
                    break;
                case 26:
                    HeaderCell headerCell3 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 20, 0, false, this.resourcesProvider);
                    headerCell3.setTextSize(20.0f);
                    flickerLoadingView = headerCell3;
                    break;
                case 27:
                    StoryPrivacyBottomSheet.UserCell userCell3 = new StoryPrivacyBottomSheet.UserCell(this.context, this.resourcesProvider);
                    userCell3.setIsSendAs(false, false);
                    userCell3.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = userCell3;
                    break;
                case 28:
                    View view4 = new View(this.context);
                    view4.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = view4;
                    break;
                case 29:
                    View businessLinkView = new BusinessLinksActivity.BusinessLinkView(this.context, this.resourcesProvider);
                    businessLinkView.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = businessLinkView;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme:
                    View textRightIconCell = new TextRightIconCell(this.context, this.resourcesProvider);
                    textRightIconCell.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = textRightIconCell;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable:
                    flickerLoadingView = new GraySectionCell(this.context, this.resourcesProvider);
                    break;
                case 32:
                    View profileSearchCell = new ProfileSearchCell(this.context);
                    profileSearchCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    flickerLoadingView = profileSearchCell;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle:
                    View dialogCell = new DialogCell(null, this.context, false, true);
                    dialogCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    flickerLoadingView = dialogCell;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle:
                    FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(this.context, this.resourcesProvider);
                    flickerLoadingView2.setIsSingleCell(true);
                    flickerLoadingView2.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = flickerLoadingView2;
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons:
                case R.styleable.AppCompatTheme_alertDialogStyle:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.context, i == 35 ? 4 : i == 36 ? 6 : i == 37 ? 7 : i == 41 ? 8 : 0, 21, true, this.resourcesProvider);
                    checkBoxCell.getCheckBoxRound().setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    checkBoxCell.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = checkBoxCell;
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme:
                    flickerLoadingView = new CollapseTextCell(this.context, this.resourcesProvider);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle:
                case R.styleable.AppCompatTheme_borderlessButtonStyle:
                    View textCheckCell2 = new TextCheckCell2(this.context);
                    textCheckCell2.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = textCheckCell2;
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle:
                    View headerCell4 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 0, false, true, this.resourcesProvider);
                    headerCell4.setBackgroundColor(getThemedColor(i2));
                    flickerLoadingView = headerCell4;
                    break;
            }
        }
        return new RecyclerListView.Holder(flickerLoadingView);
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

    public boolean isShadow(int i) {
        if (i < UItem.factoryViewTypeStartsWith) {
            return i == 7 || i == 8 || i == 38 || i == 31 || i == 34;
        }
        UItem.UItemFactory<?> findFactory = UItem.findFactory(i);
        return findFactory != null && findFactory.isShadow();
    }

    @Override
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UniversalAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public static void lambda$onBindViewHolder$1(UItem uItem, int i) {
        Utilities.Callback<Integer> callback = uItem.intCallback;
        if (callback != null) {
            callback.run(Integer.valueOf(i));
        }
    }

    public StatisticActivity.BaseChartCell lambda$onBindViewHolder$2(UItem uItem) {
        View findViewByItemObject = findViewByItemObject(uItem.object);
        if (findViewByItemObject instanceof StatisticActivity.UniversalChartCell) {
            return (StatisticActivity.UniversalChartCell) findViewByItemObject;
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
    }

    public void updateReorder(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder != null && viewHolder.getItemViewType() == 16) {
            ((QuickRepliesActivity.QuickReplyView) viewHolder.itemView).setReorder(z);
        }
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        UItem.UItemFactory<?> findFactory;
        int itemViewType = viewHolder.getItemViewType();
        UItem item = getItem(viewHolder.getAdapterPosition());
        if (itemViewType < UItem.factoryViewTypeStartsWith ? itemViewType == 3 || itemViewType == 5 || itemViewType == 6 || itemViewType == 30 || itemViewType == 4 || itemViewType == 10 || itemViewType == 11 || itemViewType == 12 || itemViewType == 17 || itemViewType == 16 || itemViewType == 29 || itemViewType == 25 || itemViewType == 27 || itemViewType == 32 || itemViewType == 33 || itemViewType == 35 || itemViewType == 36 || itemViewType == 37 || itemViewType == 41 || itemViewType == 39 || itemViewType == 40 || itemViewType == 38 : (findFactory = UItem.findFactory(itemViewType)) != null && findFactory.isClickable()) {
            return item == null || item.enabled;
        }
        return false;
    }

    public UItem getItem(int i) {
        if (i < 0 || i >= this.items.size()) {
            return null;
        }
        return this.items.get(i);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
