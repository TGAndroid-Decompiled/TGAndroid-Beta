package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.a2 {
    public final th0 f33330a;

    public fh0(th0 th0Var) {
        this.f33330a = th0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        th0 th0Var = this.f33330a;
        if ((i10 < th0Var.f37683y || i10 >= th0Var.E) && (i10 < th0Var.H || i10 >= th0Var.I)) {
            return false;
        }
        ((qh0) view).f36449x.callOnClick();
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
        th0 th0Var = this.f33330a;
        tL_messages_deleteRevokedExportedChatInvites.peer = th0Var.getMessagesController().getInputPeer(-th0Var.f37671n);
        long j3 = th0Var.f37663f;
        if (j3 == th0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = th0Var.getMessagesController().getInputUser(th0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = th0Var.getMessagesController().getInputUser(j3);
        }
        th0Var.f37660c0 = true;
        th0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ch0(th0Var, 1));
    }
}
