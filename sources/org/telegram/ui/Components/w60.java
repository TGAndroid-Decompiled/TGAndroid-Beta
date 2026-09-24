package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w60 implements f90 {
    public final x60 f29889a;

    public w60(x60 x60Var) {
        this.f29889a = x60Var;
    }

    @Override
    public final void c() {
        c70 c70Var = this.f29889a.f30257c;
        org.telegram.ui.ActionBar.m2 m2Var = c70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            org.telegram.ui.sh0 sh0Var = (org.telegram.ui.sh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.f23226b;
            org.telegram.ui.rb0 rb0Var = new org.telegram.ui.rb0(1, sh0Var.f37769n);
            rb0Var.T = sh0Var.f37777s0;
            rb0Var.Y(tL_chatInviteExported);
            sh0Var.presentFragment(rb0Var);
        } else {
            org.telegram.ui.rb0 rb0Var2 = new org.telegram.ui.rb0(1, c70Var.f23234g0);
            rb0Var2.Y(c70Var.f23226b);
            rb0Var2.T = new v60(this);
            c70Var.U.presentFragment(rb0Var2);
        }
        c70Var.dismiss();
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        c70 c70Var = this.f29889a.f30257c;
        org.telegram.ui.ActionBar.m2 m2Var = c70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).e0(c70Var.f23226b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = c70Var.f23226b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-c70Var.f23234g0);
            i11 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new u60(this, 0));
        }
        c70Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        c70 c70Var = this.f29889a.f30257c;
        org.telegram.ui.ActionBar.m2 m2Var = c70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).b0(c70Var.f23226b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = c70Var.f23226b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-c70Var.f23234g0);
            i11 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new u60(this, 1));
        }
        c70Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
