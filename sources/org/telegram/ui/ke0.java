package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ke0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.p1 {
    public final xe0 f46916a;

    public ke0(xe0 xe0Var) {
        this.f46916a = xe0Var;
    }

    @Override
    public boolean f(int i3, View view) {
        xe0 xe0Var = this.f46916a;
        if ((i3 < xe0Var.E || i3 >= xe0Var.F) && (i3 < xe0Var.I || i3 >= xe0Var.J)) {
            return false;
        }
        ((ue0) view).f50072y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        xe0 xe0Var = this.f46916a;
        tL_messages_deleteRevokedExportedChatInvites.peer = xe0Var.getMessagesController().j1(-xe0Var.f52000n);
        long j10 = xe0Var.f51992f;
        if (j10 == xe0Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = xe0Var.getMessagesController().q1(xe0Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = xe0Var.getMessagesController().o1(j10);
        }
        xe0Var.f51989d0 = true;
        xe0Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new he0(xe0Var, 1));
    }
}
