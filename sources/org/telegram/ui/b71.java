package org.telegram.ui;

import android.graphics.Point;
public final class b71 extends c8.ga {
    public final int f45636a;
    public final org.telegram.messenger.is f45637b;

    public b71(org.telegram.messenger.is isVar, int i7) {
        this.f45636a = i7;
        this.f45637b = isVar;
    }

    @Override
    public void a() {
        switch (this.f45636a) {
            case 1:
                ((ec1) this.f45637b).f46711w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z10;
        switch (this.f45636a) {
            case 0:
                Point point = org.telegram.messenger.g0.f23611q;
                boolean z11 = false;
                if (point.x <= point.y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i7 <= i10) {
                    z11 = true;
                }
                if (z10 == z11) {
                    ((t71) this.f45637b).f51478z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
