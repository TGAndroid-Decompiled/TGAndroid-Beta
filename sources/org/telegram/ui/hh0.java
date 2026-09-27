package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class hh0 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.b2 {
    public final vh0 f34233a;

    public hh0(vh0 vh0Var) {
        this.f34233a = vh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        vh0 vh0Var = this.f34233a;
        if ((i10 < vh0Var.f38610y || i10 >= vh0Var.E) && (i10 < vh0Var.H || i10 >= vh0Var.I)) {
            return false;
        }
        ((sh0) view).f37475x.callOnClick();
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
        vh0 vh0Var = this.f34233a;
        tL_messages_deleteRevokedExportedChatInvites.peer = vh0Var.getMessagesController().getInputPeer(-vh0Var.f38598n);
        long j3 = vh0Var.f38590f;
        if (j3 == vh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = vh0Var.getMessagesController().getInputUser(vh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = vh0Var.getMessagesController().getInputUser(j3);
        }
        vh0Var.f38587c0 = true;
        vh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new eh0(vh0Var, 1));
    }
}
