package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t60 implements c90 {
    public final u60 f28303a;

    public t60(u60 u60Var) {
        this.f28303a = u60Var;
    }

    @Override
    public final void c() {
        z60 z60Var = this.f28303a.f28601c;
        org.telegram.ui.ActionBar.n2 n2Var = z60Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            org.telegram.ui.ai0 ai0Var = (org.telegram.ui.ai0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = z60Var.f30747b;
            org.telegram.ui.zb0 zb0Var = new org.telegram.ui.zb0(1, ai0Var.f32087n);
            zb0Var.T = ai0Var.f32095s0;
            zb0Var.Y(tL_chatInviteExported);
            ai0Var.presentFragment(zb0Var);
        } else {
            org.telegram.ui.zb0 zb0Var2 = new org.telegram.ui.zb0(1, z60Var.f30755g0);
            zb0Var2.Y(z60Var.f30747b);
            zb0Var2.T = new s60(this);
            z60Var.U.presentFragment(zb0Var2);
        }
        z60Var.dismiss();
    }

    @Override
    public final void e() {
        z60 z60Var = this.f28303a.f28601c;
        org.telegram.ui.ActionBar.n2 n2Var = z60Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) n2Var).e0(z60Var.f30747b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = z60Var.f30747b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(z60.A(z60Var)).getInputPeer(-z60Var.f30755g0);
            ConnectionsManager.getInstance(z60.B(z60Var)).sendRequest(tL_messages_editExportedChatInvite, new r60(this, 0));
        }
        z60Var.dismiss();
    }

    @Override
    public final void i() {
        z60 z60Var = this.f28303a.f28601c;
        org.telegram.ui.ActionBar.n2 n2Var = z60Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) n2Var).b0(z60Var.f30747b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = z60Var.f30747b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(z60.E(z60Var)).getInputPeer(-z60Var.f30755g0);
            ConnectionsManager.getInstance(z60.G(z60Var)).sendRequest(tL_messages_deleteExportedChatInvite, new r60(this, 1));
        }
        z60Var.dismiss();
    }

    @Override
    public final void h() {
    }
}
