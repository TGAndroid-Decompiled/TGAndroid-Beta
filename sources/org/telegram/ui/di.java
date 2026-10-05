package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class di implements org.telegram.ui.Components.n8 {
    public final yn f35823a;

    public di(yn ynVar) {
        this.f35823a = ynVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        yn ynVar = this.f35823a;
        ynVar.getMessagesController().setDialogHistoryTTL(ynVar.R5, i10);
        if (ynVar.Y7 != null || ynVar.X7 != null) {
            ynVar.Q7();
            UndoView undoView = ynVar.f43542w3;
            if (undoView == null) {
                return;
            }
            long j3 = ynVar.R5;
            TLRPC.User user = ynVar.f43327f;
            TLRPC.UserFull userFull = ynVar.Y7;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = ynVar.X7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f35823a.O8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void l1() {
    }
}
