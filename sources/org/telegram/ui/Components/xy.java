package org.telegram.ui.Components;

import android.graphics.Point;
public final class xy implements Runnable {
    public final int f42242a;
    public final bz f42243b;
    public final int f42244c;
    public final int d;

    public xy(bz bzVar, int i7, int i10, int i11) {
        this.f42242a = i11;
        this.f42243b = bzVar;
        this.f42244c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f42242a) {
            case 0:
                bz bzVar = this.f42243b;
                int i10 = this.f42244c;
                int i11 = this.d;
                if (bzVar.X != i10 || bzVar.Y != i11) {
                    bzVar.X = i10;
                    bzVar.Y = i11;
                    int o4 = org.telegram.messenger.bz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f24226q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.bz.o() == 0 && ((i7 = bzVar.X) > 1280 || bzVar.Y > 1280)) {
                        bzVar.X = i7 / 2;
                        bzVar.Y /= 2;
                    }
                    int i13 = bzVar.X;
                    if (i13 > i12 || bzVar.Y > i12) {
                        int i14 = bzVar.Y;
                        if (i13 > i14) {
                            bzVar.Y = (int) (i14 / (i12 / i13));
                            bzVar.X = i12;
                        } else {
                            bzVar.X = (int) (i13 / (i12 / i14));
                            bzVar.Y = i12;
                        }
                    }
                    bzVar.f33844a0 = false;
                    bzVar.f();
                    bzVar.f33851e0.run();
                    return;
                }
                return;
            case 1:
                bz bzVar2 = this.f42243b;
                int i15 = this.f42244c;
                int i16 = this.d;
                bzVar2.f33853n = i15;
                bzVar2.f33854r = i16;
                return;
            default:
                bz bzVar3 = this.f42243b;
                int i17 = this.f42244c;
                int i18 = this.d;
                ga gaVar = bzVar3.J;
                gaVar.f35384l = i17;
                gaVar.f35385m = i18;
                return;
        }
    }
}
