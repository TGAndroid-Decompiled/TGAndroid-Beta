package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class pf1 extends cg1 {
    public final eg1 f36564i3;

    public pf1(eg1 eg1Var, Context context) {
        super(eg1Var, context);
        this.f36564i3 = eg1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f36564i3.f33294b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((vf1) arrayList.get(0)).f38528c == null || ((vf1) arrayList.get(0)).f38528c.f18161id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36564i3.y0();
    }
}
