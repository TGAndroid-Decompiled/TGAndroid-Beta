package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class uz implements Runnable {
    public final int f28955a;
    public final yz f28956b;
    public final int f28957c;
    public final int d;

    public uz(yz yzVar, int i10, int i11, int i12) {
        this.f28955a = i12;
        this.f28956b = yzVar;
        this.f28957c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28955a) {
            case 0:
                yz yzVar = this.f28956b;
                int i11 = this.f28957c;
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
                    yzVar.f30838d0.run();
                    return;
                }
                return;
            case 1:
                yz yzVar2 = this.f28956b;
                int i16 = this.f28957c;
                int i17 = this.d;
                yzVar2.f30840n = i16;
                yzVar2.f30841r = i17;
                return;
            default:
                yz yzVar3 = this.f28956b;
                int i18 = this.f28957c;
                int i19 = this.d;
                qa qaVar = yzVar3.I;
                qaVar.f27616l = i18;
                qaVar.f27617m = i19;
                return;
        }
    }
}
