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
public final class o40 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.r70 {
    public final u40 f40968a;

    public o40(u40 u40Var) {
        this.f40968a = u40Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject chat;
        r50 r50Var = this.f40968a.f43179b;
        ChatObject.Call call = r50Var.W0;
        AccountInstance accountInstance = r50Var.d;
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
            if (r50Var.W0.isScheduled()) {
                r50Var.k1().k(0L, 37, tLObject, r50Var.V0, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    r50Var.f41960w0 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    r50Var.f41960w0 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    r50Var.f41960w0 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                r50Var.U0 = inputPeer;
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(r50Var.i1());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = r50Var.f41960w0;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(r50Var.V0);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new lh.o5(5));
                r50Var.I1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r50Var.W0.participants.f(MessageObject.getPeerId(r50Var.f41960w0));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                r50Var.f41965x0 = tLObject;
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        u40 u40Var = this.f40968a;
        r50 r50Var = u40Var.f43179b;
        ChatObject.Call call = r50Var.W0;
        AccountInstance accountInstance = r50Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(r50Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(r50Var.i1()), Long.valueOf(r50Var.W0.call.f22402id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = r50Var.W0.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new o(u40Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        r50Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
