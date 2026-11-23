package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class vo0 extends jg.c0 {
    public final wo0 f40757n;

    public vo0(wo0 wo0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var, true, true);
        this.f40757n = wo0Var;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) f1Var.f59245a;
        zo0 zo0Var = this.f40757n.L;
        TLRPC.User user = null;
        if (zo0Var.d2 || zo0Var.f42973e2) {
            int i10 = org.telegram.ui.ActionBar.n6.f29480eh;
            int i11 = org.telegram.ui.ActionBar.n6.Wg;
            org.telegram.ui.ActionBar.u6.U(p4Var.f31315b, i10, null);
            p4Var.I = i11;
            p4Var.f31322w.b(org.telegram.ui.ActionBar.n6.B5, i11, org.telegram.ui.ActionBar.n6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ri.d0(zo0Var.f30223a).f26721j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.mp.u1(zo0Var.f30223a).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.mp.u1(zo0Var.f30223a).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.mp.u1(zo0Var.f30223a).O0(Long.valueOf(tL_topPeer.peer.chat_id));
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
            str = org.telegram.messenger.n10.k(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        p4Var.a(j3, true, str);
        if (zo0Var.Q1.h(j3) >= 0) {
            z11 = true;
        }
        if (p4Var.f31323x) {
            p4Var.f31322w.a(z11, z10);
        }
    }
}
