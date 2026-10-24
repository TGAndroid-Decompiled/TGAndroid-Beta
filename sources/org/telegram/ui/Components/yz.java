package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yz implements Runnable {
    public final int f33089a;
    public final c00 f33090b;
    public final int f33091c;
    public final int d;

    public yz(c00 c00Var, int i10, int i11, int i12) {
        this.f33089a = i12;
        this.f33090b = c00Var;
        this.f33091c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f33089a) {
            case 0:
                c00 c00Var = this.f33090b;
                int i11 = this.f33091c;
                int i12 = this.d;
                if (c00Var.W != i11 || c00Var.X != i12) {
                    c00Var.W = i11;
                    c00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = c00Var.W) > 1280 || c00Var.X > 1280)) {
                        c00Var.W = i10 / 2;
                        c00Var.X /= 2;
                    }
                    int i14 = c00Var.W;
                    if (i14 > i13 || c00Var.X > i13) {
                        int i15 = c00Var.X;
                        if (i14 > i15) {
                            c00Var.X = (int) (i15 / (i13 / i14));
                            c00Var.W = i13;
                        } else {
                            c00Var.W = (int) (i14 / (i13 / i15));
                            c00Var.X = i13;
                        }
                    }
                    c00Var.Z = false;
                    c00Var.g();
                    c00Var.f25140d0.run();
                    return;
                }
                return;
            case 1:
                c00 c00Var2 = this.f33090b;
                int i16 = this.f33091c;
                int i17 = this.d;
                c00Var2.f25142n = i16;
                c00Var2.f25143r = i17;
                return;
            default:
                c00 c00Var3 = this.f33090b;
                int i18 = this.f33091c;
                int i19 = this.d;
                na naVar = c00Var3.I;
                naVar.f28842l = i18;
                naVar.f28843m = i19;
                return;
        }
    }
}
