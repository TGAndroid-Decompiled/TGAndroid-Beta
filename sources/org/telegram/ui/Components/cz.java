package org.telegram.ui.Components;

import android.graphics.Point;
public final class cz implements Runnable {
    public final int f25229a;
    public final gz f25230b;
    public final int f25231c;
    public final int d;

    public cz(gz gzVar, int i10, int i11, int i12) {
        this.f25229a = i12;
        this.f25230b = gzVar;
        this.f25231c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f25229a) {
            case 0:
                gz gzVar = this.f25230b;
                int i11 = this.f25231c;
                int i12 = this.d;
                if (gzVar.W != i11 || gzVar.X != i12) {
                    gzVar.W = i11;
                    gzVar.X = i12;
                    int o10 = org.telegram.messenger.tz.o();
                    int i13 = 1920;
                    if (o10 != 1) {
                        if (o10 != 2) {
                            i13 = 720;
                        } else {
                            Point point = org.telegram.messenger.i0.f16026q;
                            i13 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.tz.o() == 0 && ((i10 = gzVar.W) > 1280 || gzVar.X > 1280)) {
                        gzVar.W = i10 / 2;
                        gzVar.X /= 2;
                    }
                    int i14 = gzVar.W;
                    if (i14 > i13 || gzVar.X > i13) {
                        int i15 = gzVar.X;
                        if (i14 > i15) {
                            gzVar.X = (int) (i15 / (i13 / i14));
                            gzVar.W = i13;
                        } else {
                            gzVar.W = (int) (i14 / (i13 / i15));
                            gzVar.X = i13;
                        }
                    }
                    gzVar.Z = false;
                    gzVar.f();
                    gzVar.f26547d0.run();
                    return;
                }
                return;
            case 1:
                gz gzVar2 = this.f25230b;
                int i16 = this.f25231c;
                int i17 = this.d;
                gzVar2.f26549n = i16;
                gzVar2.f26550r = i17;
                return;
            default:
                gz gzVar3 = this.f25230b;
                int i18 = this.f25231c;
                int i19 = this.d;
                x9 x9Var = gzVar3.I;
                x9Var.f32437l = i18;
                x9Var.f32438m = i19;
                return;
        }
    }
}
