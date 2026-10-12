package org.telegram.ui.Components;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class k00 implements Runnable {
    public final int f27691a;
    public final o00 f27692b;
    public final int f27693c;
    public final int d;

    public k00(o00 o00Var, int i10, int i11, int i12) {
        this.f27691a = i12;
        this.f27692b = o00Var;
        this.f27693c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f27691a) {
            case 0:
                o00 o00Var = this.f27692b;
                int i11 = this.f27693c;
                int i12 = this.d;
                if (o00Var.W != i11 || o00Var.X != i12) {
                    o00Var.W = i11;
                    o00Var.X = i12;
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
                    if (SharedConfig.getDevicePerformanceClass() == 0 && ((i10 = o00Var.W) > 1280 || o00Var.X > 1280)) {
                        o00Var.W = i10 / 2;
                        o00Var.X /= 2;
                    }
                    int i14 = o00Var.W;
                    if (i14 > i13 || o00Var.X > i13) {
                        int i15 = o00Var.X;
                        if (i14 > i15) {
                            o00Var.X = (int) (i15 / (i13 / i14));
                            o00Var.W = i13;
                        } else {
                            o00Var.W = (int) (i14 / (i13 / i15));
                            o00Var.X = i13;
                        }
                    }
                    o00Var.Z = false;
                    o00Var.g();
                    o00Var.f29007d0.run();
                    return;
                }
                return;
            case 1:
                o00 o00Var2 = this.f27692b;
                int i16 = this.f27693c;
                int i17 = this.d;
                o00Var2.f29010n = i16;
                o00Var2.f29011r = i17;
                return;
            default:
                o00 o00Var3 = this.f27692b;
                int i18 = this.f27693c;
                int i19 = this.d;
                ra raVar = o00Var3.I;
                raVar.f30125l = i18;
                raVar.f30126m = i19;
                return;
        }
    }
}
