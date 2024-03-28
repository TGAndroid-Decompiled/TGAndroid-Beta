package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stats$BroadcastRevenueTransaction;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
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
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
public class UniversalAdapter extends AdapterWithDiffUtils {
    private boolean allowReorder;
    private BaseChartView.SharedUiComponents chartSharedUI;
    private final int classGuid;
    private final Context context;
    private final int currentAccount;
    private Section currentReorderSection;
    private Section currentWhiteSection;
    private final Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> fillItems;
    private final RecyclerListView listView;
    private Utilities.Callback2<Integer, ArrayList<UItem>> onReordered;
    private boolean orderChanged;
    private int orderChangedId;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList<UItem> oldItems = new ArrayList<>();
    private final ArrayList<UItem> items = new ArrayList<>();
    private final ArrayList<Section> whiteSections = new ArrayList<>();
    private final ArrayList<Section> reorderSections = new ArrayList<>();

    private boolean isShadow(int i) {
        return i == 7 || i == 8;
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
        this.fillItems.run(this.items, this);
        if (z) {
            setItems(this.oldItems, this.items);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        switch (i) {
            case -1:
                view = new FrameLayout(this, this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), i3);
                    }
                };
                break;
            case 0:
                View headerCell = new HeaderCell(this.context, this.resourcesProvider);
                headerCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = headerCell;
                break;
            case 1:
                View headerCell2 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 17, 15, false, this.resourcesProvider);
                headerCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = headerCell2;
                break;
            case 2:
                view = new TopViewCell(this.context, this.resourcesProvider);
                break;
            case 3:
                View textCell = new TextCell(this.context, this.resourcesProvider);
                textCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = textCell;
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
                view = textCheckCell;
                break;
            case 5:
            case 6:
                View notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 6, this.resourcesProvider);
                notificationsCheckCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = notificationsCheckCell;
                break;
            case 7:
            case 8:
            default:
                view = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                break;
            case 10:
                View dialogRadioCell = new DialogRadioCell(this.context);
                dialogRadioCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = dialogRadioCell;
                break;
            case 11:
            case 12:
                UserCell userCell = new UserCell(this.context, 6, i == 12 ? 3 : 0, false);
                userCell.setSelfAsSavedMessages(true);
                userCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = userCell;
                break;
            case 13:
                UserCell userCell2 = new UserCell(this.context, 6, 0, false, true);
                userCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = userCell2;
                break;
            case 14:
                View slideChooseView = new SlideChooseView(this.context, this.resourcesProvider);
                slideChooseView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = slideChooseView;
                break;
            case 15:
                View slideIntChooseView = new SlideIntChooseView(this.context, this.resourcesProvider);
                slideIntChooseView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = slideIntChooseView;
                break;
            case 16:
                View quickReplyView = new QuickRepliesActivity.QuickReplyView(this.context, this.onReordered != null, this.resourcesProvider);
                quickReplyView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = quickReplyView;
                break;
            case 17:
                View largeQuickReplyView = new QuickRepliesActivity.LargeQuickReplyView(this.context, this.resourcesProvider);
                largeQuickReplyView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = largeQuickReplyView;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                if (this.chartSharedUI == null) {
                    this.chartSharedUI = new BaseChartView.SharedUiComponents();
                }
                View universalChartCell = new StatisticActivity.UniversalChartCell(this.context, this.currentAccount, i - 18, this.chartSharedUI, this.classGuid);
                universalChartCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = universalChartCell;
                break;
            case 22:
                View proceedOverviewCell = new ChannelMonetizationLayout.ProceedOverviewCell(this.context, this.resourcesProvider);
                proceedOverviewCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = proceedOverviewCell;
                break;
            case 23:
                View transactionCell = new ChannelMonetizationLayout.TransactionCell(this.context, this.resourcesProvider);
                transactionCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = transactionCell;
                break;
            case 24:
                HeaderCell headerCell3 = new HeaderCell(this.context, Theme.key_windowBackgroundWhiteBlackText, 23, 8, 10, false, this.resourcesProvider);
                headerCell3.setTextSize(20.0f);
                headerCell3.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = headerCell3;
                break;
            case 25:
                StoryPrivacyBottomSheet.UserCell userCell3 = new StoryPrivacyBottomSheet.UserCell(this.context, this.resourcesProvider);
                userCell3.setIsSendAs(false, false);
                userCell3.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = userCell3;
                break;
            case 26:
                View view2 = new View(this.context);
                view2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = view2;
                break;
            case 27:
                View businessLinkView = new BusinessLinksActivity.BusinessLinkView(this.context, this.resourcesProvider);
                businessLinkView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = businessLinkView;
                break;
            case 28:
                View textRightIconCell = new TextRightIconCell(this.context, this.resourcesProvider);
                textRightIconCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = textRightIconCell;
                break;
        }
        return new RecyclerListView.Holder(view);
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
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        final UItem item = getItem(i);
        UItem item2 = getItem(i + 1);
        UItem item3 = getItem(i - 1);
        if (item == null) {
            return;
        }
        int itemViewType = viewHolder.getItemViewType();
        boolean hasDivider = hasDivider(i);
        switch (itemViewType) {
            case -1:
                FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                if (frameLayout.getChildCount() == (item.view != null) && frameLayout.getChildAt(0) == item.view) {
                    return;
                }
                frameLayout.removeAllViews();
                View view = item.view;
                if (view != null) {
                    AndroidUtilities.removeFromParent(view);
                    frameLayout.addView(item.view, LayoutHelper.createFrame(-1, -1.0f));
                    return;
                }
                return;
            case 0:
            case 1:
            case 24:
                ((HeaderCell) viewHolder.itemView).setText(item.text);
                int i3 = item.backgroundKey;
                if (i3 != 0) {
                    viewHolder.itemView.setBackgroundColor(getThemedColor(i3));
                    return;
                }
                return;
            case 2:
                TopViewCell topViewCell = (TopViewCell) viewHolder.itemView;
                int i4 = item.iconResId;
                if (i4 != 0) {
                    topViewCell.setEmoji(i4);
                } else {
                    topViewCell.setEmoji(item.subtext.toString(), item.textValue.toString());
                }
                topViewCell.setText(item.text);
                return;
            case 3:
                TextCell textCell = (TextCell) viewHolder.itemView;
                Object obj = item.object;
                if (obj instanceof TLRPC$Document) {
                    textCell.setTextAndSticker(item.text, (TLRPC$Document) obj, hasDivider);
                } else if (TextUtils.isEmpty(item.textValue)) {
                    int i5 = item.iconResId;
                    if (i5 == 0) {
                        textCell.setText(item.text, hasDivider);
                    } else {
                        textCell.setTextAndIcon(item.text, i5, hasDivider);
                    }
                } else {
                    int i6 = item.iconResId;
                    if (i6 == 0) {
                        textCell.setTextAndValue(item.text, item.textValue, hasDivider);
                    } else {
                        textCell.setTextAndValueAndIcon(item.text, item.textValue, i6, hasDivider);
                    }
                }
                if (item.accent) {
                    int i7 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i7, i7);
                } else if (item.red) {
                    textCell.setColors(Theme.key_text_RedBold, Theme.key_text_RedRegular);
                } else {
                    textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                }
                int i8 = item.backgroundKey;
                if (i8 != 0) {
                    textCell.setBackgroundColor(getThemedColor(i8));
                    return;
                }
                return;
            case 4:
            case 9:
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (textCheckCell.itemId == item.id) {
                    textCheckCell.setChecked(item.checked);
                }
                textCheckCell.setTextAndCheck(item.text, item.checked, hasDivider);
                textCheckCell.itemId = item.id;
                if (itemViewType == 9) {
                    viewHolder.itemView.setBackgroundColor(Theme.getColor(item.checked ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    return;
                }
                return;
            case 5:
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                notificationsCheckCell.setTextAndValueAndCheck(item.text, item.subtext, item.checked, hasDivider);
                CharSequence charSequence = item.subtext;
                notificationsCheckCell.setMultiline((charSequence == null || !charSequence.toString().contains("\n")) ? false : false);
                return;
            case 6:
                ((NotificationsCheckCell) viewHolder.itemView).setTextAndValueAndCheck(item.text, item.subtext, item.checked, hasDivider);
                return;
            case 7:
            case 8:
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
                boolean z = (item3 == null || isShadow(item3.viewType)) ? false : true;
                r7 = (item2 == null || isShadow(item2.viewType)) ? false : false;
                if (z && r7) {
                    i2 = R.drawable.greydivider;
                } else if (z) {
                    i2 = R.drawable.greydivider_bottom;
                } else if (r7) {
                    i2 = R.drawable.greydivider_top;
                } else {
                    i2 = R.drawable.field_carret_empty;
                }
                int i9 = item.backgroundKey;
                if (i9 != 0) {
                    textInfoPrivacyCell.setBackgroundColor(getThemedColor(i9));
                }
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.context, i2, Theme.key_windowBackgroundGrayShadow, this.resourcesProvider));
                return;
            case 10:
                DialogRadioCell dialogRadioCell = (DialogRadioCell) viewHolder.itemView;
                if (dialogRadioCell.itemId == item.id) {
                    dialogRadioCell.setChecked(item.checked, true);
                    dialogRadioCell.setEnabled(item.enabled, true);
                } else {
                    dialogRadioCell.setEnabled(item.enabled, false);
                }
                if (TextUtils.isEmpty(item.textValue)) {
                    dialogRadioCell.setText(item.text, item.checked, hasDivider);
                } else {
                    dialogRadioCell.setTextAndValue(item.text, item.textValue, item.checked, hasDivider);
                }
                dialogRadioCell.itemId = item.id;
                return;
            case 11:
            case 12:
                UserCell userCell = (UserCell) viewHolder.itemView;
                userCell.setFromUItem(this.currentAccount, item, hasDivider);
                if (itemViewType == 12) {
                    userCell.setChecked(item.checked, false);
                    return;
                }
                return;
            case 13:
                UserCell userCell2 = (UserCell) viewHolder.itemView;
                userCell2.setFromUItem(this.currentAccount, item, hasDivider);
                userCell2.setAddButtonVisible(!item.checked);
                userCell2.setCloseIcon(item.clickCallback);
                return;
            case 14:
                SlideChooseView slideChooseView = (SlideChooseView) viewHolder.itemView;
                slideChooseView.setOptions(item.intValue, item.texts);
                slideChooseView.setCallback(new SlideChooseView.Callback() {
                    @Override
                    public final void onOptionSelected(int i10) {
                        UniversalAdapter.lambda$onBindViewHolder$0(UItem.this, i10);
                    }

                    @Override
                    public void onTouchEnd() {
                        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                    }
                });
                return;
            case 15:
                ((SlideIntChooseView) viewHolder.itemView).set(item.intValue, (SlideIntChooseView.Options) item.object, item.intCallback);
                return;
            case 16:
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                quickReplyView.setChecked(item.checked, false);
                quickReplyView.setReorder(this.allowReorder);
                Object obj2 = item.object;
                if (obj2 instanceof QuickRepliesController.QuickReply) {
                    quickReplyView.set((QuickRepliesController.QuickReply) obj2, null, hasDivider);
                    return;
                }
                return;
            case 17:
                QuickRepliesActivity.LargeQuickReplyView largeQuickReplyView = (QuickRepliesActivity.LargeQuickReplyView) viewHolder.itemView;
                largeQuickReplyView.setChecked(item.checked, false);
                Object obj3 = item.object;
                if (obj3 instanceof QuickRepliesController.QuickReply) {
                    largeQuickReplyView.set((QuickRepliesController.QuickReply) obj3, hasDivider);
                    return;
                }
                return;
            case 18:
            case 19:
            case 20:
            case 21:
                ((StatisticActivity.UniversalChartCell) viewHolder.itemView).set(item.intValue, (StatisticActivity.ChartViewData) item.object, new Utilities.Callback0Return() {
                    @Override
                    public final Object run() {
                        StatisticActivity.BaseChartCell lambda$onBindViewHolder$1;
                        lambda$onBindViewHolder$1 = UniversalAdapter.this.lambda$onBindViewHolder$1(item);
                        return lambda$onBindViewHolder$1;
                    }
                });
                return;
            case 22:
                ((ChannelMonetizationLayout.ProceedOverviewCell) viewHolder.itemView).set((ChannelMonetizationLayout.ProceedOverview) item.object);
                return;
            case 23:
                ((ChannelMonetizationLayout.TransactionCell) viewHolder.itemView).set((TL_stats$BroadcastRevenueTransaction) item.object, hasDivider);
                return;
            case 25:
                StoryPrivacyBottomSheet.UserCell userCell3 = (StoryPrivacyBottomSheet.UserCell) viewHolder.itemView;
                long j = userCell3.dialogId;
                Object obj4 = item.object;
                boolean z2 = j == (obj4 instanceof TLRPC$User ? ((TLRPC$User) obj4).id : obj4 instanceof TLRPC$Chat ? -((TLRPC$Chat) obj4).id : 0L);
                userCell3.setIsSendAs(false, true);
                userCell3.set(item.object);
                userCell3.checkBox.setVisibility(8);
                userCell3.radioButton.setVisibility(0);
                userCell3.setChecked(item.checked, z2);
                userCell3.setDivider(hasDivider);
                return;
            case 26:
                if (item.transparent) {
                    viewHolder.itemView.setBackgroundColor(0);
                }
                viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, item.intValue));
                return;
            case 27:
                BusinessLinksActivity.BusinessLinkView businessLinkView = (BusinessLinksActivity.BusinessLinkView) viewHolder.itemView;
                Object obj5 = item.object;
                if (obj5 instanceof BusinessLinksActivity.BusinessLinkWrapper) {
                    businessLinkView.set((BusinessLinksActivity.BusinessLinkWrapper) obj5, hasDivider);
                    return;
                }
                return;
            case 28:
                TextRightIconCell textRightIconCell = (TextRightIconCell) viewHolder.itemView;
                textRightIconCell.setTextAndIcon(item.text, item.iconResId);
                textRightIconCell.setDivider(hasDivider);
                int i10 = item.backgroundKey;
                if (i10 != 0) {
                    textRightIconCell.setBackgroundColor(getThemedColor(i10));
                    return;
                }
                return;
            default:
                return;
        }
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
        return (itemViewType == 3 || itemViewType == 5 || itemViewType == 6 || itemViewType == 28 || itemViewType == 4 || itemViewType == 10 || itemViewType == 11 || itemViewType == 12 || itemViewType == 17 || itemViewType == 16 || itemViewType == 27 || itemViewType == 23 || itemViewType == 25) && (item == null || item.enabled);
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
