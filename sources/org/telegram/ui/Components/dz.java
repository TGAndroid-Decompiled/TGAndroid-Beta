package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class dz implements Runnable {
    public final int f27844a;
    public final hz f27845b;
    public final int f27846c;
    public final int d;

    public dz(hz hzVar, int i9, int i10, int i11) {
        this.f27844a = i11;
        this.f27845b = hzVar;
        this.f27846c = i9;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f27844a) {
            case 0:
                hz hzVar = this.f27845b;
                int i10 = this.f27846c;
                int i11 = this.d;
                if (hzVar.S != i10 || hzVar.T != i11) {
                    hzVar.S = i10;
                    hzVar.T = i11;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i12 = 1920;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            i12 = 720;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i9 = hzVar.S) > 1280 || hzVar.T > 1280)) {
                        hzVar.S = i9 / 2;
                        hzVar.T /= 2;
                    }
                    int i13 = hzVar.S;
                    if (i13 > i12 || hzVar.T > i12) {
                        int i14 = hzVar.T;
                        if (i13 > i14) {
                            hzVar.T = (int) (i14 / (i12 / i13));
                            hzVar.S = i12;
                        } else {
                            hzVar.S = (int) (i13 / (i12 / i14));
                            hzVar.T = i12;
                        }
                    }
                    hzVar.V = false;
                    hzVar.g();
                    hzVar.Z.run();
                    return;
                }
                return;
            case 1:
                hz hzVar2 = this.f27845b;
                int i15 = this.f27846c;
                int i16 = this.d;
                hzVar2.f29239n = i15;
                hzVar2.f29240r = i16;
                return;
            default:
                hz hzVar3 = this.f27845b;
                int i17 = this.f27846c;
                int i18 = this.d;
                ha haVar = hzVar3.E;
                haVar.f29013l = i17;
                haVar.f29014m = i18;
                return;
        }
    }
}
