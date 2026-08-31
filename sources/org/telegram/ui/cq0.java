package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class cq0 extends f2.v {
    public final hq0 f35892c;

    public cq0(hq0 hq0Var) {
        this.f35892c = hq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        hq0 hq0Var = this.f35892c;
        if (hq0Var.I.j(i10) != 1 && !hq0Var.V && (hq0Var.G != null || !TextUtils.isEmpty(hq0Var.v))) {
            int i12 = hq0Var.O;
            int i13 = hq0Var.f37577d0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return hq0Var.J.J;
    }
}
