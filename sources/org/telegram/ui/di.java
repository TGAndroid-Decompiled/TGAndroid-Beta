package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class di implements org.telegram.ui.Components.g8 {
    public final zn f33481a;

    public di(zn znVar) {
        this.f33481a = znVar;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        zn znVar = this.f33481a;
        znVar.getMessagesController().setDialogHistoryTTL(znVar.Q5, i10);
        if (znVar.X7 != null || znVar.W7 != null) {
            znVar.Q7();
            UndoView undoView = znVar.f40775v3;
            if (undoView == null) {
                return;
            }
            long j10 = znVar.Q5;
            TLRPC.User user = znVar.f40575f;
            TLRPC.UserFull userFull = znVar.X7;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = znVar.W7.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f33481a.N8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
