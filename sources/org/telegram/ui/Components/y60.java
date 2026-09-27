package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y60 implements h90 {
    public final z60 f30592a;

    public y60(z60 z60Var) {
        this.f30592a = z60Var;
    }

    @Override
    public final void c() {
        e70 e70Var = this.f30592a.f30861c;
        org.telegram.ui.ActionBar.o2 o2Var = e70Var.U;
        if (o2Var instanceof org.telegram.ui.vh0) {
            org.telegram.ui.vh0 vh0Var = (org.telegram.ui.vh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = e70Var.f23940b;
            org.telegram.ui.ub0 ub0Var = new org.telegram.ui.ub0(1, vh0Var.f38598n);
            ub0Var.T = vh0Var.f38606s0;
            ub0Var.Y(tL_chatInviteExported);
            vh0Var.presentFragment(ub0Var);
        } else {
            org.telegram.ui.ub0 ub0Var2 = new org.telegram.ui.ub0(1, e70Var.f23948g0);
            ub0Var2.Y(e70Var.f23940b);
            ub0Var2.T = new x60(this);
            e70Var.U.presentFragment(ub0Var2);
        }
        e70Var.dismiss();
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        e70 e70Var = this.f30592a.f30861c;
        org.telegram.ui.ActionBar.o2 o2Var = e70Var.U;
        if (o2Var instanceof org.telegram.ui.vh0) {
            ((org.telegram.ui.vh0) o2Var).e0(e70Var.f23940b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = e70Var.f23940b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.g3) e70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-e70Var.f23948g0);
            i11 = ((org.telegram.ui.ActionBar.g3) e70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new w60(this, 0));
        }
        e70Var.dismiss();
    }

    @Override
    public final void j() {
        int i10;
        int i11;
        e70 e70Var = this.f30592a.f30861c;
        org.telegram.ui.ActionBar.o2 o2Var = e70Var.U;
        if (o2Var instanceof org.telegram.ui.vh0) {
            ((org.telegram.ui.vh0) o2Var).b0(e70Var.f23940b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = e70Var.f23940b.link;
            i10 = ((org.telegram.ui.ActionBar.g3) e70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-e70Var.f23948g0);
            i11 = ((org.telegram.ui.ActionBar.g3) e70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new w60(this, 1));
        }
        e70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
