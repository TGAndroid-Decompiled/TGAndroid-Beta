package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class i91 extends u91 {
    public final w91 f48753p3;

    public i91(w91 w91Var, Context context) {
        super(w91Var, context);
        this.f48753p3 = w91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f48753p3.f53219b;
        if (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((o91) arrayList.get(0)).f50609c == null || ((o91) arrayList.get(0)).f50609c.f28544id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f48753p3.C0();
    }
}
