package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;
public final class fy0 implements DialogInterface.OnClickListener {
    public final int f38375a;
    public final int f38376b;

    public fy0(int i9, int i10) {
        this.f38375a = i10;
        this.f38376b = i9;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        switch (this.f38375a) {
            case 0:
                int i10 = 2 - i9;
                if (i10 == this.f38376b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i10);
                    return;
                }
            default:
                int i11 = 2 - i9;
                if (i11 == this.f38376b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    return;
                }
        }
    }
}
