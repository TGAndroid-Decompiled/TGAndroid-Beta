package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vh0 implements mc0, oc0 {
    public final int f33562a;
    public final ai0 f33563b;

    public vh0(ai0 ai0Var, int i10) {
        this.f33562a = i10;
        this.f33563b = ai0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f33562a;
        ai0 ai0Var = this.f33563b;
        switch (i11) {
            case 0:
                if (ai0Var.K) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (ai0Var.K) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return j7.l1.k(i10, ".");
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
    public void q(qc0 qc0Var, int i10) {
        ai0 ai0Var = this.f33563b;
        try {
            ai0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ai0Var.c(true);
    }
}
