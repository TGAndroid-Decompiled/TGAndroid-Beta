package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class lp0 extends zf.u {
    public final mp0 f28239n;

    public lp0(mp0 mp0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, true, true);
        this.f28239n = mp0Var;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) c1Var.f47909a;
        pp0 pp0Var = this.f28239n.K;
        TLRPC.User user = null;
        if (pp0Var.Z1 || pp0Var.a2) {
            int i11 = org.telegram.ui.ActionBar.t6.f20902bh;
            int i12 = org.telegram.ui.ActionBar.t6.Tg;
            org.telegram.ui.ActionBar.a7.V(q4Var.f22823b, i11, null);
            q4Var.H = i12;
            q4Var.f22829w.b(org.telegram.ui.ActionBar.t6.B5, i12, org.telegram.ui.ActionBar.t6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.vi.b0(pp0Var.f21584a).f18654i1.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = org.telegram.messenger.wp.r1(pp0Var.f21584a).Z1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = org.telegram.messenger.wp.r1(pp0Var.f21584a).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = org.telegram.messenger.wp.r1(pp0Var.f21584a).L0(Long.valueOf(tL_topPeer.peer.chat_id));
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
            str = org.telegram.messenger.i20.j(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        q4Var.a(j10, true, str);
        if (pp0Var.M1.h(j10) >= 0) {
            z11 = true;
        }
        if (q4Var.f22830x) {
            q4Var.f22829w.a(z11, z10);
        }
    }
}
