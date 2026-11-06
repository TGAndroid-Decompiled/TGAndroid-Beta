package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g50 implements p70 {
    public final h50 f33832a;

    public g50(h50 h50Var) {
        this.f33832a = h50Var;
    }

    @Override
    public final void d() {
        m50 m50Var = this.f33832a.f34177c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.L1;
        if (f2Var instanceof org.telegram.ui.cf0) {
            org.telegram.ui.cf0 cf0Var = (org.telegram.ui.cf0) f2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = m50Var.f35873i1;
            org.telegram.ui.h90 h90Var = new org.telegram.ui.h90(1, cf0Var.f44809n);
            h90Var.S = cf0Var.f44817s0;
            h90Var.d0(tL_chatInviteExported);
            cf0Var.presentFragment(h90Var);
        } else {
            org.telegram.ui.h90 h90Var2 = new org.telegram.ui.h90(1, m50Var.X1);
            h90Var2.d0(m50Var.f35873i1);
            h90Var2.S = new f50(this);
            m50Var.L1.presentFragment(h90Var2);
        }
        m50Var.dismiss();
    }

    @Override
    public final void e() {
        m50 m50Var = this.f33832a.f34177c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.L1;
        if (f2Var instanceof org.telegram.ui.cf0) {
            ((org.telegram.ui.cf0) f2Var).k0(m50Var.f35873i1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = m50Var.f35873i1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.qp.s1(m50Var.f28613a).j1(-m50Var.X1);
            ConnectionsManager.getInstance(m50Var.f28613a).sendRequest(tL_messages_editExportedChatInvite, new e50(this, 0));
        }
        m50Var.dismiss();
    }

    @Override
    public final void k() {
        m50 m50Var = this.f33832a.f34177c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.L1;
        if (f2Var instanceof org.telegram.ui.cf0) {
            ((org.telegram.ui.cf0) f2Var).h0(m50Var.f35873i1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = m50Var.f35873i1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.qp.s1(m50Var.f28613a).j1(-m50Var.X1);
            ConnectionsManager.getInstance(m50Var.f28613a).sendRequest(tL_messages_deleteExportedChatInvite, new e50(this, 1));
        }
        m50Var.dismiss();
    }

    @Override
    public final void f() {
    }
}
