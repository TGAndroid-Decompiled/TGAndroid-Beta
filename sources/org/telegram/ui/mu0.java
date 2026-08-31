package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mu0 extends org.telegram.ui.Components.a60 {
    public final nu0 d;

    public mu0(nu0 nu0Var) {
        this.d = nu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f39527s.V7 > 0) {
            sb.append(", ");
            sb.append(this.d.f39527s.U7 + 1);
            sb.append(" / ");
            sb.append(this.d.f39527s.V7);
        }
        sb.append(", ");
        sb.append(this.d.h);
        sb.append(" – ");
        sb.append(this.d.f39525n);
        return sb.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f39527s.V7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f39527s.U7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f39527s.V7 > 0 && (max = Math.max(0, Math.min(this.d.f39527s.V7 - 1, i10))) != this.d.f39527s.U7) {
            nu0 nu0Var = this.d;
            nu0Var.f39526r = nu0Var.f39527s.U7;
            this.d.f39527s.U7 = max;
            this.d.f39527s.R0();
            this.d.invalidate();
            int i11 = this.d.f39527s.U7;
            nu0 nu0Var2 = this.d;
            if (i11 != nu0Var2.f39526r) {
                nu0Var2.f39527s.p2(1);
            }
        }
    }
}
