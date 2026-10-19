package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vi0 implements kd0, md0 {
    public final int f31311a;
    public final aj0 f31312b;

    public vi0(aj0 aj0Var, int i10) {
        this.f31311a = i10;
        this.f31312b = aj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f31311a;
        aj0 aj0Var = this.f31312b;
        switch (i11) {
            case 0:
                if (aj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (aj0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i2.e.j(i10, ".");
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
    public void q(od0 od0Var, int i10) {
        aj0 aj0Var = this.f31312b;
        try {
            aj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        aj0Var.c(true);
    }
}
