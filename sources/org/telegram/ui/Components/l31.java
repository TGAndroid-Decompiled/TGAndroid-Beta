package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class l31 extends g.p {
    public final u31 f35574c;

    public l31(u31 u31Var) {
        this.f35574c = u31Var;
    }

    @Override
    public final int i(int i7) {
        u31 u31Var = this.f35574c;
        v4.g0 adapter = u31Var.f38583n.getAdapter();
        t31 t31Var = u31Var.f38585s;
        if (adapter == t31Var) {
            if ((t31Var.d.get(i7) instanceof Integer) || i7 >= t31Var.f38270x) {
                return t31Var.f38269w;
            }
            return 1;
        }
        jg.d2 d2Var = u31Var.f38586w;
        SparseArray sparseArray = d2Var.f16704s;
        if (i7 != d2Var.D && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.f16700e.a();
    }
}
