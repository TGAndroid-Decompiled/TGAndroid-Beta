package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class c41 extends g.p {
    public final k41 f33976c;

    public c41(k41 k41Var) {
        this.f33976c = k41Var;
    }

    @Override
    public final int i(int i7) {
        k41 k41Var = this.f33976c;
        v4.h0 adapter = k41Var.f36738n.getAdapter();
        j41 j41Var = k41Var.f36740s;
        if (adapter == j41Var) {
            if ((j41Var.d.get(i7) instanceof Integer) || i7 >= j41Var.f36359x) {
                return j41Var.f36358w;
            }
            return 1;
        }
        jg.c2 c2Var = k41Var.f36741w;
        SparseArray sparseArray = c2Var.f17418s;
        if (i7 != c2Var.E && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return c2Var.f17414e.a();
    }
}
