package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p4 extends md0 {
    public final int[] f31438y0;

    public p4(Context context, org.telegram.ui.ActionBar.u6 u6Var, int[] iArr) {
        super(context, u6Var);
        this.f31438y0 = iArr;
    }

    @Override
    public final CharSequence d(int i10) {
        int i11 = this.f31438y0[i10];
        if (i11 == 0) {
            return LocaleController.getString(R.string.MuteNever);
        }
        if (i11 < 60) {
            return LocaleController.formatPluralString("Minutes", i11, new Object[0]);
        }
        if (i11 < 1440) {
            return LocaleController.formatPluralString("Hours", i11 / 60, new Object[0]);
        }
        if (i11 < 10080) {
            return LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]);
        }
        if (i11 < 44640) {
            return LocaleController.formatPluralString("Weeks", i11 / 10080, new Object[0]);
        }
        if (i11 < 525600) {
            return LocaleController.formatPluralString("Months", i11 / 44640, new Object[0]);
        }
        return LocaleController.formatPluralString("Years", i11 / 525600, new Object[0]);
    }
}
