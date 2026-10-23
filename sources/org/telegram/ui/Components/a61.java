package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class a61 extends g.o {
    public final i61 f24653c;

    public a61(i61 i61Var) {
        this.f24653c = i61Var;
    }

    @Override
    public final int i(int i10) {
        i61 i61Var = this.f24653c;
        s4.g0 adapter = i61Var.f27223n.getAdapter();
        h61 h61Var = i61Var.f27225s;
        if (adapter == h61Var) {
            if ((h61Var.d.get(i10) instanceof Integer) || i10 >= h61Var.f26808w) {
                return h61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = i61Var.v;
        SparseArray sparseArray = e2Var.f11880s;
        if (i10 != e2Var.f11883y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return e2Var.e.a();
    }
}
