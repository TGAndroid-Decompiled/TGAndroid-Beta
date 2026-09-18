package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class of1 extends bg1 {
    public final dg1 f36190i3;

    public of1(dg1 dg1Var, Context context) {
        super(dg1Var, context);
        this.f36190i3 = dg1Var;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.f36190i3.f32973b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((uf1) arrayList.get(0)).f37987c == null || ((uf1) arrayList.get(0)).f37987c.f18348id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36190i3.y0();
    }
}
