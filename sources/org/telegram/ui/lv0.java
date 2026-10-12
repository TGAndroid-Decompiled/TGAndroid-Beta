package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lv0 extends org.telegram.ui.Components.v60 {
    public final mv0 d;

    public lv0(mv0 mv0Var) {
        this.d = mv0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f38362s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f38362s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f38362s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f38360n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f38362s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f38362s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f38362s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f38362s.Z7 - 1, i10))) != this.d.f38362s.Y7) {
            mv0 mv0Var = this.d;
            mv0Var.f38361r = mv0Var.f38362s.Y7;
            this.d.f38362s.Y7 = max;
            this.d.f38362s.R0();
            this.d.invalidate();
            int i11 = this.d.f38362s.Y7;
            mv0 mv0Var2 = this.d;
            if (i11 != mv0Var2.f38361r) {
                mv0Var2.f38362s.p2(1);
            }
        }
    }
}
