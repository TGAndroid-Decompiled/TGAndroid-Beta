package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g4 extends qc0 {
    public final int[] f28744s0;

    public g4(Context context, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr) {
        super(context, c6Var);
        this.f28744s0 = iArr;
    }

    @Override
    public final CharSequence d(int i10) {
        int i11 = this.f28744s0[i10];
        if (i11 == 0) {
            return LocaleController.getString(R.string.AutoDeleteNever);
        }
        if (i11 < 10080) {
            return LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]);
        }
        if (i11 < 44640) {
            return LocaleController.formatPluralString("Weeks", i11 / 1440, new Object[0]);
        }
        if (i11 < 525600) {
            return LocaleController.formatPluralString("Months", i11 / 10080, new Object[0]);
        }
        return LocaleController.formatPluralString("Years", ((i11 * 5) / 31) * 1440, new Object[0]);
    }
}
