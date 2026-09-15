package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 implements qc0, sc0 {
    public final int f30596a;
    public final ei0 f30597b;

    public zh0(ei0 ei0Var, int i10) {
        this.f30596a = i10;
        this.f30597b = ei0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f30596a;
        ei0 ei0Var = this.f30597b;
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
        ei0 ei0Var = this.f30597b;
        try {
            ei0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ei0Var.c(true);
    }
}
