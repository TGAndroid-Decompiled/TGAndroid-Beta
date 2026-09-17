package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zn implements p8 {
    public final org.telegram.ui.ActionBar.n1[] f33214a;
    public final co f33215b;

    public zn(co coVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.f33215b = coVar;
        this.f33214a = n1VarArr;
    }

    @Override
    public final void Y0(int i10, int i11) {
        int i12;
        org.telegram.ui.co coVar = this.f33215b.G;
        if (coVar != null) {
            coVar.getMessagesController().setDialogHistoryTTL(coVar.a(), i10);
            TLRPC.ChatFull chatFull = coVar.Z7;
            TLRPC.UserFull userFull = coVar.f35220a8;
            if (userFull != null || chatFull != null) {
                coVar.Q7();
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    long a2 = coVar.a();
                    TLRPC.User i13 = coVar.i();
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
        org.telegram.ui.ActionBar.n1 n1Var = this.f33214a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void l1() {
    }
}
