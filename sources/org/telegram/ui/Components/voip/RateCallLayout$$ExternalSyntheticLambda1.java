package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.ChatScrimPopupContainerLayout;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.HashtagHistoryView;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftLinkBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;
import org.telegram.ui.ContactAddActivity;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.DialogOrContactPickerActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.web.WebActionBar;

public final class RateCallLayout$$ExternalSyntheticLambda1 implements ChatAttachAlertAudioLayout.AudioSelectDelegate, AlertsCreator.ScheduleDatePickerDelegate, ActionBarPopupWindow.onSizeChangedListener, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListener, OnFailureListener, PaymentFormActivity.PaymentFormCallback, DialogsActivity.DialogsActivityDelegate, SelectAnimatedEmojiDialog.BackgroundDelegate, MessagesStorage.BooleanCallback, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListenerExtended, ViewPositionWatcher.OnChangedListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public RateCallLayout$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final void onDoubleTap$org$telegram$ui$Components$UniversalRecyclerView$$ExternalSyntheticLambda4(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$DataSettingsActivity$$ExternalSyntheticLambda0(View view, float f, float f2) {
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void didSelectAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            ((Utilities.Callback) this.f$0).run(new PollAttachedMediaMusic((MessageObject) arrayList.get(0)));
        }
        ((ChatAttachAlertPollLayout.AnonymousClass14) this.f$1).dismiss(true);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
        if (!z) {
            chatAttachAlertPollLayout.getClass();
            return;
        }
        chatAttachAlertPollLayout.pollLimitDeadline = i;
        chatAttachAlertPollLayout.pollLimitDuration = 0;
        View view = (View) this.f$1;
        if (view instanceof TextCell) {
            chatAttachAlertPollLayout.checkDurationInfoRow((TextCell) view, true);
        } else {
            chatAttachAlertPollLayout.listAdapter.notifyItemChanged(chatAttachAlertPollLayout.poll2vLimitDurationTimeRow);
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 14:
                PremiumPreviewGiftLinkBottomSheet premiumPreviewGiftLinkBottomSheet = (PremiumPreviewGiftLinkBottomSheet) this.f$0;
                premiumPreviewGiftLinkBottomSheet.getClass();
                long j = 0;
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    long j2 = ((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId;
                    premiumPreviewGiftLinkBottomSheet.baseFragment.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f$1, j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i3++;
                    j = j2;
                }
                dialogsActivity.finishFragment();
                BoostDialogs.showGiftLinkForwardedBulletin(j);
                break;
            default:
                GiftInfoAdapter giftInfoAdapter = (GiftInfoAdapter) this.f$0;
                giftInfoAdapter.getClass();
                long j3 = 0;
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    long j4 = ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId;
                    giftInfoAdapter.baseFragment.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of((String) this.f$1, j4, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i4++;
                    j3 = j4;
                }
                dialogsActivity.finishFragment();
                BoostDialogs.showGiftLinkForwardedBulletin(j3);
                break;
        }
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                ((EditTextCaption.InputDialogCallback) this.f$0).run(((WebActionBar.AnonymousClass4) this.f$1).getText().toString().trim());
                break;
            case 5:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            case 27:
            default:
                ((DialogsActivity) this.f$0).getMediaDataController().removeWebapp(((TLRPC.User) this.f$1).id);
                break;
            case 6:
                HashtagHistoryView hashtagHistoryView = (HashtagHistoryView) this.f$0;
                HashtagSearchController.getInstance(hashtagHistoryView.currentAccount).removeHashtagFromHistory((String) this.f$1);
                hashtagHistoryView.adapter.update(true);
                break;
            case 7:
                MediaActivity mediaActivity = MediaActivity.this;
                mediaActivity.getMessagesController().getStoriesController().deleteStories(mediaActivity.dialogId, (ArrayList) this.f$1);
                mediaActivity.sharedMediaLayout.closeActionMode(false);
                break;
            case 9:
                ((LimitReachedBottomSheet) this.f$0).lambda$revokeLinks$25((ArrayList) this.f$1);
                break;
            case 10:
                ((AtomicBoolean) this.f$0).set(true);
                ((SelectorBottomSheet$$ExternalSyntheticLambda0) this.f$1).run();
                break;
            case 11:
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0).run((TLRPC.TL_premiumGiftCodeOption) this.f$1);
                break;
            case 17:
                SearchViewPager searchViewPager = (SearchViewPager) this.f$0;
                searchViewPager.getClass();
                alertDialog.dismiss();
                searchViewPager.parent.getDownloadController().deleteRecentFiles((ArrayList) this.f$1);
                searchViewPager.showActionMode(false);
                break;
            case 19:
                ((Runnable) this.f$0).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f$1);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new PassportActivity$$ExternalSyntheticLambda1(11));
                break;
            case 23:
                Activity activity = (Activity) this.f$1;
                Intent intent = new Intent(activity, (Class<?>) LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f$0));
                activity.startActivity(intent);
                break;
            case 24:
                ContactAddActivity contactAddActivity = (ContactAddActivity) this.f$0;
                contactAddActivity.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                TLRPC.User user = (TLRPC.User) this.f$1;
                arrayList.add(user);
                contactAddActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                contactAddActivity.finishFragment();
                break;
            case 25:
                ((ContactsActivity) this.f$0).lambda$createView$4((String) this.f$1);
                break;
            case 26:
                ContactsActivity contactsActivity = (ContactsActivity) this.f$0;
                ContactsActivity.ContactsActivityDelegate contactsActivityDelegate = contactsActivity.delegate;
                if (contactsActivityDelegate != null) {
                    contactsActivityDelegate.didSelectContact((TLRPC.User) this.f$1);
                    contactsActivity.delegate = null;
                }
                break;
            case 28:
                ((DialogOrContactPickerActivity) this.f$0).lambda$showBlockAlert$3((TLRPC.User) this.f$1);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public void onFailure(Exception exc) {
        PhotoView photoView = (PhotoView) this.f$0;
        photoView.segmentingLoading = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT < 24 || !(exc instanceof MlKitException) || exc.getMessage() == null || !exc.getMessage().contains("segmentation optional module to be downloaded") || !photoView.isAttachedToWindow()) {
            photoView.segmentingLoaded = true;
        } else {
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(14, photoView, (Bitmap) this.f$1), 2000L);
        }
    }

    @Override
    public void onInvoiceStatusChanged(int i) {
        switch (this.$r8$classId) {
            case 12:
                if (i == 1) {
                    ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0).run(null);
                } else if (i != 3) {
                    ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$1).run(null);
                }
                break;
            default:
                if (i == 1) {
                    ((Utilities.Callback) this.f$0).run(null);
                } else if (i != 3) {
                    ((Utilities.Callback) this.f$1).run(null);
                }
                break;
        }
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 20:
                UItem item = ((UniversalRecyclerView) this.f$0).adapter.getItem(i);
                if (item != null) {
                    ((Utilities.Callback5) this.f$1).mo1067run(item, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
                    break;
                }
                break;
            default:
                ((DataSettingsActivity) this.f$0).lambda$createView$9((Context) this.f$1, view, i, f);
                break;
        }
    }

    @Override
    public void onLongClickRelease() {
    }

    @Override
    public void onMove(float f) {
    }

    @Override
    public void onPositionChanged(View view, RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        BlurredBackgroundDrawable blurredBackgroundDrawable = (BlurredBackgroundDrawable) this.f$0;
        if (blurredBackgroundDrawable.sourceOffsetX != f || blurredBackgroundDrawable.sourceOffsetY != f2) {
            blurredBackgroundDrawable.sourceOffsetX = f;
            blurredBackgroundDrawable.sourceOffsetY = f2;
            blurredBackgroundDrawable.onSourceOffsetChange();
        }
        ((View) this.f$1).invalidate();
    }

    @Override
    public void onSizeChanged() {
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = (ChatScrimPopupContainerLayout) this.f$0;
        if (chatScrimPopupContainerLayout.bottomView != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1;
            float visibleHeight = actionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindowLayout.getMeasuredHeight();
            chatScrimPopupContainerLayout.bottomViewYOffset = visibleHeight;
            FrameLayout frameLayout = chatScrimPopupContainerLayout.bottomView;
            if (frameLayout != null) {
                frameLayout.setTranslationY(visibleHeight + chatScrimPopupContainerLayout.expandSize + chatScrimPopupContainerLayout.bottomViewReactionsOffset);
            }
        }
    }

    @Override
    public void run(boolean z) {
        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
        sharedMediaLayout.profileActivity.finishFragment();
        BaseFragment baseFragment = sharedMediaLayout.profileActivity;
        if (baseFragment instanceof NotificationCenter.NotificationCenterDelegate) {
            baseFragment.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) baseFragment, NotificationCenter.closeChats);
        }
        baseFragment.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        baseFragment.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(sharedMediaLayout.dialog_id), (TLRPC.User) this.f$1, null, Boolean.valueOf(z));
        baseFragment.getMessagesController().setSavedViewAs(false);
    }

    public RateCallLayout$$ExternalSyntheticLambda1(Activity activity, File file) {
        this.$r8$classId = 23;
        this.f$1 = activity;
        this.f$0 = file;
    }

    public RateCallLayout$$ExternalSyntheticLambda1(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.$r8$classId = 26;
        this.f$0 = contactsActivity;
        this.f$1 = user;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        AnimatedEmojiSpan animatedEmojiSpan;
        EmojiPacksAlert emojiPacksAlert = (EmojiPacksAlert) this.f$0;
        if (!(view instanceof EmojiPacksAlert.EmojiImageView) || (animatedEmojiSpan = ((EmojiPacksAlert.EmojiImageView) view).span) == null) {
            return false;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, emojiPacksAlert.getContext(), null, true, true);
        actionBarMenuSubItem.setItemHeight(48);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        actionBarMenuSubItem.setText(LocaleController.getString(R.string.Copy));
        actionBarMenuSubItem.getTextView().setTextSize(1, 14.4f);
        actionBarMenuSubItem.getTextView().setTypeface(AndroidUtilities.bold());
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(23, emojiPacksAlert, animatedEmojiSpan));
        LinearLayout linearLayout = new LinearLayout((Context) this.f$1);
        Drawable drawableMutate = emojiPacksAlert.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(emojiPacksAlert.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground), PorterDuff.Mode.MULTIPLY));
        linearLayout.setBackground(drawableMutate);
        linearLayout.addView(actionBarMenuSubItem);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout);
        emojiPacksAlert.popupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setClippingEnabled(true);
        emojiPacksAlert.popupWindow.setLayoutInScreen();
        emojiPacksAlert.popupWindow.setInputMethodMode(2);
        emojiPacksAlert.popupWindow.setSoftInputMode(0);
        emojiPacksAlert.popupWindow.setOutsideTouchable(true);
        emojiPacksAlert.popupWindow.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        emojiPacksAlert.popupWindow.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override
    public boolean mo1082onItemClick(View view, int i, float f, float f2) {
        UItem item = ((UniversalRecyclerView) this.f$0).adapter.getItem(i);
        if (item == null) {
            return false;
        }
        return ((Boolean) ((Utilities.Callback5Return) this.f$1).run(item, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2))).booleanValue();
    }
}
