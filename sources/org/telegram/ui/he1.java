package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class he1 extends ve1 {
    public final xe1 f37823j3;

    public he1(xe1 xe1Var, Context context) {
        super(xe1Var, context);
        this.f37823j3 = xe1Var;
    }

    @Override
    public final boolean T0() {
        ArrayList arrayList = this.f37823j3.f43548b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ne1) arrayList.get(0)).f39813c == null || ((ne1) arrayList.get(0)).f39813c.f20396id != 1 ? getAdapter().h() > 1 : getAdapter().h() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f37823j3.x0();
    }
}
