package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class mz implements Runnable {
    public final int f30783a;
    public final qz f30784b;
    public final int f30785c;
    public final int d;

    public mz(qz qzVar, int i10, int i11, int i12) {
        this.f30783a = i12;
        this.f30784b = qzVar;
        this.f30785c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f30783a) {
            case 0:
                qz qzVar = this.f30784b;
                int i11 = this.f30785c;
                int i12 = this.d;
                if (qzVar.S != i11 || qzVar.T != i12) {
                    qzVar.S = i11;
                    qzVar.T = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = qzVar.S) > 1280 || qzVar.T > 1280)) {
                        qzVar.S = i10 / 2;
                        qzVar.T /= 2;
                    }
                    int i14 = qzVar.S;
                    if (i14 > i13 || qzVar.T > i13) {
                        int i15 = qzVar.T;
                        if (i14 > i15) {
                            qzVar.T = (int) (i15 / (i13 / i14));
                            qzVar.S = i13;
                        } else {
                            qzVar.S = (int) (i14 / (i13 / i15));
                            qzVar.T = i13;
                        }
                    }
                    qzVar.V = false;
                    qzVar.g();
                    qzVar.Z.run();
                    return;
                }
                return;
            case 1:
                qz qzVar2 = this.f30784b;
                int i16 = this.f30785c;
                int i17 = this.d;
                qzVar2.f32143n = i16;
                qzVar2.f32144r = i17;
                return;
            default:
                qz qzVar3 = this.f30784b;
                int i18 = this.f30785c;
                int i19 = this.d;
                ma maVar = qzVar3.E;
                maVar.f30618l = i18;
                maVar.f30619m = i19;
                return;
        }
    }
}
