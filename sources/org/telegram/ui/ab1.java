package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ab1 extends lb1 {
    public final nb1 f35742o3;

    public ab1(nb1 nb1Var, Context context) {
        super(nb1Var, context);
        this.f35742o3 = nb1Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f35742o3.f39800b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((fb1) arrayList.get(0)).f37097c == null || ((fb1) arrayList.get(0)).f37097c.f19846id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f35742o3.C0();
    }
}
