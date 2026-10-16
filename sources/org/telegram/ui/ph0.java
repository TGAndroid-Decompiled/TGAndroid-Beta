package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ph0 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final di0 f38926a;

    public ph0(di0 di0Var) {
        this.f38926a = di0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        di0 di0Var = this.f38926a;
        if ((i10 < di0Var.f35058y || i10 >= di0Var.E) && (i10 < di0Var.H || i10 >= di0Var.I)) {
            return false;
        }
        ((ai0) view).f33943x.callOnClick();
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
        di0 di0Var = this.f38926a;
        tL_messages_deleteRevokedExportedChatInvites.peer = di0Var.getMessagesController().getInputPeer(-di0Var.f35046n);
        long j10 = di0Var.f35038f;
        if (j10 == di0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = di0Var.getMessagesController().getInputUser(di0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = di0Var.getMessagesController().getInputUser(j10);
        }
        di0Var.f35035c0 = true;
        di0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new mh0(di0Var, 1));
    }
}
