package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class w41 extends f2.v {
    public final e51 f30200c;

    public w41(e51 e51Var) {
        this.f30200c = e51Var;
    }

    @Override
    public final int i(int i10) {
        e51 e51Var = this.f30200c;
        f2.o0 adapter = e51Var.f24470n.getAdapter();
        d51 d51Var = e51Var.f24472s;
        if (adapter == d51Var) {
            if ((d51Var.d.get(i10) instanceof Integer) || i10 >= d51Var.f24171w) {
                return d51Var.v;
            }
            return 1;
        }
        tf.m1 m1Var = e51Var.v;
        SparseArray sparseArray = m1Var.f44799s;
        if (i10 != m1Var.f44802y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return m1Var.e.a();
    }
}
