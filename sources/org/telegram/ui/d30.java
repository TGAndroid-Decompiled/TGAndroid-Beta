package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class d30 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.d70 {
    public final j30 f46941a;

    public d30(j30 j30Var) {
        this.f46941a = j30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject O0;
        e40 e40Var = this.f46941a.f48977b;
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        org.telegram.messenger.c cVar = e40Var.f47376o1;
        if (t3Var != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                O0 = org.telegram.messenger.mp.u1(cVar.f23343a).c2(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                O0 = org.telegram.messenger.mp.u1(cVar.f23343a).O0(Long.valueOf(inputPeer.chat_id));
            } else {
                O0 = org.telegram.messenger.mp.u1(cVar.f23343a).O0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = O0;
            if (e40Var.V2.j()) {
                e40Var.o1().k(0L, 37, tLObject, e40Var.U2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    e40Var.f47410v2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    e40Var.f47410v2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    e40Var.f47410v2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                e40Var.T2 = inputPeer;
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(cVar.f23343a).P0(e40Var.m1());
                if (P0 != null) {
                    P0.groupcall_default_join_as = e40Var.f47410v2;
                    if (P0 instanceof TLRPC.TL_chatFull) {
                        P0.flags |= 32768;
                    } else {
                        P0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.mp.n1(e40Var.U2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f23343a).sendRequest(savedefaultgroupcalljoinas, new fi.l5(9));
                e40Var.P1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.V2.d.f(org.telegram.messenger.fj.B1(e40Var.f47410v2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                e40Var.f47415w2 = tLObject;
            }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        j30 j30Var = this.f46941a;
        e40 e40Var = j30Var.f48977b;
        org.telegram.messenger.t3 t3Var = e40Var.V2;
        org.telegram.messenger.c cVar = e40Var.f47376o1;
        if (t3Var.j()) {
            int i10 = cVar.f23343a;
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i10).P0(e40Var.m1());
            if (P0 != null) {
                P0.flags &= -2097153;
                P0.call = null;
                org.telegram.messenger.ks.f(i10).k(org.telegram.messenger.ks.f25312w2, Long.valueOf(e40Var.m1()), Long.valueOf(e40Var.V2.f27034b.f28502id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.t3 t3Var2 = e40Var.V2;
            discardgroupcall.call = t3Var2.g(t3Var2.f27033a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(j30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        e40Var.dismiss();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25305v2, new Object[0]);
    }
}
