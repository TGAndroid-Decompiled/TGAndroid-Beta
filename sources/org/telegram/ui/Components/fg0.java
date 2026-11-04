package org.telegram.ui.Components;

import java.util.Locale;
public final class fg0 implements ya0, ab0 {
    public final int f33795a;
    public final kg0 f33796b;

    public fg0(kg0 kg0Var, int i3) {
        this.f33795a = i3;
        this.f33796b = kg0Var;
    }

    @Override
    public String e(int i3) {
        int i10 = this.f33795a;
        kg0 kg0Var = this.f33796b;
        switch (i10) {
            case 0:
                if (kg0Var.P) {
                    return org.telegram.messenger.bd.a0("MilesShort", null, 2131748435, Integer.valueOf(i3));
                }
                return org.telegram.messenger.bd.a0("KMetersShort", null, 2131749069, Integer.valueOf(i3));
            default:
                if (kg0Var.P) {
                    if (i3 == 1) {
                        return org.telegram.messenger.bd.a0("FootsShort", null, 2131750602, 250);
                    }
                    if (i3 > 1) {
                        i3--;
                    }
                    Locale locale = Locale.US;
                    return k2.p1.i(i3, ".");
                } else if (i3 == 1) {
                    return org.telegram.messenger.bd.a0("MetersShort", null, 2131748450, 50);
                } else {
                    if (i3 > 1) {
                        i3--;
                    }
                    return org.telegram.messenger.bd.a0("MetersShort", null, 2131748450, Integer.valueOf(i3 * 100));
                }
        }
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        kg0 kg0Var = this.f33796b;
        try {
            kg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kg0Var.c(true);
    }
}
