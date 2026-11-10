package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class d30 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.r60 {
    public final k30 f44892a;

    public d30(k30 k30Var) {
        this.f44892a = k30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        TLObject M0;
        f40 f40Var = this.f44892a.f47153b;
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        org.telegram.messenger.c cVar = f40Var.n1;
        if (r3Var != null) {
            boolean z12 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z12) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).a2(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).M0(Long.valueOf(inputPeer.chat_id));
            } else {
                M0 = org.telegram.messenger.qp.s1(cVar.f21770a).M0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = M0;
            if (f40Var.U2.j()) {
                f40Var.n1().k(0L, 37, tLObject, f40Var.T2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    f40Var.f45588u2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z12) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    f40Var.f45588u2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    f40Var.f45588u2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                f40Var.S2 = inputPeer;
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(cVar.f21770a).N0(f40Var.l1());
                if (N0 != null) {
                    N0.groupcall_default_join_as = f40Var.f45588u2;
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.qp.l1(f40Var.T2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f21770a).sendRequest(savedefaultgroupcalljoinas, new di.v5(9));
                f40Var.O1();
            } else if (VoIPService.getSharedInstance() != null && z9) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.U2.d.f(org.telegram.messenger.ij.B1(f40Var.f45588u2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                f40Var.f45593v2 = tLObject;
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k30 k30Var = this.f44892a;
        f40 f40Var = k30Var.f47153b;
        org.telegram.messenger.r3 r3Var = f40Var.U2;
        org.telegram.messenger.c cVar = f40Var.n1;
        if (r3Var.j()) {
            int i10 = cVar.f21770a;
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(f40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.qs.f(i10).k(org.telegram.messenger.qs.f25103w2, Long.valueOf(f40Var.l1()), Long.valueOf(f40Var.U2.f25226b.f26970id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = f40Var.U2;
            discardgroupcall.call = r3Var2.g(r3Var2.f25225a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(k30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        f40Var.dismiss();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25096v2, new Object[0]);
    }
}
