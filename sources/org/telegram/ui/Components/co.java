package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class co implements n8 {
    public final org.telegram.ui.ActionBar.o1[] f23373a;
    public final go f23374b;

    public co(go goVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.f23374b = goVar;
        this.f23373a = o1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.xn xnVar = this.f23374b.G;
        if (xnVar != null) {
            xnVar.getMessagesController().setDialogHistoryTTL(xnVar.a(), i10);
            TLRPC.ChatFull chatFull = xnVar.Z7;
            TLRPC.UserFull userFull = xnVar.f39696a8;
            if (userFull != null || chatFull != null) {
                xnVar.Q7();
                UndoView undoView = xnVar.y3;
                if (undoView != null) {
                    long a2 = xnVar.a();
                    TLRPC.User i13 = xnVar.i();
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
        org.telegram.ui.ActionBar.o1 o1Var = this.f23373a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
