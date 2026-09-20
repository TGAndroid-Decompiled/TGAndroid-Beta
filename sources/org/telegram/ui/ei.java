package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ei implements org.telegram.ui.Components.m8 {
    public final zn f33347a;

    public ei(zn znVar) {
        this.f33347a = znVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        zn znVar = this.f33347a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.T5, i10);
        if (znVar.f40249a8 != null || znVar.Z7 != null) {
            znVar.Q7();
            UndoView undoView = znVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = znVar.T5;
            TLRPC.User user = znVar.f40305f;
            TLRPC.UserFull userFull = znVar.f40249a8;
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
        org.telegram.ui.ActionBar.n1 n1Var = this.f33347a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
