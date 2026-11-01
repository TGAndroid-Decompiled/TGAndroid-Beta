package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class o41 extends g.o {
    public final x41 f29026c;

    public o41(x41 x41Var) {
        this.f29026c = x41Var;
    }

    @Override
    public final int i(int i10) {
        x41 x41Var = this.f29026c;
        s4.g0 adapter = x41Var.f32415n.getAdapter();
        w41 w41Var = x41Var.f32417s;
        if (adapter == w41Var) {
            if ((w41Var.d.get(i10) instanceof Integer) || i10 >= w41Var.f32081x) {
                return w41Var.f32080w;
            }
            return 1;
        }
        zf.o1 o1Var = x41Var.f32418w;
        SparseArray sparseArray = o1Var.f55621s;
        if (i10 != o1Var.D && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return o1Var.e.a();
    }
}
