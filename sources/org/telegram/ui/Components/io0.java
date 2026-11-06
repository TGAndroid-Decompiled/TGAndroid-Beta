package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class io0 extends jg.c0 {
    public final jo0 f34735n;

    public io0(jo0 jo0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var, true, true);
        this.f34735n = jo0Var;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        boolean z9;
        String str;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) d1Var.f56951a;
        mo0 mo0Var = this.f34735n.K;
        TLRPC.User user = null;
        if (mo0Var.Z1 || mo0Var.f36008a2) {
            int i10 = org.telegram.ui.ActionBar.k6.f27822bh;
            int i11 = org.telegram.ui.ActionBar.k6.Tg;
            org.telegram.ui.ActionBar.r6.V(o4Var.f29644b, i10, null);
            o4Var.H = i11;
            o4Var.f29651w.b(org.telegram.ui.ActionBar.k6.B5, i11, org.telegram.ui.ActionBar.k6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(mo0Var.f28613a).f25818i1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.qp.s1(mo0Var.f28613a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.qp.s1(mo0Var.f28613a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.qp.s1(mo0Var.f28613a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
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
        if (mo0Var.M1.h(j3) >= 0) {
            z10 = true;
        }
        if (o4Var.f29652x) {
            o4Var.f29651w.a(z10, z9);
        }
    }
}
