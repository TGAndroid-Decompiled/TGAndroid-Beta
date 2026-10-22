package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wi0 implements kd0, md0 {
    public final int f32133a;
    public final bj0 f32134b;

    public wi0(bj0 bj0Var, int i10) {
        this.f32133a = i10;
        this.f32134b = bj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f32133a;
        bj0 bj0Var = this.f32134b;
        switch (i11) {
            case 0:
                if (bj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (bj0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i2.e.j(i10, ".");
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
    public void q(od0 od0Var, int i10) {
        bj0 bj0Var = this.f32134b;
        try {
            bj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        bj0Var.c(true);
    }
}
