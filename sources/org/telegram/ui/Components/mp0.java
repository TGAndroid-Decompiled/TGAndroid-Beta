package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class mp0 extends of.z {
    public final np0 f30904n;

    public mp0(np0 np0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, context, b6Var, true, true);
        this.f30904n = np0Var;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLRPC.Chat chat;
        int i11;
        int i12;
        boolean z10;
        String str;
        int i13;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) q1Var.f5501a;
        rp0 rp0Var = this.f30904n.G;
        boolean z11 = false;
        TLRPC.User user = null;
        if (rp0Var.f32246d0 || rp0Var.f32248e0) {
            int i14 = org.telegram.ui.ActionBar.f6.f23188ng;
            int i15 = org.telegram.ui.ActionBar.f6.f23046fg;
            n4Var.f24748b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            n4Var.D = i15;
            n4Var.v.b(org.telegram.ui.ActionBar.f6.B5, i15, org.telegram.ui.ActionBar.f6.C5);
        }
        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i10).hints.get(i9);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
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
        if (rp0Var.Q.h(j10) >= 0) {
            z11 = true;
        }
        if (n4Var.f24755w) {
            n4Var.v.a(z11, z10);
        }
    }
}
