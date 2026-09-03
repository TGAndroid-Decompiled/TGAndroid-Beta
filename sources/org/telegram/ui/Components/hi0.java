package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hi0 implements tc0, vc0 {
    public final int f25426a;
    public final mi0 f25427b;

    public hi0(mi0 mi0Var, int i10) {
        this.f25426a = i10;
        this.f25427b = mi0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f25426a;
        mi0 mi0Var = this.f25427b;
        switch (i11) {
            case 0:
                if (mi0Var.L) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (mi0Var.L) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return kf.k0.j(i10, ".");
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
    public void q(xc0 xc0Var, int i10) {
        mi0 mi0Var = this.f25427b;
        try {
            mi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        mi0Var.c(true);
    }
}
