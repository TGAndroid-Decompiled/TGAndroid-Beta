package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mu0 extends org.telegram.ui.Components.s60 {
    public final nu0 d;

    public mu0(nu0 nu0Var) {
        this.d = nu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f39585s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f39585s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f39585s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f39583n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f39585s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f39585s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f39585s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f39585s.Z7 - 1, i10))) != this.d.f39585s.Y7) {
            nu0 nu0Var = this.d;
            nu0Var.f39584r = nu0Var.f39585s.Y7;
            this.d.f39585s.Y7 = max;
            this.d.f39585s.S0();
            this.d.invalidate();
            int i11 = this.d.f39585s.Y7;
            nu0 nu0Var2 = this.d;
            if (i11 != nu0Var2.f39584r) {
                nu0Var2.f39585s.p2(1);
            }
        }
    }
}
