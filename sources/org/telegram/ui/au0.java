package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class au0 extends org.telegram.ui.Components.t50 {
    public final bu0 d;

    public au0(bu0 bu0Var) {
        this.d = bu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f36922s.U7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f36922s.T7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f36922s.U7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f36920n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f36922s.U7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f36922s.T7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f36922s.U7 > 0 && (max = Math.max(0, Math.min(this.d.f36922s.U7 - 1, i10))) != this.d.f36922s.T7) {
            bu0 bu0Var = this.d;
            bu0Var.f36921r = bu0Var.f36922s.T7;
            this.d.f36922s.T7 = max;
            this.d.f36922s.R0();
            this.d.invalidate();
            int i11 = this.d.f36922s.T7;
            bu0 bu0Var2 = this.d;
            if (i11 != bu0Var2.f36921r) {
                bu0Var2.f36922s.p2(1);
            }
        }
    }
}
