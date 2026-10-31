package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class n41 extends g.o {
    public final w41 f28682c;

    public n41(w41 w41Var) {
        this.f28682c = w41Var;
    }

    @Override
    public final int i(int i10) {
        w41 w41Var = this.f28682c;
        s4.g0 adapter = w41Var.f31999n.getAdapter();
        v41 v41Var = w41Var.f32001s;
        if (adapter == v41Var) {
            if ((v41Var.d.get(i10) instanceof Integer) || i10 >= v41Var.f31138x) {
                return v41Var.f31137w;
            }
            return 1;
        }
        zf.o1 o1Var = w41Var.f32002w;
        SparseArray sparseArray = o1Var.f55603s;
        if (i10 != o1Var.D && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return o1Var.e.a();
    }
}
