package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class x41 extends f2.v {
    public final f51 f32950c;

    public x41(f51 f51Var) {
        this.f32950c = f51Var;
    }

    @Override
    public final int i(int i10) {
        f51 f51Var = this.f32950c;
        f2.p0 adapter = f51Var.f26762n.getAdapter();
        e51 e51Var = f51Var.f26764s;
        if (adapter == e51Var) {
            if ((e51Var.d.get(i10) instanceof Integer) || i10 >= e51Var.f26442w) {
                return e51Var.v;
            }
            return 1;
        }
        uf.m1 m1Var = f51Var.v;
        SparseArray sparseArray = m1Var.f48651s;
        if (i10 != m1Var.f48654y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return m1Var.f48647e.a();
    }
}
