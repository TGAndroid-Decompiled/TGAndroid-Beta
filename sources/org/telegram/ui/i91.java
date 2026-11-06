package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class i91 extends t91 {
    public final v91 f46607o3;

    public i91(v91 v91Var, Context context) {
        super(v91Var, context);
        this.f46607o3 = v91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f46607o3.f50622b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((n91) arrayList.get(0)).f47974c == null || ((n91) arrayList.get(0)).f47974c.f27004id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f46607o3.C0();
    }
}
