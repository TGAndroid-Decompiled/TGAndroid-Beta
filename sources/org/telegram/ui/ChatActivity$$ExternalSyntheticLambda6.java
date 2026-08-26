package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final MessageObject f$1;

    public ChatActivity$$ExternalSyntheticLambda6(ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() throws Throwable {
        TLRPC.WebPage webPage;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                MessageObject messageObject = this.f$1;
                if (!messageObject.isVideo()) {
                    MediaController.getInstance().playMessage(messageObject);
                } else {
                    chatActivity.openPhotoViewerForMessage(null, messageObject);
                }
                break;
            case 1:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                MessageObject messageObject2 = this.f$1;
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject2) == null) {
                        chatActivity2.createArticleViewer(false).open(messageObject2, null, null, null);
                    }
                    break;
                }
                break;
            case 2:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                MessageObject messageObject3 = this.f$1;
                TLRPC.Message message = messageObject3.messageOwner;
                int i = message.ttl;
                boolean z = i != Integer.MAX_VALUE;
                int i2 = i == Integer.MAX_VALUE ? 0 : i;
                message.destroyTime = chatActivity3.getConnectionsManager().getCurrentTime() + i2;
                messageObject3.messageOwner.destroyTimeMillis = chatActivity3.getConnectionsManager().getCurrentTimeMillis() + (((long) i2) * 1000);
                if (chatActivity3.currentEncryptedChat == null) {
                    chatActivity3.getMessagesController().markMessageAsRead2(chatActivity3.dialog_id, messageObject3.getId(), null, i2, 0L, z);
                } else {
                    chatActivity3.getMessagesController().markMessageAsRead(chatActivity3.dialog_id, messageObject3.messageOwner.random_id, i2);
                }
                break;
            case 3:
                ChatActivity chatActivity4 = this.f$0;
                chatActivity4.getClass();
                chatActivity4.scrollToMessageId(this.f$1.getId(), 0, true, 0, true, 0, null, null, new ChatActivity$$ExternalSyntheticLambda5(chatActivity4, 9));
                if (chatActivity4.waitingForLoad.isEmpty()) {
                    chatActivity4.showMessagesSearchListView(false);
                }
                break;
            case 4:
                ChatActivity chatActivity5 = this.f$0;
                chatActivity5.getClass();
                MessageObject messageObject4 = this.f$1;
                chatActivity5.scrollToMessageId(messageObject4.getReplyMsgId(), messageObject4.messageOwner.id, true, messageObject4.getDialogId() == chatActivity5.mergeDialogId ? 1 : 0, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) messageObject4.messageOwner.action).answer.option, null);
                break;
            case 5:
                ChatActivity chatActivity6 = this.f$0;
                chatActivity6.getClass();
                MessageObject messageObject5 = this.f$1;
                chatActivity6.scrollToMessageId(messageObject5.getReplyMsgId(), messageObject5.messageOwner.id, true, messageObject5.getDialogId() == chatActivity6.mergeDialogId ? 1 : 0, false, 0, null, null, null);
                break;
            case 6:
                ChatActivity chatActivity7 = this.f$0;
                chatActivity7.getClass();
                MessageObject messageObject6 = this.f$1;
                chatActivity7.scrollToMessageId(messageObject6.getReplyMsgId(), messageObject6.messageOwner.id, true, messageObject6.getDialogId() == chatActivity7.mergeDialogId ? 1 : 0, false, 0);
                break;
            case 7:
                ChatActivity chatActivity8 = this.f$0;
                chatActivity8.getMessagesController().pinMessage(chatActivity8.currentChat, chatActivity8.currentUser, this.f$1.getId(), true, false, false);
                chatActivity8.pinBulletin = null;
                break;
            default:
                ChatActivity chatActivity9 = this.f$0;
                BulletinFactory.of(chatActivity9).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                MessageObject messageObject7 = this.f$1;
                chatActivity9.removeFromSponsored(messageObject7);
                chatActivity9.removeMessageWithThanos(messageObject7);
                break;
        }
    }
}
