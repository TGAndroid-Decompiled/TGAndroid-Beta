package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hv0 extends org.telegram.ui.Components.c70 {
    public final iv0 d;

    public hv0(iv0 iv0Var) {
        this.d = iv0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f39016s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f39016s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f39016s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f39014n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f39016s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f39016s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f39016s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f39016s.Z7 - 1, i10))) != this.d.f39016s.Y7) {
            iv0 iv0Var = this.d;
            iv0Var.f39015r = iv0Var.f39016s.Y7;
            this.d.f39016s.Y7 = max;
            this.d.f39016s.R0();
            this.d.invalidate();
            int i11 = this.d.f39016s.Y7;
            iv0 iv0Var2 = this.d;
            if (i11 != iv0Var2.f39015r) {
                iv0Var2.f39016s.p2(1);
            }
        }
    }
}
