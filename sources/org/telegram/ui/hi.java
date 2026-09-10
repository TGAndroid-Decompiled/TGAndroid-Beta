package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class hi implements org.telegram.ui.Components.n8 {
    public final eo f33397a;

    public hi(eo eoVar) {
        this.f33397a = eoVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        eo eoVar = this.f33397a;
        eoVar.getMessagesController().setDialogHistoryTTL(eoVar.T5, i10);
        if (eoVar.f32262a8 != null || eoVar.Z7 != null) {
            eoVar.Q7();
            UndoView undoView = eoVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = eoVar.T5;
            TLRPC.User user = eoVar.f32318f;
            TLRPC.UserFull userFull = eoVar.f32262a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = eoVar.Z7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f33397a.Q8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
