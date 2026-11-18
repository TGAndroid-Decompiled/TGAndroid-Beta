package org.telegram.ui.Components;

import java.util.Locale;
public final class pg0 implements ob0, qb0 {
    public final int f38432a;
    public final ug0 f38433b;

    public pg0(ug0 ug0Var, int i7) {
        this.f38432a = i7;
        this.f38433b = ug0Var;
    }

    @Override
    public String i(int i7) {
        int i10 = this.f38432a;
        ug0 ug0Var = this.f38433b;
        switch (i10) {
            case 0:
                if (ug0Var.P) {
                    return org.telegram.messenger.gd.a0("MilesShort", null, 2131748235, Integer.valueOf(i7));
                }
                return org.telegram.messenger.gd.a0("KMetersShort", null, 2131748869, Integer.valueOf(i7));
            default:
                if (ug0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.gd.a0("FootsShort", null, 2131750585, 250);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    Locale locale = Locale.US;
                    return i5.c.i(i7, ".");
                } else if (i7 == 1) {
                    return org.telegram.messenger.gd.a0("MetersShort", null, 2131748250, 50);
                } else {
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.gd.a0("MetersShort", null, 2131748250, Integer.valueOf(i7 * 100));
                }
        }
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        ug0 ug0Var = this.f38433b;
        try {
            ug0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ug0Var.c(true);
    }
}
