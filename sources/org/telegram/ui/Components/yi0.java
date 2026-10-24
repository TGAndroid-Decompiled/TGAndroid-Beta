package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yi0 implements kd0, md0 {
    public final int f32937a;
    public final dj0 f32938b;

    public yi0(dj0 dj0Var, int i10) {
        this.f32937a = i10;
        this.f32938b = dj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f32937a;
        dj0 dj0Var = this.f32938b;
        switch (i11) {
            case 0:
                if (dj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (dj0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i2.o1.k(i10, ".");
                } else if (i10 == 1) {
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, 50);
                } else {
                    if (i10 > 1) {
                        i10--;
                    }
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, Integer.valueOf(i10 * 100));
                }
        }
    }

    @Override
    public void n(od0 od0Var, int i10) {
        dj0 dj0Var = this.f32938b;
        try {
            dj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        dj0Var.c(true);
    }
}
