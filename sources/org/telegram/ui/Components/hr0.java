package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class hr0 extends ig.b0 {
    public final ir0 f29039n;

    public hr0(ir0 ir0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, context, u6Var, true, true);
        this.f29039n = ir0Var;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        boolean z10;
        String str;
        int i14;
        org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) e1Var.f47735a;
        mr0 mr0Var = this.f29039n.K;
        TLRPC.User user = null;
        if (mr0Var.f30708i0 || mr0Var.f30709j0) {
            int i15 = org.telegram.ui.ActionBar.y6.f23548ng;
            int i16 = org.telegram.ui.ActionBar.y6.f23400fg;
            org.telegram.ui.ActionBar.f7.V(r4Var.f24960b, i15, null);
            r4Var.H = i16;
            r4Var.v.b(org.telegram.ui.ActionBar.y6.B5, i16, org.telegram.ui.ActionBar.y6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z11 = false;
        if (j10 == r4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        r4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        r4Var.a(j10, true, str);
        if (mr0Var.V.h(j10) >= 0) {
            z11 = true;
        }
        if (r4Var.f24966w) {
            r4Var.v.a(z11, z10);
        }
    }
}
