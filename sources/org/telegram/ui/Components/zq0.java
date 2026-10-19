package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class zq0 extends hg.b0 {
    public final ar0 f33025n;

    public zq0(ar0 ar0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, true, true);
        this.f33025n = ar0Var;
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
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) b1Var.f45912a;
        er0 er0Var = this.f33025n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (er0Var.f25987i0 || er0Var.f25988j0) {
            int i15 = org.telegram.ui.ActionBar.h6.f21180ng;
            int i16 = org.telegram.ui.ActionBar.h6.fg;
            m4Var.f22572b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            m4Var.H = i16;
            m4Var.v.b(org.telegram.ui.ActionBar.h6.B5, i16, org.telegram.ui.ActionBar.h6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) er0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) er0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.f3) er0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.f3) er0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
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
        m4Var.a(j10, str);
        if (er0Var.V.h(j10) >= 0) {
            z11 = true;
        }
        if (m4Var.f22578w) {
            m4Var.v.a(z11, z10);
        }
    }
}
