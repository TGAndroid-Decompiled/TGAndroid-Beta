package org.telegram.ui;

import android.graphics.Point;
public final class f71 extends c8.ia {
    public final int f47596a;
    public final org.telegram.messenger.fs f47597b;

    public f71(org.telegram.messenger.fs fsVar, int i7) {
        this.f47596a = i7;
        this.f47597b = fsVar;
    }

    @Override
    public void a() {
        switch (this.f47596a) {
            case 1:
                ((hc1) this.f47597b).f48372w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z10;
        switch (this.f47596a) {
            case 0:
                Point point = org.telegram.messenger.g0.f24121q;
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
                    ((x71) this.f47597b).f53751z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
