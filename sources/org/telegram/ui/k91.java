package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class k91 extends w91 {
    public final y91 f47245o3;

    public k91(y91 y91Var, Context context) {
        super(y91Var, context);
        this.f47245o3 = y91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f47245o3.f52016b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((q91) arrayList.get(0)).f48989c == null || ((q91) arrayList.get(0)).f48989c.f27008id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f47245o3.C0();
    }
}
