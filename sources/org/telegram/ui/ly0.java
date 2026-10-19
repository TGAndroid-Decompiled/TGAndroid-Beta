package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;
public final class ly0 implements DialogInterface.OnClickListener {
    public final int f39046a;
    public final int f39047b;

    public ly0(int i10, int i11) {
        this.f39046a = i11;
        this.f39047b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39046a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 == this.f39047b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    return;
                }
            default:
                int i12 = 2 - i10;
                if (i12 == this.f39047b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i12);
                    return;
                }
        }
    }
}
