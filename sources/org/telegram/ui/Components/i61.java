package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class i61 extends g.o {
    public final q61 f27077c;

    public i61(q61 q61Var) {
        this.f27077c = q61Var;
    }

    @Override
    public final int i(int i10) {
        q61 q61Var = this.f27077c;
        s4.i0 adapter = q61Var.f29742n.getAdapter();
        p61 p61Var = q61Var.f29744s;
        if (adapter == p61Var) {
            if ((p61Var.d.get(i10) instanceof Integer) || i10 >= p61Var.f29433w) {
                return p61Var.v;
            }
            return 1;
        }
        gg.f2 f2Var = q61Var.v;
        SparseArray sparseArray = f2Var.f10601s;
        if (i10 != f2Var.f10604y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return f2Var.f10597e.a();
    }
}
