package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v41 extends f2.v {
    public final d51 f31791c;

    public v41(d51 d51Var) {
        this.f31791c = d51Var;
    }

    @Override
    public final int i(int i10) {
        d51 d51Var = this.f31791c;
        f2.p0 adapter = d51Var.f26191n.getAdapter();
        c51 c51Var = d51Var.f26193s;
        if (adapter == c51Var) {
            if ((c51Var.d.get(i10) instanceof Integer) || i10 >= c51Var.f25779w) {
                return c51Var.v;
            }
            return 1;
        }
        uf.m1 m1Var = d51Var.v;
        SparseArray sparseArray = m1Var.f48687s;
        if (i10 != m1Var.f48690y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return m1Var.f48683e.a();
    }
}
