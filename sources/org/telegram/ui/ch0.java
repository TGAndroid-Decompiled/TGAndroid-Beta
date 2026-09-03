package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ch0 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final qh0 f35808a;

    public ch0(qh0 qh0Var) {
        this.f35808a = qh0Var;
    }

    @Override
    public boolean f(int i10, View view) {
        qh0 qh0Var = this.f35808a;
        if ((i10 < qh0Var.f40507y || i10 >= qh0Var.B) && (i10 < qh0Var.E || i10 >= qh0Var.F)) {
            return false;
        }
        ((nh0) view).f39373x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        qh0 qh0Var = this.f35808a;
        tL_messages_deleteRevokedExportedChatInvites.peer = qh0Var.getMessagesController().getInputPeer(-qh0Var.f40498n);
        long j10 = qh0Var.f40490f;
        if (j10 == qh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = qh0Var.getMessagesController().getInputUser(qh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = qh0Var.getMessagesController().getInputUser(j10);
        }
        qh0Var.Z = true;
        qh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new zg0(qh0Var, 1));
    }
}
