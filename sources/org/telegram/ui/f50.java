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
public final class f50 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.c80 {
    public final l50 f33495a;

    public f50(l50 l50Var) {
        this.f33495a = l50Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject chat;
        i60 i60Var = this.f33495a.f35306b;
        ChatObject.Call call = i60Var.f34360a1;
        AccountInstance accountInstance = i60Var.d;
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
            if (i60Var.f34360a1.isScheduled()) {
                i60Var.k1().k(0L, 37, tLObject, i60Var.Z0, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    i60Var.A0 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    i60Var.A0 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    i60Var.A0 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                i60Var.Y0 = inputPeer;
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i60Var.i1());
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = i60Var.A0;
                    if (chatFull instanceof TLRPC.TL_chatFull) {
                        chatFull.flags |= 32768;
                    } else {
                        chatFull.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(i60Var.Z0);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new ai.t7(8));
                i60Var.I1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) i60Var.f34360a1.participants.f(MessageObject.getPeerId(i60Var.A0));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                i60Var.B0 = tLObject;
            }
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        l50 l50Var = this.f33495a;
        i60 i60Var = l50Var.f35306b;
        ChatObject.Call call = i60Var.f34360a1;
        AccountInstance accountInstance = i60Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i60Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(i60Var.i1()), Long.valueOf(i60Var.f34360a1.call.f18338id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = i60Var.f34360a1.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new m(l50Var, 8));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        i60Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
