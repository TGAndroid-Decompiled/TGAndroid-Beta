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
public final class k50 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.t80 {
    public final q50 f37293a;

    public k50(q50 q50Var) {
        this.f37293a = q50Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject chat;
        n60 n60Var = this.f37293a.f39065b;
        ChatObject.Call call = n60Var.f38157a1;
        AccountInstance accountInstance = n60Var.d;
        if (call != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (n60Var.f38157a1.isScheduled()) {
                n60Var.l1().k(0L, 37, tLObject, n60Var.Z0, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    n60Var.A0 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    n60Var.A0 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    n60Var.A0 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                n60Var.Y0 = inputPeer;
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(n60Var.j1());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = n60Var.A0;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(n60Var.Z0);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new bi.g7(8));
                n60Var.J1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) n60Var.f38157a1.participants.f(MessageObject.getPeerId(n60Var.A0));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                n60Var.B0 = tLObject;
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        q50 q50Var = this.f37293a;
        n60 n60Var = q50Var.f39065b;
        ChatObject.Call call = n60Var.f38157a1;
        AccountInstance accountInstance = n60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(n60Var.j1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(n60Var.j1()), Long.valueOf(n60Var.f38157a1.call.f18926id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = n60Var.f38157a1.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new m(q50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        n60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
