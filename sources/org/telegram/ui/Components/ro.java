package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ro implements p8 {
    public final org.telegram.ui.ActionBar.n1[] f30470a;
    public final uo f30471b;

    public ro(uo uoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.f30471b = uoVar;
        this.f30470a = n1VarArr;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        org.telegram.ui.zn znVar = this.f30471b.G;
        if (znVar != null) {
            znVar.getMessagesController().setDialogHistoryTTL(znVar.a(), i10);
            TLRPC.ChatFull chatFull = znVar.Z7;
            TLRPC.UserFull userFull = znVar.f44708a8;
            if (userFull != null || chatFull != null) {
                znVar.T7();
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    long a2 = znVar.a();
                    TLRPC.User i13 = znVar.i();
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
        org.telegram.ui.ActionBar.n1 n1Var = this.f30470a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
