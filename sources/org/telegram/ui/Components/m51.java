package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class m51 extends g.p {
    public final u51 f26218c;

    public m51(u51 u51Var) {
        this.f26218c = u51Var;
    }

    @Override
    public final int i(int i10) {
        u51 u51Var = this.f26218c;
        s4.h0 adapter = u51Var.f28767n.getAdapter();
        t51 t51Var = u51Var.f28769s;
        if (adapter == t51Var) {
            if ((t51Var.d.get(i10) instanceof Integer) || i10 >= t51Var.f28432w) {
                return t51Var.v;
            }
            return 1;
        }
        gg.g2 g2Var = u51Var.v;
        SparseArray sparseArray = g2Var.f9742s;
        if (i10 != g2Var.f9745y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return g2Var.e.a();
    }
}
