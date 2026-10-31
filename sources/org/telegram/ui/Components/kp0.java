package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class kp0 extends zf.u {
    public final lp0 f27866n;

    public kp0(lp0 lp0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, true, true);
        this.f27866n = lp0Var;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) c1Var.f47898a;
        op0 op0Var = this.f27866n.K;
        TLRPC.User user = null;
        if (op0Var.Z1 || op0Var.a2) {
            int i11 = org.telegram.ui.ActionBar.t6.f20901bh;
            int i12 = org.telegram.ui.ActionBar.t6.Tg;
            org.telegram.ui.ActionBar.a7.V(q4Var.f22822b, i11, null);
            q4Var.H = i12;
            q4Var.f22828w.b(org.telegram.ui.ActionBar.t6.B5, i12, org.telegram.ui.ActionBar.t6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(op0Var.f21583a).f18325i1.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = org.telegram.messenger.vp.r1(op0Var.f21583a).Z1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = org.telegram.messenger.vp.r1(op0Var.f21583a).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = org.telegram.messenger.vp.r1(op0Var.f21583a).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z11 = false;
        if (j10 == q4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        q4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = org.telegram.messenger.h20.j(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        q4Var.a(j10, true, str);
        if (op0Var.M1.h(j10) >= 0) {
            z11 = true;
        }
        if (q4Var.f22829x) {
            q4Var.f22828w.a(z11, z10);
        }
    }
}
