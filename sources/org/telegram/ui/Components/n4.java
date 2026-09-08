package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n4 extends vc0 {
    public final int[] f28633w0;

    public n4(Context context, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr) {
        super(context, f6Var);
        this.f28633w0 = iArr;
    }

    @Override
    public final CharSequence d(int i10) {
        int i11 = this.f28633w0[i10];
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
