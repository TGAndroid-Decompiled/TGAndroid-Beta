package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class j51 extends g.p {
    public final r51 f25283c;

    public j51(r51 r51Var) {
        this.f25283c = r51Var;
    }

    @Override
    public final int i(int i10) {
        r51 r51Var = this.f25283c;
        s4.h0 adapter = r51Var.f27876n.getAdapter();
        q51 q51Var = r51Var.f27878s;
        if (adapter == q51Var) {
            if ((q51Var.d.get(i10) instanceof Integer) || i10 >= q51Var.f27519w) {
                return q51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = r51Var.v;
        SparseArray sparseArray = g2Var.f9730s;
        if (i10 != g2Var.f9733y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
