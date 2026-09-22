package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class m51 extends g.p {
    public final u51 f26333c;

    public m51(u51 u51Var) {
        this.f26333c = u51Var;
    }

    @Override
    public final int i(int i10) {
        u51 u51Var = this.f26333c;
        s4.h0 adapter = u51Var.f28671n.getAdapter();
        t51 t51Var = u51Var.f28673s;
        if (adapter == t51Var) {
            if ((t51Var.d.get(i10) instanceof Integer) || i10 >= t51Var.f28403w) {
                return t51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = u51Var.v;
        SparseArray sparseArray = g2Var.f9749s;
        if (i10 != g2Var.f9752y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
