package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatEditActivity$$ExternalSyntheticLambda41 implements AlertDialog.OnButtonClickListener, MessagesStorage.LongCallback, MessagesStorage.BooleanCallback, LocationActivity.LocationActivityDelegate {
    public final int $r8$classId;
    public final ChatEditActivity f$0;

    public ChatEditActivity$$ExternalSyntheticLambda41(ChatEditActivity chatEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatEditActivity;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ChatEditActivity chatEditActivity = this.f$0;
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        TLRPC.ChatFull chatFull = chatEditActivity.info;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        chatEditActivity.updateFields(false, true);
        chatEditActivity.getMessagesController().loadFullChat(chatEditActivity.chatId, 0, true);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$5();
                break;
            case 1:
                this.f$0.lambda$checkDiscard$61(alertDialog, i);
                break;
            case 2:
                this.f$0.processDone$5();
                break;
            default:
                this.f$0.lambda$checkDiscard$63(alertDialog, i);
                break;
        }
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 4:
                this.f$0.updateSuggestedCell(Long.valueOf(j));
                break;
            default:
                ChatEditActivity chatEditActivity = this.f$0;
                if (j != 0) {
                    chatEditActivity.chatId = j;
                    chatEditActivity.currentChat = chatEditActivity.getMessagesController().getChat(Long.valueOf(j));
                    chatEditActivity.donePressed = false;
                    TLRPC.ChatFull chatFull = chatEditActivity.info;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    chatEditActivity.processDone$5();
                } else {
                    chatEditActivity.donePressed = false;
                }
                break;
        }
    }

    @Override
    public void run(boolean z) {
        ChatEditActivity chatEditActivity = this.f$0;
        chatEditActivity.getClass();
        if (AndroidUtilities.isTablet()) {
            chatEditActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-chatEditActivity.chatId));
        } else {
            chatEditActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        chatEditActivity.finishFragment();
        chatEditActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chatEditActivity.currentChat.id), null, chatEditActivity.currentChat, Boolean.valueOf(z));
    }
}
