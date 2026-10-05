package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class v51 extends g.p {
    public final d61 f31667c;

    public v51(d61 d61Var) {
        this.f31667c = d61Var;
    }

    @Override
    public final int i(int i10) {
        d61 d61Var = this.f31667c;
        s4.h0 adapter = d61Var.f25688n.getAdapter();
        c61 c61Var = d61Var.f25690s;
        if (adapter == c61Var) {
            if ((c61Var.d.get(i10) instanceof Integer) || i10 >= c61Var.f25281w) {
                return c61Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = d61Var.v;
        SparseArray sparseArray = g2Var.f10597s;
        if (i10 != g2Var.f10600y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.f10593e.a();
    }
}
