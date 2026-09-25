package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class hf1 extends uf1 {
    public final wf1 f34214i3;

    public hf1(wf1 wf1Var, Context context) {
        super(wf1Var, context);
        this.f34214i3 = wf1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f34214i3.f39312b;
        if (getAdapter() == null || this.X1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((nf1) arrayList.get(0)).f35874c == null || ((nf1) arrayList.get(0)).f35874c.f18388id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f34214i3.y0();
    }
}
