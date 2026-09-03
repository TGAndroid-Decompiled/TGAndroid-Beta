package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vn implements g8 {
    public final org.telegram.ui.ActionBar.p1[] f29512a;
    public final yn f29513b;

    public vn(yn ynVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.f29513b = ynVar;
        this.f29512a = p1VarArr;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        org.telegram.ui.zn znVar = this.f29513b.D;
        if (znVar != null) {
            znVar.getMessagesController().setDialogHistoryTTL(znVar.a(), i10);
            TLRPC.ChatFull chatFull = znVar.W7;
            TLRPC.UserFull userFull = znVar.X7;
            if (userFull != null || chatFull != null) {
                znVar.Q7();
                UndoView undoView = znVar.f40775v3;
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
        org.telegram.ui.ActionBar.p1 p1Var = this.f29512a[0];
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
