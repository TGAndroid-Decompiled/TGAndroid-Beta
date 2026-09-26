package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class eh0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.z1 {
    public final sh0 f33410a;

    public eh0(sh0 sh0Var) {
        this.f33410a = sh0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        sh0 sh0Var = this.f33410a;
        if ((i10 < sh0Var.f37795y || i10 >= sh0Var.E) && (i10 < sh0Var.H || i10 >= sh0Var.I)) {
            return false;
        }
        ((ph0) view).f36546x.callOnClick();
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
        sh0 sh0Var = this.f33410a;
        tL_messages_deleteRevokedExportedChatInvites.peer = sh0Var.getMessagesController().getInputPeer(-sh0Var.f37783n);
        long j3 = sh0Var.f37775f;
        if (j3 == sh0Var.getUserConfig().getClientUserId()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = sh0Var.getMessagesController().getInputUser(sh0Var.getUserConfig().getCurrentUser());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = sh0Var.getMessagesController().getInputUser(j3);
        }
        sh0Var.f37772c0 = true;
        sh0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new bh0(sh0Var, 1));
    }
}
