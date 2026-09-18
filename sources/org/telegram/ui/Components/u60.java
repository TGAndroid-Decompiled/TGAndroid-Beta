package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u60 implements d90 {
    public final v60 f28618a;

    public u60(v60 v60Var) {
        this.f28618a = v60Var;
    }

    @Override
    public final void c() {
        a70 a70Var = this.f28618a.f28942c;
        org.telegram.ui.ActionBar.n2 n2Var = a70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.f22536b;
            org.telegram.ui.yb0 yb0Var = new org.telegram.ui.yb0(1, zh0Var.f40162n);
            yb0Var.T = zh0Var.f40170s0;
            yb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(yb0Var);
        } else {
            org.telegram.ui.yb0 yb0Var2 = new org.telegram.ui.yb0(1, a70Var.f22544g0);
            yb0Var2.Y(a70Var.f22536b);
            yb0Var2.T = new t60(this);
            a70Var.U.presentFragment(yb0Var2);
        }
        a70Var.dismiss();
    }

    @Override
    public final void e() {
        a70 a70Var = this.f28618a.f28942c;
        org.telegram.ui.ActionBar.n2 n2Var = a70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).e0(a70Var.f22536b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a70Var.f22536b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(a70.A(a70Var)).getInputPeer(-a70Var.f22544g0);
            ConnectionsManager.getInstance(a70.B(a70Var)).sendRequest(tL_messages_editExportedChatInvite, new s60(this, 0));
        }
        a70Var.dismiss();
    }

    @Override
    public final void k() {
        a70 a70Var = this.f28618a.f28942c;
        org.telegram.ui.ActionBar.n2 n2Var = a70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).b0(a70Var.f22536b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a70Var.f22536b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(a70.E(a70Var)).getInputPeer(-a70Var.f22544g0);
            ConnectionsManager.getInstance(a70.G(a70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new s60(this, 1));
        }
        a70Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
