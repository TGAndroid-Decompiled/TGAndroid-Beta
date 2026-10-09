package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class d61 extends g.o {
    public final l61 f25610c;

    public d61(l61 l61Var) {
        this.f25610c = l61Var;
    }

    @Override
    public final int i(int i10) {
        l61 l61Var = this.f25610c;
        s4.i0 adapter = l61Var.f28308n.getAdapter();
        k61 k61Var = l61Var.f28310s;
        if (adapter == k61Var) {
            if ((k61Var.d.get(i10) instanceof Integer) || i10 >= k61Var.f27861w) {
                return k61Var.v;
            }
            return 1;
        }
        gg.f2 f2Var = l61Var.v;
        SparseArray sparseArray = f2Var.f10603s;
        if (i10 != f2Var.f10606y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return f2Var.f10599e.a();
    }
}
