package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yi0 implements id0, kd0 {
    public final int f35067a;
    public final dj0 f35068b;

    public yi0(dj0 dj0Var, int i10) {
        this.f35067a = i10;
        this.f35068b = dj0Var;
    }

    @Override
    public String f(int i10) {
        int i11 = this.f35067a;
        dj0 dj0Var = this.f35068b;
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
                    return ic.a.i(i10, ".");
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
    public void q(md0 md0Var, int i10) {
        dj0 dj0Var = this.f35068b;
        try {
            dj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        dj0Var.c(true);
    }
}
