package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ce1 extends pe1 {
    public final re1 f35951g3;

    public ce1(re1 re1Var, Context context) {
        super(re1Var, context);
        this.f35951g3 = re1Var;
    }

    @Override
    public final boolean S0() {
        ArrayList arrayList = this.f35951g3.f41153b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ie1) arrayList.get(0)).f37981c == null || ((ie1) arrayList.get(0)).f37981c.f20327id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f35951g3.y0();
    }
}
