package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class rz implements Runnable {
    public final int f28612a;
    public final vz f28613b;
    public final int f28614c;
    public final int d;

    public rz(vz vzVar, int i10, int i11, int i12) {
        this.f28612a = i12;
        this.f28613b = vzVar;
        this.f28614c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28612a) {
            case 0:
                vz vzVar = this.f28613b;
                int i11 = this.f28614c;
                int i12 = this.d;
                if (vzVar.T != i11 || vzVar.U != i12) {
                    vzVar.T = i11;
                    vzVar.U = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = vzVar.T) > 1280 || vzVar.U > 1280)) {
                        vzVar.T = i10 / 2;
                        vzVar.U /= 2;
                    }
                    int i14 = vzVar.T;
                    if (i14 > i13 || vzVar.U > i13) {
                        int i15 = vzVar.U;
                        if (i14 > i15) {
                            vzVar.U = (int) (i15 / (i13 / i14));
                            vzVar.T = i13;
                        } else {
                            vzVar.T = (int) (i14 / (i13 / i15));
                            vzVar.U = i13;
                        }
                    }
                    vzVar.W = false;
                    vzVar.g();
                    vzVar.f30074a0.run();
                    return;
                }
                return;
            case 1:
                vz vzVar2 = this.f28613b;
                int i16 = this.f28614c;
                int i17 = this.d;
                vzVar2.f30078n = i16;
                vzVar2.f30079r = i17;
                return;
            default:
                vz vzVar3 = this.f28613b;
                int i18 = this.f28614c;
                int i19 = this.d;
                ha haVar = vzVar3.F;
                haVar.f25360l = i18;
                haVar.f25361m = i19;
                return;
        }
    }
}
