package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class g91 extends s91 {
    public final u91 f47379p3;

    public g91(u91 u91Var, Context context) {
        super(u91Var, context);
        this.f47379p3 = u91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f47379p3.f51838b;
        if (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((m91) arrayList.get(0)).f49187c == null || ((m91) arrayList.get(0)).f49187c.f28103id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f47379p3.C0();
    }
}
