package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class go implements n8 {
    public final org.telegram.ui.ActionBar.p1[] f23392a;
    public final jo f23393b;

    public go(jo joVar, org.telegram.ui.ActionBar.p1[] p1VarArr) {
        this.f23393b = joVar;
        this.f23392a = p1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.eo eoVar = this.f23393b.G;
        if (eoVar != null) {
            eoVar.getMessagesController().setDialogHistoryTTL(eoVar.a(), i10);
            TLRPC.ChatFull chatFull = eoVar.Z7;
            TLRPC.UserFull userFull = eoVar.f32262a8;
            if (userFull != null || chatFull != null) {
                eoVar.Q7();
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
        org.telegram.ui.ActionBar.p1 p1Var = this.f23392a[0];
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
