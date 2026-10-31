package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class cb1 extends nb1 {
    public final pb1 f36434o3;

    public cb1(pb1 pb1Var, Context context) {
        super(pb1Var, context);
        this.f36434o3 = pb1Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f36434o3.f40569b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((hb1) arrayList.get(0)).f37887c == null || ((hb1) arrayList.get(0)).f37887c.f19845id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36434o3.B0();
    }
}
