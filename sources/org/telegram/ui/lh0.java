package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lh0 implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.a2 {
    public final zh0 f39626a;

    public lh0(zh0 zh0Var) {
        this.f39626a = zh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        zh0 zh0Var = this.f39626a;
        if ((i10 < zh0Var.f44706y || i10 >= zh0Var.E) && (i10 < zh0Var.H || i10 >= zh0Var.I)) {
            return false;
        }
        ((wh0) view).f43659x.callOnClick();
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
        zh0 zh0Var = this.f39626a;
        tL_messages_deleteRevokedExportedChatInvites.peer = zh0Var.getMessagesController().getInputPeer(-zh0Var.f44694n);
        long j3 = zh0Var.f44686f;
        if (j3 == zh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = zh0Var.getMessagesController().getInputUser(zh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = zh0Var.getMessagesController().getInputUser(j3);
        }
        zh0Var.f44682c0 = true;
        zh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ih0(zh0Var, 1));
    }
}
