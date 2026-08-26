package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class AlertsCreator$$ExternalSyntheticLambda82 implements NumberPicker.Formatter {
    public final int $r8$classId;
    public final int[] f$0;

    public AlertsCreator$$ExternalSyntheticLambda82(int i, int[] iArr) {
        this.$r8$classId = i;
        this.f$0 = iArr;
    }

    @Override
    public final String format(int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = this.f$0[i];
                if (i2 == 0) {
                    return LocaleController.getString(R.string.AutoDeleteNever);
                }
                if (i2 < 10080) {
                    return LocaleController.formatPluralString("Days", i2 / 1440, new Object[0]);
                }
                if (i2 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i2 / 10080, new Object[0]);
                }
                return i2 < 525600 ? LocaleController.formatPluralString("Months", i2 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i2 / 525600, new Object[0]);
            default:
                int i3 = this.f$0[i];
                if (i3 == 0) {
                    return LocaleController.getString(R.string.MuteNever);
                }
                if (i3 < 60) {
                    return LocaleController.formatPluralString("Minutes", i3, new Object[0]);
                }
                if (i3 < 1440) {
                    return LocaleController.formatPluralString("Hours", i3 / 60, new Object[0]);
                }
                if (i3 < 10080) {
                    return LocaleController.formatPluralString("Days", i3 / 1440, new Object[0]);
                }
                if (i3 < 44640) {
                    return LocaleController.formatPluralString("Weeks", i3 / 10080, new Object[0]);
                }
                return i3 < 525600 ? LocaleController.formatPluralString("Months", i3 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i3 / 525600, new Object[0]);
        }
    }
}
