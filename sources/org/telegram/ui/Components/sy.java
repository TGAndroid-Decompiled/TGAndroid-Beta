package org.telegram.ui.Components;

import android.graphics.Point;
public final class sy implements Runnable {
    public final int f39453a;
    public final wy f39454b;
    public final int f39455c;
    public final int d;

    public sy(wy wyVar, int i7, int i10, int i11) {
        this.f39453a = i11;
        this.f39454b = wyVar;
        this.f39455c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f39453a) {
            case 0:
                wy wyVar = this.f39454b;
                int i10 = this.f39455c;
                int i11 = this.d;
                if (wyVar.X != i10 || wyVar.Y != i11) {
                    wyVar.X = i10;
                    wyVar.Y = i11;
                    int o4 = org.telegram.messenger.gz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f23609q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.gz.o() == 0 && ((i7 = wyVar.X) > 1280 || wyVar.Y > 1280)) {
                        wyVar.X = i7 / 2;
                        wyVar.Y /= 2;
                    }
                    int i13 = wyVar.X;
                    if (i13 > i12 || wyVar.Y > i12) {
                        int i14 = wyVar.Y;
                        if (i13 > i14) {
                            wyVar.Y = (int) (i14 / (i12 / i13));
                            wyVar.X = i12;
                        } else {
                            wyVar.X = (int) (i13 / (i12 / i14));
                            wyVar.Y = i12;
                        }
                    }
                    wyVar.f41469a0 = false;
                    wyVar.f();
                    wyVar.f41476e0.run();
                    return;
                }
                return;
            case 1:
                wy wyVar2 = this.f39454b;
                int i15 = this.f39455c;
                int i16 = this.d;
                wyVar2.f41478n = i15;
                wyVar2.f41479r = i16;
                return;
            default:
                wy wyVar3 = this.f39454b;
                int i17 = this.f39455c;
                int i18 = this.d;
                z9 z9Var = wyVar3.J;
                z9Var.f42317l = i17;
                z9Var.f42318m = i18;
                return;
        }
    }
}
