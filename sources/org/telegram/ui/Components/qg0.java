package org.telegram.ui.Components;

import java.util.Locale;
public final class qg0 implements mb0, ob0 {
    public final int f38871a;
    public final vg0 f38872b;

    public qg0(vg0 vg0Var, int i7) {
        this.f38871a = i7;
        this.f38872b = vg0Var;
    }

    @Override
    public String e(int i7) {
        int i10 = this.f38871a;
        vg0 vg0Var = this.f38872b;
        switch (i10) {
            case 0:
                if (vg0Var.P) {
                    return org.telegram.messenger.gd.a0("MilesShort", null, 2131748234, Integer.valueOf(i7));
                }
                return org.telegram.messenger.gd.a0("KMetersShort", null, 2131748868, Integer.valueOf(i7));
            default:
                if (vg0Var.P) {
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
    public void o(qb0 qb0Var, int i7) {
        vg0 vg0Var = this.f38872b;
        try {
            vg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        vg0Var.c(true);
    }
}
