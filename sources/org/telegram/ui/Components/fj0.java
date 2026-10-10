package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fj0 implements rd0, td0 {
    public final int f26426a;
    public final kj0 f26427b;

    public fj0(kj0 kj0Var, int i10) {
        this.f26426a = i10;
        this.f26427b = kj0Var;
    }

    @Override
    public String i(int i10) {
        int i11 = this.f26426a;
        kj0 kj0Var = this.f26427b;
        switch (i11) {
            case 0:
                if (kj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (kj0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return hg.c.h(i10, ".");
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
    public void r(vd0 vd0Var, int i10) {
        kj0 kj0Var = this.f26427b;
        try {
            kj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kj0Var.c(true);
    }
}
