package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gn implements e8 {
    public final org.telegram.ui.ActionBar.g1[] f33936a;
    public final jn f33937b;

    public gn(jn jnVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.f33937b = jnVar;
        this.f33936a = g1VarArr;
    }

    @Override
    public final void X0(int i7, int i10) {
        int i11;
        org.telegram.ui.cn cnVar = this.f33937b.G;
        if (cnVar != null) {
            cnVar.getMessagesController().I4(i7, cnVar.a());
            TLRPC.ChatFull chatFull = cnVar.f44620p8;
            TLRPC.UserFull userFull = cnVar.f44633q8;
            if (userFull != null || chatFull != null) {
                cnVar.g8();
                UndoView undoView = cnVar.M3;
                if (undoView != null) {
                    long a10 = cnVar.a();
                    TLRPC.User j3 = cnVar.j();
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
        org.telegram.ui.ActionBar.g1 g1Var = this.f33936a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
