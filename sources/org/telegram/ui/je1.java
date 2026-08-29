package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class je1 extends xe1 {
    public final ze1 f39526e3;

    public je1(ze1 ze1Var, Context context) {
        super(ze1Var, context);
        this.f39526e3 = ze1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f39526e3.f45158b;
        if (getAdapter() == null || this.T1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((pe1) arrayList.get(0)).f41396c == null || ((pe1) arrayList.get(0)).f41396c.f22444id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f39526e3.y0();
    }
}
