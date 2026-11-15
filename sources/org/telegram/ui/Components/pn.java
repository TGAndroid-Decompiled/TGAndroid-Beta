package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pn implements c8 {
    public final org.telegram.ui.ActionBar.g1[] f38332a;
    public final sn f38333b;

    public pn(sn snVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.f38333b = snVar;
        this.f38332a = g1VarArr;
    }

    @Override
    public final void R0(int i7, int i10) {
        int i11;
        org.telegram.ui.an anVar = this.f38333b.H;
        if (anVar != null) {
            anVar.getMessagesController().J4(i7, anVar.a());
            TLRPC.ChatFull chatFull = anVar.f45334q8;
            TLRPC.UserFull userFull = anVar.f45348r8;
            if (userFull != null || chatFull != null) {
                anVar.h8();
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    long a10 = anVar.a();
                    TLRPC.User j3 = anVar.j();
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
        org.telegram.ui.ActionBar.g1 g1Var = this.f38332a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void g1() {
    }
}
