package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class hq0 extends f2.v {
    public final mq0 f37464c;

    public hq0(mq0 mq0Var) {
        this.f37464c = mq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        mq0 mq0Var = this.f37464c;
        if (mq0Var.I.j(i10) != 1 && !mq0Var.V && (mq0Var.G != null || !TextUtils.isEmpty(mq0Var.v))) {
            int i12 = mq0Var.O;
            int i13 = mq0Var.f39037d0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return mq0Var.J.J;
    }
}
