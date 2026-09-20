package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ao implements m8 {
    public final org.telegram.ui.ActionBar.n1[] f22728a;
    public final eo f22729b;

    public ao(eo eoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.f22729b = eoVar;
        this.f22728a = n1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.zn znVar = this.f22729b.G;
        if (znVar != null) {
            znVar.getMessagesController().setDialogHistoryTTL(znVar.a(), i10);
            TLRPC.ChatFull chatFull = znVar.Z7;
            TLRPC.UserFull userFull = znVar.f40249a8;
            if (userFull != null || chatFull != null) {
                znVar.Q7();
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
        org.telegram.ui.ActionBar.n1 n1Var = this.f22728a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
