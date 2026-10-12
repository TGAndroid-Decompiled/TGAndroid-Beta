package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class aj0 implements qd0, sd0 {
    public final int f23568a;
    public final fj0 f23569b;

    public aj0(fj0 fj0Var, int i10) {
        this.f23568a = i10;
        this.f23569b = fj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f23568a;
        fj0 fj0Var = this.f23569b;
        switch (i11) {
            case 0:
                if (fj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (fj0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i2.d.i(i10, ".");
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
    public void r(ud0 ud0Var, int i10) {
        fj0 fj0Var = this.f23569b;
        try {
            fj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        fj0Var.c(true);
    }
}
