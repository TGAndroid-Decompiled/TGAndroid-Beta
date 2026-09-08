package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dv0 extends org.telegram.ui.Components.x50 {
    public final ev0 d;

    public dv0(ev0 ev0Var) {
        this.d = ev0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f36220s.Y7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f36220s.X7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f36220s.Y7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f36218n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f36220s.Y7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f36220s.X7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f36220s.Y7 > 0 && (max = Math.max(0, Math.min(this.d.f36220s.Y7 - 1, i10))) != this.d.f36220s.X7) {
            ev0 ev0Var = this.d;
            ev0Var.f36219r = ev0Var.f36220s.X7;
            this.d.f36220s.X7 = max;
            this.d.f36220s.R0();
            this.d.invalidate();
            int i11 = this.d.f36220s.X7;
            ev0 ev0Var2 = this.d;
            if (i11 != ev0Var2.f36219r) {
                ev0Var2.f36220s.p2(1);
            }
        }
    }
}
