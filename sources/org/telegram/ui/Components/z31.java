package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class z31 extends f2.x {
    public final h41 f35179c;

    public z31(h41 h41Var) {
        this.f35179c = h41Var;
    }

    @Override
    public final int i(int i9) {
        h41 h41Var = this.f35179c;
        f2.r0 adapter = h41Var.f28972n.getAdapter();
        g41 g41Var = h41Var.f28974s;
        if (adapter == g41Var) {
            if ((g41Var.d.get(i9) instanceof Integer) || i9 >= g41Var.f28649w) {
                return g41Var.v;
            }
            return 1;
        }
        of.y1 y1Var = h41Var.v;
        SparseArray sparseArray = y1Var.f19555s;
        if (i9 != y1Var.f19558y && (sparseArray.get(i9) == null || (sparseArray.get(i9) instanceof TLRPC.Document))) {
            return 1;
        }
        return y1Var.f19551e.a();
    }
}
