package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ii0 implements uc0, wc0 {
    public final int f27808a;
    public final ni0 f27809b;

    public ii0(ni0 ni0Var, int i10) {
        this.f27808a = i10;
        this.f27809b = ni0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f27808a;
        ni0 ni0Var = this.f27809b;
        switch (i11) {
            case 0:
                if (ni0Var.L) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (ni0Var.L) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return l.d.j(i10, ".");
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
    public void q(yc0 yc0Var, int i10) {
        ni0 ni0Var = this.f27809b;
        try {
            ni0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ni0Var.c(true);
    }
}
