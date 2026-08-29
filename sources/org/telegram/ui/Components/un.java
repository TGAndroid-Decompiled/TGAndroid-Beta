package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class un implements l8 {
    public final org.telegram.ui.ActionBar.o1[] f33275a;
    public final xn f33276b;

    public un(xn xnVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.f33276b = xnVar;
        this.f33275a = o1VarArr;
    }

    @Override
    public final void T0(int i10, int i11) {
        int i12;
        org.telegram.ui.tn tnVar = this.f33276b.C;
        if (tnVar != null) {
            tnVar.getMessagesController().setDialogHistoryTTL(tnVar.a(), i10);
            TLRPC.ChatFull chatFull = tnVar.V7;
            TLRPC.UserFull userFull = tnVar.W7;
            if (userFull != null || chatFull != null) {
                tnVar.Q7();
                UndoView undoView = tnVar.f42989u3;
                if (undoView != null) {
                    long a2 = tnVar.a();
                    TLRPC.User i13 = tnVar.i();
                    if (userFull != null) {
                        i12 = userFull.ttl_period;
                    } else {
                        i12 = chatFull.ttl_period;
                    }
                    undoView.k(a2, i11, i13, Integer.valueOf(i12), null, null);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f33275a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void e1() {
    }
}
