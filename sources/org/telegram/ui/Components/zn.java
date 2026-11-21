package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zn implements j8 {
    public final org.telegram.ui.ActionBar.g1[] f42943a;
    public final co f42944b;

    public zn(co coVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.f42944b = coVar;
        this.f42943a = g1VarArr;
    }

    @Override
    public final void R0(int i7, int i10) {
        int i11;
        org.telegram.ui.bn bnVar = this.f42944b.H;
        if (bnVar != null) {
            bnVar.getMessagesController().T4(i7, bnVar.a());
            TLRPC.ChatFull chatFull = bnVar.f46177r8;
            TLRPC.UserFull userFull = bnVar.f46190s8;
            if (userFull != null || chatFull != null) {
                bnVar.h8();
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    long a10 = bnVar.a();
                    TLRPC.User j3 = bnVar.j();
                    if (userFull != null) {
                        i11 = userFull.ttl_period;
                    } else {
                        i11 = chatFull.ttl_period;
                    }
                    undoView.k(a10, i10, j3, Integer.valueOf(i11), null, null);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f42943a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void d1() {
    }
}
