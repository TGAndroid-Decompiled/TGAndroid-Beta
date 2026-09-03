package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n60 implements w80 {
    public final o60 f27200a;

    public n60(o60 o60Var) {
        this.f27200a = o60Var;
    }

    @Override
    public final void a() {
        t60 t60Var = this.f27200a.f27469c;
        org.telegram.ui.ActionBar.p2 p2Var = t60Var.R;
        if (p2Var instanceof org.telegram.ui.rh0) {
            org.telegram.ui.rh0 rh0Var = (org.telegram.ui.rh0) p2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = t60Var.f28907b;
            org.telegram.ui.pb0 pb0Var = new org.telegram.ui.pb0(1, rh0Var.f37858n);
            pb0Var.Q = rh0Var.f37861p0;
            pb0Var.Y(tL_chatInviteExported);
            rh0Var.presentFragment(pb0Var);
        } else {
            org.telegram.ui.pb0 pb0Var2 = new org.telegram.ui.pb0(1, t60Var.f28911d0);
            pb0Var2.Y(t60Var.f28907b);
            pb0Var2.Q = new m60(this);
            t60Var.R.presentFragment(pb0Var2);
        }
        t60Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        t60 t60Var = this.f27200a.f27469c;
        org.telegram.ui.ActionBar.p2 p2Var = t60Var.R;
        if (p2Var instanceof org.telegram.ui.rh0) {
            ((org.telegram.ui.rh0) p2Var).e0(t60Var.f28907b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = t60Var.f28907b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-t60Var.f28911d0);
            i11 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new l60(this, 0));
        }
        t60Var.dismiss();
    }

    @Override
    public final void h() {
        int i10;
        int i11;
        t60 t60Var = this.f27200a.f27469c;
        org.telegram.ui.ActionBar.p2 p2Var = t60Var.R;
        if (p2Var instanceof org.telegram.ui.rh0) {
            ((org.telegram.ui.rh0) p2Var).b0(t60Var.f28907b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = t60Var.f28907b.link;
            i10 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-t60Var.f28911d0);
            i11 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new l60(this, 1));
        }
        t60Var.dismiss();
    }

    @Override
    public final void f() {
    }
}
