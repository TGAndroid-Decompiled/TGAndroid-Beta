package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fi implements org.telegram.ui.Components.p8 {
    public final zn f37683a;

    public fi(zn znVar) {
        this.f37683a = znVar;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        zn znVar = this.f37683a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.T5, i10);
        if (znVar.f44707a8 != null || znVar.Z7 != null) {
            znVar.T7();
            UndoView undoView = znVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = znVar.T5;
            TLRPC.User user = znVar.f44764f;
            TLRPC.UserFull userFull = znVar.f44707a8;
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f37683a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
