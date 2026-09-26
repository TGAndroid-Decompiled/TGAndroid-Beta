package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ki0 implements ad0, cd0 {
    public final int f25793a;
    public final pi0 f25794b;

    public ki0(pi0 pi0Var, int i10) {
        this.f25793a = i10;
        this.f25794b = pi0Var;
    }

    @Override
    public String j(int i10) {
        int i11 = this.f25793a;
        pi0 pi0Var = this.f25794b;
        switch (i11) {
            case 0:
                if (pi0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (pi0Var.O) {
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
    public void q(ed0 ed0Var, int i10) {
        pi0 pi0Var = this.f25794b;
        try {
            pi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        pi0Var.c(true);
    }
}
