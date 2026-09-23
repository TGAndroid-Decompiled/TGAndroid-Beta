package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bo implements n8 {
    public final org.telegram.ui.ActionBar.n1[] f22793a;
    public final fo f22794b;

    public bo(fo foVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.f22794b = foVar;
        this.f22793a = n1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.xn xnVar = this.f22794b.G;
        if (xnVar != null) {
            xnVar.getMessagesController().setDialogHistoryTTL(xnVar.a(), i10);
            TLRPC.ChatFull chatFull = xnVar.Z7;
            TLRPC.UserFull userFull = xnVar.f39316a8;
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
        org.telegram.ui.ActionBar.n1 n1Var = this.f22793a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
