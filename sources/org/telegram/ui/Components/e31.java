package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class e31 extends g.p {
    public final n31 f33131c;

    public e31(n31 n31Var) {
        this.f33131c = n31Var;
    }

    @Override
    public final int i(int i7) {
        n31 n31Var = this.f33131c;
        v4.g0 adapter = n31Var.f36236n.getAdapter();
        m31 m31Var = n31Var.f36238s;
        if (adapter == m31Var) {
            if ((m31Var.d.get(i7) instanceof Integer) || i7 >= m31Var.f35866x) {
                return m31Var.f35865w;
            }
            return 1;
        }
        jg.d2 d2Var = n31Var.f36239w;
        SparseArray sparseArray = d2Var.f16701s;
        if (i7 != d2Var.D && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.f16697e.a();
    }
}
