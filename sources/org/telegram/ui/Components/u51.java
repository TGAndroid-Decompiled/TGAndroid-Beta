package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class u51 extends g.p {
    public final c61 f31305c;

    public u51(c61 c61Var) {
        this.f31305c = c61Var;
    }

    @Override
    public final int i(int i10) {
        c61 c61Var = this.f31305c;
        s4.h0 adapter = c61Var.f25237n.getAdapter();
        b61 b61Var = c61Var.f25239s;
        if (adapter == b61Var) {
            if ((b61Var.d.get(i10) instanceof Integer) || i10 >= b61Var.f24811w) {
                return b61Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = c61Var.v;
        SparseArray sparseArray = g2Var.f10597s;
        if (i10 != g2Var.f10600y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.f10593e.a();
    }
}
