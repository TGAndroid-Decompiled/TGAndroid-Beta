package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i4 extends ed0 {
    public final int[] f24911w0;

    public i4(Context context, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr) {
        super(context, d6Var);
        this.f24911w0 = iArr;
    }

    @Override
    public final CharSequence d(int i10) {
        int i11 = this.f24911w0[i10];
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
