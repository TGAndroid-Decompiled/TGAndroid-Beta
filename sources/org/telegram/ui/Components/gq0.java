package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class gq0 extends tf.t {
    public final hq0 f25234n;

    public gq0(hq0 hq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.f25234n = hq0Var;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        boolean z4;
        String str;
        int i14;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) l1Var.f5785a;
        lq0 lq0Var = this.f25234n.H;
        boolean z10 = false;
        TLRPC.User user = null;
        if (lq0Var.f26848e0 || lq0Var.f26850f0) {
            int i15 = org.telegram.ui.ActionBar.j6.f20094ng;
            int i16 = org.telegram.ui.ActionBar.j6.f19951fg;
            n4Var.f21431b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            n4Var.E = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        if (j10 == n4Var.getDialogId()) {
            z4 = true;
        } else {
            z4 = false;
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
        if (lq0Var.R.h(j10) >= 0) {
            z10 = true;
        }
        if (n4Var.f21437w) {
            n4Var.v.a(z10, z4);
        }
    }
}
