package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class jf1 extends wf1 {
    public final yf1 f37688p3;

    public jf1(yf1 yf1Var, Context context) {
        super(yf1Var, context);
        this.f37688p3 = yf1Var;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.f37688p3.f43173b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((pf1) arrayList.get(0)).f39477c == null || ((pf1) arrayList.get(0)).f39477c.f20094id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37688p3.y0();
    }
}
