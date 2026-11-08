package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class j91 extends u91 {
    public final w91 f46909o3;

    public j91(w91 w91Var, Context context) {
        super(w91Var, context);
        this.f46909o3 = w91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f46909o3.f50995b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((o91) arrayList.get(0)).f48337c == null || ((o91) arrayList.get(0)).f48337c.f27008id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f46909o3.C0();
    }
}
