package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v41 extends g.p {
    public final d51 f28655c;

    public v41(d51 d51Var) {
        this.f28655c = d51Var;
    }

    @Override
    public final int i(int i10) {
        d51 d51Var = this.f28655c;
        s4.h0 adapter = d51Var.f23244n.getAdapter();
        c51 c51Var = d51Var.f23246s;
        if (adapter == c51Var) {
            if ((c51Var.d.get(i10) instanceof Integer) || i10 >= c51Var.f22940w) {
                return c51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = d51Var.v;
        SparseArray sparseArray = g2Var.f9731s;
        if (i10 != g2Var.f9734y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
