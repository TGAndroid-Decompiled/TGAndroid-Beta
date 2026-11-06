package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class j31 extends g.p {
    public final s31 f34854c;

    public j31(s31 s31Var) {
        this.f34854c = s31Var;
    }

    @Override
    public final int i(int i7) {
        s31 s31Var = this.f34854c;
        v4.g0 adapter = s31Var.f37872n.getAdapter();
        r31 r31Var = s31Var.f37874s;
        if (adapter == r31Var) {
            if ((r31Var.d.get(i7) instanceof Integer) || i7 >= r31Var.f37529x) {
                return r31Var.f37528w;
            }
            return 1;
        }
        jg.d2 d2Var = s31Var.f37875w;
        SparseArray sparseArray = d2Var.f16701s;
        if (i7 != d2Var.D && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.f16697e.a();
    }
}
