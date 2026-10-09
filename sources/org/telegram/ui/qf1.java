package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class qf1 extends dg1 {
    public final fg1 f41107g3;

    public qf1(fg1 fg1Var, Context context) {
        super(fg1Var, context);
        this.f41107g3 = fg1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f41107g3.f37561b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((wf1) arrayList.get(0)).f43570c == null || ((wf1) arrayList.get(0)).f43570c.f20090id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41107g3.y0();
    }
}
