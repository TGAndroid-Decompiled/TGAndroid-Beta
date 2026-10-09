package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class h00 implements Runnable {
    public final int f26917a;
    public final l00 f26918b;
    public final int f26919c;
    public final int d;

    public h00(l00 l00Var, int i10, int i11, int i12) {
        this.f26917a = i12;
        this.f26918b = l00Var;
        this.f26919c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f26917a) {
            case 0:
                l00 l00Var = this.f26918b;
                int i11 = this.f26919c;
                int i12 = this.d;
                if (l00Var.W != i11 || l00Var.X != i12) {
                    l00Var.W = i11;
                    l00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = l00Var.W) > 1280 || l00Var.X > 1280)) {
                        l00Var.W = i10 / 2;
                        l00Var.X /= 2;
                    }
                    int i14 = l00Var.W;
                    if (i14 > i13 || l00Var.X > i13) {
                        int i15 = l00Var.X;
                        if (i14 > i15) {
                            l00Var.X = (int) (i15 / (i13 / i14));
                            l00Var.W = i13;
                        } else {
                            l00Var.W = (int) (i14 / (i13 / i15));
                            l00Var.X = i13;
                        }
                    }
                    l00Var.Z = false;
                    l00Var.g();
                    l00Var.f28194d0.run();
                    return;
                }
                return;
            case 1:
                l00 l00Var2 = this.f26918b;
                int i16 = this.f26919c;
                int i17 = this.d;
                l00Var2.f28197n = i16;
                l00Var2.f28198r = i17;
                return;
            default:
                l00 l00Var3 = this.f26918b;
                int i18 = this.f26919c;
                int i19 = this.d;
                sa saVar = l00Var3.I;
                saVar.f30749l = i18;
                saVar.f30750m = i19;
                return;
        }
    }
}
