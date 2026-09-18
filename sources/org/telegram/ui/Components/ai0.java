package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ai0 implements qc0, sc0 {
    public final int f22419a;
    public final fi0 f22420b;

    public ai0(fi0 fi0Var, int i10) {
        this.f22419a = i10;
        this.f22420b = fi0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f22419a;
        fi0 fi0Var = this.f22420b;
        switch (i11) {
            case 0:
                if (fi0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (fi0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return hg.k0.i(i10, ".");
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
    public void q(uc0 uc0Var, int i10) {
        fi0 fi0Var = this.f22420b;
        try {
            fi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        fi0Var.c(true);
    }
}
