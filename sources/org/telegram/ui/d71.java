package org.telegram.ui;

import android.graphics.Point;
public final class d71 extends c8.ea {
    public final int f45011a;
    public final org.telegram.messenger.ls f45012b;

    public d71(org.telegram.messenger.ls lsVar, int i7) {
        this.f45011a = i7;
        this.f45012b = lsVar;
    }

    @Override
    public void a() {
        switch (this.f45011a) {
            case 1:
                ((ec1) this.f45012b).f45311w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z9;
        switch (this.f45011a) {
            case 0:
                Point point = org.telegram.messenger.g0.f22544q;
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
                    ((u71) this.f45012b).f50331y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
