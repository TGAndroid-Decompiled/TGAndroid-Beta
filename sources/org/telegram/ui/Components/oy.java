package org.telegram.ui.Components;

import android.graphics.Point;
public final class oy implements Runnable {
    public final int f36827a;
    public final sy f36828b;
    public final int f36829c;
    public final int d;

    public oy(sy syVar, int i7, int i10, int i11) {
        this.f36827a = i11;
        this.f36828b = syVar;
        this.f36829c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f36827a) {
            case 0:
                sy syVar = this.f36828b;
                int i10 = this.f36829c;
                int i11 = this.d;
                if (syVar.W != i10 || syVar.X != i11) {
                    syVar.W = i10;
                    syVar.X = i11;
                    int o4 = org.telegram.messenger.iz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f22563q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.iz.o() == 0 && ((i7 = syVar.W) > 1280 || syVar.X > 1280)) {
                        syVar.W = i7 / 2;
                        syVar.X /= 2;
                    }
                    int i13 = syVar.W;
                    if (i13 > i12 || syVar.X > i12) {
                        int i14 = syVar.X;
                        if (i13 > i14) {
                            syVar.X = (int) (i14 / (i12 / i13));
                            syVar.W = i12;
                        } else {
                            syVar.W = (int) (i13 / (i12 / i14));
                            syVar.X = i12;
                        }
                    }
                    syVar.Z = false;
                    syVar.f();
                    syVar.f38178d0.run();
                    return;
                }
                return;
            case 1:
                sy syVar2 = this.f36828b;
                int i15 = this.f36829c;
                int i16 = this.d;
                syVar2.f38181n = i15;
                syVar2.f38182r = i16;
                return;
            default:
                sy syVar3 = this.f36828b;
                int i17 = this.f36829c;
                int i18 = this.d;
                da daVar = syVar3.I;
                daVar.f32905l = i17;
                daVar.f32906m = i18;
                return;
        }
    }
}
