package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class np0 extends pf.t {

    public final op0 f31009n;

    public np0(op0 op0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true, true);
        this.f31009n = op0Var;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Chat chat;
        String firstName;
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) o1Var.f5789a;
        sp0 sp0Var = this.f31009n.G;
        TLRPC.User user = null;
        if (sp0Var.f32524d0 || sp0Var.f32526e0) {
            int i11 = org.telegram.ui.ActionBar.g6.f23242ng;
            int i12 = org.telegram.ui.ActionBar.g6.f23099fg;
            k4Var.f24572b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            k4Var.D = i12;
            k4Var.v.b(org.telegram.ui.ActionBar.g6.B5, i12, org.telegram.ui.ActionBar.g6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == k4Var.getDialogId();
        k4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            firstName = UserObject.getFirstName(user);
        } else {
            firstName = chat != null ? chat.title : "";
        }
        k4Var.a(j10, firstName);
        boolean z11 = sp0Var.Q.h(j10) >= 0;
        if (k4Var.f24579w) {
            k4Var.v.a(z11, z10);
        }
    }
}
