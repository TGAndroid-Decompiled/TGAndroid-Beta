package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.a2 {
    public final zh0 f35384a;

    public lh0(zh0 zh0Var) {
        this.f35384a = zh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        zh0 zh0Var = this.f35384a;
        if ((i10 < zh0Var.f40174y || i10 >= zh0Var.E) && (i10 < zh0Var.H || i10 >= zh0Var.I)) {
            return false;
        }
        ((wh0) view).f39169x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        zh0 zh0Var = this.f35384a;
        tL_messages_deleteRevokedExportedChatInvites.peer = zh0Var.getMessagesController().getInputPeer(-zh0Var.f40162n);
        long j3 = zh0Var.f40154f;
        if (j3 == zh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = zh0Var.getMessagesController().getInputUser(zh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = zh0Var.getMessagesController().getInputUser(j3);
        }
        zh0Var.f40151c0 = true;
        zh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ih0(zh0Var, 1));
    }
}
