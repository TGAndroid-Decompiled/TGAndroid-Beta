package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class p31 extends g.p {
    public final x31 f38191c;

    public p31(x31 x31Var) {
        this.f38191c = x31Var;
    }

    @Override
    public final int i(int i7) {
        x31 x31Var = this.f38191c;
        v4.h0 adapter = x31Var.f41552n.getAdapter();
        w31 w31Var = x31Var.f41554s;
        if (adapter == w31Var) {
            if ((w31Var.d.get(i7) instanceof Integer) || i7 >= w31Var.f41253x) {
                return w31Var.f41252w;
            }
            return 1;
        }
        jg.c2 c2Var = x31Var.f41555w;
        SparseArray sparseArray = c2Var.f17041s;
        if (i7 != c2Var.E && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return c2Var.f17037e.a();
    }
}
