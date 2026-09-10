package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fv0 extends org.telegram.ui.Components.g60 {
    public final gv0 d;

    public fv0(gv0 gv0Var) {
        this.d = gv0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f33197s.Y7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f33197s.X7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f33197s.Y7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f33195n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f33197s.Y7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f33197s.X7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f33197s.Y7 > 0 && (max = Math.max(0, Math.min(this.d.f33197s.Y7 - 1, i10))) != this.d.f33197s.X7) {
            gv0 gv0Var = this.d;
            gv0Var.f33196r = gv0Var.f33197s.X7;
            this.d.f33197s.X7 = max;
            this.d.f33197s.R0();
            this.d.invalidate();
            int i11 = this.d.f33197s.X7;
            gv0 gv0Var2 = this.d;
            if (i11 != gv0Var2.f33196r) {
                gv0Var2.f33197s.p2(1);
            }
        }
    }
}
