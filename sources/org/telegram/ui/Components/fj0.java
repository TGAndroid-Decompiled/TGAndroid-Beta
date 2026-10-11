package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fj0 implements qd0, sd0 {
    public final int f26475a;
    public final kj0 f26476b;

    public fj0(kj0 kj0Var, int i10) {
        this.f26475a = i10;
        this.f26476b = kj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f26475a;
        kj0 kj0Var = this.f26476b;
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
    public void q(ud0 ud0Var, int i10) {
        kj0 kj0Var = this.f26476b;
        try {
            kj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kj0Var.c(true);
    }
}
