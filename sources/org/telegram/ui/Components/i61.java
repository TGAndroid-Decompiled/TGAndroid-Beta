package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class i61 extends g.o {
    public final q61 f29228c;

    public i61(q61 q61Var) {
        this.f29228c = q61Var;
    }

    @Override
    public final int i(int i10) {
        q61 q61Var = this.f29228c;
        s4.h0 adapter = q61Var.f31807n.getAdapter();
        p61 p61Var = q61Var.f31809s;
        if (adapter == p61Var) {
            if ((p61Var.d.get(i10) instanceof Integer) || i10 >= p61Var.f31515w) {
                return p61Var.v;
            }
            return 1;
        }
        ig.d2 d2Var = q61Var.v;
        SparseArray sparseArray = d2Var.f14034s;
        if (i10 != d2Var.f14037y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.e.a();
    }
}
