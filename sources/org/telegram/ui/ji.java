package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ji implements org.telegram.ui.Components.p8 {
    public final eo f39216a;

    public ji(eo eoVar) {
        this.f39216a = eoVar;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        eo eoVar = this.f39216a;
        eoVar.getMessagesController().setDialogHistoryTTL(eoVar.T5, i10);
        if (eoVar.f37196a8 != null || eoVar.Z7 != null) {
            eoVar.T7();
            UndoView undoView = eoVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = eoVar.T5;
            TLRPC.User user = eoVar.f37253f;
            TLRPC.UserFull userFull = eoVar.f37196a8;
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f39216a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
