package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class df1 extends qf1 {
    public final sf1 f36181f3;

    public df1(sf1 sf1Var, Context context) {
        super(sf1Var, context);
        this.f36181f3 = sf1Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f36181f3.f41191b;
        if (getAdapter() == null || this.U1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((jf1) arrayList.get(0)).f38044c == null || ((jf1) arrayList.get(0)).f38044c.f20897id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f36181f3.y0();
    }
}
