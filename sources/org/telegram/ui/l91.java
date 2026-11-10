package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class l91 extends x91 {
    public final z91 f47554o3;

    public l91(z91 z91Var, Context context) {
        super(z91Var, context);
        this.f47554o3 = z91Var;
    }

    @Override
    public final boolean R0() {
        ArrayList arrayList = this.f47554o3.f52346b;
        if (getAdapter() == null || this.V1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((r91) arrayList.get(0)).f49322c == null || ((r91) arrayList.get(0)).f49322c.f27012id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f47554o3.C0();
    }
}
