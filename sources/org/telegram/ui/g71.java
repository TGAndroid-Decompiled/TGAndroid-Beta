package org.telegram.ui;

import android.graphics.Point;
public final class g71 extends c8.ea {
    public final int f46034a;
    public final org.telegram.messenger.ls f46035b;

    public g71(org.telegram.messenger.ls lsVar, int i7) {
        this.f46034a = i7;
        this.f46035b = lsVar;
    }

    @Override
    public void a() {
        switch (this.f46034a) {
            case 1:
                ((jc1) this.f46035b).f46947w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z9;
        switch (this.f46034a) {
            case 0:
                Point point = org.telegram.messenger.g0.f22567q;
                boolean z10 = false;
                if (point.x <= point.y) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i7 <= i10) {
                    z10 = true;
                }
                if (z9 == z10) {
                    ((x71) this.f46035b).f51627y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
