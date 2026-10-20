package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ku0 extends org.telegram.ui.Components.s60 {
    public final lu0 d;

    public ku0(lu0 lu0Var) {
        this.d = lu0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f39030s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f39030s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f39030s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f39028n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f39030s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f39030s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f39030s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f39030s.Z7 - 1, i10))) != this.d.f39030s.Y7) {
            lu0 lu0Var = this.d;
            lu0Var.f39029r = lu0Var.f39030s.Y7;
            this.d.f39030s.Y7 = max;
            this.d.f39030s.T0();
            this.d.invalidate();
            int i11 = this.d.f39030s.Y7;
            lu0 lu0Var2 = this.d;
            if (i11 != lu0Var2.f39029r) {
                lu0Var2.f39030s.r2(1);
            }
        }
    }
}
