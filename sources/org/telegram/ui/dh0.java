package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class dh0 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final rh0 f33478a;

    public dh0(rh0 rh0Var) {
        this.f33478a = rh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        rh0 rh0Var = this.f33478a;
        if ((i10 < rh0Var.f37867y || i10 >= rh0Var.B) && (i10 < rh0Var.E || i10 >= rh0Var.F)) {
            return false;
        }
        ((oh0) view).f36819x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        rh0 rh0Var = this.f33478a;
        tL_messages_deleteRevokedExportedChatInvites.peer = rh0Var.getMessagesController().getInputPeer(-rh0Var.f37858n);
        long j10 = rh0Var.f37850f;
        if (j10 == rh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = rh0Var.getMessagesController().getInputUser(rh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = rh0Var.getMessagesController().getInputUser(j10);
        }
        rh0Var.Z = true;
        rh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new ah0(rh0Var, 1));
    }
}
