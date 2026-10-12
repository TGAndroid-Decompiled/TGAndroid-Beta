package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class br0 extends g.o {
    public final hr0 f34620c;

    public br0(hr0 hr0Var) {
        this.f34620c = hr0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        hr0 hr0Var = this.f34620c;
        if (hr0Var.L.j(i10) != 1 && !hr0Var.Y && (hr0Var.J != null || !TextUtils.isEmpty(hr0Var.v))) {
            int i12 = hr0Var.R;
            int i13 = hr0Var.f36923g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return hr0Var.M.J;
    }
}
