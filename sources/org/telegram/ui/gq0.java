package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class gq0 extends g.o {
    public final mq0 f37653c;

    public gq0(mq0 mq0Var) {
        this.f37653c = mq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        mq0 mq0Var = this.f37653c;
        if (mq0Var.L.j(i10) != 1 && !mq0Var.Y && (mq0Var.J != null || !TextUtils.isEmpty(mq0Var.v))) {
            int i12 = mq0Var.R;
            int i13 = mq0Var.f39653g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return mq0Var.M.J;
    }
}
