package org.telegram.ui;

import android.graphics.Point;
public final class f71 extends c8.ea {
    public final int f45641a;
    public final org.telegram.messenger.ls f45642b;

    public f71(org.telegram.messenger.ls lsVar, int i7) {
        this.f45641a = i7;
        this.f45642b = lsVar;
    }

    @Override
    public void a() {
        switch (this.f45641a) {
            case 1:
                ((ic1) this.f45642b).f46611w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z9;
        switch (this.f45641a) {
            case 0:
                Point point = org.telegram.messenger.g0.f22563q;
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
                    ((w71) this.f45642b).f50968y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
