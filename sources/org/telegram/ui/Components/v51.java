package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v51 extends g.o {
    public final d61 f31160c;

    public v51(d61 d61Var) {
        this.f31160c = d61Var;
    }

    @Override
    public final int i(int i10) {
        d61 d61Var = this.f31160c;
        s4.g0 adapter = d61Var.f25351n.getAdapter();
        c61 c61Var = d61Var.f25353s;
        if (adapter == c61Var) {
            if ((c61Var.d.get(i10) instanceof Integer) || i10 >= c61Var.f25114w) {
                return c61Var.v;
            }
            return 1;
        }
        hg.e2 e2Var = d61Var.v;
        SparseArray sparseArray = e2Var.f11853s;
        if (i10 != e2Var.f11856y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return e2Var.e.a();
    }
}
