package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class nq0 extends fg.b0 {
    public final oq0 f25569n;

    public nq0(oq0 oq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.f25569n = oq0Var;
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
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) c1Var.f41610a;
        sq0 sq0Var = this.f25569n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (sq0Var.f27176h0 || sq0Var.f27177i0) {
            int i15 = org.telegram.ui.ActionBar.j6.f18117ng;
            int i16 = org.telegram.ui.ActionBar.j6.f17972fg;
            n4Var.f19560b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
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
        if (sq0Var.U.h(j3) >= 0) {
            z11 = true;
        }
        if (n4Var.f19566w) {
            n4Var.v.a(z11, z10);
        }
    }
}
