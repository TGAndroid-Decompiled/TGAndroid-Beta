package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pn implements a8 {
    public final org.telegram.ui.ActionBar.k1[] f29385a;
    public final sn f29386b;

    public pn(sn snVar, org.telegram.ui.ActionBar.k1[] k1VarArr) {
        this.f29386b = snVar;
        this.f29385a = k1VarArr;
    }

    @Override
    public final void Y0(int i10, int i11) {
        int i12;
        org.telegram.ui.un unVar = this.f29386b.G;
        if (unVar != null) {
            unVar.getMessagesController().F4(i10, unVar.a());
            TLRPC.ChatFull chatFull = unVar.f42374p8;
            TLRPC.UserFull userFull = unVar.f42385q8;
            if (userFull != null || chatFull != null) {
                unVar.Y7();
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    long a2 = unVar.a();
                    TLRPC.User j10 = unVar.j();
                    if (userFull != null) {
                        i12 = userFull.ttl_period;
                    } else {
                        i12 = chatFull.ttl_period;
                    }
                    undoView.k(a2, i11, j10, Integer.valueOf(i12), null, null);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.k1 k1Var = this.f29385a[0];
        if (k1Var != null) {
            k1Var.dismiss();
        }
    }

    @Override
    public final void t1() {
    }
}
