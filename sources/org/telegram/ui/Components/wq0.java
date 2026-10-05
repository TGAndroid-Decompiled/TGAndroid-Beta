package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class wq0 extends gg.c0 {
    public final xq0 f32695n;

    public wq0(xq0 xq0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, true, true);
        this.f32695n = xq0Var;
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
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) c1Var.f46538a;
        br0 br0Var = this.f32695n.K;
        boolean z11 = false;
        TLRPC.User user = null;
        if (br0Var.f25062h0 || br0Var.f25063i0) {
            int i15 = org.telegram.ui.ActionBar.i6.f21020ng;
            int i16 = org.telegram.ui.ActionBar.i6.f20872fg;
            n4Var.f22526b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.i6.B5, i16, org.telegram.ui.ActionBar.i6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
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
        if (br0Var.U.h(j3) >= 0) {
            z11 = true;
        }
        if (n4Var.f22533w) {
            n4Var.v.a(z11, z10);
        }
    }
}
