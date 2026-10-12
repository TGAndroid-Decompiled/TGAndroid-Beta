package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qh0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final ei0 f39450a;

    public qh0(ei0 ei0Var) {
        this.f39450a = ei0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        ei0 ei0Var = this.f39450a;
        if ((i10 < ei0Var.f35612y || i10 >= ei0Var.E) && (i10 < ei0Var.H || i10 >= ei0Var.I)) {
            return false;
        }
        ((bi0) view).f34582x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ei0 ei0Var = this.f39450a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ei0Var.getMessagesController().getInputPeer(-ei0Var.f35600n);
        long j10 = ei0Var.f35592f;
        if (j10 == ei0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ei0Var.getMessagesController().getInputUser(ei0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ei0Var.getMessagesController().getInputUser(j10);
        }
        ei0Var.f35589c0 = true;
        ei0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new nh0(ei0Var, 1));
    }
}
