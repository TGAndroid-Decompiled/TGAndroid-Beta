package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ej0 implements qd0, sd0 {
    public final int f26097a;
    public final jj0 f26098b;

    public ej0(jj0 jj0Var, int i10) {
        this.f26097a = i10;
        this.f26098b = jj0Var;
    }

    @Override
    public String i(int i10) {
        int i11 = this.f26097a;
        jj0 jj0Var = this.f26098b;
        switch (i11) {
            case 0:
                if (jj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (jj0Var.O) {
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
    public void r(ud0 ud0Var, int i10) {
        jj0 jj0Var = this.f26098b;
        try {
            jj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        jj0Var.c(true);
    }
}
