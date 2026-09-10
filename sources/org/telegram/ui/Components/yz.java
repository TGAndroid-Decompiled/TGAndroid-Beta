package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yz implements Runnable {
    public final int f29532a;
    public final c00 f29533b;
    public final int f29534c;
    public final int d;

    public yz(c00 c00Var, int i10, int i11, int i12) {
        this.f29532a = i12;
        this.f29533b = c00Var;
        this.f29534c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f29532a) {
            case 0:
                c00 c00Var = this.f29533b;
                int i11 = this.f29534c;
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
                    c00Var.f21937d0.run();
                    return;
                }
                return;
            case 1:
                c00 c00Var2 = this.f29533b;
                int i16 = this.f29534c;
                int i17 = this.d;
                c00Var2.f21939n = i16;
                c00Var2.f21940r = i17;
                return;
            default:
                c00 c00Var3 = this.f29533b;
                int i18 = this.f29534c;
                int i19 = this.d;
                oa oaVar = c00Var3.I;
                oaVar.f25744l = i18;
                oaVar.f25745m = i19;
                return;
        }
    }
}
