package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ni0 implements dd0, fd0 {
    public final int f26718a;
    public final si0 f26719b;

    public ni0(si0 si0Var, int i10) {
        this.f26718a = i10;
        this.f26719b = si0Var;
    }

    @Override
    public String j(int i10) {
        int i11 = this.f26718a;
        si0 si0Var = this.f26719b;
        switch (i11) {
            case 0:
                if (si0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (si0Var.O) {
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
    public void q(hd0 hd0Var, int i10) {
        si0 si0Var = this.f26719b;
        try {
            si0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        si0Var.c(true);
    }
}
