package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class z51 extends g.o {
    public final h61 f33159c;

    public z51(h61 h61Var) {
        this.f33159c = h61Var;
    }

    @Override
    public final int i(int i10) {
        h61 h61Var = this.f33159c;
        s4.g0 adapter = h61Var.f26882n.getAdapter();
        g61 g61Var = h61Var.f26884s;
        if (adapter == g61Var) {
            if ((g61Var.d.get(i10) instanceof Integer) || i10 >= g61Var.f26576w) {
                return g61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = h61Var.v;
        SparseArray sparseArray = e2Var.f11880s;
        if (i10 != e2Var.f11883y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return e2Var.e.a();
    }
}
