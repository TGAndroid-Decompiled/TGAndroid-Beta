package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cu0 extends org.telegram.ui.Components.g50 {
    public final du0 d;

    public cu0(du0 du0Var) {
        this.d = du0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f37612s.U7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f37612s.T7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f37612s.U7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f37610n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f37612s.U7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f37612s.T7;
    }

    @Override
    public final void k(int i9) {
        int max;
        if (this.d.f37612s.U7 > 0 && (max = Math.max(0, Math.min(this.d.f37612s.U7 - 1, i9))) != this.d.f37612s.T7) {
            du0 du0Var = this.d;
            du0Var.f37611r = du0Var.f37612s.T7;
            this.d.f37612s.T7 = max;
            this.d.f37612s.R0();
            this.d.invalidate();
            int i10 = this.d.f37612s.T7;
            du0 du0Var2 = this.d;
            if (i10 != du0Var2.f37611r) {
                du0Var2.f37612s.p2(1);
            }
        }
    }
}
