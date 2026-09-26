package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class tz implements Runnable {
    public final int f28627a;
    public final xz f28628b;
    public final int f28629c;
    public final int d;

    public tz(xz xzVar, int i10, int i11, int i12) {
        this.f28627a = i12;
        this.f28628b = xzVar;
        this.f28629c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28627a) {
            case 0:
                xz xzVar = this.f28628b;
                int i11 = this.f28629c;
                int i12 = this.d;
                if (xzVar.W != i11 || xzVar.X != i12) {
                    xzVar.W = i11;
                    xzVar.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = xzVar.W) > 1280 || xzVar.X > 1280)) {
                        xzVar.W = i10 / 2;
                        xzVar.X /= 2;
                    }
                    int i14 = xzVar.W;
                    if (i14 > i13 || xzVar.X > i13) {
                        int i15 = xzVar.X;
                        if (i14 > i15) {
                            xzVar.X = (int) (i15 / (i13 / i14));
                            xzVar.W = i13;
                        } else {
                            xzVar.W = (int) (i14 / (i13 / i15));
                            xzVar.X = i13;
                        }
                    }
                    xzVar.Z = false;
                    xzVar.g();
                    xzVar.f30498d0.run();
                    return;
                }
                return;
            case 1:
                xz xzVar2 = this.f28628b;
                int i16 = this.f28629c;
                int i17 = this.d;
                xzVar2.f30500n = i16;
                xzVar2.f30501r = i17;
                return;
            default:
                xz xzVar3 = this.f28628b;
                int i18 = this.f28629c;
                int i19 = this.d;
                pa paVar = xzVar3.I;
                paVar.f27311l = i18;
                paVar.f27312m = i19;
                return;
        }
    }
}
