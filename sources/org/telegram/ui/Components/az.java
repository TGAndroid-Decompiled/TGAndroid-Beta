package org.telegram.ui.Components;

import android.graphics.Point;
public final class az implements Runnable {
    public final int f33654a;
    public final ez f33655b;
    public final int f33656c;
    public final int d;

    public az(ez ezVar, int i7, int i10, int i11) {
        this.f33654a = i11;
        this.f33655b = ezVar;
        this.f33656c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f33654a) {
            case 0:
                ez ezVar = this.f33655b;
                int i10 = this.f33656c;
                int i11 = this.d;
                if (ezVar.X != i10 || ezVar.Y != i11) {
                    ezVar.X = i10;
                    ezVar.Y = i11;
                    int o4 = org.telegram.messenger.cz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f24010q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.cz.o() == 0 && ((i7 = ezVar.X) > 1280 || ezVar.Y > 1280)) {
                        ezVar.X = i7 / 2;
                        ezVar.Y /= 2;
                    }
                    int i13 = ezVar.X;
                    if (i13 > i12 || ezVar.Y > i12) {
                        int i14 = ezVar.Y;
                        if (i13 > i14) {
                            ezVar.Y = (int) (i14 / (i12 / i13));
                            ezVar.X = i12;
                        } else {
                            ezVar.X = (int) (i13 / (i12 / i14));
                            ezVar.Y = i12;
                        }
                    }
                    ezVar.f34994a0 = false;
                    ezVar.f();
                    ezVar.f35001e0.run();
                    return;
                }
                return;
            case 1:
                ez ezVar2 = this.f33655b;
                int i15 = this.f33656c;
                int i16 = this.d;
                ezVar2.f35003n = i15;
                ezVar2.f35004r = i16;
                return;
            default:
                ez ezVar3 = this.f33655b;
                int i17 = this.f33656c;
                int i18 = this.d;
                ha haVar = ezVar3.J;
                haVar.f35801l = i17;
                haVar.f35802m = i18;
                return;
        }
    }
}
