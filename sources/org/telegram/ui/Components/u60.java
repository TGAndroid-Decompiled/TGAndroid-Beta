package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u60 implements e90 {
    public final v60 f27573a;

    public u60(v60 v60Var) {
        this.f27573a = v60Var;
    }

    @Override
    public final void c() {
        a70 a70Var = this.f27573a.f27846c;
        org.telegram.ui.ActionBar.p2 p2Var = a70Var.U;
        if (p2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) p2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.f21398b;
            org.telegram.ui.xb0 xb0Var = new org.telegram.ui.xb0(1, zh0Var.f39338n);
            xb0Var.T = zh0Var.f39346s0;
            xb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(xb0Var);
        } else {
            org.telegram.ui.xb0 xb0Var2 = new org.telegram.ui.xb0(1, a70Var.f21406g0);
            xb0Var2.Y(a70Var.f21398b);
            xb0Var2.T = new t60(this);
            a70Var.U.presentFragment(xb0Var2);
        }
        a70Var.dismiss();
    }

    @Override
    public final void e() {
        int i10;
        int i11;
        a70 a70Var = this.f27573a.f27846c;
        org.telegram.ui.ActionBar.p2 p2Var = a70Var.U;
        if (p2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) p2Var).e0(a70Var.f21398b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a70Var.f21398b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-a70Var.f21406g0);
            i11 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new s60(this, 0));
        }
        a70Var.dismiss();
    }

    @Override
    public final void j() {
        int i10;
        int i11;
        a70 a70Var = this.f27573a.f27846c;
        org.telegram.ui.ActionBar.p2 p2Var = a70Var.U;
        if (p2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) p2Var).b0(a70Var.f21398b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a70Var.f21398b.link;
            i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-a70Var.f21406g0);
            i11 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new s60(this, 1));
        }
        a70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
