package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class lq0 extends g.o {
    public final rq0 f41340c;

    public lq0(rq0 rq0Var) {
        this.f41340c = rq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        rq0 rq0Var = this.f41340c;
        if (rq0Var.L.j(i10) != 1 && !rq0Var.Y && (rq0Var.J != null || !TextUtils.isEmpty(rq0Var.v))) {
            int i12 = rq0Var.R;
            int i13 = rq0Var.f43249g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return rq0Var.M.J;
    }
}
