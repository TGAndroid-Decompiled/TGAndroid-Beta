package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class fq0 extends g.o {
    public final lq0 f37003c;

    public fq0(lq0 lq0Var) {
        this.f37003c = lq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        lq0 lq0Var = this.f37003c;
        if (lq0Var.L.j(i10) != 1 && !lq0Var.Y && (lq0Var.J != null || !TextUtils.isEmpty(lq0Var.v))) {
            int i12 = lq0Var.R;
            int i13 = lq0Var.f38921g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return lq0Var.M.J;
    }
}
