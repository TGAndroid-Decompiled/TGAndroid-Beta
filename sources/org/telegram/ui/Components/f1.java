package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f1 implements jd0 {
    public final int f27976a;
    public final int[] f27977b;

    public f1(int i10, int[] iArr) {
        this.f27976a = i10;
        this.f27977b = iArr;
    }

    @Override
    public final String f(int i10) {
        switch (this.f27976a) {
            case 0:
                int i11 = this.f27977b[i10];
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
            default:
                int i12 = this.f27977b[i10];
                if (i12 == 0) {
                    return LocaleController.getString(R.string.AutoDeleteNever);
                }
                if (i12 < 10080) {
                    return LocaleController.formatPluralString("Days", i12 / 1440, new Object[0]);
                }
                if (i12 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i12 / 10080, new Object[0]);
                }
                if (i12 < 525600) {
                    return LocaleController.formatPluralString("Months", i12 / 44640, new Object[0]);
                }
                return LocaleController.formatPluralString("Years", i12 / 525600, new Object[0]);
        }
    }
}
