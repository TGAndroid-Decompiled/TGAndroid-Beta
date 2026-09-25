package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class pq0 extends gg.c0 {
    public final qq0 f27419n;

    public pq0(qq0 qq0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, true, true);
        this.f27419n = qq0Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        boolean z10;
        String str;
        int i14;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) c1Var.f42961a;
        uq0 uq0Var = this.f27419n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (uq0Var.f28884h0 || uq0Var.f28885i0) {
            int i15 = org.telegram.ui.ActionBar.h6.f19251ng;
            int i16 = org.telegram.ui.ActionBar.h6.f19104fg;
            n4Var.f20688b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.h6.B5, i16, org.telegram.ui.ActionBar.h6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        if (j3 == n4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        n4Var.a(j3, str);
        if (uq0Var.U.h(j3) >= 0) {
            z11 = true;
        }
        if (n4Var.f20694w) {
            n4Var.v.a(z11, z10);
        }
    }
}
