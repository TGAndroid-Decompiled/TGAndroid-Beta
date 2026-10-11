package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class pf1 extends cg1 {
    public final eg1 f40848g3;

    public pf1(eg1 eg1Var, Context context) {
        super(eg1Var, context);
        this.f40848g3 = eg1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f40848g3.f37314b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((vf1) arrayList.get(0)).f43006c == null || ((vf1) arrayList.get(0)).f43006c.f20084id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f40848g3.y0();
    }
}
