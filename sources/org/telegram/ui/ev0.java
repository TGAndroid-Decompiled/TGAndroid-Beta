package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ev0 extends org.telegram.ui.Components.g60 {
    public final fv0 d;

    public ev0(fv0 fv0Var) {
        this.d = fv0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f33625s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f33625s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f33625s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f33623n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f33625s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f33625s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f33625s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f33625s.Z7 - 1, i10))) != this.d.f33625s.Y7) {
            fv0 fv0Var = this.d;
            fv0Var.f33624r = fv0Var.f33625s.Y7;
            this.d.f33625s.Y7 = max;
            this.d.f33625s.R0();
            this.d.invalidate();
            int i11 = this.d.f33625s.Y7;
            fv0 fv0Var2 = this.d;
            if (i11 != fv0Var2.f33624r) {
                fv0Var2.f33625s.o2(1);
            }
        }
    }
}
