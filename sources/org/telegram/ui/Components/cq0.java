package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cq0 extends hg.c0 {
    public final dq0 f25077n;

    public cq0(dq0 dq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.f25077n = dq0Var;
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
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) c1Var.f45738a;
        hq0 hq0Var = this.f25077n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (hq0Var.f26798h0 || hq0Var.f26799i0) {
            int i15 = org.telegram.ui.ActionBar.j6.f20853ng;
            int i16 = org.telegram.ui.ActionBar.j6.f20708fg;
            m4Var.f22281b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            m4Var.H = i16;
            m4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        if (j3 == m4Var.getDialogId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        m4Var.a(j3, str);
        if (hq0Var.U.h(j3) >= 0) {
            z11 = true;
        }
        if (m4Var.f22288w) {
            m4Var.v.a(z11, z10);
        }
    }
}
