package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class eo implements n8 {
    public final org.telegram.ui.ActionBar.n1[] f26094a;
    public final ho f26095b;

    public eo(ho hoVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.f26095b = hoVar;
        this.f26094a = n1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.yn ynVar = this.f26095b.G;
        if (ynVar != null) {
            ynVar.getMessagesController().setDialogHistoryTTL(ynVar.a(), i10);
            TLRPC.ChatFull chatFull = ynVar.X7;
            TLRPC.UserFull userFull = ynVar.Y7;
            if (userFull != null || chatFull != null) {
                ynVar.Q7();
                UndoView undoView = ynVar.f43542w3;
                if (undoView != null) {
                    long a2 = ynVar.a();
                    TLRPC.User i13 = ynVar.i();
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
        org.telegram.ui.ActionBar.n1 n1Var = this.f26094a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void l1() {
    }
}
