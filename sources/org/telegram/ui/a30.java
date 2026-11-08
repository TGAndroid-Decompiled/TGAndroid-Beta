package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class a30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.r60 {
    public final h30 f43558a;

    public a30(h30 h30Var) {
        this.f43558a = h30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        TLObject M0;
        c40 c40Var = this.f43558a.f46207b;
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        org.telegram.messenger.c cVar = c40Var.f44588k1;
        if (r3Var != null) {
            boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z12) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(inputPeer.chat_id));
            } else {
                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = M0;
            if (c40Var.R2.j()) {
                c40Var.n1().k(0L, 37, tLObject, c40Var.Q2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    c40Var.f44621r2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z12) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    c40Var.f44621r2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    c40Var.f44621r2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                c40Var.P2 = inputPeer;
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.f21765a).N0(c40Var.l1());
                if (N0 != null) {
                    N0.groupcall_default_join_as = c40Var.f44621r2;
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.qp.l1(c40Var.Q2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f21765a).sendRequest(savedefaultgroupcalljoinas, new di.u5(9));
                c40Var.O1();
            } else if (VoIPService.getSharedInstance() != null && z9) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.R2.d.f(org.telegram.messenger.ij.C1(c40Var.f44621r2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                c40Var.f44626s2 = tLObject;
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        h30 h30Var = this.f43558a;
        c40 c40Var = h30Var.f46207b;
        org.telegram.messenger.r3 r3Var = c40Var.R2;
        org.telegram.messenger.c cVar = c40Var.f44588k1;
        if (r3Var.j()) {
            int i10 = cVar.f21765a;
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(c40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.f25099w2, Long.valueOf(c40Var.l1()), Long.valueOf(c40Var.R2.f25222b.f26966id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = c40Var.R2;
            discardgroupcall.call = r3Var2.g(r3Var2.f25221a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(h30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        c40Var.dismiss();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25092v2, new Object[0]);
    }
}
