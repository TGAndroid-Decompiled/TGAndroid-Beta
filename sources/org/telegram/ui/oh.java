package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class oh implements org.telegram.ui.Components.e8 {
    public final cn f48527a;

    public oh(cn cnVar) {
        this.f48527a = cnVar;
    }

    @Override
    public final void X0(int i7, int i10) {
        int i11;
        cn cnVar = this.f48527a;
        cnVar.getMessagesController().I4(i7, cnVar.f44545j6);
        if (cnVar.f44633q8 != null || cnVar.f44620p8 != null) {
            cnVar.g8();
            UndoView undoView = cnVar.M3;
            if (undoView == null) {
                return;
            }
            long j3 = cnVar.f44545j6;
            TLRPC.User user = cnVar.f44487f;
            TLRPC.UserFull userFull = cnVar.f44633q8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = cnVar.f44620p8.ttl_period;
            }
            undoView.k(j3, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f48527a.f44483e9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
