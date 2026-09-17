package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;
public final class kz0 implements DialogInterface.OnClickListener {
    public final int f38155a;
    public final int f38156b;

    public kz0(int i10, int i11) {
        this.f38155a = i11;
        this.f38156b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38155a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 == this.f38156b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    return;
                }
            default:
                int i12 = 2 - i10;
                if (i12 == this.f38156b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i12);
                    return;
                }
        }
    }
}
