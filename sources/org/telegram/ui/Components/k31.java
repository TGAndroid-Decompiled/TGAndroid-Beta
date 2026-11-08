package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class k31 extends g.p {
    public final t31 f35184c;

    public k31(t31 t31Var) {
        this.f35184c = t31Var;
    }

    @Override
    public final int i(int i7) {
        t31 t31Var = this.f35184c;
        v4.g0 adapter = t31Var.f38229n.getAdapter();
        s31 s31Var = t31Var.f38231s;
        if (adapter == s31Var) {
            if ((s31Var.d.get(i7) instanceof Integer) || i7 >= s31Var.f37891x) {
                return s31Var.f37890w;
            }
            return 1;
        }
        jg.d2 d2Var = t31Var.f38232w;
        SparseArray sparseArray = d2Var.f16704s;
        if (i7 != d2Var.D && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return d2Var.f16700e.a();
    }
}
