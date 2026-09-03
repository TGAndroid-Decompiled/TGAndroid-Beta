package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class tz implements Runnable {
    public final int f31445a;
    public final xz f31446b;
    public final int f31447c;
    public final int d;

    public tz(xz xzVar, int i10, int i11, int i12) {
        this.f31445a = i12;
        this.f31446b = xzVar;
        this.f31447c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f31445a) {
            case 0:
                xz xzVar = this.f31446b;
                int i11 = this.f31447c;
                int i12 = this.d;
                if (xzVar.T != i11 || xzVar.U != i12) {
                    xzVar.T = i11;
                    xzVar.U = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = xzVar.T) > 1280 || xzVar.U > 1280)) {
                        xzVar.T = i10 / 2;
                        xzVar.U /= 2;
                    }
                    int i14 = xzVar.T;
                    if (i14 > i13 || xzVar.U > i13) {
                        int i15 = xzVar.U;
                        if (i14 > i15) {
                            xzVar.U = (int) (i15 / (i13 / i14));
                            xzVar.T = i13;
                        } else {
                            xzVar.T = (int) (i14 / (i13 / i15));
                            xzVar.U = i13;
                        }
                    }
                    xzVar.W = false;
                    xzVar.g();
                    xzVar.f33251a0.run();
                    return;
                }
                return;
            case 1:
                xz xzVar2 = this.f31446b;
                int i16 = this.f31447c;
                int i17 = this.d;
                xzVar2.f33256n = i16;
                xzVar2.f33257r = i17;
                return;
            default:
                xz xzVar3 = this.f31446b;
                int i18 = this.f31447c;
                int i19 = this.d;
                ha haVar = xzVar3.F;
                haVar.f27453l = i18;
                haVar.f27454m = i19;
                return;
        }
    }
}
