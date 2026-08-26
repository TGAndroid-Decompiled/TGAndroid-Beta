package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

public final class SettingsActivity$$ExternalSyntheticLambda27 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final int f$0;

    public SettingsActivity$$ExternalSyntheticLambda27(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = 2 - i;
                if (i2 != this.f$0) {
                    SharedConfig.overrideDevicePerformanceClass(i2);
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                }
                break;
            default:
                int i3 = 2 - i;
                if (i3 != this.f$0) {
                    SharedConfig.overrideDevicePerformanceClass(i3);
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                }
                break;
        }
    }
}
