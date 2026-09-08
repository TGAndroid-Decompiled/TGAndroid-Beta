package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 implements rc0, tc0 {
    public final int f33185a;
    public final ei0 f33186b;

    public zh0(ei0 ei0Var, int i10) {
        this.f33185a = i10;
        this.f33186b = ei0Var;
    }

    @Override
    public String f(int i10) {
        int i11 = this.f33185a;
        ei0 ei0Var = this.f33186b;
        switch (i11) {
            case 0:
                if (ei0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (ei0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return i2.g.i(i10, ".");
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
    public void s(vc0 vc0Var, int i10) {
        ei0 ei0Var = this.f33186b;
        try {
            ei0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ei0Var.c(true);
    }
}
