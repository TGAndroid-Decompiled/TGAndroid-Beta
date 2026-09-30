package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z60 implements i90 {
    public final a70 f30901a;

    public z60(a70 a70Var) {
        this.f30901a = a70Var;
    }

    @Override
    public final void c() {
        f70 f70Var = this.f30901a.f22577c;
        org.telegram.ui.ActionBar.m2 m2Var = f70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            org.telegram.ui.sh0 sh0Var = (org.telegram.ui.sh0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = f70Var.f24225b;
            org.telegram.ui.rb0 rb0Var = new org.telegram.ui.rb0(1, sh0Var.f37880n);
            rb0Var.T = sh0Var.f37888s0;
            rb0Var.Y(tL_chatInviteExported);
            sh0Var.presentFragment(rb0Var);
        } else {
            org.telegram.ui.rb0 rb0Var2 = new org.telegram.ui.rb0(1, f70Var.f24233g0);
            rb0Var2.Y(f70Var.f24225b);
            rb0Var2.T = new y60(this);
            f70Var.U.presentFragment(rb0Var2);
        }
        f70Var.dismiss();
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        f70 f70Var = this.f30901a.f22577c;
        org.telegram.ui.ActionBar.m2 m2Var = f70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).e0(f70Var.f24225b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = f70Var.f24225b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.e3) f70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-f70Var.f24233g0);
            i11 = ((org.telegram.ui.ActionBar.e3) f70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new x60(this, 0));
        }
        f70Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        f70 f70Var = this.f30901a.f22577c;
        org.telegram.ui.ActionBar.m2 m2Var = f70Var.U;
        if (m2Var instanceof org.telegram.ui.sh0) {
            ((org.telegram.ui.sh0) m2Var).b0(f70Var.f24225b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = f70Var.f24225b.link;
            i10 = ((org.telegram.ui.ActionBar.e3) f70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-f70Var.f24233g0);
            i11 = ((org.telegram.ui.ActionBar.e3) f70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new x60(this, 1));
        }
        f70Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
