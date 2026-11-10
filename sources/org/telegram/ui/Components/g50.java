package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g50 implements p70 {
    public final h50 f33802a;

    public g50(h50 h50Var) {
        this.f33802a = h50Var;
    }

    @Override
    public final void d() {
        m50 m50Var = this.f33802a.f34183c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.O1;
        if (f2Var instanceof org.telegram.ui.ff0) {
            org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) f2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = m50Var.l1;
            org.telegram.ui.k90 k90Var = new org.telegram.ui.k90(1, ff0Var.f45746n);
            k90Var.S = ff0Var.f45754s0;
            k90Var.d0(tL_chatInviteExported);
            ff0Var.presentFragment(k90Var);
        } else {
            org.telegram.ui.k90 k90Var2 = new org.telegram.ui.k90(1, m50Var.f35854a2);
            k90Var2.d0(m50Var.l1);
            k90Var2.S = new f50(this);
            m50Var.O1.presentFragment(k90Var2);
        }
        m50Var.dismiss();
    }

    @Override
    public final void e() {
        m50 m50Var = this.f33802a.f34183c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.O1;
        if (f2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) f2Var).k0(m50Var.l1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = m50Var.l1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.qp.s1(m50Var.f28669a).j1(-m50Var.f35854a2);
            ConnectionsManager.getInstance(m50Var.f28669a).sendRequest(tL_messages_editExportedChatInvite, new e50(this, 0));
        }
        m50Var.dismiss();
    }

    @Override
    public final void k() {
        m50 m50Var = this.f33802a.f34183c;
        org.telegram.ui.ActionBar.f2 f2Var = m50Var.O1;
        if (f2Var instanceof org.telegram.ui.ff0) {
            ((org.telegram.ui.ff0) f2Var).h0(m50Var.l1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = m50Var.l1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.qp.s1(m50Var.f28669a).j1(-m50Var.f35854a2);
            ConnectionsManager.getInstance(m50Var.f28669a).sendRequest(tL_messages_deleteExportedChatInvite, new e50(this, 1));
        }
        m50Var.dismiss();
    }

    @Override
    public final void f() {
    }
}
