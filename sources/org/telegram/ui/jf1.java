package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class jf1 extends wf1 {
    public final yf1 f37683p3;

    public jf1(yf1 yf1Var, Context context) {
        super(yf1Var, context);
        this.f37683p3 = yf1Var;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.f37683p3.f43166b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((pf1) arrayList.get(0)).f39472c == null || ((pf1) arrayList.get(0)).f39472c.f20090id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37683p3.y0();
    }
}
