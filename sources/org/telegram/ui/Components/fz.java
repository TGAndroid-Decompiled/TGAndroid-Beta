package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class fz implements Runnable {

    public final int f28468a;

    public final jz f28469b;

    public final int f28470c;
    public final int d;

    public fz(jz jzVar, int i10, int i11, int i12) {
        this.f28468a = i12;
        this.f28469b = jzVar;
        this.f28470c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f28468a) {
            case 0:
                jz jzVar = this.f28469b;
                int i11 = this.f28470c;
                int i12 = this.d;
                if (jzVar.S != i11 || jzVar.T != i12) {
                    jzVar.S = i11;
                    jzVar.T = i12;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMin = 1920;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            iMin = 720;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            iMin = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = jzVar.S) > 1280 || jzVar.T > 1280)) {
                        jzVar.S = i10 / 2;
                        jzVar.T /= 2;
                    }
                    int i13 = jzVar.S;
                    if (i13 > iMin || jzVar.T > iMin) {
                        int i14 = jzVar.T;
                        if (i13 > i14) {
                            jzVar.T = (int) (i14 / (iMin / i13));
                            jzVar.S = iMin;
                        } else {
                            jzVar.S = (int) (i13 / (iMin / i14));
                            jzVar.T = iMin;
                        }
                    }
                    jzVar.V = false;
                    jzVar.g();
                    jzVar.Z.run();
                }
                break;
            case 1:
                jz jzVar2 = this.f28469b;
                int i15 = this.f28470c;
                int i16 = this.d;
                jzVar2.f29857n = i15;
                jzVar2.f29858r = i16;
                break;
            default:
                jz jzVar3 = this.f28469b;
                int i17 = this.f28470c;
                int i18 = this.d;
                fa faVar = jzVar3.E;
                faVar.f28327l = i17;
                faVar.f28328m = i18;
                break;
        }
    }
}
