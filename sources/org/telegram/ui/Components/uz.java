package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class uz implements Runnable {
    public final int f31470a;
    public final yz f31471b;
    public final int f31472c;
    public final int d;

    public uz(yz yzVar, int i10, int i11, int i12) {
        this.f31470a = i12;
        this.f31471b = yzVar;
        this.f31472c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f31470a) {
            case 0:
                yz yzVar = this.f31471b;
                int i11 = this.f31472c;
                int i12 = this.d;
                if (yzVar.W != i11 || yzVar.X != i12) {
                    yzVar.W = i11;
                    yzVar.X = i12;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i13 = 1920;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            i13 = 720;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            i13 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = yzVar.W) > 1280 || yzVar.X > 1280)) {
                        yzVar.W = i10 / 2;
                        yzVar.X /= 2;
                    }
                    int i14 = yzVar.W;
                    if (i14 > i13 || yzVar.X > i13) {
                        int i15 = yzVar.X;
                        if (i14 > i15) {
                            yzVar.X = (int) (i15 / (i13 / i14));
                            yzVar.W = i13;
                        } else {
                            yzVar.W = (int) (i14 / (i13 / i15));
                            yzVar.X = i13;
                        }
                    }
                    yzVar.Z = false;
                    yzVar.g();
                    yzVar.f33303d0.run();
                    return;
                }
                return;
            case 1:
                yz yzVar2 = this.f31471b;
                int i16 = this.f31472c;
                int i17 = this.d;
                yzVar2.f33306n = i16;
                yzVar2.f33307r = i17;
                return;
            default:
                yz yzVar3 = this.f31471b;
                int i18 = this.f31472c;
                int i19 = this.d;
                qa qaVar = yzVar3.I;
                qaVar.f29986l = i18;
                qaVar.f29987m = i19;
                return;
        }
    }
}
