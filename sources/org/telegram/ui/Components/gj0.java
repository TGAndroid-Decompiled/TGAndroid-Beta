package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gj0 implements rd0, td0 {
    public final int f26722a;
    public final lj0 f26723b;

    public gj0(lj0 lj0Var, int i10) {
        this.f26722a = i10;
        this.f26723b = lj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f26722a;
        lj0 lj0Var = this.f26723b;
        switch (i11) {
            case 0:
                if (lj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (lj0Var.O) {
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
    public void q(vd0 vd0Var, int i10) {
        lj0 lj0Var = this.f26723b;
        try {
            lj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        lj0Var.c(true);
    }
}
