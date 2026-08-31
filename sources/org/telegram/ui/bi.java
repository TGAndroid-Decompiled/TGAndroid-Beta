package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bi implements org.telegram.ui.Components.g8 {
    public final xn f35529a;

    public bi(xn xnVar) {
        this.f35529a = xnVar;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        xn xnVar = this.f35529a;
        xnVar.getMessagesController().setDialogHistoryTTL(xnVar.Q5, i10);
        if (xnVar.X7 != null || xnVar.W7 != null) {
            xnVar.Q7();
            UndoView undoView = xnVar.f43378v3;
            if (undoView == null) {
                return;
            }
            long j10 = xnVar.Q5;
            TLRPC.User user = xnVar.f43178f;
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
        org.telegram.ui.ActionBar.p1 p1Var = this.f35529a.N8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
