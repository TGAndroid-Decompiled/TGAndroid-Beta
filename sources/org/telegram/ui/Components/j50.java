package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j50 implements s70 {
    public final k50 f35879a;

    public j50(k50 k50Var) {
        this.f35879a = k50Var;
    }

    @Override
    public final void d() {
        p50 p50Var = this.f35879a.f36278c;
        org.telegram.ui.ActionBar.e2 e2Var = p50Var.P1;
        if (e2Var instanceof org.telegram.ui.cf0) {
            org.telegram.ui.cf0 cf0Var = (org.telegram.ui.cf0) e2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = p50Var.f38212m1;
            org.telegram.ui.i90 i90Var = new org.telegram.ui.i90(1, cf0Var.f46130n);
            i90Var.T = cf0Var.f46139t0;
            i90Var.d0(tL_chatInviteExported);
            cf0Var.presentFragment(i90Var);
        } else {
            org.telegram.ui.i90 i90Var2 = new org.telegram.ui.i90(1, p50Var.f38206b2);
            i90Var2.d0(p50Var.f38212m1);
            i90Var2.T = new i50(this);
            p50Var.P1.presentFragment(i90Var2);
        }
        p50Var.dismiss();
    }

    @Override
    public final void e() {
        p50 p50Var = this.f35879a.f36278c;
        org.telegram.ui.ActionBar.e2 e2Var = p50Var.P1;
        if (e2Var instanceof org.telegram.ui.cf0) {
            ((org.telegram.ui.cf0) e2Var).k0(p50Var.f38212m1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = p50Var.f38212m1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.np.s1(p50Var.f29679a).j1(-p50Var.f38206b2);
            ConnectionsManager.getInstance(p50Var.f29679a).sendRequest(tL_messages_editExportedChatInvite, new h50(this, 0));
        }
        p50Var.dismiss();
    }

    @Override
    public final void j() {
        p50 p50Var = this.f35879a.f36278c;
        org.telegram.ui.ActionBar.e2 e2Var = p50Var.P1;
        if (e2Var instanceof org.telegram.ui.cf0) {
            ((org.telegram.ui.cf0) e2Var).h0(p50Var.f38212m1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = p50Var.f38212m1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.np.s1(p50Var.f29679a).j1(-p50Var.f38206b2);
            ConnectionsManager.getInstance(p50Var.f29679a).sendRequest(tL_messages_deleteExportedChatInvite, new h50(this, 1));
        }
        p50Var.dismiss();
    }

    @Override
    public final void f() {
    }
}
