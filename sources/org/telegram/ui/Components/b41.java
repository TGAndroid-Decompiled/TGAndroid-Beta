package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

public final class b41 extends f2.w {

    public final j41 f26919c;

    public b41(j41 j41Var) {
        this.f26919c = j41Var;
    }

    @Override
    public final int i(int i10) {
        j41 j41Var = this.f26919c;
        f2.q0 adapter = j41Var.f29585n.getAdapter();
        i41 i41Var = j41Var.f29587s;
        if (adapter == i41Var) {
            if ((i41Var.d.get(i10) instanceof Integer) || i10 >= i41Var.f29223w) {
                return i41Var.v;
            }
            return 1;
        }
        pf.l1 l1Var = j41Var.v;
        SparseArray sparseArray = l1Var.f45872s;
        if (i10 == l1Var.f45875y || !(sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return l1Var.f45868e.a();
        }
        return 1;
    }
}
