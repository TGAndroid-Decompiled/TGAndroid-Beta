package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ku0 extends org.telegram.ui.Components.y50 {
    public final lu0 d;

    public ku0(lu0 lu0Var) {
        this.d = lu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f36142s.V7 > 0) {
            sb.append(", ");
            sb.append(this.d.f36142s.U7 + 1);
            sb.append(" / ");
            sb.append(this.d.f36142s.V7);
        }
        sb.append(", ");
        sb.append(this.d.h);
        sb.append(" – ");
        sb.append(this.d.f36140n);
        return sb.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f36142s.V7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f36142s.U7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f36142s.V7 > 0 && (max = Math.max(0, Math.min(this.d.f36142s.V7 - 1, i10))) != this.d.f36142s.U7) {
            lu0 lu0Var = this.d;
            lu0Var.f36141r = lu0Var.f36142s.U7;
            this.d.f36142s.U7 = max;
            this.d.f36142s.R0();
            this.d.invalidate();
            int i11 = this.d.f36142s.U7;
            lu0 lu0Var2 = this.d;
            if (i11 != lu0Var2.f36141r) {
                lu0Var2.f36142s.p2(1);
            }
        }
    }
}
