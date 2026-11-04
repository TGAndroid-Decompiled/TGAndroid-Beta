package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ko0 extends kg.z {
    public final lo0 f35457n;

    public ko0(lo0 lo0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var, true, true);
        this.f35457n = lo0Var;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) d1Var.f55540a;
        oo0 oo0Var = this.f35457n.L;
        TLRPC.User user = null;
        if (oo0Var.f36875a2 || oo0Var.f36876b2) {
            int i10 = org.telegram.ui.ActionBar.k6.f27853bh;
            int i11 = org.telegram.ui.ActionBar.k6.Tg;
            org.telegram.ui.ActionBar.r6.V(o4Var.f29738b, i10, null);
            o4Var.I = i11;
            o4Var.f29745w.b(org.telegram.ui.ActionBar.k6.B5, i11, org.telegram.ui.ActionBar.k6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.li.b0(oo0Var.f28583a).f24032j1.get(i3);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = org.telegram.messenger.hp.s1(oo0Var.f28583a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = org.telegram.messenger.hp.s1(oo0Var.f28583a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = org.telegram.messenger.hp.s1(oo0Var.f28583a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z11 = false;
        if (j10 == o4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = org.telegram.messenger.l10.j(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        o4Var.a(j10, true, str);
        if (oo0Var.N1.h(j10) >= 0) {
            z11 = true;
        }
        if (o4Var.f29746x) {
            o4Var.f29745w.a(z11, z10);
        }
    }
}
