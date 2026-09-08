package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l60 implements v80 {
    public final m60 f28094a;

    public l60(m60 m60Var) {
        this.f28094a = m60Var;
    }

    @Override
    public final void b() {
        r60 r60Var = this.f28094a.f28420c;
        org.telegram.ui.ActionBar.n2 n2Var = r60Var.U;
        if (n2Var instanceof org.telegram.ui.yh0) {
            org.telegram.ui.yh0 yh0Var = (org.telegram.ui.yh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.f29968b;
            org.telegram.ui.xb0 xb0Var = new org.telegram.ui.xb0(1, yh0Var.f43163n);
            xb0Var.T = yh0Var.f43171s0;
            xb0Var.Y(tL_chatInviteExported);
            yh0Var.presentFragment(xb0Var);
        } else {
            org.telegram.ui.xb0 xb0Var2 = new org.telegram.ui.xb0(1, r60Var.f29977g0);
            xb0Var2.Y(r60Var.f29968b);
            xb0Var2.T = new k60(this);
            r60Var.U.presentFragment(xb0Var2);
        }
        r60Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        r60 r60Var = this.f28094a.f28420c;
        org.telegram.ui.ActionBar.n2 n2Var = r60Var.U;
        if (n2Var instanceof org.telegram.ui.yh0) {
            ((org.telegram.ui.yh0) n2Var).e0(r60Var.f29968b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = r60Var.f29968b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-r60Var.f29977g0);
            i11 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new j60(this, 0));
        }
        r60Var.dismiss();
    }

    @Override
    public final void j() {
        int i10;
        int i11;
        r60 r60Var = this.f28094a.f28420c;
        org.telegram.ui.ActionBar.n2 n2Var = r60Var.U;
        if (n2Var instanceof org.telegram.ui.yh0) {
            ((org.telegram.ui.yh0) n2Var).b0(r60Var.f29968b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = r60Var.f29968b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-r60Var.f29977g0);
            i11 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new j60(this, 1));
        }
        r60Var.dismiss();
    }

    @Override
    public final void d() {
    }
}
