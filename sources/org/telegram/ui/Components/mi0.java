package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mi0 implements bd0, dd0 {
    public final int f26453a;
    public final ri0 f26454b;

    public mi0(ri0 ri0Var, int i10) {
        this.f26453a = i10;
        this.f26454b = ri0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f26453a;
        ri0 ri0Var = this.f26454b;
        switch (i11) {
            case 0:
                if (ri0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (ri0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return hg.k0.h(i10, ".");
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
        ri0 ri0Var = this.f26454b;
        try {
            ri0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ri0Var.c(true);
    }
}
