package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class f31 extends g.p {
    public final n31 f33692c;

    public f31(n31 n31Var) {
        this.f33692c = n31Var;
    }

    @Override
    public final int i(int i3) {
        n31 n31Var = this.f33692c;
        u4.h0 adapter = n31Var.f36359n.getAdapter();
        m31 m31Var = n31Var.f36361s;
        if (adapter == m31Var) {
            if ((m31Var.d.get(i3) instanceof Integer) || i3 >= m31Var.f35996x) {
                return m31Var.f35995w;
            }
            return 1;
        }
        kg.y1 y1Var = n31Var.f36362w;
        SparseArray sparseArray = y1Var.f17239s;
        if (i3 != y1Var.E && (sparseArray.get(i3) == null || (sparseArray.get(i3) instanceof TLRPC.Document))) {
            return 1;
        }
        return y1Var.f17235e.a();
    }
}
