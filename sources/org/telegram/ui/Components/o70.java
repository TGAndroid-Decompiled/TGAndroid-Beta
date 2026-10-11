package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o70 implements x90 {
    public final p70 f29279a;

    public o70(p70 p70Var) {
        this.f29279a = p70Var;
    }

    @Override
    public final void a() {
        u70 u70Var = this.f29279a.f29637c;
        org.telegram.ui.ActionBar.m2 m2Var = u70Var.U;
        if (m2Var instanceof org.telegram.ui.yh0) {
            org.telegram.ui.yh0 yh0Var = (org.telegram.ui.yh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = u70Var.f31311b;
            org.telegram.ui.ub0 ub0Var = new org.telegram.ui.ub0(1, yh0Var.f44420n);
            ub0Var.T = yh0Var.f44428s0;
            ub0Var.Y(tL_chatInviteExported);
            yh0Var.presentFragment(ub0Var);
        } else {
            org.telegram.ui.ub0 ub0Var2 = new org.telegram.ui.ub0(1, u70Var.f31320g0);
            ub0Var2.Y(u70Var.f31311b);
            ub0Var2.T = new n70(this);
            u70Var.U.presentFragment(ub0Var2);
        }
        u70Var.dismiss();
    }

    @Override
    public final void c() {
        u70 u70Var = this.f29279a.f29637c;
        org.telegram.ui.ActionBar.m2 m2Var = u70Var.U;
        if (m2Var instanceof org.telegram.ui.yh0) {
            ((org.telegram.ui.yh0) m2Var).e0(u70Var.f31311b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = u70Var.f31311b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(u70.D(u70Var)).getInputPeer(-u70Var.f31320g0);
            ConnectionsManager.getInstance(u70.E(u70Var)).sendRequest(tL_messages_editExportedChatInvite, new m70(this, 0));
        }
        u70Var.dismiss();
    }

    @Override
    public final void j() {
        u70 u70Var = this.f29279a.f29637c;
        org.telegram.ui.ActionBar.m2 m2Var = u70Var.U;
        if (m2Var instanceof org.telegram.ui.yh0) {
            ((org.telegram.ui.yh0) m2Var).b0(u70Var.f31311b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = u70Var.f31311b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(u70.F(u70Var)).getInputPeer(-u70Var.f31320g0);
            ConnectionsManager.getInstance(u70.H(u70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new m70(this, 1));
        }
        u70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
