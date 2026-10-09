package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n70 implements w90 {
    public final o70 f29062a;

    public n70(o70 o70Var) {
        this.f29062a = o70Var;
    }

    @Override
    public final void a() {
        t70 t70Var = this.f29062a.f29404c;
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            org.telegram.ui.zh0 zh0Var = (org.telegram.ui.zh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = t70Var.f31054b;
            org.telegram.ui.vb0 vb0Var = new org.telegram.ui.vb0(1, zh0Var.f44648n);
            vb0Var.T = zh0Var.f44656s0;
            vb0Var.Y(tL_chatInviteExported);
            zh0Var.presentFragment(vb0Var);
        } else {
            org.telegram.ui.vb0 vb0Var2 = new org.telegram.ui.vb0(1, t70Var.f31063g0);
            vb0Var2.Y(t70Var.f31054b);
            vb0Var2.T = new m70(this);
            t70Var.U.presentFragment(vb0Var2);
        }
        t70Var.dismiss();
    }

    @Override
    public final void c() {
        t70 t70Var = this.f29062a.f29404c;
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).e0(t70Var.f31054b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = t70Var.f31054b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(t70.D(t70Var)).getInputPeer(-t70Var.f31063g0);
            ConnectionsManager.getInstance(t70.E(t70Var)).sendRequest(tL_messages_editExportedChatInvite, new l70(this, 0));
        }
        t70Var.dismiss();
    }

    @Override
    public final void j() {
        t70 t70Var = this.f29062a.f29404c;
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.U;
        if (n2Var instanceof org.telegram.ui.zh0) {
            ((org.telegram.ui.zh0) n2Var).b0(t70Var.f31054b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = t70Var.f31054b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(t70.F(t70Var)).getInputPeer(-t70Var.f31063g0);
            ConnectionsManager.getInstance(t70.H(t70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new l70(this, 1));
        }
        t70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
