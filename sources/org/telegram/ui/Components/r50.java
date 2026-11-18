package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r50 implements d80 {
    public final s50 f39042a;

    public r50(s50 s50Var) {
        this.f39042a = s50Var;
    }

    @Override
    public final void d() {
        x50 x50Var = this.f39042a.f39494c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.ff0) {
            org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) h2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = x50Var.f41894m1;
            org.telegram.ui.j90 j90Var = new org.telegram.ui.j90(1, ff0Var.f47681n);
            j90Var.T = ff0Var.f47690t0;
            j90Var.d0(tL_chatInviteExported);
            ff0Var.presentFragment(j90Var);
        } else {
            org.telegram.ui.j90 j90Var2 = new org.telegram.ui.j90(1, x50Var.f41888b2);
            j90Var2.d0(x50Var.f41894m1);
            j90Var2.T = new q50(this);
            x50Var.P1.presentFragment(j90Var2);
        }
        x50Var.dismiss();
    }

    @Override
    public final void e() {
        x50 x50Var = this.f39042a.f39494c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) h2Var).k0(x50Var.f41894m1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = x50Var.f41894m1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.mp.u1(x50Var.f30189a).l1(-x50Var.f41888b2);
            ConnectionsManager.getInstance(x50Var.f30189a).sendRequest(tL_messages_editExportedChatInvite, new p50(this, 0));
        }
        x50Var.dismiss();
    }

    @Override
    public final void i() {
        x50 x50Var = this.f39042a.f39494c;
        org.telegram.ui.ActionBar.h2 h2Var = x50Var.P1;
        if (h2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) h2Var).h0(x50Var.f41894m1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = x50Var.f41894m1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.mp.u1(x50Var.f30189a).l1(-x50Var.f41888b2);
            ConnectionsManager.getInstance(x50Var.f30189a).sendRequest(tL_messages_deleteExportedChatInvite, new p50(this, 1));
        }
        x50Var.dismiss();
    }

    @Override
    public final void f() {
    }
}
