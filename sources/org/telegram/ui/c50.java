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
public final class c50 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.x70 {
    public final i50 f33019a;

    public c50(i50 i50Var) {
        this.f33019a = i50Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        TLObject chat;
        e60 e60Var = this.f33019a.f34803b;
        ChatObject.Call call = e60Var.X0;
        AccountInstance accountInstance = e60Var.d;
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
            if (e60Var.X0.isScheduled()) {
                e60Var.k1().k(0L, 37, tLObject, e60Var.W0, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    e60Var.f33713x0 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z12) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    e60Var.f33713x0 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    e60Var.f33713x0 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                e60Var.V0 = inputPeer;
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(e60Var.i1());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = e60Var.f33713x0;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(e60Var.W0);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new nh.p5(4));
                e60Var.I1();
            } else if (VoIPService.getSharedInstance() != null && z4) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e60Var.X0.participants.f(MessageObject.getPeerId(e60Var.f33713x0));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                e60Var.f33718y0 = tLObject;
            }
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        i50 i50Var = this.f33019a;
        e60 e60Var = i50Var.f34803b;
        ChatObject.Call call = e60Var.X0;
        AccountInstance accountInstance = e60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(e60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(e60Var.i1()), Long.valueOf(e60Var.X0.call.f19169id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = e60Var.X0.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new o(i50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        e60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
