package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lh0 implements xb0, zb0 {
    public final int f30453a;
    public final qh0 f30454b;

    public lh0(qh0 qh0Var, int i9) {
        this.f30453a = i9;
        this.f30454b = qh0Var;
    }

    @Override
    public String g(int i9) {
        int i10 = this.f30453a;
        qh0 qh0Var = this.f30454b;
        switch (i10) {
            case 0:
                if (qh0Var.K) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i9));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i9));
            default:
                if (qh0Var.K) {
                    if (i9 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i9 > 1) {
                        i9--;
                    }
                    Locale locale = Locale.US;
                    return j3.r0.l(i9, ".");
                } else if (i9 == 1) {
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, 50);
                } else {
                    if (i9 > 1) {
                        i9--;
                    }
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, Integer.valueOf(i9 * 100));
                }
        }
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        qh0 qh0Var = this.f30454b;
        try {
            qh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        qh0Var.c(true);
    }
}
