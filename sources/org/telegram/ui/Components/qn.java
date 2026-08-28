package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qn implements g8 {
    public final org.telegram.ui.ActionBar.o1[] f31990a;
    public final tn f31991b;

    public qn(tn tnVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.f31991b = tnVar;
        this.f31990a = o1VarArr;
    }

    @Override
    public final void V0(int i9, int i10) {
        int i11;
        org.telegram.ui.qn qnVar = this.f31991b.C;
        if (qnVar != null) {
            qnVar.getMessagesController().setDialogHistoryTTL(qnVar.a(), i9);
            TLRPC.ChatFull chatFull = qnVar.V7;
            TLRPC.UserFull userFull = qnVar.W7;
            if (userFull != null || chatFull != null) {
                qnVar.Q7();
                UndoView undoView = qnVar.f42093u3;
                if (undoView != null) {
                    long a2 = qnVar.a();
                    TLRPC.User i12 = qnVar.i();
                    if (userFull != null) {
                        i11 = userFull.ttl_period;
                    } else {
                        i11 = chatFull.ttl_period;
                    }
                    undoView.k(a2, i10, i12, Integer.valueOf(i11), null, null);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f31990a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
