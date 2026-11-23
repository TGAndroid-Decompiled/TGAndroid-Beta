package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zn implements j8 {
    public final org.telegram.ui.ActionBar.g1[] f42903a;
    public final co f42904b;

    public zn(co coVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.f42904b = coVar;
        this.f42903a = g1VarArr;
    }

    @Override
    public final void R0(int i7, int i10) {
        int i11;
        org.telegram.ui.bn bnVar = this.f42904b.H;
        if (bnVar != null) {
            bnVar.getMessagesController().T4(i7, bnVar.a());
            TLRPC.ChatFull chatFull = bnVar.f46134r8;
            TLRPC.UserFull userFull = bnVar.f46147s8;
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
        org.telegram.ui.ActionBar.g1 g1Var = this.f42903a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void d1() {
    }
}
