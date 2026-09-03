package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xn implements g8 {
    public final org.telegram.ui.ActionBar.p1[] f33140a;
    public final ao f33141b;

    public xn(ao aoVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.f33141b = aoVar;
        this.f33140a = p1VarArr;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        org.telegram.ui.xn xnVar = this.f33141b.D;
        if (xnVar != null) {
            xnVar.getMessagesController().setDialogHistoryTTL(xnVar.a(), i10);
            TLRPC.ChatFull chatFull = xnVar.W7;
            TLRPC.UserFull userFull = xnVar.X7;
            if (userFull != null || chatFull != null) {
                xnVar.Q7();
                UndoView undoView = xnVar.f43356v3;
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
        org.telegram.ui.ActionBar.p1 p1Var = this.f33140a[0];
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
