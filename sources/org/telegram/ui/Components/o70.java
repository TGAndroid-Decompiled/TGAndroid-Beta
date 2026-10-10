package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o70 implements x90 {
    public final p70 f29363a;

    public o70(p70 p70Var) {
        this.f29363a = p70Var;
    }

    @Override
    public final void a() {
        u70 u70Var = this.f29363a.f29713c;
        org.telegram.ui.ActionBar.n2 n2Var = u70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = u70Var.f31388b;
            org.telegram.ui.vb0 vb0Var = new org.telegram.ui.vb0(1, zh0Var.f44694n);
            vb0Var.T = zh0Var.f44702s0;
            vb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(vb0Var);
        } else {
            org.telegram.ui.vb0 vb0Var2 = new org.telegram.ui.vb0(1, u70Var.f31397g0);
            vb0Var2.Y(u70Var.f31388b);
            vb0Var2.T = new n70(this);
            u70Var.U.presentFragment(vb0Var2);
        }
        u70Var.dismiss();
    }

    @Override
    public final void c() {
        u70 u70Var = this.f29363a.f29713c;
        org.telegram.ui.ActionBar.n2 n2Var = u70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).e0(u70Var.f31388b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = u70Var.f31388b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(u70.D(u70Var)).getInputPeer(-u70Var.f31397g0);
            ConnectionsManager.getInstance(u70.E(u70Var)).sendRequest(tL_messages_editExportedChatInvite, new m70(this, 0));
        }
        u70Var.dismiss();
    }

    @Override
    public final void j() {
        u70 u70Var = this.f29363a.f29713c;
        org.telegram.ui.ActionBar.n2 n2Var = u70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).b0(u70Var.f31388b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = u70Var.f31388b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(u70.F(u70Var)).getInputPeer(-u70Var.f31397g0);
            ConnectionsManager.getInstance(u70.H(u70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new m70(this, 1));
        }
        u70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
