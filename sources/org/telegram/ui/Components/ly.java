package org.telegram.ui.Components;

import android.graphics.Point;
public final class ly implements Runnable {
    public final int f35913a;
    public final py f35914b;
    public final int f35915c;
    public final int d;

    public ly(py pyVar, int i3, int i10, int i11) {
        this.f35913a = i11;
        this.f35914b = pyVar;
        this.f35915c = i3;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f35913a) {
            case 0:
                py pyVar = this.f35914b;
                int i10 = this.f35915c;
                int i11 = this.d;
                if (pyVar.X != i10 || pyVar.Y != i11) {
                    pyVar.X = i10;
                    pyVar.Y = i11;
                    int o10 = org.telegram.messenger.az.o();
                    int i12 = 1920;
                    if (o10 != 1) {
                        if (o10 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f22608q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.az.o() == 0 && ((i3 = pyVar.X) > 1280 || pyVar.Y > 1280)) {
                        pyVar.X = i3 / 2;
                        pyVar.Y /= 2;
                    }
                    int i13 = pyVar.X;
                    if (i13 > i12 || pyVar.Y > i12) {
                        int i14 = pyVar.Y;
                        if (i13 > i14) {
                            pyVar.Y = (int) (i14 / (i12 / i13));
                            pyVar.X = i12;
                        } else {
                            pyVar.X = (int) (i13 / (i12 / i14));
                            pyVar.Y = i12;
                        }
                    }
                    pyVar.f37269a0 = false;
                    pyVar.f();
                    pyVar.f37276e0.run();
                    return;
                }
                return;
            case 1:
                py pyVar2 = this.f35914b;
                int i15 = this.f35915c;
                int i16 = this.d;
                pyVar2.f37278n = i15;
                pyVar2.f37279r = i16;
                return;
            default:
                py pyVar3 = this.f35914b;
                int i17 = this.f35915c;
                int i18 = this.d;
                ca caVar = pyVar3.J;
                caVar.f32630l = i17;
                caVar.f32631m = i18;
                return;
        }
    }
}
