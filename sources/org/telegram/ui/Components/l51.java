package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class l51 extends g.p {
    public final t51 f25926c;

    public l51(t51 t51Var) {
        this.f25926c = t51Var;
    }

    @Override
    public final int i(int i10) {
        t51 t51Var = this.f25926c;
        s4.h0 adapter = t51Var.f28471n.getAdapter();
        s51 s51Var = t51Var.f28473s;
        if (adapter == s51Var) {
            if ((s51Var.d.get(i10) instanceof Integer) || i10 >= s51Var.f28134w) {
                return s51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = t51Var.v;
        SparseArray sparseArray = g2Var.f9730s;
        if (i10 != g2Var.f9733y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
