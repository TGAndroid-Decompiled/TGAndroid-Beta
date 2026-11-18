package org.telegram.ui.Components;

import android.graphics.Point;
public final class yy implements Runnable {
    public final int f42668a;
    public final cz f42669b;
    public final int f42670c;
    public final int d;

    public yy(cz czVar, int i7, int i10, int i11) {
        this.f42668a = i11;
        this.f42669b = czVar;
        this.f42670c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f42668a) {
            case 0:
                cz czVar = this.f42669b;
                int i10 = this.f42670c;
                int i11 = this.d;
                if (czVar.X != i10 || czVar.Y != i11) {
                    czVar.X = i10;
                    czVar.Y = i11;
                    int o4 = org.telegram.messenger.bz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f24118q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.bz.o() == 0 && ((i7 = czVar.X) > 1280 || czVar.Y > 1280)) {
                        czVar.X = i7 / 2;
                        czVar.Y /= 2;
                    }
                    int i13 = czVar.X;
                    if (i13 > i12 || czVar.Y > i12) {
                        int i14 = czVar.Y;
                        if (i13 > i14) {
                            czVar.Y = (int) (i14 / (i12 / i13));
                            czVar.X = i12;
                        } else {
                            czVar.X = (int) (i13 / (i12 / i14));
                            czVar.Y = i12;
                        }
                    }
                    czVar.f34204a0 = false;
                    czVar.f();
                    czVar.f34211e0.run();
                    return;
                }
                return;
            case 1:
                cz czVar2 = this.f42669b;
                int i15 = this.f42670c;
                int i16 = this.d;
                czVar2.f34213n = i15;
                czVar2.f34214r = i16;
                return;
            default:
                cz czVar3 = this.f42669b;
                int i17 = this.f42670c;
                int i18 = this.d;
                ha haVar = czVar3.J;
                haVar.f35835l = i17;
                haVar.f35836m = i18;
                return;
        }
    }
}
