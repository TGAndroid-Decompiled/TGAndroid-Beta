package org.telegram.ui.Components;

import java.util.Locale;
public final class dg0 implements eb0, gb0 {
    public final int f32977a;
    public final ig0 f32978b;

    public dg0(ig0 ig0Var, int i7) {
        this.f32977a = i7;
        this.f32978b = ig0Var;
    }

    @Override
    public String h(int i7) {
        int i10 = this.f32977a;
        ig0 ig0Var = this.f32978b;
        switch (i10) {
            case 0:
                if (ig0Var.O) {
                    return org.telegram.messenger.id.a0("MilesShort", null, 2131748427, Integer.valueOf(i7));
                }
                return org.telegram.messenger.id.a0("KMetersShort", null, 2131749061, Integer.valueOf(i7));
            default:
                if (ig0Var.O) {
                    if (i7 == 1) {
                        return org.telegram.messenger.id.a0("FootsShort", null, 2131750601, 250);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    Locale locale = Locale.US;
                    return jg.g.j(i7, ".");
                } else if (i7 == 1) {
                    return org.telegram.messenger.id.a0("MetersShort", null, 2131748442, 50);
                } else {
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.id.a0("MetersShort", null, 2131748442, Integer.valueOf(i7 * 100));
                }
        }
    }

    @Override
    public void n(ib0 ib0Var, int i7) {
        ig0 ig0Var = this.f32978b;
        try {
            ig0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ig0Var.c(true);
    }
}
