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
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
public class UniversalAdapter extends AdapterWithDiffUtils {
    private boolean allowReorder;
    private final Context context;
    private final int currentAccount;
    private Section currentReorderSection;
    private Section currentWhiteSection;
    private final Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> fillItems;
    private Utilities.Callback2<Integer, ArrayList<UItem>> onReordered;
    private boolean orderChanged;
    private int orderChangedId;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList<UItem> oldItems = new ArrayList<>();
    private final ArrayList<UItem> items = new ArrayList<>();
    private final ArrayList<Section> whiteSections = new ArrayList<>();
    private final ArrayList<Section> reorderSections = new ArrayList<>();

    public UniversalAdapter(Context context, int i, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.currentAccount = i;
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
        View view2;
        View view3;
        switch (i) {
            case -1:
                view2 = new FrameLayout(this, this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), i3);
                    }
                };
                break;
            case 0:
                View headerCell = new HeaderCell(this.context, this.resourcesProvider);
                headerCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view2 = headerCell;
                break;
            case 1:
                view2 = new TopViewCell(this.context, this.resourcesProvider);
                break;
            case 2:
                View textCell = new TextCell(this.context, this.resourcesProvider);
                textCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view2 = textCell;
                break;
            case 3:
            case 7:
                TextCheckCell textCheckCell = new TextCheckCell(this.context, this.resourcesProvider);
                if (i == 7) {
                    textCheckCell.setDrawCheckRipple(true);
                    textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                    textCheckCell.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    textCheckCell.setHeight(56);
                }
                textCheckCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = textCheckCell;
                view2 = view;
                break;
            case 4:
            case 5:
                View notificationsCheckCell = new NotificationsCheckCell(this.context, 21, 60, i == 5, this.resourcesProvider);
                notificationsCheckCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view = notificationsCheckCell;
                view2 = view;
                break;
            case 6:
            default:
                view2 = new TextInfoPrivacyCell(this.context, this.resourcesProvider);
                break;
            case 8:
                View dialogRadioCell = new DialogRadioCell(this.context);
                dialogRadioCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view2 = dialogRadioCell;
                break;
            case 9:
                UserCell userCell = new UserCell(this.context, 6, 0, false);
                userCell.setSelfAsSavedMessages(true);
                userCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view3 = userCell;
                view2 = view3;
                break;
            case 10:
                UserCell userCell2 = new UserCell(this.context, 6, 0, false, true);
                userCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view2 = userCell2;
                break;
            case 11:
                View slideChooseView = new SlideChooseView(this.context, this.resourcesProvider);
                slideChooseView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view2 = slideChooseView;
                break;
            case 12:
                View quickReplyView = new QuickRepliesActivity.QuickReplyView(this.context, this.onReordered != null, this.resourcesProvider);
                quickReplyView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view3 = quickReplyView;
                view2 = view3;
                break;
            case 13:
                View largeQuickReplyView = new QuickRepliesActivity.LargeQuickReplyView(this.context, this.resourcesProvider);
                largeQuickReplyView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                view2 = largeQuickReplyView;
                break;
        }
        return new RecyclerListView.Holder(view2);
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
        if (item != null && item2 != null) {
            if ((item2.viewType != 6) == (item.viewType != 6)) {
                return true;
            }
        }
        return false;
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
        boolean z = false;
        switch (itemViewType) {
            case -1:
                FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                if (frameLayout.getChildCount() == (item.view == null ? 0 : 1) && frameLayout.getChildAt(0) == item.view) {
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
                ((HeaderCell) viewHolder.itemView).setText(item.text);
                return;
            case 1:
                TopViewCell topViewCell = (TopViewCell) viewHolder.itemView;
                int i3 = item.iconResId;
                if (i3 != 0) {
                    topViewCell.setEmoji(i3);
                } else {
                    topViewCell.setEmoji(item.subtext.toString(), item.textValue.toString());
                }
                topViewCell.setText(item.text);
                return;
            case 2:
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (TextUtils.isEmpty(item.textValue)) {
                    int i4 = item.iconResId;
                    if (i4 == 0) {
                        textCell.setText(item.text, hasDivider);
                    } else {
                        textCell.setTextAndIcon(item.text, i4, hasDivider);
                    }
                } else {
                    int i5 = item.iconResId;
                    if (i5 == 0) {
                        textCell.setTextAndValue(item.text, item.textValue, hasDivider);
                    } else {
                        textCell.setTextAndValueAndIcon(item.text, item.textValue, i5, hasDivider);
                    }
                }
                if (item.accent) {
                    int i6 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i6, i6);
                    return;
                } else if (item.red) {
                    textCell.setColors(Theme.key_text_RedBold, Theme.key_text_RedRegular);
                    return;
                } else {
                    textCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    return;
                }
            case 3:
            case 7:
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (textCheckCell.itemId == item.id) {
                    textCheckCell.setChecked(item.checked);
                }
                textCheckCell.setTextAndCheck(item.text, item.checked, hasDivider);
                textCheckCell.itemId = item.id;
                if (itemViewType == 7) {
                    viewHolder.itemView.setBackgroundColor(Theme.getColor(item.checked ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    return;
                }
                return;
            case 4:
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                notificationsCheckCell.setTextAndValueAndCheck(item.text, item.subtext, item.checked, hasDivider);
                CharSequence charSequence = item.subtext;
                if (charSequence != null && charSequence.toString().contains("\n")) {
                    z = true;
                }
                notificationsCheckCell.setMultiline(z);
                return;
            case 5:
                ((NotificationsCheckCell) viewHolder.itemView).setTextAndValueAndCheck(item.text, item.subtext, item.checked, hasDivider);
                return;
            case 6:
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (TextUtils.isEmpty(item.text)) {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText(BuildConfig.APP_CENTER_HASH);
                } else {
                    textInfoPrivacyCell.setFixedSize(0);
                    textInfoPrivacyCell.setText(item.text);
                }
                boolean z2 = (item3 == null || item3.viewType == itemViewType) ? false : true;
                if (item2 != null && item2.viewType != itemViewType) {
                    z = true;
                }
                if (z2 && z) {
                    i2 = R.drawable.greydivider;
                } else if (z2) {
                    i2 = R.drawable.greydivider_bottom;
                } else if (z) {
                    i2 = R.drawable.greydivider_top;
                } else {
                    i2 = R.drawable.field_carret_empty;
                }
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.context, i2, Theme.key_windowBackgroundGrayShadow, this.resourcesProvider));
                return;
            case 8:
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
            case 9:
                ((UserCell) viewHolder.itemView).setFromUItem(this.currentAccount, item, hasDivider);
                return;
            case 10:
                UserCell userCell = (UserCell) viewHolder.itemView;
                userCell.setFromUItem(this.currentAccount, item, hasDivider);
                userCell.setAddButtonVisible(!item.checked);
                userCell.setCloseIcon(item.clickCallback);
                return;
            case 11:
                SlideChooseView slideChooseView = (SlideChooseView) viewHolder.itemView;
                slideChooseView.setOptions(item.intValue, item.texts);
                slideChooseView.setCallback(new SlideChooseView.Callback() {
                    @Override
                    public final void onOptionSelected(int i7) {
                        UniversalAdapter.lambda$onBindViewHolder$0(UItem.this, i7);
                    }

                    @Override
                    public void onTouchEnd() {
                        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                    }
                });
                return;
            case 12:
                QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
                quickReplyView.setChecked(item.checked, false);
                quickReplyView.setReorder(this.allowReorder);
                Object obj = item.object;
                if (obj instanceof QuickRepliesController.QuickReply) {
                    quickReplyView.set((QuickRepliesController.QuickReply) obj, null, hasDivider);
                    return;
                }
                return;
            case 13:
                QuickRepliesActivity.LargeQuickReplyView largeQuickReplyView = (QuickRepliesActivity.LargeQuickReplyView) viewHolder.itemView;
                largeQuickReplyView.setChecked(item.checked, false);
                Object obj2 = item.object;
                if (obj2 instanceof QuickRepliesController.QuickReply) {
                    largeQuickReplyView.set((QuickRepliesController.QuickReply) obj2, hasDivider);
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

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        updateReorder(viewHolder, this.allowReorder);
    }

    public void updateReorder(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder != null && viewHolder.getItemViewType() == 12) {
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
        return (itemViewType == 2 || itemViewType == 4 || itemViewType == 5 || itemViewType == 3 || itemViewType == 8 || itemViewType == 9 || itemViewType == 13 || itemViewType == 12) && (item == null || item.enabled);
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
