package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class dq0 extends g.o {
    public final jq0 f36440c;

    public dq0(jq0 jq0Var) {
        this.f36440c = jq0Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        jq0 jq0Var = this.f36440c;
        if (jq0Var.L.j(i10) != 1 && !jq0Var.Y && (jq0Var.J != null || !TextUtils.isEmpty(jq0Var.v))) {
            int i12 = jq0Var.R;
            int i13 = jq0Var.f38310g0;
            if (i10 % i13 != i13 - 1) {
                i11 = AndroidUtilities.dp(2.0f);
            } else {
                i11 = 0;
            }
            return i12 + i11;
        }
        return jq0Var.M.J;
    }
}
