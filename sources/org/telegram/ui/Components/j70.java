package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j70 implements v90 {
    public final k70 f26212a;

    public j70(k70 k70Var) {
        this.f26212a = k70Var;
    }

    @Override
    public final void c() {
        p70 p70Var = this.f26212a.f26598c;
        org.telegram.ui.ActionBar.m2 m2Var = p70Var.U;
        if (m2Var instanceof org.telegram.ui.ei0) {
            org.telegram.ui.ei0 ei0Var = (org.telegram.ui.ei0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.f28206b;
            org.telegram.ui.ac0 ac0Var = new org.telegram.ui.ac0(1, ei0Var.f35600n);
            ac0Var.T = ei0Var.f35608s0;
            ac0Var.Y(tL_chatInviteExported);
            ei0Var.presentFragment(ac0Var);
        } else {
            org.telegram.ui.ac0 ac0Var2 = new org.telegram.ui.ac0(1, p70Var.f28214g0);
            ac0Var2.Y(p70Var.f28206b);
            ac0Var2.T = new i70(this);
            p70Var.U.presentFragment(ac0Var2);
        }
        p70Var.dismiss();
    }

    @Override
    public final void d() {
        p70 p70Var = this.f26212a.f26598c;
        org.telegram.ui.ActionBar.m2 m2Var = p70Var.U;
        if (m2Var instanceof org.telegram.ui.ei0) {
            ((org.telegram.ui.ei0) m2Var).e0(p70Var.f28206b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = p70Var.f28206b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(p70.D(p70Var)).getInputPeer(-p70Var.f28214g0);
            ConnectionsManager.getInstance(p70.E(p70Var)).sendRequest(tL_messages_editExportedChatInvite, new h70(this, 0));
        }
        p70Var.dismiss();
    }

    @Override
    public final void i() {
        p70 p70Var = this.f26212a.f26598c;
        org.telegram.ui.ActionBar.m2 m2Var = p70Var.U;
        if (m2Var instanceof org.telegram.ui.ei0) {
            ((org.telegram.ui.ei0) m2Var).b0(p70Var.f28206b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = p70Var.f28206b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(p70.F(p70Var)).getInputPeer(-p70Var.f28214g0);
            ConnectionsManager.getInstance(p70.H(p70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new h70(this, 1));
        }
        p70Var.dismiss();
    }

    @Override
    public final void h() {
    }
}
