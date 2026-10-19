package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class u51 extends g.o {
    public final c61 f30895c;

    public u51(c61 c61Var) {
        this.f30895c = c61Var;
    }

    @Override
    public final int i(int i10) {
        c61 c61Var = this.f30895c;
        s4.g0 adapter = c61Var.f25092n.getAdapter();
        b61 b61Var = c61Var.f25094s;
        if (adapter == b61Var) {
            if ((b61Var.d.get(i10) instanceof Integer) || i10 >= b61Var.f24815w) {
                return b61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = c61Var.v;
        SparseArray sparseArray = e2Var.f11853s;
        if (i10 != e2Var.f11856y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return e2Var.e.a();
    }
}
