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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextRightIconCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
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
    protected Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> fillItems;
    protected final RecyclerListView listView;
    private Utilities.Callback2<Integer, ArrayList<UItem>> onReordered;
    private boolean orderChanged;
    private int orderChangedId;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList<UItem> oldItems = new ArrayList<>();
    private final ArrayList<UItem> items = new ArrayList<>();
    private final ArrayList<Section> whiteSections = new ArrayList<>();
    private final ArrayList<Section> reorderSections = new ArrayList<>();

    private boolean isShadow(int i) {
        return i == 7 || i == 8 || i == 31 || i == 34;
    }

    public UniversalAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Theme.ResourcesProvider resourcesProvider) {
        this.listView = recyclerListView;
        this.context = context;
        this.currentAccount = i;
        this.classGuid = i2;
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
                recyclerListView.drawSectionBackground(canvas, section.start, i2, getThemedColor(Theme.key_windowBackgroundWhite));
            }
        }
    }

    public void update(boolean z) {
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.whiteSections.clear();
        this.reorderSections.clear();
        Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2 = this.fillItems;
        if (callback2 != null) {
            callback2.run(this.items, this);
            if (z) {
                setItems(this.oldItems, this.items);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        FlickerLoadingView flickerLoadingView;
        switch (i) {
            case -1:
                flickerLoadingView = new FrameLayout(this, this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), i3);
                    }
                };
                break;
            case 0:
                View headerCell = new HeaderCell(this.context, this.resourcesProvider);
                headerCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = headerCell;
                break;
            case 1:
                View headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, false, this.resourcesProvider);
                headerCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = headerCell2;
                break;
            case 2:
                flickerLoadingView = new TopViewCell(this.context, this.resourcesProvider);
                break;
            case 3:
                View textCell = new TextCell(this.context, this.resourcesProvider);
                textCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = textCell;
                break;
            case 4:
            case 9:
                TextCheckCell textCheckCell = new TextCheckCell(this.context, this.resourcesProvider);
                if (i == 9) {
                    textCheckCell.setDrawCheckRipple(true);
                    textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                    textCheckCell.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    textCheckCell.setHeight(56);
                }
                textCheckCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = textCheckCell;
                break;
            case 5:
            case 6:
                View notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                notificationsCheckCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = notificationsCheckCell;
                break;
            case 7:
            case 8:
            default:
                flickerLoadingView = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                break;
            case 10:
                View dialogRadioCell = new DialogRadioCell(this.context);
                dialogRadioCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = dialogRadioCell;
                break;
            case 11:
            case 12:
                UserCell userCell = new UserCell(this.context, 6, i == 12 ? 3 : 0, false);
                userCell.setSelfAsSavedMessages(true);
                userCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = userCell;
                break;
            case 13:
                UserCell userCell2 = new UserCell(this.context, 6, 0, false, true);
                userCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = userCell2;
                break;
            case 14:
                View slideChooseView = new SlideChooseView(this.context, this.resourcesProvider);
                slideChooseView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = slideChooseView;
                break;
            case 15:
                View slideIntChooseView = new SlideIntChooseView(this.context, this.resourcesProvider);
                slideIntChooseView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = slideIntChooseView;
                break;
            case 16:
                View quickReplyView = new QuickRepliesActivity.QuickReplyView(this.context, this.onReordered != null, this.resourcesProvider);
                quickReplyView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = quickReplyView;
                break;
            case 17:
                View largeQuickReplyView = new QuickRepliesActivity.LargeQuickReplyView(this.context, this.resourcesProvider);
                largeQuickReplyView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
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
                universalChartCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = universalChartCell;
                break;
            case 24:
                View proceedOverviewCell = new ChannelMonetizationLayout.ProceedOverviewCell(this.context, this.resourcesProvider);
                proceedOverviewCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = proceedOverviewCell;
                break;
            case 25:
                View transactionCell = new ChannelMonetizationLayout.TransactionCell(this.context, this.resourcesProvider);
                transactionCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = transactionCell;
                break;
            case 26:
                HeaderCell headerCell3 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 8, 10, false, this.resourcesProvider);
                headerCell3.setTextSize(20.0f);
                headerCell3.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = headerCell3;
                break;
            case 27:
                StoryPrivacyBottomSheet.UserCell userCell3 = new StoryPrivacyBottomSheet.UserCell(this.context, this.resourcesProvider);
                userCell3.setIsSendAs(false, false);
                userCell3.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = userCell3;
                break;
            case 28:
                View view = new View(this.context);
                view.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = view;
                break;
            case 29:
                View businessLinkView = new BusinessLinksActivity.BusinessLinkView(this.context, this.resourcesProvider);
                businessLinkView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = businessLinkView;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme:
                View textRightIconCell = new TextRightIconCell(this.context, this.resourcesProvider);
                textRightIconCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
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
                flickerLoadingView2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView = flickerLoadingView2;
                break;
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

    @Override
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UniversalAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public static void lambda$onBindViewHolder$0(UItem uItem, int i) {
        Utilities.Callback<Integer> callback = uItem.intCallback;
        if (callback != null) {
            callback.run(Integer.valueOf(i));
        }
    }

    public StatisticActivity.BaseChartCell lambda$onBindViewHolder$1(UItem uItem) {
        View findViewByItemObject = findViewByItemObject(uItem.object);
        if (findViewByItemObject instanceof StatisticActivity.UniversalChartCell) {
            return (StatisticActivity.UniversalChartCell) findViewByItemObject;
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
        int itemViewType = viewHolder.getItemViewType();
        UItem item = getItem(viewHolder.getAdapterPosition());
        return (itemViewType == 3 || itemViewType == 5 || itemViewType == 6 || itemViewType == 30 || itemViewType == 4 || itemViewType == 10 || itemViewType == 11 || itemViewType == 12 || itemViewType == 17 || itemViewType == 16 || itemViewType == 29 || itemViewType == 25 || itemViewType == 27 || itemViewType == 32 || itemViewType == 33) && (item == null || item.enabled);
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
