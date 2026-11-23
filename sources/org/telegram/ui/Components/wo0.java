package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class wo0 extends jg.c0 {
    public final xo0 f41863n;

    public wo0(xo0 xo0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var, true, true);
        this.f41863n = xo0Var;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) f1Var.f59165a;
        ap0 ap0Var = this.f41863n.L;
        TLRPC.User user = null;
        if (ap0Var.d2 || ap0Var.f33565e2) {
            int i10 = org.telegram.ui.ActionBar.m6.f29410eh;
            int i11 = org.telegram.ui.ActionBar.m6.Wg;
            org.telegram.ui.ActionBar.t6.U(p4Var.f31238b, i10, null);
            p4Var.I = i11;
            p4Var.f31245w.b(org.telegram.ui.ActionBar.m6.B5, i11, org.telegram.ui.ActionBar.m6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.si.d0(ap0Var.f30173a).f26834j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.np.u1(ap0Var.f30173a).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.np.u1(ap0Var.f30173a).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.np.u1(ap0Var.f30173a).O0(Long.valueOf(tL_topPeer.peer.chat_id));
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
            str = org.telegram.messenger.p10.k(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        p4Var.a(j3, true, str);
        if (ap0Var.Q1.h(j3) >= 0) {
            z11 = true;
        }
        if (p4Var.f31246x) {
            p4Var.f31245w.a(z11, z10);
        }
    }
}
