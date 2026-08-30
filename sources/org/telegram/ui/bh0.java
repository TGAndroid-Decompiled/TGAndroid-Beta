package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final ph0 f32968a;

    public bh0(ph0 ph0Var) {
        this.f32968a = ph0Var;
    }

    @Override
    public boolean f(int i10, View view) {
        ph0 ph0Var = this.f32968a;
        if ((i10 < ph0Var.f37342y || i10 >= ph0Var.B) && (i10 < ph0Var.E || i10 >= ph0Var.F)) {
            return false;
        }
        ((mh0) view).f36315x.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ph0 ph0Var = this.f32968a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ph0Var.getMessagesController().getInputPeer(-ph0Var.f37333n);
        long j10 = ph0Var.f37325f;
        if (j10 == ph0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ph0Var.getMessagesController().getInputUser(ph0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ph0Var.getMessagesController().getInputUser(j10);
        }
        ph0Var.Z = true;
        ph0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new yg0(ph0Var, 1));
    }
}
