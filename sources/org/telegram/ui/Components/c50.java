package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c50 implements l70 {
    public final d50 f32565a;

    public c50(d50 d50Var) {
        this.f32565a = d50Var;
    }

    @Override
    public final void b() {
        i50 i50Var = this.f32565a.f32935c;
        org.telegram.ui.ActionBar.d2 d2Var = i50Var.M1;
        if (d2Var instanceof org.telegram.ui.xe0) {
            org.telegram.ui.xe0 xe0Var = (org.telegram.ui.xe0) d2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = i50Var.f34603j1;
            org.telegram.ui.e90 e90Var = new org.telegram.ui.e90(1, xe0Var.f52000n);
            e90Var.T = xe0Var.f52009t0;
            e90Var.d0(tL_chatInviteExported);
            xe0Var.presentFragment(e90Var);
        } else {
            org.telegram.ui.e90 e90Var2 = new org.telegram.ui.e90(1, i50Var.Y1);
            e90Var2.d0(i50Var.f34603j1);
            e90Var2.T = new b50(this);
            i50Var.M1.presentFragment(e90Var2);
        }
        i50Var.dismiss();
    }

    @Override
    public final void d() {
        i50 i50Var = this.f32565a.f32935c;
        org.telegram.ui.ActionBar.d2 d2Var = i50Var.M1;
        if (d2Var instanceof org.telegram.ui.xe0) {
            ((org.telegram.ui.xe0) d2Var).k0(i50Var.f34603j1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = i50Var.f34603j1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = org.telegram.messenger.hp.s1(i50Var.f28583a).j1(-i50Var.Y1);
            ConnectionsManager.getInstance(i50Var.f28583a).sendRequest(tL_messages_editExportedChatInvite, new a50(this, 0));
        }
        i50Var.dismiss();
    }

    @Override
    public final void i() {
        i50 i50Var = this.f32565a.f32935c;
        org.telegram.ui.ActionBar.d2 d2Var = i50Var.M1;
        if (d2Var instanceof org.telegram.ui.xe0) {
            ((org.telegram.ui.xe0) d2Var).h0(i50Var.f34603j1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = i50Var.f34603j1.link;
            tL_messages_deleteExportedChatInvite.peer = org.telegram.messenger.hp.s1(i50Var.f28583a).j1(-i50Var.Y1);
            ConnectionsManager.getInstance(i50Var.f28583a).sendRequest(tL_messages_deleteExportedChatInvite, new a50(this, 1));
        }
        i50Var.dismiss();
    }

    @Override
    public final void h() {
    }
}
