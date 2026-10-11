package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class e61 extends g.o {
    public final m61 f26001c;

    public e61(m61 m61Var) {
        this.f26001c = m61Var;
    }

    @Override
    public final int i(int i10) {
        m61 m61Var = this.f26001c;
        s4.i0 adapter = m61Var.f28761n.getAdapter();
        l61 l61Var = m61Var.f28763s;
        if (adapter == l61Var) {
            if ((l61Var.d.get(i10) instanceof Integer) || i10 >= l61Var.f28217w) {
                return l61Var.v;
            }
            return 1;
        }
        gg.f2 f2Var = m61Var.v;
        SparseArray sparseArray = f2Var.f10602s;
        if (i10 != f2Var.f10605y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return f2Var.f10598e.a();
    }
}
