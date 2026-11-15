package org.telegram.ui.Components;

import java.util.Locale;
public final class fg0 implements eb0, gb0 {
    public final int f34599a;
    public final kg0 f34600b;

    public fg0(kg0 kg0Var, int i7) {
        this.f34599a = i7;
        this.f34600b = kg0Var;
    }

    @Override
    public String e(int i7) {
        int i10 = this.f34599a;
        kg0 kg0Var = this.f34600b;
        switch (i10) {
            case 0:
                if (kg0Var.P) {
                    return org.telegram.messenger.hd.a0("MilesShort", null, 2131748427, Integer.valueOf(i7));
                }
                return org.telegram.messenger.hd.a0("KMetersShort", null, 2131749061, Integer.valueOf(i7));
            default:
                if (kg0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.hd.a0("FootsShort", null, 2131750601, 250);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    Locale locale = Locale.US;
                    return i5.c.i(i7, ".");
                } else if (i7 == 1) {
                    return org.telegram.messenger.hd.a0("MetersShort", null, 2131748442, 50);
                } else {
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.hd.a0("MetersShort", null, 2131748442, Integer.valueOf(i7 * 100));
                }
        }
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        kg0 kg0Var = this.f34600b;
        try {
            kg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kg0Var.c(true);
    }
}
