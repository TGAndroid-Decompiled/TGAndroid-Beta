package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f70 implements p90 {
    public final g70 f26153a;

    public f70(g70 g70Var) {
        this.f26153a = g70Var;
    }

    @Override
    public final void c() {
        l70 l70Var = this.f26153a.f26516c;
        org.telegram.ui.ActionBar.n2 n2Var = l70Var.U;
        if (n2Var instanceof org.telegram.ui.hh0) {
            org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.f28125b;
            org.telegram.ui.ab0 ab0Var = new org.telegram.ui.ab0(1, hh0Var.f37638n);
            ab0Var.T = hh0Var.f37646s0;
            ab0Var.Y(tL_chatInviteExported);
            hh0Var.presentFragment(ab0Var);
        } else {
            org.telegram.ui.ab0 ab0Var2 = new org.telegram.ui.ab0(1, l70Var.f28133g0);
            ab0Var2.Y(l70Var.f28125b);
            ab0Var2.T = new e70(this);
            l70Var.U.presentFragment(ab0Var2);
        }
        l70Var.dismiss();
    }

    @Override
    public final void d() {
        int i10;
        int i11;
        l70 l70Var = this.f26153a.f26516c;
        org.telegram.ui.ActionBar.n2 n2Var = l70Var.U;
        if (n2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) n2Var).e0(l70Var.f28125b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = l70Var.f28125b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-l70Var.f28133g0);
            i11 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new d70(this, 0));
        }
        l70Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        l70 l70Var = this.f26153a.f26516c;
        org.telegram.ui.ActionBar.n2 n2Var = l70Var.U;
        if (n2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) n2Var).b0(l70Var.f28125b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = l70Var.f28125b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-l70Var.f28133g0);
            i11 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new d70(this, 1));
        }
        l70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
