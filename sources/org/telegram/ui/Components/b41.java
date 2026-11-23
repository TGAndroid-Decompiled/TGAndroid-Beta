package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class b41 extends g.p {
    public final j41 f33626c;

    public b41(j41 j41Var) {
        this.f33626c = j41Var;
    }

    @Override
    public final int i(int i7) {
        j41 j41Var = this.f33626c;
        v4.i0 adapter = j41Var.f36265n.getAdapter();
        i41 i41Var = j41Var.f36267s;
        if (adapter == i41Var) {
            if ((i41Var.d.get(i7) instanceof Integer) || i7 >= i41Var.f35912x) {
                return i41Var.f35911w;
            }
            return 1;
        }
        jg.c2 c2Var = j41Var.f36268w;
        SparseArray sparseArray = c2Var.f17520s;
        if (i7 != c2Var.E && (sparseArray.get(i7) == null || (sparseArray.get(i7) instanceof TLRPC.Document))) {
            return 1;
        }
        return c2Var.f17516e.a();
    }
}
