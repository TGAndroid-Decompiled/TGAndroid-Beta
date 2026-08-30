package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class a50 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.w70 {
    public final g50 f32460a;

    public a50(g50 g50Var) {
        this.f32460a = g50Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        TLObject chat;
        c60 c60Var = this.f32460a.f34449b;
        ChatObject.Call call = c60Var.X0;
        AccountInstance accountInstance = c60Var.d;
        if (call != null) {
            boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z12) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (c60Var.X0.isScheduled()) {
                c60Var.k1().k(0L, 37, tLObject, c60Var.W0, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    c60Var.f33194x0 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z12) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    c60Var.f33194x0 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    c60Var.f33194x0 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                c60Var.V0 = inputPeer;
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(c60Var.i1());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = c60Var.f33194x0;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(c60Var.W0);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new nh.p5(4));
                c60Var.I1();
            } else if (VoIPService.getSharedInstance() != null && z4) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c60Var.X0.participants.f(MessageObject.getPeerId(c60Var.f33194x0));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                c60Var.f33199y0 = tLObject;
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        g50 g50Var = this.f32460a;
        c60 c60Var = g50Var.f34449b;
        ChatObject.Call call = c60Var.X0;
        AccountInstance accountInstance = c60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(c60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(c60Var.i1()), Long.valueOf(c60Var.X0.call.f19194id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = c60Var.X0.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new o(g50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        c60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
