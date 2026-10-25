package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mo implements q8 {
    public final org.telegram.ui.ActionBar.o1[] f30674a;
    public final po f30675b;

    public mo(po poVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.f30675b = poVar;
        this.f30674a = o1VarArr;
    }

    @Override
    public final void T0(int i10, int i11) {
        int i12;
        org.telegram.ui.un unVar = this.f30675b.G;
        if (unVar != null) {
            unVar.getMessagesController().setDialogHistoryTTL(unVar.a(), i10);
            TLRPC.ChatFull chatFull = unVar.f44322l8;
            TLRPC.UserFull userFull = unVar.f44334m8;
            if (userFull != null || chatFull != null) {
                unVar.X7();
                UndoView undoView = unVar.K3;
                if (undoView != null) {
                    long a2 = unVar.a();
                    TLRPC.User i13 = unVar.i();
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
        org.telegram.ui.ActionBar.o1 o1Var = this.f30674a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void e1() {
    }
}
