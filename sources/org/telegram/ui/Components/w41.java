package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class w41 extends g.p {
    public final e51 f29566c;

    public w41(e51 e51Var) {
        this.f29566c = e51Var;
    }

    @Override
    public final int i(int i10) {
        e51 e51Var = this.f29566c;
        s4.h0 adapter = e51Var.f23543n.getAdapter();
        d51 d51Var = e51Var.f23545s;
        if (adapter == d51Var) {
            if ((d51Var.d.get(i10) instanceof Integer) || i10 >= d51Var.f23223w) {
                return d51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = e51Var.v;
        SparseArray sparseArray = g2Var.f9745s;
        if (i10 != g2Var.f9748y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
