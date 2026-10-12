package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class to implements p8 {
    public final org.telegram.ui.ActionBar.m1[] f30903a;
    public final wo f30904b;

    public to(wo woVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.f30904b = woVar;
        this.f30903a = m1VarArr;
    }

    @Override
    public final void Q0(int i10, int i11) {
        int i12;
        org.telegram.ui.eo eoVar = this.f30904b.G;
        if (eoVar != null) {
            eoVar.getMessagesController().setDialogHistoryTTL(eoVar.a(), i10);
            TLRPC.ChatFull chatFull = eoVar.Z7;
            TLRPC.UserFull userFull = eoVar.f37196a8;
            if (userFull != null || chatFull != null) {
                eoVar.T7();
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    long a2 = eoVar.a();
                    TLRPC.User i13 = eoVar.i();
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f30903a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void h1() {
    }
}
