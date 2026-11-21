package org.telegram.ui.Components;

import java.util.Locale;
public final class rg0 implements pb0, rb0 {
    public final int f39216a;
    public final wg0 f39217b;

    public rg0(wg0 wg0Var, int i7) {
        this.f39216a = i7;
        this.f39217b = wg0Var;
    }

    @Override
    public String i(int i7) {
        int i10 = this.f39216a;
        wg0 wg0Var = this.f39217b;
        switch (i10) {
            case 0:
                if (wg0Var.P) {
                    return org.telegram.messenger.gd.a0("MilesShort", null, 2131748234, Integer.valueOf(i7));
                }
                return org.telegram.messenger.gd.a0("KMetersShort", null, 2131748868, Integer.valueOf(i7));
            default:
                if (wg0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.gd.a0("FootsShort", null, 2131750584, 250);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    Locale locale = Locale.US;
                    return i5.c.i(i7, ".");
                } else if (i7 == 1) {
                    return org.telegram.messenger.gd.a0("MetersShort", null, 2131748249, 50);
                } else {
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.gd.a0("MetersShort", null, 2131748249, Integer.valueOf(i7 * 100));
                }
        }
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        wg0 wg0Var = this.f39217b;
        try {
            wg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        wg0Var.c(true);
    }
}
