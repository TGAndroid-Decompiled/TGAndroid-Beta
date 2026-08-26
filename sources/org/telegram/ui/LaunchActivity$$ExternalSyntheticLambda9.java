package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;

public final class LaunchActivity$$ExternalSyntheticLambda9 implements ListenerSet.Event, MessagesStorage.BooleanCallback, NumberPicker.Formatter, ImageReceiver.ImageReceiverDelegate, AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListenerExtended, RecyclerListView.OnItemLongClickListener, RecyclerListView.OnItemClickListenerExtended, LocationActivity.LocationActivityDelegate, AlertDialog.OnButtonClickListener, RecyclerListView.IntReturnCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public LaunchActivity$$ExternalSyntheticLambda9(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
    }

    private final void onDoubleTap$org$telegram$ui$ContactsActivity$$ExternalSyntheticLambda8(View view, float f, float f2) {
    }

    private final void onDoubleTap$org$telegram$ui$MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda4(View view, float f, float f2) {
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 5:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda26(i, this.f$1, (ChatNotificationsPopupWrapper.Callback) this.f$0, 8), 16L);
                break;
            default:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda26(i, this.f$1, (ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12) this.f$0, 9), 16L);
                break;
        }
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
        Iterator it = ((HashMap) this.f$0).entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(this.f$1).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        AudioPlayerAlert.CoverContainer coverContainer = (AudioPlayerAlert.CoverContainer) this.f$0;
        if (this.f$1 == coverContainer.activeIndex) {
            AudioPlayerAlert.AnonymousClass6 anonymousClass6 = (AudioPlayerAlert.AnonymousClass6) coverContainer;
            Bitmap bitmap = imageReceiver.getBitmap();
            int iDp = ((bitmap == null || !imageReceiver.hasImageLoaded()) && !imageReceiver.hasBitmapImage()) ? 0 : AndroidUtilities.dp(64.0f);
            AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
            ValueAnimator valueAnimator = audioPlayerAlert.rightPaddingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                audioPlayerAlert.rightPaddingAnimator = null;
            }
            AudioPlayerAlert.AnonymousClass7 anonymousClass7 = audioPlayerAlert.titleTextView;
            if (anonymousClass7.getCustomPaddingRight() != iDp) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(anonymousClass7.getCustomPaddingRight(), iDp);
                audioPlayerAlert.rightPaddingAnimator = valueAnimatorOfInt;
                if (iDp == 0) {
                    valueAnimatorOfInt.setStartDelay(200L);
                    audioPlayerAlert.rightPaddingAnimator.setDuration(100L);
                } else {
                    valueAnimatorOfInt.setDuration(200L);
                }
                audioPlayerAlert.rightPaddingAnimator.setInterpolator(new DecelerateInterpolator());
                audioPlayerAlert.rightPaddingAnimator.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(audioPlayerAlert, 20));
                audioPlayerAlert.rightPaddingAnimator.start();
            }
            if (audioPlayerAlert.blurredView.getTag() != null) {
                audioPlayerAlert.bigAlbumConver.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public String format(int i) {
        Calendar calendar = (Calendar) this.f$0;
        calendar.clear();
        int i2 = this.f$1;
        calendar.set(1, i2);
        calendar.set(2, 0);
        calendar.add(2, i - 120);
        return calendar.get(1) == i2 ? LocaleController.getInstance().getFormatterMonthOnly().format(calendar.getTimeInMillis()) : LocaleController.getInstance().getFormatterMonthYear().format(calendar.getTimeInMillis());
    }

    @Override
    public boolean hasDoubleTap(View view) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void invoke(Object obj) {
        ((Player.Listener) obj).onMediaItemTransition((MediaItem) this.f$0, this.f$1);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = ((LaunchActivity) this.f$0).mainFragmentsStack;
                if (!arrayList.isEmpty()) {
                    MessagesController.getInstance(this.f$1).openByUserName("spambot", (BaseFragment) zziq.m(1, arrayList), 1);
                }
                break;
            case 12:
                int i2 = UserConfig.selectedAccount;
                LoginActivity loginActivity = LoginActivity.this;
                int i3 = this.f$1;
                if (i2 != i3) {
                    ((LaunchActivity) loginActivity.getParentActivity()).switchToAccount(i3);
                }
                loginActivity.finishFragment();
                break;
            case 14:
                PassportActivity passportActivity = PassportActivity.this;
                passportActivity.onFieldError(passportActivity.inputFields[this.f$1]);
                break;
            case 15:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f$0;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(this.f$1, false), true);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.userId);
                if (userFull != null) {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                    profileActivity.getMessagesStorage().updateUserInfo(userFull, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().getInputUser(profileActivity.userId);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.updateRowsIds();
                profileActivity.listAdapter.mObservable.notifyItemRangeRemoved(this.f$1, 1);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
        int i = this.$r8$classId;
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 9:
                ((ContactsActivity) this.f$0).lambda$createView$5(view, this.f$1, i);
                break;
            default:
                ((MultiContactsSelectorBottomSheet) this.f$0).lambda$new$4(this.f$1, view);
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
    public void run(boolean z) {
        ChatActivity chatActivity = ChatActivity.this;
        int i = this.f$1;
        if (i == 15 && ChatObject.isChannel(chatActivity.currentChat)) {
            TLRPC.Chat chat = chatActivity.currentChat;
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                chatActivity.getMessagesController().deleteDialog(chatActivity.dialog_id, 2, z);
                return;
            }
        }
        if (i == 15) {
            chatActivity.performHistoryClear(chatActivity.threadMessageId, z);
            return;
        }
        NotificationCenter notificationCenter = chatActivity.getNotificationCenter();
        int i2 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(chatActivity, i2);
        chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
        chatActivity.finishFragment();
        chatActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(chatActivity.dialog_id), chatActivity.currentUser, chatActivity.currentChat, Boolean.valueOf(z));
    }

    public LaunchActivity$$ExternalSyntheticLambda9(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) this.f$0;
        if (this.f$1 == 5) {
            reactionsContainerLayout.getClass();
            return false;
        }
        ReactionsContainerLayout.ReactionsContainerDelegate reactionsContainerDelegate = reactionsContainerLayout.delegate;
        if (reactionsContainerDelegate == null || !(view instanceof ReactionsContainerLayout.ReactionHolderView)) {
            return false;
        }
        reactionsContainerDelegate.onReactionClicked(reactionsContainerLayout, ((ReactionsContainerLayout.ReactionHolderView) view).currentReaction, true, false);
        return true;
    }

    public LaunchActivity$$ExternalSyntheticLambda9(ChatActivity.AnonymousClass16 anonymousClass16, int i, boolean z) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass16;
        this.f$1 = i;
    }

    @Override
    public boolean mo1082onItemClick(View view, int i, float f, float f2) {
        return ((UserSelectorBottomSheet) this.f$0).lambda$new$11(this.f$1, view);
    }

    @Override
    public int run() {
        LinearLayoutManager linearLayoutManager = ((LiteModeSettingsActivity) this.f$0).layoutManager;
        int iDp = AndroidUtilities.dp(60.0f);
        int i = this.f$1;
        linearLayoutManager.scrollToPositionWithOffset(i, iDp);
        return i;
    }
}
