package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class c41 extends g.p {
    public final k41 f34012c;

    public c41(k41 k41Var) {
        this.f34012c = k41Var;
    }

    @Override
    public final int i(int i7) {
        k41 k41Var = this.f34012c;
        v4.i0 adapter = k41Var.f36772n.getAdapter();
        j41 j41Var = k41Var.f36774s;
        if (adapter == j41Var) {
            if ((j41Var.d.get(i7) instanceof Integer) || i7 >= j41Var.f36400x) {
                return j41Var.f36399w;
            }
            return 1;
        }
        jg.c2 c2Var = k41Var.f36775w;
        SparseArray sparseArray = c2Var.f17452s;
        if (i7 != c2Var.E && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return c2Var.f17448e.a();
    }
}
