package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gi0 implements sc0, uc0 {
    public final int f25144a;
    public final li0 f25145b;

    public gi0(li0 li0Var, int i10) {
        this.f25144a = i10;
        this.f25145b = li0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f25144a;
        li0 li0Var = this.f25145b;
        switch (i11) {
            case 0:
                if (li0Var.L) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (li0Var.L) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return kh.a2.j(i10, ".");
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
    public void q(wc0 wc0Var, int i10) {
        li0 li0Var = this.f25145b;
        try {
            li0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        li0Var.c(true);
    }
}
