package org.telegram.ui.Components;

import java.util.Locale;
public final class cg0 implements db0, fb0 {
    public final int f32586a;
    public final hg0 f32587b;

    public cg0(hg0 hg0Var, int i7) {
        this.f32586a = i7;
        this.f32587b = hg0Var;
    }

    @Override
    public String h(int i7) {
        int i10 = this.f32586a;
        hg0 hg0Var = this.f32587b;
        switch (i10) {
            case 0:
                if (hg0Var.O) {
                    return org.telegram.messenger.id.a0("MilesShort", null, 2131748428, Integer.valueOf(i7));
                }
                return org.telegram.messenger.id.a0("KMetersShort", null, 2131749062, Integer.valueOf(i7));
            default:
                if (hg0Var.O) {
                    if (i7 == 1) {
                        return org.telegram.messenger.id.a0("FootsShort", null, 2131750602, 250);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    Locale locale = Locale.US;
                    return jg.g.j(i7, ".");
                } else if (i7 == 1) {
                    return org.telegram.messenger.id.a0("MetersShort", null, 2131748443, 50);
                } else {
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.id.a0("MetersShort", null, 2131748443, Integer.valueOf(i7 * 100));
                }
        }
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        hg0 hg0Var = this.f32587b;
        try {
            hg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hg0Var.c(true);
    }
}
