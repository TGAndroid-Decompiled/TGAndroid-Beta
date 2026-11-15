package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class b30 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.t60 {
    public final h30 f45569a;

    public b30(h30 h30Var) {
        this.f45569a = h30Var;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        TLObject M0;
        c40 c40Var = this.f45569a.f47588b;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        org.telegram.messenger.c cVar = c40Var.f45940o1;
        if (r3Var != null) {
            boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z13) {
                M0 = org.telegram.messenger.np.s1(cVar.f22782a).a2(Long.valueOf(inputPeer.user_id));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                M0 = org.telegram.messenger.np.s1(cVar.f22782a).M0(Long.valueOf(inputPeer.chat_id));
            } else {
                M0 = org.telegram.messenger.np.s1(cVar.f22782a).M0(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = M0;
            if (c40Var.V2.j()) {
                c40Var.n1().k(0L, 37, tLObject, c40Var.U2, null, null);
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    c40Var.f45974v2 = tL_peerChannel;
                    tL_peerChannel.channel_id = inputPeer.channel_id;
                } else if (z13) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    c40Var.f45974v2 = tL_peerUser;
                    tL_peerUser.user_id = inputPeer.user_id;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    c40Var.f45974v2 = tL_peerChat;
                    tL_peerChat.chat_id = inputPeer.chat_id;
                }
                c40Var.T2 = inputPeer;
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(cVar.f22782a).N0(c40Var.l1());
                if (N0 != null) {
                    N0.groupcall_default_join_as = c40Var.f45974v2;
                    if (N0 instanceof TLRPC.TL_chatFull) {
                        N0.flags |= 32768;
                    } else {
                        N0.flags |= 67108864;
                    }
                }
                TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
                savedefaultgroupcalljoinas.peer = org.telegram.messenger.np.l1(c40Var.U2);
                savedefaultgroupcalljoinas.join_as = inputPeer;
                ConnectionsManager.getInstance(cVar.f22782a).sendRequest(savedefaultgroupcalljoinas, new fi.m5(9));
                c40Var.O1();
            } else if (VoIPService.getSharedInstance() != null && z10) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.V2.d.f(org.telegram.messenger.gj.B1(c40Var.f45974v2));
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                c40Var.f45979w2 = tLObject;
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        h30 h30Var = this.f45569a;
        c40 c40Var = h30Var.f47588b;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        org.telegram.messenger.c cVar = c40Var.f45940o1;
        if (r3Var.j()) {
            int i10 = cVar.f22782a;
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i10).N0(c40Var.l1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.ns.f(i10).k(org.telegram.messenger.ns.f25596w2, Long.valueOf(c40Var.l1()), Long.valueOf(c40Var.V2.f26216b.f28061id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = c40Var.V2;
            discardgroupcall.call = r3Var2.g(r3Var2.f26215a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(h30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        c40Var.dismiss();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25589v2, new Object[0]);
    }
}
