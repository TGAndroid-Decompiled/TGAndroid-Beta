package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;

public final class fy0 implements DialogInterface.OnClickListener {

    public final int f38236a;

    public final int f38237b;

    public fy0(int i10, int i11) {
        this.f38236a = i11;
        this.f38237b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38236a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 != this.f38237b) {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                }
                break;
            default:
                int i12 = 2 - i10;
                if (i12 != this.f38237b) {
                    SharedConfig.overrideDevicePerformanceClass(i12);
                } else {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                }
                break;
        }
    }
}
