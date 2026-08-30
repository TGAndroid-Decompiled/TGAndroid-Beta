package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m60 implements w80 {
    public final n60 f26951a;

    public m60(n60 n60Var) {
        this.f26951a = n60Var;
    }

    @Override
    public final void a() {
        s60 s60Var = this.f26951a.f27204c;
        org.telegram.ui.ActionBar.p2 p2Var = s60Var.R;
        if (p2Var instanceof org.telegram.ui.ph0) {
            org.telegram.ui.ph0 ph0Var = (org.telegram.ui.ph0) p2Var;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.f28638b;
            org.telegram.ui.nb0 nb0Var = new org.telegram.ui.nb0(1, ph0Var.f37333n);
            nb0Var.Q = ph0Var.f37336p0;
            nb0Var.Y(tL_chatInviteExported);
            ph0Var.presentFragment(nb0Var);
        } else {
            org.telegram.ui.nb0 nb0Var2 = new org.telegram.ui.nb0(1, s60Var.f28642d0);
            nb0Var2.Y(s60Var.f28638b);
            nb0Var2.Q = new l60(this);
            s60Var.R.presentFragment(nb0Var2);
        }
        s60Var.dismiss();
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        s60 s60Var = this.f26951a.f27204c;
        org.telegram.ui.ActionBar.p2 p2Var = s60Var.R;
        if (p2Var instanceof org.telegram.ui.ph0) {
            ((org.telegram.ui.ph0) p2Var).e0(s60Var.f28638b);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = s60Var.f28638b.link;
            tL_messages_editExportedChatInvite.revoked = true;
            i10 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-s60Var.f28642d0);
            i11 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editExportedChatInvite, new k60(this, 0));
        }
        s60Var.dismiss();
    }

    @Override
    public final void j() {
        int i10;
        int i11;
        s60 s60Var = this.f26951a.f27204c;
        org.telegram.ui.ActionBar.p2 p2Var = s60Var.R;
        if (p2Var instanceof org.telegram.ui.ph0) {
            ((org.telegram.ui.ph0) p2Var).b0(s60Var.f28638b);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = s60Var.f28638b.link;
            i10 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(i10).getInputPeer(-s60Var.f28642d0);
            i11 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteExportedChatInvite, new k60(this, 1));
        }
        s60Var.dismiss();
    }

    @Override
    public final void e() {
    }
}
