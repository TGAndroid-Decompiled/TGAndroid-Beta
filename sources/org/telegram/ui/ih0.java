package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ih0 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final wh0 f37435a;

    public ih0(wh0 wh0Var) {
        this.f37435a = wh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        wh0 wh0Var = this.f37435a;
        if ((i10 < wh0Var.f42495y || i10 >= wh0Var.E) && (i10 < wh0Var.H || i10 >= wh0Var.I)) {
            return false;
        }
        ((th0) view).f40844x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        wh0 wh0Var = this.f37435a;
        tL_messages_deleteRevokedExportedChatInvites.peer = wh0Var.getMessagesController().getInputPeer(-wh0Var.f42483n);
        long j3 = wh0Var.f42475f;
        if (j3 == wh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = wh0Var.getMessagesController().getInputUser(wh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = wh0Var.getMessagesController().getInputUser(j3);
        }
        wh0Var.f42471c0 = true;
        wh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new fh0(wh0Var, 1));
    }
}
