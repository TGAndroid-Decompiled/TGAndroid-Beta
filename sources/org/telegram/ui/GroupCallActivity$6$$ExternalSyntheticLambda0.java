package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.JoinCallAlert;

public final class GroupCallActivity$6$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, JoinCallAlert.JoinCallAlertDelegate {
    public final GroupCallActivity.AnonymousClass6 f$0;

    public GroupCallActivity$6$$ExternalSyntheticLambda0(GroupCallActivity.AnonymousClass6 anonymousClass6) {
        this.f$0 = anonymousClass6;
    }

    @Override
    public void didSelectChat(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        TLObject chat;
        GroupCallActivity groupCallActivity = GroupCallActivity.this;
        if (groupCallActivity.call == null) {
            return;
        }
        boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        AccountInstance accountInstance = groupCallActivity.accountInstance;
        if (z4) {
            chat = accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id));
        } else {
            chat = inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        }
        TLObject tLObject = chat;
        if (!groupCallActivity.call.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            groupCallActivity.userSwitchObject = tLObject;
            return;
        }
        groupCallActivity.getUndoView().showWithAction(0L, 37, tLObject, groupCallActivity.currentChat, (Runnable) null, (Runnable) null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            groupCallActivity.selfPeer = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z4) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            groupCallActivity.selfPeer = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            groupCallActivity.selfPeer = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        groupCallActivity.schedulePeer = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(groupCallActivity.getChatId());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = groupCallActivity.selfPeer;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(groupCallActivity.currentChat);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new PassportActivity$$ExternalSyntheticLambda1(1));
        groupCallActivity.updateItems$1$1();
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        GroupCallActivity.AnonymousClass6 anonymousClass6 = this.f$0;
        GroupCallActivity groupCallActivity = GroupCallActivity.this;
        if (groupCallActivity.call.isScheduled()) {
            AccountInstance accountInstance = groupCallActivity.accountInstance;
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(groupCallActivity.getChatId());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(groupCallActivity.getChatId()), Long.valueOf(groupCallActivity.call.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = groupCallActivity.call.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new LinkManager$$ExternalSyntheticLambda3(anonymousClass6, 11));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        groupCallActivity.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
