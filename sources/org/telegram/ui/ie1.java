package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ie1 extends we1 {
    public final ye1 f38181j3;

    public ie1(ye1 ye1Var, Context context) {
        super(ye1Var, context);
        this.f38181j3 = ye1Var;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.f38181j3.f43795b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((oe1) arrayList.get(0)).f40146c == null || ((oe1) arrayList.get(0)).f40146c.f20395id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f38181j3.x0();
    }
}
