package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nu0 extends org.telegram.ui.Components.t60 {
    public final ou0 d;

    public nu0(ou0 ou0Var) {
        this.d = ou0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f40278s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f40278s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f40278s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f40276n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f40278s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f40278s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f40278s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f40278s.Z7 - 1, i10))) != this.d.f40278s.Y7) {
            ou0 ou0Var = this.d;
            ou0Var.f40277r = ou0Var.f40278s.Y7;
            this.d.f40278s.Y7 = max;
            this.d.f40278s.T0();
            this.d.invalidate();
            int i11 = this.d.f40278s.Y7;
            ou0 ou0Var2 = this.d;
            if (i11 != ou0Var2.f40277r) {
                ou0Var2.f40278s.r2(1);
            }
        }
    }
}
