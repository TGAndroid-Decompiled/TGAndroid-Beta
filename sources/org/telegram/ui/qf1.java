package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class qf1 extends dg1 {
    public final fg1 f36903i3;

    public qf1(fg1 fg1Var, Context context) {
        super(fg1Var, context);
        this.f36903i3 = fg1Var;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.f36903i3.f33599b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((wf1) arrayList.get(0)).f39142c == null || ((wf1) arrayList.get(0)).f39142c.f18380id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36903i3.y0();
    }
}
