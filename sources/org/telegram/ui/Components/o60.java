package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o60 implements x80 {
    public final p60 f29673a;

    public o60(p60 p60Var) {
        this.f29673a = p60Var;
    }

    @Override
    public final void a() {
        u60 u60Var = this.f29673a.f29993c;
        org.telegram.ui.ActionBar.p2 p2Var = u60Var.R;
        if (p2Var instanceof org.telegram.ui.qh0) {
            org.telegram.ui.qh0 qh0Var = (org.telegram.ui.qh0) p2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = u60Var.f31508b;
            org.telegram.ui.ob0 ob0Var = new org.telegram.ui.ob0(1, qh0Var.f40498n);
            ob0Var.Q = qh0Var.f40501p0;
            ob0Var.Y(tL_chatInviteExported);
            qh0Var.presentFragment(ob0Var);
        } else {
            org.telegram.ui.ob0 ob0Var2 = new org.telegram.ui.ob0(1, u60Var.f31512d0);
            ob0Var2.Y(u60Var.f31508b);
            ob0Var2.Q = new n60(this);
            u60Var.R.presentFragment(ob0Var2);
        }
        u60Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        u60 u60Var = this.f29673a.f29993c;
        org.telegram.ui.ActionBar.p2 p2Var = u60Var.R;
        if (p2Var instanceof org.telegram.ui.qh0) {
            ((org.telegram.ui.qh0) p2Var).e0(u60Var.f31508b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = u60Var.f31508b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-u60Var.f31512d0);
            i11 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new m60(this, 0));
        }
        u60Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        u60 u60Var = this.f29673a.f29993c;
        org.telegram.ui.ActionBar.p2 p2Var = u60Var.R;
        if (p2Var instanceof org.telegram.ui.qh0) {
            ((org.telegram.ui.qh0) p2Var).b0(u60Var.f31508b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = u60Var.f31508b.link;
            i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-u60Var.f31512d0);
            i11 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new m60(this, 1));
        }
        u60Var.dismiss();
    }

    @Override
    public final void e() {
    }
}
