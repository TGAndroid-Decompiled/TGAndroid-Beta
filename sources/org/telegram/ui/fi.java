package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fi implements org.telegram.ui.Components.p8 {
    public final zn f37657a;

    public fi(zn znVar) {
        this.f37657a = znVar;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        zn znVar = this.f37657a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.T5, i10);
        if (znVar.f44752a8 != null || znVar.Z7 != null) {
            znVar.T7();
            UndoView undoView = znVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = znVar.T5;
            TLRPC.User user = znVar.f44809f;
            TLRPC.UserFull userFull = znVar.f44752a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = znVar.Z7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f37657a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
