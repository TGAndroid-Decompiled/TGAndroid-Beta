package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e1 implements xb0 {
    public final int f27892a;
    public final int[] f27893b;

    public e1(int i9, int[] iArr) {
        this.f27892a = i9;
        this.f27893b = iArr;
    }

    @Override
    public final String g(int i9) {
        switch (this.f27892a) {
            case 0:
                int i10 = this.f27893b[i9];
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
            default:
                int i11 = this.f27893b[i9];
                if (i11 == 0) {
                    return LocaleController.getString(R.string.AutoDeleteNever);
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
}
