package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class dr0 extends hg.b0 {
    public final er0 f25720n;

    public dr0(er0 er0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, true, true);
        this.f25720n = er0Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        boolean z10;
        String str;
        int i14;
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) b1Var.f46343a;
        ir0 ir0Var = this.f25720n.K;
        TLRPC.User user = null;
        if (ir0Var.f27420i0 || ir0Var.f27421j0) {
            int i15 = org.telegram.ui.ActionBar.k6.f21376ng;
            int i16 = org.telegram.ui.ActionBar.k6.fg;
            org.telegram.ui.ActionBar.r6.W(m4Var.f22719b, i15, null);
            m4Var.H = i16;
            m4Var.v.b(org.telegram.ui.ActionBar.k6.B5, i16, org.telegram.ui.ActionBar.k6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z11 = false;
        if (j10 == m4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        m4Var.a(j10, true, str);
        if (ir0Var.V.h(j10) >= 0) {
            z11 = true;
        }
        if (m4Var.f22725w) {
            m4Var.v.a(z11, z10);
        }
    }
}
