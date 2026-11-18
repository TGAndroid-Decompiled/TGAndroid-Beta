package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class z31 extends g.p {
    public final h41 f42760c;

    public z31(h41 h41Var) {
        this.f42760c = h41Var;
    }

    @Override
    public final int i(int i7) {
        h41 h41Var = this.f42760c;
        v4.i0 adapter = h41Var.f35719n.getAdapter();
        g41 g41Var = h41Var.f35721s;
        if (adapter == g41Var) {
            if ((g41Var.d.get(i7) instanceof Integer) || i7 >= g41Var.f35334x) {
                return g41Var.f35333w;
            }
            return 1;
        }
        jg.c2 c2Var = h41Var.f35722w;
        SparseArray sparseArray = c2Var.f17424s;
        if (i7 != c2Var.E && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return c2Var.f17420e.a();
    }
}
