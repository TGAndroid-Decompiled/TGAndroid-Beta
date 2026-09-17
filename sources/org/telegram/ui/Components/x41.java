package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class x41 extends g.p {
    public final f51 f29848c;

    public x41(f51 f51Var) {
        this.f29848c = f51Var;
    }

    @Override
    public final int i(int i10) {
        f51 f51Var = this.f29848c;
        s4.h0 adapter = f51Var.f23782n.getAdapter();
        e51 e51Var = f51Var.f23784s;
        if (adapter == e51Var) {
            if ((e51Var.d.get(i10) instanceof Integer) || i10 >= e51Var.f23492w) {
                return e51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = f51Var.v;
        SparseArray sparseArray = g2Var.f9749s;
        if (i10 != g2Var.f9752y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
