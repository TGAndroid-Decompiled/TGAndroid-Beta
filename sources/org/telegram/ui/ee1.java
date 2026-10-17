package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ee1 extends re1 {
    public final te1 f36509g3;

    public ee1(te1 te1Var, Context context) {
        super(te1Var, context);
        this.f36509g3 = te1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f36509g3.f41682b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ke1) arrayList.get(0)).f38506c == null || ((ke1) arrayList.get(0)).f38506c.f20324id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36509g3.y0();
    }
}
