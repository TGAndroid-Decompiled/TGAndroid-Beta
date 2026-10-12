package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class z51 extends g.o {
    public final h61 f31770c;

    public z51(h61 h61Var) {
        this.f31770c = h61Var;
    }

    @Override
    public final int i(int i10) {
        h61 h61Var = this.f31770c;
        s4.g0 adapter = h61Var.f25522n.getAdapter();
        g61 g61Var = h61Var.f25524s;
        if (adapter == g61Var) {
            if ((g61Var.d.get(i10) instanceof Integer) || i10 >= g61Var.f25203w) {
                return g61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = h61Var.v;
        SparseArray sparseArray = e2Var.f10545s;
        if (i10 != e2Var.f10548y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return e2Var.e.a();
    }
}
