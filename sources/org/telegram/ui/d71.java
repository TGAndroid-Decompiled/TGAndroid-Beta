package org.telegram.ui;

import android.graphics.Point;
public final class d71 extends c8.ea {
    public final int f45012a;
    public final org.telegram.messenger.ls f45013b;

    public d71(org.telegram.messenger.ls lsVar, int i7) {
        this.f45012a = i7;
        this.f45013b = lsVar;
    }

    @Override
    public void a() {
        switch (this.f45012a) {
            case 1:
                ((ec1) this.f45013b).f45312w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z9;
        switch (this.f45012a) {
            case 0:
                Point point = org.telegram.messenger.g0.f22537q;
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
                    ((u71) this.f45013b).f50332y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
