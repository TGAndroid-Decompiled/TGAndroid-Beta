package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class a00 implements Runnable {
    public final int f24427a;
    public final e00 f24428b;
    public final int f24429c;
    public final int d;

    public a00(e00 e00Var, int i10, int i11, int i12) {
        this.f24427a = i12;
        this.f24428b = e00Var;
        this.f24429c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f24427a) {
            case 0:
                e00 e00Var = this.f24428b;
                int i11 = this.f24429c;
                int i12 = this.d;
                if (e00Var.W != i11 || e00Var.X != i12) {
                    e00Var.W = i11;
                    e00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = e00Var.W) > 1280 || e00Var.X > 1280)) {
                        e00Var.W = i10 / 2;
                        e00Var.X /= 2;
                    }
                    int i14 = e00Var.W;
                    if (i14 > i13 || e00Var.X > i13) {
                        int i15 = e00Var.X;
                        if (i14 > i15) {
                            e00Var.X = (int) (i15 / (i13 / i14));
                            e00Var.W = i13;
                        } else {
                            e00Var.W = (int) (i14 / (i13 / i15));
                            e00Var.X = i13;
                        }
                    }
                    e00Var.Z = false;
                    e00Var.g();
                    e00Var.f25683d0.run();
                    return;
                }
                return;
            case 1:
                e00 e00Var2 = this.f24428b;
                int i16 = this.f24429c;
                int i17 = this.d;
                e00Var2.f25685n = i16;
                e00Var2.f25686r = i17;
                return;
            default:
                e00 e00Var3 = this.f24428b;
                int i18 = this.f24429c;
                int i19 = this.d;
                pa paVar = e00Var3.I;
                paVar.f29278l = i18;
                paVar.f29279m = i19;
                return;
        }
    }
}
