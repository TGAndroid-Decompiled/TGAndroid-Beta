package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class lo implements o8 {
    public final org.telegram.ui.ActionBar.m1[] f28385a;
    public final oo f28386b;

    public lo(oo ooVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.f28386b = ooVar;
        this.f28385a = m1VarArr;
    }

    @Override
    public final void H0(int i10, int i11) {
        int i12;
        org.telegram.ui.sn snVar = this.f28386b.G;
        if (snVar != null) {
            snVar.getMessagesController().setDialogHistoryTTL(snVar.a(), i10);
            TLRPC.ChatFull chatFull = snVar.f41592l8;
            TLRPC.UserFull userFull = snVar.f41604m8;
            if (userFull != null || chatFull != null) {
                snVar.T7();
                UndoView undoView = snVar.K3;
                if (undoView != null) {
                    long a2 = snVar.a();
                    TLRPC.User i13 = snVar.i();
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f28385a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void Y0() {
    }
}
