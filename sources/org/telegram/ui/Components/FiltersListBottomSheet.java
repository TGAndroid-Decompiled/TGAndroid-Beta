package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.KeepMediaPopupView;

public final class FiltersListBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final ListAdapter adapter;
    public VideoEditTextureView$$ExternalSyntheticLambda1 delegate;
    public final ArrayList dialogFilters;
    public boolean ignoreLayout;
    public final ChatActivity.AnonymousClass34 listView;
    public int scrollOffsetY;
    public final ArrayList selectedDialogs;
    public final View shadow;
    public AnimatorSet shadowAnimation;
    public final TextView titleTextView;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Activity context;

        public ListAdapter(Activity activity) {
            this.context = activity;
        }

        @Override
        public final int getItemCount() {
            int size = FiltersListBottomSheet.this.dialogFilters.size();
            return size < 10 ? size + 1 : size;
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            BottomSheet.BottomSheetCell bottomSheetCell = (BottomSheet.BottomSheetCell) viewHolder.itemView;
            FiltersListBottomSheet filtersListBottomSheet = FiltersListBottomSheet.this;
            if (i >= filtersListBottomSheet.dialogFilters.size()) {
                bottomSheetCell.getImageView().setColorFilter((ColorFilter) null);
                Activity activity = this.context;
                Drawable drawable = activity.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = activity.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
                bottomSheetCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
                bottomSheetCell.setTextAndIcon(LocaleController.getString(R.string.CreateNewFilter), 0, combinedDrawable, false);
                return;
            }
            bottomSheetCell.getImageView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogIcon, false), PorterDuff.Mode.MULTIPLY));
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) filtersListBottomSheet.dialogFilters.get(i);
            bottomSheetCell.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            int i3 = dialogFilter.flags;
            if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
                i2 = R.drawable.msg_openprofile;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i3) != 0) {
                int i4 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                if ((i3 & i4) == i4) {
                    i2 = R.drawable.msg_markunread;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                    i2 = R.drawable.msg_channel;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                    i2 = R.drawable.msg_groups;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                    i2 = R.drawable.msg_contacts;
                } else if ((i3 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS) {
                    i2 = R.drawable.msg_bots;
                } else {
                    i2 = R.drawable.msg_folders;
                }
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                i2 = R.drawable.msg_channel;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                i2 = R.drawable.msg_groups;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                i2 = R.drawable.msg_contacts;
            } else if ((i3 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS) {
                i2 = R.drawable.msg_bots;
            } else {
                i2 = R.drawable.msg_folders;
            }
            bottomSheetCell.setTextAndIcon(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, bottomSheetCell.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, bottomSheetCell.getTextView().getPaint().getFontMetricsInt()), 0, new FolderDrawable(filtersListBottomSheet.getContext(), i2, dialogFilter.color), false);
            bottomSheetCell.getTextView().setEmojiColor(Theme.getColor(Theme.key_featuredStickers_addButton, ((BottomSheet) filtersListBottomSheet).resourcesProvider));
            boolean z = true;
            int i5 = 0;
            while (true) {
                ArrayList arrayList = filtersListBottomSheet.selectedDialogs;
                if (i5 >= arrayList.size()) {
                    bottomSheetCell.setChecked(z);
                    return;
                }
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(((BottomSheet) filtersListBottomSheet).currentAccount), ((Long) arrayList.get(i5)).longValue())) {
                    z = false;
                }
                i5++;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BottomSheet.BottomSheetCell bottomSheetCell = new BottomSheet.BottomSheetCell(this.context, 0, null);
            bottomSheetCell.setBackground(null);
            bottomSheetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(bottomSheetCell);
        }
    }

    public FiltersListBottomSheet(DialogsActivity dialogsActivity, ArrayList arrayList) {
        super(dialogsActivity.getParentActivity(), null, false, false);
        fixNavigationBar();
        this.selectedDialogs = arrayList;
        this.dialogFilters = new ArrayList(dialogsActivity.getMessagesController().dialogFilters);
        int i = 0;
        while (i < this.dialogFilters.size()) {
            if (((MessagesController.DialogFilter) this.dialogFilters.get(i)).isDefault()) {
                this.dialogFilters.remove(i);
                i--;
            }
            i++;
        }
        Activity parentActivity = dialogsActivity.getParentActivity();
        KeepMediaPopupView.ExceptionsView exceptionsView = new KeepMediaPopupView.ExceptionsView(this, parentActivity);
        this.containerView = exceptionsView;
        exceptionsView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i2, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, parentActivity, 13);
        this.listView = anonymousClass34;
        anonymousClass34.setTag(14);
        getContext();
        anonymousClass34.setLayoutManager(new LinearLayoutManager(1, false));
        ListAdapter listAdapter = new ListAdapter(parentActivity);
        this.adapter = listAdapter;
        anonymousClass34.setAdapter(listAdapter);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        anonymousClass34.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        anonymousClass34.setClipToPadding(false);
        anonymousClass34.setGlowColor(Theme.getColor(null, Theme.key_dialogScrollGlow, false));
        anonymousClass34.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 26));
        anonymousClass34.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 16));
        this.containerView.addView(anonymousClass34, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.titleTextView = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
        textView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void access$800(FiltersListBottomSheet filtersListBottomSheet) {
        int childCount = filtersListBottomSheet.listView.getChildCount();
        View view = filtersListBottomSheet.shadow;
        TextView textView = filtersListBottomSheet.titleTextView;
        ChatActivity.AnonymousClass34 anonymousClass34 = filtersListBottomSheet.listView;
        if (childCount <= 0) {
            int paddingTop = anonymousClass34.getPaddingTop();
            filtersListBottomSheet.scrollOffsetY = paddingTop;
            anonymousClass34.setTopGlowOffset(paddingTop);
            textView.setTranslationY(filtersListBottomSheet.scrollOffsetY);
            view.setTranslationY(filtersListBottomSheet.scrollOffsetY);
            filtersListBottomSheet.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            filtersListBottomSheet.runShadowAnimation(true);
        } else {
            filtersListBottomSheet.runShadowAnimation(false);
            i = top;
        }
        if (filtersListBottomSheet.scrollOffsetY != i) {
            filtersListBottomSheet.scrollOffsetY = i;
            anonymousClass34.setTopGlowOffset(i);
            textView.setTranslationY(filtersListBottomSheet.scrollOffsetY);
            view.setTranslationY(filtersListBottomSheet.scrollOffsetY);
            filtersListBottomSheet.containerView.invalidate();
        }
    }

    public static ArrayList getDialogsCount(BaseFragment baseFragment, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) arrayList.get(i)).longValue();
            if (DialogObject.isEncryptedDialog(jLongValue)) {
                TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(baseFragment.getMessagesController(), jLongValue);
                if (encryptedChatM != null) {
                    jLongValue = encryptedChatM.user_id;
                    if (!arrayList2.contains(Long.valueOf(jLongValue))) {
                        if (dialogFilter == null) {
                            arrayList2.add(Long.valueOf(jLongValue));
                            if (z2) {
                                break;
                                break;
                            }
                        } else {
                            arrayList2.add(Long.valueOf(jLongValue));
                            if (z2) {
                                break;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if (dialogFilter == null || ((!z || !dialogFilter.alwaysShow.contains(Long.valueOf(jLongValue))) && (z || !dialogFilter.neverShow.contains(Long.valueOf(jLongValue))))) {
                arrayList2.add(Long.valueOf(jLongValue));
                if (z2) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(5));
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void lambda$new$0$1(int i, View view) {
        DialogsActivity dialogsActivity;
        MessagesController.DialogFilter dialogFilter;
        long jLongValue;
        UndoView undoView;
        int i2;
        int i3;
        MessagesController.DialogFilter dialogFilter2;
        long jLongValue2;
        UndoView undoView2;
        VideoEditTextureView$$ExternalSyntheticLambda1 videoEditTextureView$$ExternalSyntheticLambda1 = this.delegate;
        ListAdapter listAdapter = this.adapter;
        MessagesController.DialogFilter dialogFilter3 = i < FiltersListBottomSheet.this.dialogFilters.size() ? (MessagesController.DialogFilter) FiltersListBottomSheet.this.dialogFilters.get(i) : null;
        boolean z = view instanceof BottomSheet.BottomSheetCell ? ((BottomSheet.BottomSheetCell) view).checked : false;
        DialogsActivity dialogsActivity2 = DialogsActivity.this;
        ArrayList arrayList = dialogsActivity2.selectedDialogs;
        ArrayList dialogsCount = getDialogsCount(dialogsActivity2, dialogFilter3, arrayList, true, false);
        if (z) {
            if (dialogFilter3 != null) {
                dialogsActivity = dialogsActivity2;
                dialogsActivity.presentFragment(new FilterCreateActivity(null, dialogsCount));
            } else if (z) {
                for (i3 = 0; i3 < arrayList.size(); i3++) {
                    dialogFilter3.neverShow.add((Long) arrayList.get(i3));
                    dialogFilter3.alwaysShow.remove(arrayList.get(i3));
                }
                FilterCreateActivity.saveFilterToServer(dialogFilter3, dialogFilter3.flags, dialogFilter3.name, dialogFilter3.entities, dialogFilter3.title_noanimate, dialogFilter3.color, dialogFilter3.alwaysShow, dialogFilter3.neverShow, dialogFilter3.pinnedDialogs, false, false, true, true, false, dialogsActivity2, null);
                dialogFilter2 = dialogFilter3;
                jLongValue2 = arrayList.size() == 1 ? ((Long) arrayList.get(0)).longValue() : 0L;
                undoView2 = dialogsActivity2.getUndoView();
                if (undoView2 != null) {
                    undoView2.showWithAction(jLongValue2, 21, Integer.valueOf(arrayList.size()), dialogFilter2, (Runnable) null, (Runnable) null);
                }
                dialogsActivity = dialogsActivity2;
            } else {
                if (!dialogsCount.isEmpty()) {
                    for (i2 = 0; i2 < dialogsCount.size(); i2++) {
                        dialogFilter3.neverShow.remove(dialogsCount.get(i2));
                    }
                    dialogFilter3.alwaysShow.addAll(dialogsCount);
                    FilterCreateActivity.saveFilterToServer(dialogFilter3, dialogFilter3.flags, dialogFilter3.name, dialogFilter3.entities, dialogFilter3.title_noanimate, dialogFilter3.color, dialogFilter3.alwaysShow, dialogFilter3.neverShow, dialogFilter3.pinnedDialogs, false, false, true, true, false, dialogsActivity2, null);
                }
                dialogsActivity = dialogsActivity2;
                dialogFilter = dialogFilter3;
                jLongValue = dialogsCount.size() == 1 ? ((Long) dialogsCount.get(0)).longValue() : 0L;
                undoView = dialogsActivity.getUndoView();
                if (undoView != null) {
                    undoView.showWithAction(jLongValue, 20, Integer.valueOf(dialogsCount.size()), dialogFilter, (Runnable) null, (Runnable) null);
                }
            }
            dialogsActivity.hideActionMode$1(true);
        } else {
            int size = dialogsCount.size() + (dialogFilter3 != null ? dialogFilter3.alwaysShow.size() : 0);
            if ((size <= dialogsActivity2.getMessagesController().dialogFiltersChatsLimitDefault || dialogsActivity2.getUserConfig().isPremium()) && size <= dialogsActivity2.getMessagesController().dialogFiltersChatsLimitPremium) {
                if (dialogFilter3 != null) {
                    dialogsActivity = dialogsActivity2;
                    dialogsActivity.presentFragment(new FilterCreateActivity(null, dialogsCount));
                } else if (z) {
                    while (i3 < arrayList.size()) {
                        dialogFilter3.neverShow.add((Long) arrayList.get(i3));
                        dialogFilter3.alwaysShow.remove(arrayList.get(i3));
                    }
                    FilterCreateActivity.saveFilterToServer(dialogFilter3, dialogFilter3.flags, dialogFilter3.name, dialogFilter3.entities, dialogFilter3.title_noanimate, dialogFilter3.color, dialogFilter3.alwaysShow, dialogFilter3.neverShow, dialogFilter3.pinnedDialogs, false, false, true, true, false, dialogsActivity2, null);
                    dialogFilter2 = dialogFilter3;
                    jLongValue2 = arrayList.size() == 1 ? ((Long) arrayList.get(0)).longValue() : 0L;
                    undoView2 = dialogsActivity2.getUndoView();
                    if (undoView2 != null) {
                        undoView2.showWithAction(jLongValue2, 21, Integer.valueOf(arrayList.size()), dialogFilter2, (Runnable) null, (Runnable) null);
                    }
                    dialogsActivity = dialogsActivity2;
                } else {
                    if (!dialogsCount.isEmpty()) {
                        while (i2 < dialogsCount.size()) {
                            dialogFilter3.neverShow.remove(dialogsCount.get(i2));
                        }
                        dialogFilter3.alwaysShow.addAll(dialogsCount);
                        FilterCreateActivity.saveFilterToServer(dialogFilter3, dialogFilter3.flags, dialogFilter3.name, dialogFilter3.entities, dialogFilter3.title_noanimate, dialogFilter3.color, dialogFilter3.alwaysShow, dialogFilter3.neverShow, dialogFilter3.pinnedDialogs, false, false, true, true, false, dialogsActivity2, null);
                    }
                    dialogsActivity = dialogsActivity2;
                    dialogFilter = dialogFilter3;
                    jLongValue = dialogsCount.size() == 1 ? ((Long) dialogsCount.get(0)).longValue() : 0L;
                    undoView = dialogsActivity.getUndoView();
                    if (undoView != null) {
                        undoView.showWithAction(jLongValue, 20, Integer.valueOf(dialogsCount.size()), dialogFilter, (Runnable) null, (Runnable) null);
                    }
                }
                dialogsActivity.hideActionMode$1(true);
            } else {
                dialogsActivity2.showDialog(new LimitReachedBottomSheet(4, ((BaseFragment) dialogsActivity2).currentAccount, dialogsActivity2.fragmentView.getContext(), dialogsActivity2, null));
            }
        }
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void runShadowAnimation(boolean z) {
        View view = this.shadow;
        if ((!z || view.getTag() == null) && (z || view.getTag() != null)) {
            return;
        }
        view.setTag(z ? null : 1);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new ChatActivity.AnonymousClass77(22, this, z));
        this.shadowAnimation.start();
    }
}
