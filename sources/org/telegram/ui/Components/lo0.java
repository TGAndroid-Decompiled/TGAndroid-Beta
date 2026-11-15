package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class lo0 extends jg.c0 {
    public final mo0 f36867n;

    public lo0(mo0 mo0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var, true, true);
        this.f36867n = mo0Var;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) e1Var.f58535a;
        po0 po0Var = this.f36867n.L;
        TLRPC.User user = null;
        if (po0Var.d2 || po0Var.f38343e2) {
            int i10 = org.telegram.ui.ActionBar.j6.f28878eh;
            int i11 = org.telegram.ui.ActionBar.j6.Wg;
            org.telegram.ui.ActionBar.q6.U(o4Var.f30799b, i10, null);
            o4Var.I = i11;
            o4Var.f30806w.b(org.telegram.ui.ActionBar.j6.B5, i11, org.telegram.ui.ActionBar.j6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.si.b0(po0Var.f29679a).f26492j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.np.s1(po0Var.f29679a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.np.s1(po0Var.f29679a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.np.s1(po0Var.f29679a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z11 = false;
        if (j3 == o4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = org.telegram.messenger.q10.j(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        o4Var.a(j3, true, str);
        if (po0Var.Q1.h(j3) >= 0) {
            z11 = true;
        }
        if (o4Var.f30807x) {
            o4Var.f30806w.a(z11, z10);
        }
    }
}
