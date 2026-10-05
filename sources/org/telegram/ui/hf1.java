package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class hf1 extends uf1 {
    public final wf1 f37081p3;

    public hf1(wf1 wf1Var, Context context) {
        super(wf1Var, context);
        this.f37081p3 = wf1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f37081p3.f42470b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((nf1) arrayList.get(0)).f38956c == null || ((nf1) arrayList.get(0)).f38956c.f20099id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37081p3.y0();
    }
}
