package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class j51 extends g.p {
    public final r51 f24241c;

    public j51(r51 r51Var) {
        this.f24241c = r51Var;
    }

    @Override
    public final int i(int i10) {
        r51 r51Var = this.f24241c;
        s4.h0 adapter = r51Var.f26593n.getAdapter();
        q51 q51Var = r51Var.f26595s;
        if (adapter == q51Var) {
            if ((q51Var.d.get(i10) instanceof Integer) || i10 >= q51Var.f26324w) {
                return q51Var.v;
            }
            return 1;
        }
        fg.h2 h2Var = r51Var.v;
        SparseArray sparseArray = h2Var.f8070s;
        if (i10 != h2Var.f8073y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return h2Var.e.a();
    }
}
