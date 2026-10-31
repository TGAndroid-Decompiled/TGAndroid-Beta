package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w50 implements i80 {
    public final x50 f32007a;

    public w50(x50 x50Var) {
        this.f32007a = x50Var;
    }

    @Override
    public final void b() {
        c60 c60Var = this.f32007a.f32356c;
        org.telegram.ui.ActionBar.k2 k2Var = c60Var.L1;
        if (k2Var instanceof org.telegram.ui.kg0) {
            org.telegram.ui.kg0 kg0Var = (org.telegram.ui.kg0) k2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = c60Var.f24993i1;
            org.telegram.ui.ma0 ma0Var = new org.telegram.ui.ma0(1, kg0Var.f38810n);
            ma0Var.S = kg0Var.f38818s0;
            ma0Var.c0(tL_chatInviteExported);
            kg0Var.presentFragment(ma0Var);
        } else {
            org.telegram.ui.ma0 ma0Var2 = new org.telegram.ui.ma0(1, c60Var.X1);
            ma0Var2.c0(c60Var.f24993i1);
            ma0Var2.S = new v50(this);
            c60Var.L1.presentFragment(ma0Var2);
        }
        c60Var.dismiss();
    }

    @Override
    public final void d() {
        c60 c60Var = this.f32007a.f32356c;
        org.telegram.ui.ActionBar.k2 k2Var = c60Var.L1;
        if (k2Var instanceof org.telegram.ui.kg0) {
            ((org.telegram.ui.kg0) k2Var).j0(c60Var.f24993i1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = c60Var.f24993i1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.vp.r1(c60Var.f21583a).i1(-c60Var.X1);
            ConnectionsManager.getInstance(c60Var.f21583a).sendRequest(tL_messages_editExportedChatInvite, new u50(this, 0));
        }
        c60Var.dismiss();
    }

    @Override
    public final void n() {
        c60 c60Var = this.f32007a.f32356c;
        org.telegram.ui.ActionBar.k2 k2Var = c60Var.L1;
        if (k2Var instanceof org.telegram.ui.kg0) {
            ((org.telegram.ui.kg0) k2Var).g0(c60Var.f24993i1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = c60Var.f24993i1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.vp.r1(c60Var.f21583a).i1(-c60Var.X1);
            ConnectionsManager.getInstance(c60Var.f21583a).sendRequest(tL_messages_deleteExportedChatInvite, new u50(this, 1));
        }
        c60Var.dismiss();
    }

    @Override
    public final void g() {
    }
}
