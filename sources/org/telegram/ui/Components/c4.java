package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c4 extends bc0 {
    public final int[] f27359s0;

    public c4(Context context, org.telegram.ui.ActionBar.b6 b6Var, int[] iArr) {
        super(context, b6Var);
        this.f27359s0 = iArr;
    }

    @Override
    public final CharSequence d(int i9) {
        int i10 = this.f27359s0[i9];
        if (i10 == 0) {
            return LocaleController.getString(R.string.AutoDeleteNever);
        }
        if (i10 < 10080) {
            return LocaleController.formatPluralString("Days", i10 / 1440, new Object[0]);
        }
        if (i10 < 44640) {
            return LocaleController.formatPluralString("Weeks", i10 / 1440, new Object[0]);
        }
        if (i10 < 525600) {
            return LocaleController.formatPluralString("Months", i10 / 10080, new Object[0]);
        }
        return LocaleController.formatPluralString("Years", ((i10 * 5) / 31) * 1440, new Object[0]);
    }
}
