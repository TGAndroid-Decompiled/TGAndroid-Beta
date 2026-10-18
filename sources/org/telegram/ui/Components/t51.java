package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class t51 extends g.o {
    public final b61 f30470c;

    public t51(b61 b61Var) {
        this.f30470c = b61Var;
    }

    @Override
    public final int i(int i10) {
        b61 b61Var = this.f30470c;
        s4.g0 adapter = b61Var.f24816n.getAdapter();
        a61 a61Var = b61Var.f24818s;
        if (adapter == a61Var) {
            if ((a61Var.d.get(i10) instanceof Integer) || i10 >= a61Var.f24507w) {
                return a61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = b61Var.v;
        SparseArray sparseArray = e2Var.f11854s;
        if (i10 != e2Var.f11857y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return e2Var.e.a();
    }
}
