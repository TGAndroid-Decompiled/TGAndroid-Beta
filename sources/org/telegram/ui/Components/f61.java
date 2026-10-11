package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class f61 extends g.o {
    public final n61 f26269c;

    public f61(n61 n61Var) {
        this.f26269c = n61Var;
    }

    @Override
    public final int i(int i10) {
        n61 n61Var = this.f26269c;
        s4.i0 adapter = n61Var.f28981n.getAdapter();
        m61 m61Var = n61Var.f28983s;
        if (adapter == m61Var) {
            if ((m61Var.d.get(i10) instanceof Integer) || i10 >= m61Var.f28577w) {
                return m61Var.v;
            }
            return 1;
        }
        gg.f2 f2Var = n61Var.v;
        SparseArray sparseArray = f2Var.f10602s;
        if (i10 != f2Var.f10605y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return f2Var.f10598e.a();
    }
}
