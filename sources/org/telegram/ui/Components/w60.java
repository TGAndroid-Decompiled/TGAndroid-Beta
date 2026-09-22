package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w60 implements f90 {
    public final x60 f29940a;

    public w60(x60 x60Var) {
        this.f29940a = x60Var;
    }

    @Override
    public final void a() {
        c70 c70Var = this.f29940a.f30228c;
        org.telegram.ui.ActionBar.n2 n2Var = c70Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            org.telegram.ui.ai0 ai0Var = (org.telegram.ui.ai0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.f23268b;
            org.telegram.ui.zb0 zb0Var = new org.telegram.ui.zb0(1, ai0Var.f32108n);
            zb0Var.T = ai0Var.f32116s0;
            zb0Var.Y(tL_chatInviteExported);
            ai0Var.presentFragment(zb0Var);
        } else {
            org.telegram.ui.zb0 zb0Var2 = new org.telegram.ui.zb0(1, c70Var.f23276g0);
            zb0Var2.Y(c70Var.f23268b);
            zb0Var2.T = new v60(this);
            c70Var.U.presentFragment(zb0Var2);
        }
        c70Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        c70 c70Var = this.f29940a.f30228c;
        org.telegram.ui.ActionBar.n2 n2Var = c70Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) n2Var).e0(c70Var.f23268b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = c70Var.f23268b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-c70Var.f23276g0);
            i11 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new u60(this, 0));
        }
        c70Var.dismiss();
    }

    @Override
    public final void i() {
        int i10;
        int i11;
        c70 c70Var = this.f29940a.f30228c;
        org.telegram.ui.ActionBar.n2 n2Var = c70Var.U;
        if (n2Var instanceof org.telegram.ui.ai0) {
            ((org.telegram.ui.ai0) n2Var).b0(c70Var.f23268b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = c70Var.f23268b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-c70Var.f23276g0);
            i11 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new u60(this, 1));
        }
        c70Var.dismiss();
    }

    @Override
    public final void h() {
    }
}
