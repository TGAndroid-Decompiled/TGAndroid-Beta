package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class sz implements Runnable {
    public final int f28335a;
    public final wz f28336b;
    public final int f28337c;
    public final int d;

    public sz(wz wzVar, int i10, int i11, int i12) {
        this.f28335a = i12;
        this.f28336b = wzVar;
        this.f28337c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28335a) {
            case 0:
                wz wzVar = this.f28336b;
                int i11 = this.f28337c;
                int i12 = this.d;
                if (wzVar.W != i11 || wzVar.X != i12) {
                    wzVar.W = i11;
                    wzVar.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = wzVar.W) > 1280 || wzVar.X > 1280)) {
                        wzVar.W = i10 / 2;
                        wzVar.X /= 2;
                    }
                    int i14 = wzVar.W;
                    if (i14 > i13 || wzVar.X > i13) {
                        int i15 = wzVar.X;
                        if (i14 > i15) {
                            wzVar.X = (int) (i15 / (i13 / i14));
                            wzVar.W = i13;
                        } else {
                            wzVar.W = (int) (i14 / (i13 / i15));
                            wzVar.X = i13;
                        }
                    }
                    wzVar.Z = false;
                    wzVar.g();
                    wzVar.f30199d0.run();
                    return;
                }
                return;
            case 1:
                wz wzVar2 = this.f28336b;
                int i16 = this.f28337c;
                int i17 = this.d;
                wzVar2.f30201n = i16;
                wzVar2.f30202r = i17;
                return;
            default:
                wz wzVar3 = this.f28336b;
                int i18 = this.f28337c;
                int i19 = this.d;
                pa paVar = wzVar3.I;
                paVar.f27289l = i18;
                paVar.f27290m = i19;
                return;
        }
    }
}
