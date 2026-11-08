package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hn implements f8 {
    public final org.telegram.ui.ActionBar.g1[] f34306a;
    public final kn f34307b;

    public hn(kn knVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.f34307b = knVar;
        this.f34306a = g1VarArr;
    }

    @Override
    public final void X0(int i7, int i10) {
        int i11;
        org.telegram.ui.an anVar = this.f34307b.G;
        if (anVar != null) {
            anVar.getMessagesController().I4(i7, anVar.a());
            TLRPC.ChatFull chatFull = anVar.f43922p8;
            TLRPC.UserFull userFull = anVar.f43935q8;
            if (userFull != null || chatFull != null) {
                anVar.f8();
                UndoView undoView = anVar.M3;
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
        org.telegram.ui.ActionBar.g1 g1Var = this.f34306a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
