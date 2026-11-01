package org.telegram.ui.Components;

import java.util.Locale;
public final class fh0 implements wb0, yb0 {
    public final int f26168a;
    public final kh0 f26169b;

    public fh0(kh0 kh0Var, int i10) {
        this.f26168a = i10;
        this.f26169b = kh0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f26168a;
        kh0 kh0Var = this.f26169b;
        switch (i11) {
            case 0:
                if (kh0Var.O) {
                    return org.telegram.messenger.dd.a0("MilesShort", null, 2131748442, Integer.valueOf(i10));
                }
                return org.telegram.messenger.dd.a0("KMetersShort", null, 2131749071, Integer.valueOf(i10));
            default:
                if (kh0Var.O) {
                    if (i10 == 1) {
                        return org.telegram.messenger.dd.a0("FootsShort", null, 2131750602, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i0.a.i(i10, ".");
                } else if (i10 == 1) {
                    return org.telegram.messenger.dd.a0("MetersShort", null, 2131748457, 50);
                } else {
                    if (i10 > 1) {
                        i10--;
                    }
                    return org.telegram.messenger.dd.a0("MetersShort", null, 2131748457, Integer.valueOf(i10 * 100));
                }
        }
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        kh0 kh0Var = this.f26169b;
        try {
            kh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kh0Var.c(true);
    }
}
