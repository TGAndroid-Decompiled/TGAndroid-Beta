package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class i00 implements Runnable {
    public final int f27276a;
    public final m00 f27277b;
    public final int f27278c;
    public final int d;

    public i00(m00 m00Var, int i10, int i11, int i12) {
        this.f27276a = i12;
        this.f27277b = m00Var;
        this.f27278c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f27276a) {
            case 0:
                m00 m00Var = this.f27277b;
                int i11 = this.f27278c;
                int i12 = this.d;
                if (m00Var.W != i11 || m00Var.X != i12) {
                    m00Var.W = i11;
                    m00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = m00Var.W) > 1280 || m00Var.X > 1280)) {
                        m00Var.W = i10 / 2;
                        m00Var.X /= 2;
                    }
                    int i14 = m00Var.W;
                    if (i14 > i13 || m00Var.X > i13) {
                        int i15 = m00Var.X;
                        if (i14 > i15) {
                            m00Var.X = (int) (i15 / (i13 / i14));
                            m00Var.W = i13;
                        } else {
                            m00Var.W = (int) (i14 / (i13 / i15));
                            m00Var.X = i13;
                        }
                    }
                    m00Var.Z = false;
                    m00Var.g();
                    m00Var.f28647d0.run();
                    return;
                }
                return;
            case 1:
                m00 m00Var2 = this.f27277b;
                int i16 = this.f27278c;
                int i17 = this.d;
                m00Var2.f28650n = i16;
                m00Var2.f28651r = i17;
                return;
            default:
                m00 m00Var3 = this.f27277b;
                int i18 = this.f27278c;
                int i19 = this.d;
                ra raVar = m00Var3.I;
                raVar.f30474l = i18;
                raVar.f30475m = i19;
                return;
        }
    }
}
