package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m60 implements v80 {
    public final n60 f26100a;

    public m60(n60 n60Var) {
        this.f26100a = n60Var;
    }

    @Override
    public final void a() {
        s60 s60Var = this.f26100a.f26353c;
        org.telegram.ui.ActionBar.n2 n2Var = s60Var.U;
        if (n2Var instanceof org.telegram.ui.th0) {
            org.telegram.ui.th0 th0Var = (org.telegram.ui.th0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.f27840b;
            org.telegram.ui.sb0 sb0Var = new org.telegram.ui.sb0(1, th0Var.f37671n);
            sb0Var.T = th0Var.f37679s0;
            sb0Var.Y(tL_chatInviteExported);
            th0Var.presentFragment(sb0Var);
        } else {
            org.telegram.ui.sb0 sb0Var2 = new org.telegram.ui.sb0(1, s60Var.f27848g0);
            sb0Var2.Y(s60Var.f27840b);
            sb0Var2.T = new l60(this);
            s60Var.U.presentFragment(sb0Var2);
        }
        s60Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        s60 s60Var = this.f26100a.f26353c;
        org.telegram.ui.ActionBar.n2 n2Var = s60Var.U;
        if (n2Var instanceof org.telegram.ui.th0) {
            ((org.telegram.ui.th0) n2Var).e0(s60Var.f27840b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = s60Var.f27840b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) s60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-s60Var.f27848g0);
            i11 = ((org.telegram.ui.ActionBar.f3) s60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new k60(this, 0));
        }
        s60Var.dismiss();
    }

    @Override
    public final void j() {
        int i10;
        int i11;
        s60 s60Var = this.f26100a.f26353c;
        org.telegram.ui.ActionBar.n2 n2Var = s60Var.U;
        if (n2Var instanceof org.telegram.ui.th0) {
            ((org.telegram.ui.th0) n2Var).b0(s60Var.f27840b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = s60Var.f27840b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) s60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-s60Var.f27848g0);
            i11 = ((org.telegram.ui.ActionBar.f3) s60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new k60(this, 1));
        }
        s60Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
