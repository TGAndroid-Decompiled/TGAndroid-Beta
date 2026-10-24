package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e70 implements o90 {
    public final f70 f25980a;

    public e70(f70 f70Var) {
        this.f25980a = f70Var;
    }

    @Override
    public final void a() {
        k70 k70Var = this.f25980a.f26217c;
        org.telegram.ui.ActionBar.o2 o2Var = k70Var.U;
        if (o2Var instanceof org.telegram.ui.lh0) {
            org.telegram.ui.lh0 lh0Var = (org.telegram.ui.lh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = k70Var.f27910b;
            org.telegram.ui.gb0 gb0Var = new org.telegram.ui.gb0(1, lh0Var.f39287n);
            gb0Var.T = lh0Var.f39295s0;
            gb0Var.Y(tL_chatInviteExported);
            lh0Var.presentFragment(gb0Var);
        } else {
            org.telegram.ui.gb0 gb0Var2 = new org.telegram.ui.gb0(1, k70Var.f27918g0);
            gb0Var2.Y(k70Var.f27910b);
            gb0Var2.T = new d70(this);
            k70Var.U.presentFragment(gb0Var2);
        }
        k70Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        k70 k70Var = this.f25980a.f26217c;
        org.telegram.ui.ActionBar.o2 o2Var = k70Var.U;
        if (o2Var instanceof org.telegram.ui.lh0) {
            ((org.telegram.ui.lh0) o2Var).f0(k70Var.f27910b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = k70Var.f27910b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.h3) k70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-k70Var.f27918g0);
            i11 = ((org.telegram.ui.ActionBar.h3) k70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new c70(this, 0));
        }
        k70Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        k70 k70Var = this.f25980a.f26217c;
        org.telegram.ui.ActionBar.o2 o2Var = k70Var.U;
        if (o2Var instanceof org.telegram.ui.lh0) {
            ((org.telegram.ui.lh0) o2Var).c0(k70Var.f27910b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = k70Var.f27910b.link;
            i10 = ((org.telegram.ui.ActionBar.h3) k70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-k70Var.f27918g0);
            i11 = ((org.telegram.ui.ActionBar.h3) k70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new c70(this, 1));
        }
        k70Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
