package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class du0 extends org.telegram.ui.Components.l50 {
    public final eu0 d;

    public du0(eu0 eu0Var) {
        this.d = eu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f37851s.U7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f37851s.T7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f37851s.U7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f37849n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f37851s.U7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f37851s.T7;
    }

    @Override
    public final void k(int i10) {
        int iMax;
        if (this.d.f37851s.U7 > 0 && (iMax = Math.max(0, Math.min(this.d.f37851s.U7 - 1, i10))) != this.d.f37851s.T7) {
            eu0 eu0Var = this.d;
            eu0Var.f37850r = eu0Var.f37851s.T7;
            this.d.f37851s.T7 = iMax;
            this.d.f37851s.R0();
            this.d.invalidate();
            int i11 = this.d.f37851s.T7;
            eu0 eu0Var2 = this.d;
            if (i11 != eu0Var2.f37850r) {
                eu0Var2.f37851s.p2(1);
            }
        }
    }
}
