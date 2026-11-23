package org.telegram.ui;

import android.graphics.Point;
public final class f71 extends c8.ja {
    public final int f47588a;
    public final org.telegram.messenger.gs f47589b;

    public f71(org.telegram.messenger.gs gsVar, int i7) {
        this.f47588a = i7;
        this.f47589b = gsVar;
    }

    @Override
    public void a() {
        switch (this.f47588a) {
            case 1:
                ((hc1) this.f47589b).f48335w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z10;
        switch (this.f47588a) {
            case 0:
                Point point = org.telegram.messenger.g0.f24010q;
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
                    ((x71) this.f47589b).f53706z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
