package org.telegram.ui.Components;

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;
public final class k41 extends f2.v {
    public final s41 f29921c;

    public k41(s41 s41Var) {
        this.f29921c = s41Var;
    }

    @Override
    public final int i(int i10) {
        s41 s41Var = this.f29921c;
        f2.p0 adapter = s41Var.f32485n.getAdapter();
        r41 r41Var = s41Var.f32487s;
        if (adapter == r41Var) {
            if ((r41Var.d.get(i10) instanceof Integer) || i10 >= r41Var.f32177w) {
                return r41Var.v;
            }
            return 1;
        }
        rf.m1 m1Var = s41Var.v;
        SparseArray sparseArray = m1Var.f47313s;
        if (i10 != m1Var.f47316y && (sparseArray.get(i10) == null || (sparseArray.get(i10) instanceof TLRPC.Document))) {
            return 1;
        }
        return m1Var.f47309e.a();
    }
}
