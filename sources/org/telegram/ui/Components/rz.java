package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class rz implements Runnable {
    public final int f28073a;
    public final vz f28074b;
    public final int f28075c;
    public final int d;

    public rz(vz vzVar, int i10, int i11, int i12) {
        this.f28073a = i12;
        this.f28074b = vzVar;
        this.f28075c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28073a) {
            case 0:
                vz vzVar = this.f28074b;
                int i11 = this.f28075c;
                int i12 = this.d;
                if (vzVar.W != i11 || vzVar.X != i12) {
                    vzVar.W = i11;
                    vzVar.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = vzVar.W) > 1280 || vzVar.X > 1280)) {
                        vzVar.W = i10 / 2;
                        vzVar.X /= 2;
                    }
                    int i14 = vzVar.W;
                    if (i14 > i13 || vzVar.X > i13) {
                        int i15 = vzVar.X;
                        if (i14 > i15) {
                            vzVar.X = (int) (i15 / (i13 / i14));
                            vzVar.W = i13;
                        } else {
                            vzVar.W = (int) (i14 / (i13 / i15));
                            vzVar.X = i13;
                        }
                    }
                    vzVar.Z = false;
                    vzVar.g();
                    vzVar.f29840d0.run();
                    return;
                }
                return;
            case 1:
                vz vzVar2 = this.f28074b;
                int i16 = this.f28075c;
                int i17 = this.d;
                vzVar2.f29842n = i16;
                vzVar2.f29843r = i17;
                return;
            default:
                vz vzVar3 = this.f28074b;
                int i18 = this.f28075c;
                int i19 = this.d;
                oa oaVar = vzVar3.I;
                oaVar.f27040l = i18;
                oaVar.f27041m = i19;
                return;
        }
    }
}
