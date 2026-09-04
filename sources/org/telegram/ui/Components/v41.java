package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v41 extends g.p {
    public final d51 f31092c;

    public v41(d51 d51Var) {
        this.f31092c = d51Var;
    }

    @Override
    public final int i(int i10) {
        d51 d51Var = this.f31092c;
        s4.h0 adapter = d51Var.f25234n.getAdapter();
        c51 c51Var = d51Var.f25236s;
        if (adapter == c51Var) {
            if ((c51Var.d.get(i10) instanceof Integer) || i10 >= c51Var.f24901w) {
                return c51Var.v;
            }
            return 1;
        }
        hg.f2 f2Var = d51Var.v;
        SparseArray sparseArray = f2Var.f11049s;
        if (i10 != f2Var.f11052y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return f2Var.f11045e.a();
    }
}
