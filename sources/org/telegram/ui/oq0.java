package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class oq0 extends g.p {
    public final uq0 f35946c;

    public oq0(uq0 uq0Var) {
        this.f35946c = uq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        uq0 uq0Var = this.f35946c;
        if (uq0Var.L.j(i10) != 1 && !uq0Var.Y && (uq0Var.J != null || !TextUtils.isEmpty(uq0Var.v))) {
            int i12 = uq0Var.R;
            int i13 = uq0Var.f38177g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return uq0Var.M.J;
    }
}
