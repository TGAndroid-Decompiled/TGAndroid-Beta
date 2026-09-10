package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ji0 implements zc0, bd0 {
    public final int f24407a;
    public final oi0 f24408b;

    public ji0(oi0 oi0Var, int i10) {
        this.f24407a = i10;
        this.f24408b = oi0Var;
    }

    @Override
    public String k(int i10) {
        int i11 = this.f24407a;
        oi0 oi0Var = this.f24408b;
        switch (i11) {
            case 0:
                if (oi0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (oi0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return hc.b.j(i10, ".");
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
    public void q(dd0 dd0Var, int i10) {
        oi0 oi0Var = this.f24408b;
        try {
            oi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        oi0Var.c(true);
    }
}
