package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.dynamicanimation.animation.SpringAnimation;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.RLottieDrawable;

public final class ChatActivity$$ExternalSyntheticLambda174 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda174(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        int i = 0;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ActionBar) obj).invalidate();
                break;
            case 1:
                TextSelectionHelper textSelectionHelper = (TextSelectionHelper) obj;
                textSelectionHelper.textSelectionOverlay.invalidate();
                textSelectionHelper.showActions();
                break;
            case 2:
                TextSelectionHelper.this.showActions();
                break;
            case 3:
                ThemePreviewMessagesCell themePreviewMessagesCell = (ThemePreviewMessagesCell) obj;
                themePreviewMessagesCell.progress = -1;
                while (true) {
                    ChatMessageCell[] chatMessageCellArr = themePreviewMessagesCell.cells;
                    if (i < chatMessageCellArr.length) {
                        ChatMessageCell chatMessageCell = chatMessageCellArr[i];
                        if (chatMessageCell != null) {
                            chatMessageCell.invalidate();
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 4:
                ChangeNameActivity changeNameActivity = (ChangeNameActivity) obj;
                ChangeNameActivity.AnonymousClass2 anonymousClass2 = changeNameActivity.firstNameField;
                if (anonymousClass2 != null) {
                    anonymousClass2.requestFocus();
                    AndroidUtilities.showKeyboard(changeNameActivity.firstNameField);
                }
                break;
            case 5:
                ChangeUsernameActivity changeUsernameActivity = (ChangeUsernameActivity) obj;
                String str = changeUsernameActivity.username;
                if (str == null || str.length() > 0) {
                    changeUsernameActivity.ignoreCheck = true;
                    changeUsernameActivity.focusUsernameField(changeUsernameActivity.usernames.size() <= 0);
                    changeUsernameActivity.ignoreCheck = false;
                }
                break;
            case 6:
                ChannelAdminLogActivity.AnonymousClass9 anonymousClass9 = (ChannelAdminLogActivity.AnonymousClass9) obj;
                if (anonymousClass9.scrollAnimationIndex != -1) {
                    ChannelAdminLogActivity.this.getNotificationCenter().onAnimationFinish(anonymousClass9.scrollAnimationIndex);
                    anonymousClass9.scrollAnimationIndex = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                }
                break;
            case 7:
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                channelAdminLogActivity.getNotificationCenter().onAnimationFinish(channelAdminLogActivity.scrollCallbackAnimationIndex);
                break;
            case 8:
                BulletinFactory.showError((TLRPC.TL_error) obj);
                break;
            case 9:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                }
                break;
            case 10:
                ((ArticleViewer$$ExternalSyntheticLambda33) obj).run(Boolean.FALSE);
                break;
            case 11:
                ((ChatActivity$$ExternalSyntheticLambda464) obj).run(Boolean.FALSE, null);
                break;
            case 12:
                ChatActivity.AnonymousClass132 anonymousClass132 = (ChatActivity.AnonymousClass132) obj;
                NotificationCenter.getInstance(((BaseFragment) ((ChatActivity) anonymousClass132.this$0)).currentAccount).onAnimationFinish(anonymousClass132.index);
                break;
            case 13:
                ChatActivity.AnonymousClass134 anonymousClass134 = (ChatActivity.AnonymousClass134) obj;
                NotificationCenter.getInstance(((BaseFragment) ((ChatActivity) anonymousClass134.this$0)).currentAccount).onAnimationFinish(anonymousClass134.index);
                break;
            case 14:
                ChatActivity.access$17300(ChatActivity.this);
                break;
            case 15:
                ChatActivity.this.chatAdapter.notifyDataSetChanged(false);
                break;
            case 16:
                ChatActivity.AnonymousClass65 anonymousClass65 = (ChatActivity.AnonymousClass65) obj;
                ChatActivity chatActivity = anonymousClass65.this$0;
                if (chatActivity.gifHintTextView != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(chatActivity.gifHintTextView, (Property<HintView, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new ArticleViewer.AnonymousClass25(anonymousClass65, 27));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 17:
                ChatActivity.ChatActivityAdapter.AnonymousClass2.C00072 c00072 = (ChatActivity.ChatActivityAdapter.AnonymousClass2.C00072) obj;
                c00072.getClass();
                Bundle bundle = new Bundle();
                ChatActivity.ChatActivityAdapter.AnonymousClass2 anonymousClass3 = ChatActivity.ChatActivityAdapter.AnonymousClass2.this;
                bundle.putLong("user_id", UserConfig.getInstance(((BaseFragment) ChatActivity.this).currentAccount).clientUserId);
                ChatActivity.this.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 18:
                ChatActivity.this.hideFieldPanel(true);
                break;
            case 19:
                ((ChatActivity.AnonymousClass128) obj).end(false);
                break;
            case 20:
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.getNotificationCenter().onAnimationFinish(chatActivity2.scrollCallbackAnimationIndex);
                break;
            case 21:
                ChatActivity chatActivity3 = ChatActivity.this;
                chatActivity3.getClass();
                chatActivity3.searchItem.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(chatActivity3.searchItem.getSearchField());
                if (chatActivity3.fixedKeyboardHeight > 0) {
                    ChatActivity$$ExternalSyntheticLambda22 chatActivity$$ExternalSyntheticLambda22 = new ChatActivity$$ExternalSyntheticLambda22(chatActivity3, 8);
                    chatActivity3.cancelFixedPositionRunnable = chatActivity$$ExternalSyntheticLambda22;
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda22, 200L);
                }
                break;
            case 22:
                ChatEditActivity chatEditActivity = ChatEditActivity.this;
                chatEditActivity.avatarImage.setImageDrawable(chatEditActivity.avatarDrawable);
                chatEditActivity.setAvatarCell.setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = chatEditActivity.currentUser;
                if (user != null) {
                    user.photo = null;
                    chatEditActivity.getMessagesController().putUser(chatEditActivity.currentUser, true);
                }
                chatEditActivity.hasUploadedPhoto = true;
                if (chatEditActivity.cameraDrawable == null) {
                    int i2 = R.raw.camera_outline;
                    chatEditActivity.cameraDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                chatEditActivity.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
                chatEditActivity.setAvatarCell.imageView.setAnimation(chatEditActivity.cameraDrawable);
                break;
            case 23:
                ((ChatUsersActivity$$ExternalSyntheticLambda11) obj).run(0);
                break;
            case 24:
                ((ChooseQualityLayout$QualityIcon) obj).invalidateSelf();
                break;
            case 25:
                AndroidUtilities.showKeyboard((EditText) obj);
                break;
            case 26:
                SparseArray sparseArray = AnimatedEmojiDrawable.globalEmojiCache;
                ((AnimatedEmojiDrawable) obj).updateAttachState();
                break;
            case 27:
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher = (AnimatedEmojiDrawable.EmojiDocumentFetcher) obj;
                emojiDocumentFetcher.getClass();
                ArrayList arrayList = new ArrayList(emojiDocumentFetcher.toFetchDocuments);
                emojiDocumentFetcher.toFetchDocuments.clear();
                MessagesStorage.getInstance(emojiDocumentFetcher.currentAccount).getStorageQueue().postRunnable(new AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda1(emojiDocumentFetcher, arrayList, i));
                emojiDocumentFetcher.fetchRunnable = null;
                break;
            case 28:
                ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) obj).invalidate();
                break;
            default:
                ((SpringAnimation) obj).start();
                break;
        }
    }
}
