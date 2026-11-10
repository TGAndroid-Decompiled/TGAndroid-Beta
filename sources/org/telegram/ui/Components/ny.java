package org.telegram.ui.Components;

import android.graphics.Point;
public final class ny implements Runnable {
    public final int f36418a;
    public final ry f36419b;
    public final int f36420c;
    public final int d;

    public ny(ry ryVar, int i7, int i10, int i11) {
        this.f36418a = i11;
        this.f36419b = ryVar;
        this.f36420c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f36418a) {
            case 0:
                ry ryVar = this.f36419b;
                int i10 = this.f36420c;
                int i11 = this.d;
                if (ryVar.W != i10 || ryVar.X != i11) {
                    ryVar.W = i10;
                    ryVar.X = i11;
                    int o4 = org.telegram.messenger.iz.o();
                    int i12 = 1920;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i12 = 720;
                        } else {
                            Point point = org.telegram.messenger.g0.f22567q;
                            i12 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (org.telegram.messenger.iz.o() == 0 && ((i7 = ryVar.W) > 1280 || ryVar.X > 1280)) {
                        ryVar.W = i7 / 2;
                        ryVar.X /= 2;
                    }
                    int i13 = ryVar.W;
                    if (i13 > i12 || ryVar.X > i12) {
                        int i14 = ryVar.X;
                        if (i13 > i14) {
                            ryVar.X = (int) (i14 / (i12 / i13));
                            ryVar.W = i12;
                        } else {
                            ryVar.W = (int) (i13 / (i12 / i14));
                            ryVar.X = i12;
                        }
                    }
                    ryVar.Z = false;
                    ryVar.f();
                    ryVar.f37762d0.run();
                    return;
                }
                return;
            case 1:
                ry ryVar2 = this.f36419b;
                int i15 = this.f36420c;
                int i16 = this.d;
                ryVar2.f37765n = i15;
                ryVar2.f37766r = i16;
                return;
            default:
                ry ryVar3 = this.f36419b;
                int i17 = this.f36420c;
                int i18 = this.d;
                ca caVar = ryVar3.I;
                caVar.f32509l = i17;
                caVar.f32510m = i18;
                return;
        }
    }
}
