package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class rz implements Runnable {
    public final int f27719a;
    public final vz f27720b;
    public final int f27721c;
    public final int d;

    public rz(vz vzVar, int i10, int i11, int i12) {
        this.f27719a = i12;
        this.f27720b = vzVar;
        this.f27721c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f27719a) {
            case 0:
                vz vzVar = this.f27720b;
                int i11 = this.f27721c;
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
                    vzVar.f29437d0.run();
                    return;
                }
                return;
            case 1:
                vz vzVar2 = this.f27720b;
                int i16 = this.f27721c;
                int i17 = this.d;
                vzVar2.f29439n = i16;
                vzVar2.f29440r = i17;
                return;
            default:
                vz vzVar3 = this.f27720b;
                int i18 = this.f27721c;
                int i19 = this.d;
                na naVar = vzVar3.I;
                naVar.f26414l = i18;
                naVar.f26415m = i19;
                return;
        }
    }
}
