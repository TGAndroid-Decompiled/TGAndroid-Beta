package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class tz implements Runnable {
    public final int f31487a;
    public final xz f31488b;
    public final int f31489c;
    public final int d;

    public tz(xz xzVar, int i10, int i11, int i12) {
        this.f31487a = i12;
        this.f31488b = xzVar;
        this.f31489c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f31487a) {
            case 0:
                xz xzVar = this.f31488b;
                int i11 = this.f31489c;
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
                    xzVar.f33213a0.run();
                    return;
                }
                return;
            case 1:
                xz xzVar2 = this.f31488b;
                int i16 = this.f31489c;
                int i17 = this.d;
                xzVar2.f33218n = i16;
                xzVar2.f33219r = i17;
                return;
            default:
                xz xzVar3 = this.f31488b;
                int i18 = this.f31489c;
                int i19 = this.d;
                ha haVar = xzVar3.F;
                haVar.f27436l = i18;
                haVar.f27437m = i19;
                return;
        }
    }
}
