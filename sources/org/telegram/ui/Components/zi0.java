package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zi0 implements md0, od0 {
    public final int f33247a;
    public final ej0 f33248b;

    public zi0(ej0 ej0Var, int i10) {
        this.f33247a = i10;
        this.f33248b = ej0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f33247a;
        ej0 ej0Var = this.f33248b;
        switch (i11) {
            case 0:
                if (ej0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (ej0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i2.o1.k(i10, ".");
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
    public void n(qd0 qd0Var, int i10) {
        ej0 ej0Var = this.f33248b;
        try {
            ej0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ej0Var.c(true);
    }
}
