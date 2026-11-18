package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class e30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.e70 {
    public final k30 f47044a;

    public e30(k30 k30Var) {
        this.f47044a = k30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject O0;
        f40 f40Var = this.f47044a.f49146b;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        org.telegram.messenger.c cVar = f40Var.f47454o1;
        if (t3Var != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                O0 = org.telegram.messenger.mp.u1(cVar.f23218a).c2(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                O0 = org.telegram.messenger.mp.u1(cVar.f23218a).O0(Long.valueOf(inputPeer.chat_id));
            } else {
                O0 = org.telegram.messenger.mp.u1(cVar.f23218a).O0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = O0;
            if (f40Var.V2.j()) {
                f40Var.o1().k(0L, 37, tLObject, f40Var.U2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    f40Var.f47488v2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    f40Var.f47488v2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    f40Var.f47488v2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                f40Var.T2 = inputPeer;
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(cVar.f23218a).P0(f40Var.m1());
                if (P0 != null) {
                    P0.groupcall_default_join_as = f40Var.f47488v2;
                    if (P0 instanceof TLRPC.TL_chatFull) {
                        P0.flags |= 32768;
                    } else {
                        P0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.mp.n1(f40Var.U2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f23218a).sendRequest(savedefaultgroupcalljoinas, new fi.k5(9));
                f40Var.P1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.V2.d.f(org.telegram.messenger.fj.B1(f40Var.f47488v2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                f40Var.f47493w2 = tLObject;
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k30 k30Var = this.f47044a;
        f40 f40Var = k30Var.f49146b;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        org.telegram.messenger.c cVar = f40Var.f47454o1;
        if (t3Var.j()) {
            int i10 = cVar.f23218a;
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i10).P0(f40Var.m1());
            if (P0 != null) {
                P0.flags &= -2097153;
                P0.call = null;
                org.telegram.messenger.ks.f(i10).k(org.telegram.messenger.ks.f25213w2, Long.valueOf(f40Var.m1()), Long.valueOf(f40Var.V2.f26935b.f28413id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.t3 t3Var2 = f40Var.V2;
            discardgroupcall.call = t3Var2.g(t3Var2.f26934a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(k30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        f40Var.dismiss();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25206v2, new Object[0]);
    }
}
