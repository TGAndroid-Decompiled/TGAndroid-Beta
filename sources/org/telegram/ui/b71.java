package org.telegram.ui;

import android.graphics.Point;
public final class b71 extends c8.ga {
    public final int f45642a;
    public final org.telegram.messenger.is f45643b;

    public b71(org.telegram.messenger.is isVar, int i7) {
        this.f45642a = i7;
        this.f45643b = isVar;
    }

    @Override
    public void a() {
        switch (this.f45642a) {
            case 1:
                ((ec1) this.f45643b).f46721w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z10;
        switch (this.f45642a) {
            case 0:
                Point point = org.telegram.messenger.g0.f23609q;
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
                    ((t71) this.f45643b).f51477z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
