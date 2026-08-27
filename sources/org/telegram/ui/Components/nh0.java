package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class nh0 implements bc0, dc0 {

    public final int f30973a;

    public final sh0 f30974b;

    public nh0(sh0 sh0Var, int i10) {
        this.f30973a = i10;
        this.f30974b = sh0Var;
    }

    @Override
    public String g(int i10) {
        int i11 = this.f30973a;
        sh0 sh0Var = this.f30974b;
        switch (i11) {
            case 0:
                return sh0Var.K ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!sh0Var.K) {
                    if (i10 == 1) {
                        return LocaleController.formatString("MetersShort", R.string.MetersShort, 50);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, Integer.valueOf(i10 * 100));
                }
                if (i10 == 1) {
                    return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                }
                if (i10 > 1) {
                    i10--;
                }
                Locale locale = Locale.US;
                return i0.a.k(i10, ".");
        }
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        sh0 sh0Var = this.f30974b;
        try {
            sh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        sh0Var.c(true);
    }
}
