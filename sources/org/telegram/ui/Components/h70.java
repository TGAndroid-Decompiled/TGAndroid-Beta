package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h70 implements q90 {
    public final i70 f28853a;

    public h70(i70 i70Var) {
        this.f28853a = i70Var;
    }

    @Override
    public final void a() {
        n70 n70Var = this.f28853a.f29204c;
        org.telegram.ui.ActionBar.r2 r2Var = n70Var.U;
        if (r2Var instanceof org.telegram.ui.jh0) {
            org.telegram.ui.jh0 jh0Var = (org.telegram.ui.jh0) r2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = n70Var.f30884b;
            org.telegram.ui.db0 db0Var = new org.telegram.ui.db0(1, jh0Var.f40658n);
            db0Var.S = jh0Var.f40666s0;
            db0Var.Z(tL_chatInviteExported);
            jh0Var.presentFragment(db0Var);
        } else {
            org.telegram.ui.db0 db0Var2 = new org.telegram.ui.db0(1, n70Var.f30892g0);
            db0Var2.Z(n70Var.f30884b);
            db0Var2.S = new g70(this);
            n70Var.U.presentFragment(db0Var2);
        }
        n70Var.dismiss();
    }

    @Override
    public final void d() {
        n70 n70Var = this.f28853a.f29204c;
        org.telegram.ui.ActionBar.r2 r2Var = n70Var.U;
        if (r2Var instanceof org.telegram.ui.jh0) {
            ((org.telegram.ui.jh0) r2Var).g0(n70Var.f30884b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = n70Var.f30884b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(n70.B(n70Var)).getInputPeer(-n70Var.f30892g0);
            ConnectionsManager.getInstance(n70.C(n70Var)).sendRequest(tL_messages_editExportedChatInvite, new f70(this, 0));
        }
        n70Var.dismiss();
    }

    @Override
    public final void k() {
        n70 n70Var = this.f28853a.f29204c;
        org.telegram.ui.ActionBar.r2 r2Var = n70Var.U;
        if (r2Var instanceof org.telegram.ui.jh0) {
            ((org.telegram.ui.jh0) r2Var).d0(n70Var.f30884b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = n70Var.f30884b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(n70.D(n70Var)).getInputPeer(-n70Var.f30892g0);
            ConnectionsManager.getInstance(n70.G(n70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new f70(this, 1));
        }
        n70Var.dismiss();
    }

    @Override
    public final void e() {
    }
}
