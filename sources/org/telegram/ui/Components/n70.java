package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n70 implements w90 {
    public final o70 f29061a;

    public n70(o70 o70Var) {
        this.f29061a = o70Var;
    }

    @Override
    public final void a() {
        t70 t70Var = this.f29061a.f29405c;
        org.telegram.ui.ActionBar.m2 m2Var = t70Var.U;
        if (m2Var instanceof org.telegram.ui.yh0) {
            org.telegram.ui.yh0 yh0Var = (org.telegram.ui.yh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = t70Var.f31135b;
            org.telegram.ui.ub0 ub0Var = new org.telegram.ui.ub0(1, yh0Var.f44454n);
            ub0Var.T = yh0Var.f44462s0;
            ub0Var.Y(tL_chatInviteExported);
            yh0Var.presentFragment(ub0Var);
        } else {
            org.telegram.ui.ub0 ub0Var2 = new org.telegram.ui.ub0(1, t70Var.f31144g0);
            ub0Var2.Y(t70Var.f31135b);
            ub0Var2.T = new m70(this);
            t70Var.U.presentFragment(ub0Var2);
        }
        t70Var.dismiss();
    }

    @Override
    public final void c() {
        t70 t70Var = this.f29061a.f29405c;
        org.telegram.ui.ActionBar.m2 m2Var = t70Var.U;
        if (m2Var instanceof org.telegram.ui.yh0) {
            ((org.telegram.ui.yh0) m2Var).e0(t70Var.f31135b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = t70Var.f31135b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(t70.D(t70Var)).getInputPeer(-t70Var.f31144g0);
            ConnectionsManager.getInstance(t70.E(t70Var)).sendRequest(tL_messages_editExportedChatInvite, new l70(this, 0));
        }
        t70Var.dismiss();
    }

    @Override
    public final void j() {
        t70 t70Var = this.f29061a.f29405c;
        org.telegram.ui.ActionBar.m2 m2Var = t70Var.U;
        if (m2Var instanceof org.telegram.ui.yh0) {
            ((org.telegram.ui.yh0) m2Var).b0(t70Var.f31135b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = t70Var.f31135b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(t70.F(t70Var)).getInputPeer(-t70Var.f31144g0);
            ConnectionsManager.getInstance(t70.H(t70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new l70(this, 1));
        }
        t70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
