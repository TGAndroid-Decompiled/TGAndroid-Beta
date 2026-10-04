package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z60 implements i90 {
    public final a70 f33399a;

    public z60(a70 a70Var) {
        this.f33399a = a70Var;
    }

    @Override
    public final void b() {
        f70 f70Var = this.f33399a.f24481c;
        org.telegram.ui.ActionBar.n2 n2Var = f70Var.U;
        if (n2Var instanceof org.telegram.ui.wh0) {
            org.telegram.ui.wh0 wh0Var = (org.telegram.ui.wh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = f70Var.f26343b;
            org.telegram.ui.vb0 vb0Var = new org.telegram.ui.vb0(1, wh0Var.f42491n);
            vb0Var.T = wh0Var.f42499s0;
            vb0Var.X(tL_chatInviteExported);
            wh0Var.presentFragment(vb0Var);
        } else {
            org.telegram.ui.vb0 vb0Var2 = new org.telegram.ui.vb0(1, f70Var.f26352g0);
            vb0Var2.X(f70Var.f26343b);
            vb0Var2.T = new y60(this);
            f70Var.U.presentFragment(vb0Var2);
        }
        f70Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        f70 f70Var = this.f33399a.f24481c;
        org.telegram.ui.ActionBar.n2 n2Var = f70Var.U;
        if (n2Var instanceof org.telegram.ui.wh0) {
            ((org.telegram.ui.wh0) n2Var).e0(f70Var.f26343b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = f70Var.f26343b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-f70Var.f26352g0);
            i11 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new x60(this, 0));
        }
        f70Var.dismiss();
    }

    @Override
    public final void i() {
        int i10;
        int i11;
        f70 f70Var = this.f33399a.f24481c;
        org.telegram.ui.ActionBar.n2 n2Var = f70Var.U;
        if (n2Var instanceof org.telegram.ui.wh0) {
            ((org.telegram.ui.wh0) n2Var).b0(f70Var.f26343b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = f70Var.f26343b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-f70Var.f26352g0);
            i11 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new x60(this, 1));
        }
        f70Var.dismiss();
    }

    @Override
    public final void h() {
    }
}
