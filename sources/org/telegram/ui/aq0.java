package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class aq0 extends f2.v {
    public final fq0 f32690c;

    public aq0(fq0 fq0Var) {
        this.f32690c = fq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        fq0 fq0Var = this.f32690c;
        if (fq0Var.I.j(i10) != 1 && !fq0Var.V && (fq0Var.G != null || !TextUtils.isEmpty(fq0Var.v))) {
            int i12 = fq0Var.O;
            int i13 = fq0Var.f34319d0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return fq0Var.J.J;
    }
}
