package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class x41 extends g.p {
    public final f51 f29851c;

    public x41(f51 f51Var) {
        this.f29851c = f51Var;
    }

    @Override
    public final int i(int i10) {
        f51 f51Var = this.f29851c;
        s4.h0 adapter = f51Var.f23785n.getAdapter();
        e51 e51Var = f51Var.f23787s;
        if (adapter == e51Var) {
            if ((e51Var.d.get(i10) instanceof Integer) || i10 >= e51Var.f23495w) {
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
