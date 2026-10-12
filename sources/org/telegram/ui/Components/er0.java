package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class er0 extends hg.b0 {
    public final fr0 f24770n;

    public er0(fr0 fr0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true, true);
        this.f24770n = fr0Var;
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
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) b1Var.f44838a;
        jr0 jr0Var = this.f24770n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (jr0Var.f26467h0 || jr0Var.f26468i0) {
            int i15 = org.telegram.ui.ActionBar.g6.f20094ng;
            int i16 = org.telegram.ui.ActionBar.g6.fg;
            n4Var.f21555b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.g6.B5, i16, org.telegram.ui.ActionBar.g6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        if (j10 == n4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        n4Var.a(j10, str);
        if (jr0Var.U.h(j10) >= 0) {
            z11 = true;
        }
        if (n4Var.f21561w) {
            n4Var.v.a(z11, z10);
        }
    }
}
