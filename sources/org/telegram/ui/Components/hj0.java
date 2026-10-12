package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hj0 implements ud0, wd0 {
    public final int f26786a;
    public final mj0 f26787b;

    public hj0(mj0 mj0Var, int i10) {
        this.f26786a = i10;
        this.f26787b = mj0Var;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f26786a;
        mj0 mj0Var = this.f26787b;
        switch (i11) {
            case 0:
                if (mj0Var.O) {
                    return LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10));
                }
                return LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (mj0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("FootsShort", R.string.FootsShort, 250);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    Locale locale = Locale.US;
                    return hg.c.i(i10, ".");
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
    public void q(yd0 yd0Var, int i10) {
        mj0 mj0Var = this.f26787b;
        try {
            mj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        mj0Var.c(true);
    }
}
