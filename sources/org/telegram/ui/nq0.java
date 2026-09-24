package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class nq0 extends g.p {
    public final tq0 f35940c;

    public nq0(tq0 tq0Var) {
        this.f35940c = tq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        tq0 tq0Var = this.f35940c;
        if (tq0Var.L.j(i10) != 1 && !tq0Var.Y && (tq0Var.J != null || !TextUtils.isEmpty(tq0Var.v))) {
            int i12 = tq0Var.R;
            int i13 = tq0Var.f38181g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return tq0Var.M.J;
    }
}
