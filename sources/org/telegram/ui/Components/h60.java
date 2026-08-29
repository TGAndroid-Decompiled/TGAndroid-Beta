package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h60 implements q80 {
    public final i60 f29073a;

    public h60(i60 i60Var) {
        this.f29073a = i60Var;
    }

    @Override
    public final void a() {
        n60 n60Var = this.f29073a.f29327c;
        org.telegram.ui.ActionBar.o2 o2Var = n60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) o2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = n60Var.f30885b;
            org.telegram.ui.eb0 eb0Var = new org.telegram.ui.eb0(1, hh0Var.f38929n);
            eb0Var.P = hh0Var.f38931o0;
            eb0Var.Y(tL_chatInviteExported);
            hh0Var.presentFragment(eb0Var);
        } else {
            org.telegram.ui.eb0 eb0Var2 = new org.telegram.ui.eb0(1, n60Var.f30888c0);
            eb0Var2.Y(n60Var.f30885b);
            eb0Var2.P = new g60(this);
            n60Var.Q.presentFragment(eb0Var2);
        }
        n60Var.dismiss();
    }

    @Override
    public final void b() {
        int i10;
        int i11;
        n60 n60Var = this.f29073a.f29327c;
        org.telegram.ui.ActionBar.o2 o2Var = n60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) o2Var).e0(n60Var.f30885b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = n60Var.f30885b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-n60Var.f30888c0);
            i11 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new f60(this, 0));
        }
        n60Var.dismiss();
    }

    @Override
    public final void k() {
        int i10;
        int i11;
        n60 n60Var = this.f29073a.f29327c;
        org.telegram.ui.ActionBar.o2 o2Var = n60Var.Q;
        if (o2Var instanceof org.telegram.ui.hh0) {
            ((org.telegram.ui.hh0) o2Var).b0(n60Var.f30885b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = n60Var.f30885b.link;
            i10 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-n60Var.f30888c0);
            i11 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new f60(this, 1));
        }
        n60Var.dismiss();
    }

    @Override
    public final void j() {
    }
}
