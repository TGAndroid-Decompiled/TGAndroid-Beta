package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class pq0 extends gg.c0 {
    public final qq0 f27428n;

    public pq0(qq0 qq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.f27428n = qq0Var;
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
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) c1Var.f42974a;
        uq0 uq0Var = this.f27428n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (uq0Var.f28814h0 || uq0Var.f28815i0) {
            int i15 = org.telegram.ui.ActionBar.j6.f19286ng;
            int i16 = org.telegram.ui.ActionBar.j6.f19138fg;
            o4Var.f20744b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            o4Var.H = i16;
            o4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) uq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) uq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.f3) uq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.f3) uq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        if (j3 == o4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        o4Var.a(j3, str);
        if (uq0Var.U.h(j3) >= 0) {
            z11 = true;
        }
        if (o4Var.f20750w) {
            o4Var.v.a(z11, z10);
        }
    }
}
