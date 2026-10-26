package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class le1 extends ye1 {
    public final af1 f41258p3;

    public le1(af1 af1Var, Context context) {
        super(af1Var, context);
        this.f41258p3 = af1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f41258p3.f37737b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((re1) arrayList.get(0)).f43135c == null || ((re1) arrayList.get(0)).f43135c.f22079id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41258p3.y0();
    }
}
