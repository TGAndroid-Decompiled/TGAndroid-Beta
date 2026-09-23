package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ci implements org.telegram.ui.Components.n8 {
    public final xn f32356a;

    public ci(xn xnVar) {
        this.f32356a = xnVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        xn xnVar = this.f32356a;
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.T5, i10);
        if (xnVar.f39316a8 != null || xnVar.Z7 != null) {
            xnVar.Q7();
            UndoView undoView = xnVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = xnVar.T5;
            TLRPC.User user = xnVar.f39372f;
            TLRPC.UserFull userFull = xnVar.f39316a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = xnVar.Z7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f32356a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
