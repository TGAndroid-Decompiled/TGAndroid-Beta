package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mh0 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.b2 {
    public final ai0 f35813a;

    public mh0(ai0 ai0Var) {
        this.f35813a = ai0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        ai0 ai0Var = this.f35813a;
        if ((i10 < ai0Var.f31897y || i10 >= ai0Var.E) && (i10 < ai0Var.H || i10 >= ai0Var.I)) {
            return false;
        }
        ((xh0) view).f39639x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ai0 ai0Var = this.f35813a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ai0Var.getMessagesController().getInputPeer(-ai0Var.f31885n);
        long j3 = ai0Var.f31877f;
        if (j3 == ai0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ai0Var.getMessagesController().getInputUser(ai0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ai0Var.getMessagesController().getInputUser(j3);
        }
        ai0Var.f31874c0 = true;
        ai0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new jh0(ai0Var, 1));
    }
}
