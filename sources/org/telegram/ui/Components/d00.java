package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class d00 implements Runnable {
    public final int f23923a;
    public final h00 f23924b;
    public final int f23925c;
    public final int d;

    public d00(h00 h00Var, int i10, int i11, int i12) {
        this.f23923a = i12;
        this.f23924b = h00Var;
        this.f23925c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f23923a) {
            case 0:
                h00 h00Var = this.f23924b;
                int i11 = this.f23925c;
                int i12 = this.d;
                if (h00Var.W != i11 || h00Var.X != i12) {
                    h00Var.W = i11;
                    h00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = h00Var.W) > 1280 || h00Var.X > 1280)) {
                        h00Var.W = i10 / 2;
                        h00Var.X /= 2;
                    }
                    int i14 = h00Var.W;
                    if (i14 > i13 || h00Var.X > i13) {
                        int i15 = h00Var.X;
                        if (i14 > i15) {
                            h00Var.X = (int) (i15 / (i13 / i14));
                            h00Var.W = i13;
                        } else {
                            h00Var.W = (int) (i14 / (i13 / i15));
                            h00Var.X = i13;
                        }
                    }
                    h00Var.Z = false;
                    h00Var.g();
                    h00Var.f25139d0.run();
                    return;
                }
                return;
            case 1:
                h00 h00Var2 = this.f23924b;
                int i16 = this.f23925c;
                int i17 = this.d;
                h00Var2.f25141n = i16;
                h00Var2.f25142r = i17;
                return;
            default:
                h00 h00Var3 = this.f23924b;
                int i18 = this.f23925c;
                int i19 = this.d;
                ra raVar = h00Var3.I;
                raVar.f28479l = i18;
                raVar.f28480m = i19;
                return;
        }
    }
}
