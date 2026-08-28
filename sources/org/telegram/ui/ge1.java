package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ge1 extends ue1 {
    public final we1 f38529e3;

    public ge1(we1 we1Var, Context context) {
        super(we1Var, context);
        this.f38529e3 = we1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f38529e3.f43744b;
        if (getAdapter() == null || this.T1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((me1) arrayList.get(0)).f40405c == null || ((me1) arrayList.get(0)).f40405c.f22432id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f38529e3.x0();
    }
}
