package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bi implements org.telegram.ui.Components.g8 {
    public final xn f32969a;

    public bi(xn xnVar) {
        this.f32969a = xnVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        xn xnVar = this.f32969a;
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.Q5, i10);
        if (xnVar.X7 != null || xnVar.W7 != null) {
            xnVar.Q7();
            UndoView undoView = xnVar.f40209v3;
            if (undoView == null) {
                return;
            }
            long j10 = xnVar.Q5;
            TLRPC.User user = xnVar.f40009f;
            TLRPC.UserFull userFull = xnVar.X7;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = xnVar.W7.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f32969a.N8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
