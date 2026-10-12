package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q70 implements aa0 {
    public final r70 f29749a;

    public q70(r70 r70Var) {
        this.f29749a = r70Var;
    }

    @Override
    public final void a() {
        w70 w70Var = this.f29749a.f30067c;
        org.telegram.ui.ActionBar.m2 m2Var = w70Var.U;
        if (m2Var instanceof org.telegram.ui.ai0) {
            org.telegram.ui.ai0 ai0Var = (org.telegram.ui.ai0) m2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = w70Var.f32332b;
            org.telegram.ui.wb0 wb0Var = new org.telegram.ui.wb0(1, ai0Var.f35830n);
            wb0Var.T = ai0Var.f35838s0;
            wb0Var.Y(tL_chatInviteExported);
            ai0Var.presentFragment(wb0Var);
        } else {
            org.telegram.ui.wb0 wb0Var2 = new org.telegram.ui.wb0(1, w70Var.f32341g0);
            wb0Var2.Y(w70Var.f32332b);
            wb0Var2.T = new p70(this);
            w70Var.U.presentFragment(wb0Var2);
        }
        w70Var.dismiss();
    }

    @Override
    public final void c() {
        w70 w70Var = this.f29749a.f30067c;
        org.telegram.ui.ActionBar.m2 m2Var = w70Var.U;
        if (m2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) m2Var).e0(w70Var.f32332b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = w70Var.f32332b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(w70.D(w70Var)).getInputPeer(-w70Var.f32341g0);
            ConnectionsManager.getInstance(w70.E(w70Var)).sendRequest(tL_messages_editExportedChatInvite, new o70(this, 0));
        }
        w70Var.dismiss();
    }

    @Override
    public final void j() {
        w70 w70Var = this.f29749a.f30067c;
        org.telegram.ui.ActionBar.m2 m2Var = w70Var.U;
        if (m2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) m2Var).b0(w70Var.f32332b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = w70Var.f32332b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(w70.F(w70Var)).getInputPeer(-w70Var.f32341g0);
            ConnectionsManager.getInstance(w70.H(w70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new o70(this, 1));
        }
        w70Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
