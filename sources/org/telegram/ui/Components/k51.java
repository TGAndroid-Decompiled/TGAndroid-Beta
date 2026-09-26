package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class k51 extends g.p {
    public final s51 f25637c;

    public k51(s51 s51Var) {
        this.f25637c = s51Var;
    }

    @Override
    public final int i(int i10) {
        s51 s51Var = this.f25637c;
        s4.h0 adapter = s51Var.f28164n.getAdapter();
        r51 r51Var = s51Var.f28166s;
        if (adapter == r51Var) {
            if ((r51Var.d.get(i10) instanceof Integer) || i10 >= r51Var.f27838w) {
                return r51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = s51Var.v;
        SparseArray sparseArray = g2Var.f9730s;
        if (i10 != g2Var.f9733y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
