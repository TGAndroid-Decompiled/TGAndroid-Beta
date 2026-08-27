package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class z50 implements h80 {

    public final a60 f35155a;

    public z50(a60 a60Var) {
        this.f35155a = a60Var;
    }

    @Override
    public final void b() {
        f60 f60Var = this.f35155a.f26642c;
        org.telegram.ui.ActionBar.n2 n2Var = f60Var.Q;
        if (n2Var instanceof org.telegram.ui.kh0) {
            org.telegram.ui.kh0 kh0Var = (org.telegram.ui.kh0) n2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = f60Var.f28271b;
            org.telegram.ui.fb0 fb0Var = new org.telegram.ui.fb0(1, kh0Var.f39753n);
            fb0Var.P = kh0Var.f39755o0;
            fb0Var.Y(tL_chatInviteExported);
            kh0Var.presentFragment(fb0Var);
        } else {
            org.telegram.ui.fb0 fb0Var2 = new org.telegram.ui.fb0(1, f60Var.f28274c0);
            fb0Var2.Y(f60Var.f28271b);
            fb0Var2.P = new y50(this);
            f60Var.Q.presentFragment(fb0Var2);
        }
        f60Var.dismiss();
    }

    @Override
    public final void c() {
        f60 f60Var = this.f35155a.f26642c;
        org.telegram.ui.ActionBar.n2 n2Var = f60Var.Q;
        if (n2Var instanceof org.telegram.ui.kh0) {
            ((org.telegram.ui.kh0) n2Var).e0(f60Var.f28271b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = f60Var.f28271b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getInputPeer(-f60Var.f28274c0);
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).sendRequest(tL_messages_editExportedChatInvite, new x50(this, 0));
        }
        f60Var.dismiss();
    }

    @Override
    public final void k() {
        f60 f60Var = this.f35155a.f26642c;
        org.telegram.ui.ActionBar.n2 n2Var = f60Var.Q;
        if (n2Var instanceof org.telegram.ui.kh0) {
            ((org.telegram.ui.kh0) n2Var).b0(f60Var.f28271b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = f60Var.f28271b.link;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).getInputPeer(-f60Var.f28274c0);
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) f60Var).currentAccount).sendRequest(tL_messages_deleteExportedChatInvite, new x50(this, 1));
        }
        f60Var.dismiss();
    }

    @Override
    public final void g() {
    }
}
