package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ne1 extends af1 {
    public final cf1 f41785p3;

    public ne1(cf1 cf1Var, Context context) {
        super(cf1Var, context);
        this.f41785p3 = cf1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f41785p3.f38291b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((te1) arrayList.get(0)).f43620c == null || ((te1) arrayList.get(0)).f43620c.f22080id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41785p3.y0();
    }
}
