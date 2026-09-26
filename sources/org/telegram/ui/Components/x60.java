package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x60 implements g90 {
    public final y60 f30278a;

    public x60(y60 y60Var) {
        this.f30278a = y60Var;
    }

    @Override
    public final void c() {
        d70 d70Var = this.f30278a.f30574c;
        org.telegram.ui.ActionBar.m2 m2Var = d70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            org.telegram.ui.sh0 sh0Var = (org.telegram.ui.sh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = d70Var.f23593b;
            org.telegram.ui.rb0 rb0Var = new org.telegram.ui.rb0(1, sh0Var.f37783n);
            rb0Var.T = sh0Var.f37791s0;
            rb0Var.Y(tL_chatInviteExported);
            sh0Var.presentFragment(rb0Var);
        } else {
            org.telegram.ui.rb0 rb0Var2 = new org.telegram.ui.rb0(1, d70Var.f23601g0);
            rb0Var2.Y(d70Var.f23593b);
            rb0Var2.T = new w60(this);
            d70Var.U.presentFragment(rb0Var2);
        }
        d70Var.dismiss();
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        d70 d70Var = this.f30278a.f30574c;
        org.telegram.ui.ActionBar.m2 m2Var = d70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).e0(d70Var.f23593b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = d70Var.f23593b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) d70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-d70Var.f23601g0);
            i11 = ((org.telegram.ui.ActionBar.e3) d70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new v60(this, 0));
        }
        d70Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        d70 d70Var = this.f30278a.f30574c;
        org.telegram.ui.ActionBar.m2 m2Var = d70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).b0(d70Var.f23593b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = d70Var.f23593b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) d70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-d70Var.f23601g0);
            i11 = ((org.telegram.ui.ActionBar.e3) d70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new v60(this, 1));
        }
        d70Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
