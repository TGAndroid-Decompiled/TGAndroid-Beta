package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements org.telegram.ui.Components.im0, org.telegram.ui.ActionBar.z1 {
    public final yh0 f39340a;

    public kh0(yh0 yh0Var) {
        this.f39340a = yh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        yh0 yh0Var = this.f39340a;
        if ((i10 < yh0Var.f44432y || i10 >= yh0Var.E) && (i10 < yh0Var.H || i10 >= yh0Var.I)) {
            return false;
        }
        ((vh0) view).f43053x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        yh0 yh0Var = this.f39340a;
        tL_messages_deleteRevokedExportedChatInvites.peer = yh0Var.getMessagesController().getInputPeer(-yh0Var.f44420n);
        long j3 = yh0Var.f44412f;
        if (j3 == yh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh0Var.getMessagesController().getInputUser(yh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh0Var.getMessagesController().getInputUser(j3);
        }
        yh0Var.f44408c0 = true;
        yh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new hh0(yh0Var, 1));
    }
}
