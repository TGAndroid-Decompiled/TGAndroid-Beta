package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kv0 extends org.telegram.ui.Components.v60 {
    public final lv0 d;

    public kv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        if (this.d.f37845s.Z7 > 0) {
            sb2.append(", ");
            sb2.append(this.d.f37845s.Y7 + 1);
            sb2.append(" / ");
            sb2.append(this.d.f37845s.Z7);
        }
        sb2.append(", ");
        sb2.append(this.d.h);
        sb2.append(" – ");
        sb2.append(this.d.f37843n);
        return sb2.toString();
    }

    @Override
    public final int i() {
        return Math.max(0, this.d.f37845s.Z7 - 1);
    }

    @Override
    public final int j() {
        return this.d.f37845s.Y7;
    }

    @Override
    public final void k(int i10) {
        int max;
        if (this.d.f37845s.Z7 > 0 && (max = Math.max(0, Math.min(this.d.f37845s.Z7 - 1, i10))) != this.d.f37845s.Y7) {
            lv0 lv0Var = this.d;
            lv0Var.f37844r = lv0Var.f37845s.Y7;
            this.d.f37845s.Y7 = max;
            this.d.f37845s.R0();
            this.d.invalidate();
            int i11 = this.d.f37845s.Y7;
            lv0 lv0Var2 = this.d;
            if (i11 != lv0Var2.f37844r) {
                lv0Var2.f37845s.p2(1);
            }
        }
    }
}
