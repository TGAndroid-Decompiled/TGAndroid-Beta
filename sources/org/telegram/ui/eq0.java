package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class eq0 extends g.o {
    public final kq0 f36584c;

    public eq0(kq0 kq0Var) {
        this.f36584c = kq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        kq0 kq0Var = this.f36584c;
        if (kq0Var.L.j(i10) != 1 && !kq0Var.Y && (kq0Var.J != null || !TextUtils.isEmpty(kq0Var.v))) {
            int i12 = kq0Var.R;
            int i13 = kq0Var.f38647g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return kq0Var.M.J;
    }
}
