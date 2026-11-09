package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class jo0 extends jg.c0 {
    public final ko0 f35105n;

    public jo0(ko0 ko0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var, true, true);
        this.f35105n = ko0Var;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        boolean z9;
        String str;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) d1Var.f57056a;
        no0 no0Var = this.f35105n.K;
        TLRPC.User user = null;
        if (no0Var.Z1 || no0Var.f36430a2) {
            int i10 = org.telegram.ui.ActionBar.l6.f27838bh;
            int i11 = org.telegram.ui.ActionBar.l6.Tg;
            org.telegram.ui.ActionBar.s6.U(o4Var.f29651b, i10, null);
            o4Var.H = i11;
            o4Var.f29658w.b(org.telegram.ui.ActionBar.l6.B5, i11, org.telegram.ui.ActionBar.l6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(no0Var.f28621a).f25821i1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.qp.s1(no0Var.f28621a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.qp.s1(no0Var.f28621a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.qp.s1(no0Var.f28621a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = false;
        if (j3 == o4Var.getDialogId()) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = org.telegram.messenger.t10.j(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        o4Var.a(j3, true, str);
        if (no0Var.M1.h(j3) >= 0) {
            z10 = true;
        }
        if (o4Var.f29659x) {
            o4Var.f29658w.a(z10, z9);
        }
    }
}
