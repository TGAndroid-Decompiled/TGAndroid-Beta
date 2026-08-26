package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;

public final class ChatActivity$$ExternalSyntheticLambda241 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final boolean f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda241(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i, int i2, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$4 = message;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        ReactionsContainerLayout reactionsContainerLayout;
        TLRPC.Document documentFindDocument;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                ActionBarPopupWindow actionBarPopupWindow = chatActivity.scrimPopupWindow;
                if (actionBarPopupWindow != null && chatActivity.fragmentView != null && !actionBarPopupWindow.isShowing() && AndroidUtilities.isActivityRunning(chatActivity.getParentActivity())) {
                    chatActivity.scrimPopupWindow.showAtLocation(chatActivity.chatListView, 51, this.f$1, this.f$2);
                    if (this.f$3 && (reactionsContainerLayout = (ReactionsContainerLayout) this.f$4) != null) {
                        reactionsContainerLayout.startEnterAnimation(true);
                    }
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda22(chatActivity, 20), 420L);
                    break;
                }
                break;
            case 1:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequest$98((TLRPC.Message) this.f$4, this.f$1, this.f$2, this.f$3);
                break;
            case 2:
                Bulletin.LottieLayoutWithReactions.AnonymousClass2 anonymousClass2 = (Bulletin.LottieLayoutWithReactions.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) this.f$4;
                long j = visibleReaction.documentId;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(visibleReaction.emojicon);
                    if (tL_availableReaction != null) {
                        documentFindDocument = tL_availableReaction.activate_animation;
                    }
                } else {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                }
                if (documentFindDocument != null && lastFragment != null) {
                    BulletinFactory.of(lastFragment).createMessagesTaggedBulletin(Bulletin.LottieLayoutWithReactions.this.messagesCount, documentFindDocument, this.f$3 ? new ArticleViewer$$ExternalSyntheticLambda26(this.f$1, this.f$2, lastFragment, 7) : null).show(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f$0;
                notificationsSettingsActivity.getClass();
                int i = this.f$1;
                boolean z = this.f$3;
                if (i == 3) {
                    SharedPreferences.Editor editorEdit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z) {
                        editorEdit.remove("EnableAllStories");
                    } else {
                        editorEdit.putBoolean("EnableAllStories", true);
                    }
                    editorEdit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i);
                } else if (i == 4 || i == 5) {
                    SharedPreferences.Editor editorEdit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z) {
                        editorEdit2.putBoolean("EnableReactionsMessages", false);
                        editorEdit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        editorEdit2.putBoolean("EnableReactionsMessages", true);
                        editorEdit2.putBoolean("EnableReactionsStories", true);
                    }
                    editorEdit2.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i);
                } else {
                    notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i, !z ? 0 : Integer.MAX_VALUE);
                }
                ((NotificationsCheckCell) this.f$4).checkBox.setChecked(0, !z, true);
                notificationsSettingsActivity.adapter.notifyItemChanged(this.f$2);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda241(ChatActivity chatActivity, int i, int i2, boolean z, ReactionsContainerLayout reactionsContainerLayout) {
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = z;
        this.f$4 = reactionsContainerLayout;
    }

    public ChatActivity$$ExternalSyntheticLambda241(Bulletin.LottieLayoutWithReactions.AnonymousClass2 anonymousClass2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, int i, int i2) {
        this.f$0 = anonymousClass2;
        this.f$4 = visibleReaction;
        this.f$3 = z;
        this.f$1 = i;
        this.f$2 = i2;
    }

    public ChatActivity$$ExternalSyntheticLambda241(NotificationsSettingsActivity notificationsSettingsActivity, int i, boolean z, NotificationsCheckCell notificationsCheckCell, int i2) {
        this.f$0 = notificationsSettingsActivity;
        this.f$1 = i;
        this.f$3 = z;
        this.f$4 = notificationsCheckCell;
        this.f$2 = i2;
    }
}
