package org.telegram.ui;

import android.graphics.Point;
public final class f71 extends c8.ia {
    public final int f47622a;
    public final org.telegram.messenger.fs f47623b;

    public f71(org.telegram.messenger.fs fsVar, int i7) {
        this.f47622a = i7;
        this.f47623b = fsVar;
    }

    @Override
    public void a() {
        switch (this.f47622a) {
            case 1:
                ((hc1) this.f47623b).f48366w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z10;
        switch (this.f47622a) {
            case 0:
                Point point = org.telegram.messenger.g0.f24146q;
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
                    ((x71) this.f47623b).f53780z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
