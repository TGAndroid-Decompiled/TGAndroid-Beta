package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class h61 extends g.o {
    public final p61 f28850c;

    public h61(p61 p61Var) {
        this.f28850c = p61Var;
    }

    @Override
    public final int i(int i10) {
        p61 p61Var = this.f28850c;
        s4.h0 adapter = p61Var.f31453n.getAdapter();
        o61 o61Var = p61Var.f31455s;
        if (adapter == o61Var) {
            if ((o61Var.d.get(i10) instanceof Integer) || i10 >= o61Var.f31214w) {
                return o61Var.v;
            }
            return 1;
        }
        ig.d2 d2Var = p61Var.v;
        SparseArray sparseArray = d2Var.f14035s;
        if (i10 != d2Var.f14038y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.e.a();
    }
}
