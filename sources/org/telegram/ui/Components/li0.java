package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class li0 implements bd0, dd0 {
    public final int f26085a;
    public final qi0 f26086b;

    public li0(qi0 qi0Var, int i10) {
        this.f26085a = i10;
        this.f26086b = qi0Var;
    }

    @Override
    public String j(int i10) {
        int i11 = this.f26085a;
        qi0 qi0Var = this.f26086b;
        switch (i11) {
            case 0:
                if (qi0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (qi0Var.O) {
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
    public void q(fd0 fd0Var, int i10) {
        qi0 qi0Var = this.f26086b;
        try {
            qi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        qi0Var.c(true);
    }
}
