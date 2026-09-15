package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final yh0 f35165a;

    public kh0(yh0 yh0Var) {
        this.f35165a = yh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        yh0 yh0Var = this.f35165a;
        if ((i10 < yh0Var.f39910y || i10 >= yh0Var.E) && (i10 < yh0Var.H || i10 >= yh0Var.I)) {
            return false;
        }
        ((vh0) view).f38621x.callOnClick();
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
        yh0 yh0Var = this.f35165a;
        tL_messages_deleteRevokedExportedChatInvites.peer = yh0Var.getMessagesController().getInputPeer(-yh0Var.f39898n);
        long j3 = yh0Var.f39890f;
        if (j3 == yh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh0Var.getMessagesController().getInputUser(yh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh0Var.getMessagesController().getInputUser(j3);
        }
        yh0Var.f39887c0 = true;
        yh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new hh0(yh0Var, 1));
    }
}
