package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i70 implements r90 {
    public final j70 f29232a;

    public i70(j70 j70Var) {
        this.f29232a = j70Var;
    }

    @Override
    public final void a() {
        o70 o70Var = this.f29232a.f29532c;
        org.telegram.ui.ActionBar.r2 r2Var = o70Var.U;
        if (r2Var instanceof org.telegram.ui.lh0) {
            org.telegram.ui.lh0 lh0Var = (org.telegram.ui.lh0) r2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = o70Var.f31209b;
            org.telegram.ui.fb0 fb0Var = new org.telegram.ui.fb0(1, lh0Var.f41177n);
            fb0Var.S = lh0Var.f41185s0;
            fb0Var.Z(tL_chatInviteExported);
            lh0Var.presentFragment(fb0Var);
        } else {
            org.telegram.ui.fb0 fb0Var2 = new org.telegram.ui.fb0(1, o70Var.f31217g0);
            fb0Var2.Z(o70Var.f31209b);
            fb0Var2.S = new h70(this);
            o70Var.U.presentFragment(fb0Var2);
        }
        o70Var.dismiss();
    }

    @Override
    public final void d() {
        o70 o70Var = this.f29232a.f29532c;
        org.telegram.ui.ActionBar.r2 r2Var = o70Var.U;
        if (r2Var instanceof org.telegram.ui.lh0) {
            ((org.telegram.ui.lh0) r2Var).g0(o70Var.f31209b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = o70Var.f31209b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(o70.B(o70Var)).getInputPeer(-o70Var.f31217g0);
            ConnectionsManager.getInstance(o70.C(o70Var)).sendRequest(tL_messages_editExportedChatInvite, new g70(this, 0));
        }
        o70Var.dismiss();
    }

    @Override
    public final void k() {
        o70 o70Var = this.f29232a.f29532c;
        org.telegram.ui.ActionBar.r2 r2Var = o70Var.U;
        if (r2Var instanceof org.telegram.ui.lh0) {
            ((org.telegram.ui.lh0) r2Var).d0(o70Var.f31209b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = o70Var.f31209b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(o70.D(o70Var)).getInputPeer(-o70Var.f31217g0);
            ConnectionsManager.getInstance(o70.G(o70Var)).sendRequest(tL_messages_deleteExportedChatInvite, new g70(this, 1));
        }
        o70Var.dismiss();
    }

    @Override
    public final void e() {
    }
}
