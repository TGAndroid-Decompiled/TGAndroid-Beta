package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class c30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.s60 {
    public final j30 f44203a;

    public c30(j30 j30Var) {
        this.f44203a = j30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        TLObject M0;
        e40 e40Var = this.f44203a.f46823b;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
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
            if (e40Var.R2.j()) {
                e40Var.n1().k(0L, 37, tLObject, e40Var.Q2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    e40Var.f45261r2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z12) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    e40Var.f45261r2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    e40Var.f45261r2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                e40Var.P2 = inputPeer;
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.f21765a).N0(e40Var.l1());
                if (N0 != null) {
                    N0.groupcall_default_join_as = e40Var.f45261r2;
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.qp.l1(e40Var.Q2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f21765a).sendRequest(savedefaultgroupcalljoinas, new di.v5(9));
                e40Var.O1();
            } else if (VoIPService.getSharedInstance() != null && z9) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.R2.d.f(org.telegram.messenger.ij.B1(e40Var.f45261r2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                e40Var.f45266s2 = tLObject;
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j30 j30Var = this.f44203a;
        e40 e40Var = j30Var.f46823b;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
        if (r3Var.j()) {
            int i10 = cVar.f21765a;
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(e40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.f25099w2, Long.valueOf(e40Var.l1()), Long.valueOf(e40Var.R2.f25222b.f26966id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = e40Var.R2;
            discardgroupcall.call = r3Var2.g(r3Var2.f25221a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(j30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        e40Var.dismiss();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25092v2, new Object[0]);
    }
}
