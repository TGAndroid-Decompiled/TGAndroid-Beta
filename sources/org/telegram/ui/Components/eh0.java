package org.telegram.ui.Components;

import java.util.Locale;
public final class eh0 implements wb0, yb0 {
    public final int f25802a;
    public final jh0 f25803b;

    public eh0(jh0 jh0Var, int i10) {
        this.f25802a = i10;
        this.f25803b = jh0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f25802a;
        jh0 jh0Var = this.f25803b;
        switch (i11) {
            case 0:
                if (jh0Var.O) {
                    return org.telegram.messenger.cd.a0("MilesShort", null, 2131748442, Integer.valueOf(i10));
                }
                return org.telegram.messenger.cd.a0("KMetersShort", null, 2131749071, Integer.valueOf(i10));
            default:
                if (jh0Var.O) {
                    if (i10 == 1) {
                        return org.telegram.messenger.cd.a0("FootsShort", null, 2131750602, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i0.a.i(i10, ".");
                } else if (i10 == 1) {
                    return org.telegram.messenger.cd.a0("MetersShort", null, 2131748457, 50);
                } else {
                    if (i10 > 1) {
                        i10--;
                    }
                    return org.telegram.messenger.cd.a0("MetersShort", null, 2131748457, Integer.valueOf(i10 * 100));
                }
        }
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        jh0 jh0Var = this.f25803b;
        try {
            jh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        jh0Var.c(true);
    }
}
