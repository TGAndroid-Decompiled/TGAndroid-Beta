package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class uo0 extends jg.c0 {
    public final vo0 f40386n;

    public uo0(vo0 vo0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var, true, true);
        this.f40386n = vo0Var;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) f1Var.f59123a;
        yo0 yo0Var = this.f40386n.L;
        TLRPC.User user = null;
        if (yo0Var.d2 || yo0Var.f42556e2) {
            int i10 = org.telegram.ui.ActionBar.n6.f29423eh;
            int i11 = org.telegram.ui.ActionBar.n6.Wg;
            org.telegram.ui.ActionBar.u6.U(p4Var.f31207b, i10, null);
            p4Var.I = i11;
            p4Var.f31214w.b(org.telegram.ui.ActionBar.n6.B5, i11, org.telegram.ui.ActionBar.n6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ri.d0(yo0Var.f30187a).f26620j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.mp.u1(yo0Var.f30187a).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.mp.u1(yo0Var.f30187a).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.mp.u1(yo0Var.f30187a).O0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z11 = false;
        if (j3 == p4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        p4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = org.telegram.messenger.o10.k(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        p4Var.a(j3, true, str);
        if (yo0Var.Q1.h(j3) >= 0) {
            z11 = true;
        }
        if (p4Var.f31215x) {
            p4Var.f31214w.a(z11, z10);
        }
    }
}
