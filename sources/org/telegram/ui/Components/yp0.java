package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class yp0 extends rf.u {
    public final zp0 f35118n;

    public yp0(zp0 zp0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true, true);
        this.f35118n = zp0Var;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        boolean z10;
        String str;
        int i14;
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) n1Var.f6432a;
        dq0 dq0Var = this.f35118n.G;
        boolean z11 = false;
        TLRPC.User user = null;
        if (dq0Var.f27832d0 || dq0Var.f27834e0) {
            int i15 = org.telegram.ui.ActionBar.g6.f23251ng;
            int i16 = org.telegram.ui.ActionBar.g6.f23108fg;
            l4Var.f24625b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            l4Var.D = i16;
            l4Var.v.b(org.telegram.ui.ActionBar.g6.B5, i16, org.telegram.ui.ActionBar.g6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        if (j10 == l4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        l4Var.a(j10, str);
        if (dq0Var.Q.h(j10) >= 0) {
            z11 = true;
        }
        if (l4Var.f24632w) {
            l4Var.v.a(z11, z10);
        }
    }
}
