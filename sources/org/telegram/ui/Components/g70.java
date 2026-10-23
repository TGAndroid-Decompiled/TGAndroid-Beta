package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g70 implements q90 {
    public final h70 f26557a;

    public g70(h70 h70Var) {
        this.f26557a = h70Var;
    }

    @Override
    public final void a() {
        m70 m70Var = this.f26557a.f26813c;
        org.telegram.ui.ActionBar.o2 o2Var = m70Var.U;
        if (o2Var instanceof org.telegram.ui.mh0) {
            org.telegram.ui.mh0 mh0Var = (org.telegram.ui.mh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = m70Var.f28576b;
            org.telegram.ui.gb0 gb0Var = new org.telegram.ui.gb0(1, mh0Var.f39592n);
            gb0Var.T = mh0Var.f39600s0;
            gb0Var.Y(tL_chatInviteExported);
            mh0Var.presentFragment(gb0Var);
        } else {
            org.telegram.ui.gb0 gb0Var2 = new org.telegram.ui.gb0(1, m70Var.f28584g0);
            gb0Var2.Y(m70Var.f28576b);
            gb0Var2.T = new f70(this);
            m70Var.U.presentFragment(gb0Var2);
        }
        m70Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        m70 m70Var = this.f26557a.f26813c;
        org.telegram.ui.ActionBar.o2 o2Var = m70Var.U;
        if (o2Var instanceof org.telegram.ui.mh0) {
            ((org.telegram.ui.mh0) o2Var).f0(m70Var.f28576b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = m70Var.f28576b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-m70Var.f28584g0);
            i11 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new e70(this, 0));
        }
        m70Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        m70 m70Var = this.f26557a.f26813c;
        org.telegram.ui.ActionBar.o2 o2Var = m70Var.U;
        if (o2Var instanceof org.telegram.ui.mh0) {
            ((org.telegram.ui.mh0) o2Var).c0(m70Var.f28576b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = m70Var.f28576b.link;
            i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-m70Var.f28584g0);
            i11 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new e70(this, 1));
        }
        m70Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
