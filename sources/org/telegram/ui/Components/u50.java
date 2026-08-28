package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u50 implements d80 {
    public final v50 f32924a;

    public u50(v50 v50Var) {
        this.f32924a = v50Var;
    }

    @Override
    public final void b() {
        a60 a60Var = this.f32924a.f33265c;
        org.telegram.ui.ActionBar.o2 o2Var = a60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.f26677b;
            org.telegram.ui.bb0 bb0Var = new org.telegram.ui.bb0(1, hh0Var.f38808n);
            bb0Var.P = hh0Var.f38810o0;
            bb0Var.X(tL_chatInviteExported);
            hh0Var.presentFragment(bb0Var);
        } else {
            org.telegram.ui.bb0 bb0Var2 = new org.telegram.ui.bb0(1, a60Var.f26680c0);
            bb0Var2.X(a60Var.f26677b);
            bb0Var2.P = new t50(this);
            a60Var.Q.presentFragment(bb0Var2);
        }
        a60Var.dismiss();
    }

    @Override
    public final void c() {
        a60 a60Var = this.f32924a.f33265c;
        org.telegram.ui.ActionBar.o2 o2Var = a60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) o2Var).d0(a60Var.f26677b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = a60Var.f26677b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(a60.A(a60Var)).getInputPeer(-a60Var.f26680c0);
            ConnectionsManager.getInstance(a60.C(a60Var)).sendRequest(tL_messages_editExportedChatInvite, new s50(this, 0));
        }
        a60Var.dismiss();
    }

    @Override
    public final void k() {
        a60 a60Var = this.f32924a.f33265c;
        org.telegram.ui.ActionBar.o2 o2Var = a60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) o2Var).a0(a60Var.f26677b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = a60Var.f26677b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(a60.D(a60Var)).getInputPeer(-a60Var.f26680c0);
            ConnectionsManager.getInstance(a60.F(a60Var)).sendRequest(tL_messages_deleteExportedChatInvite, new s50(this, 1));
        }
        a60Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
