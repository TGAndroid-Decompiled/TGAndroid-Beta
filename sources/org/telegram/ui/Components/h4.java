package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h4 extends bc0 {
    public final int[] f28959s0;

    public h4(Context context, org.telegram.ui.ActionBar.b6 b6Var, int[] iArr) {
        super(context, b6Var);
        this.f28959s0 = iArr;
    }

    @Override
    public final CharSequence d(int i9) {
        int i10 = this.f28959s0[i9];
        if (i10 == 0) {
            return LocaleController.getString(R.string.MuteNever);
        }
        if (i10 < 60) {
            return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
        }
        if (i10 < 1440) {
            return LocaleController.formatPluralString("Hours", i10 / 60, new Object[0]);
        }
        if (i10 < 10080) {
            return LocaleController.formatPluralString("Days", i10 / 1440, new Object[0]);
        }
        if (i10 < 44640) {
            return LocaleController.formatPluralString("Weeks", i10 / 10080, new Object[0]);
        }
        if (i10 < 525600) {
            return LocaleController.formatPluralString("Months", i10 / 44640, new Object[0]);
        }
        return LocaleController.formatPluralString("Years", i10 / 525600, new Object[0]);
    }
}
