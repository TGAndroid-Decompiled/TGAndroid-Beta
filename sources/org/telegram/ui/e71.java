package org.telegram.ui;

import android.graphics.Point;
public final class e71 extends c8.ea {
    public final int f45219a;
    public final org.telegram.messenger.ls f45220b;

    public e71(org.telegram.messenger.ls lsVar, int i7) {
        this.f45219a = i7;
        this.f45220b = lsVar;
    }

    @Override
    public void a() {
        switch (this.f45219a) {
            case 1:
                ((fc1) this.f45220b).f45579w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z9;
        switch (this.f45219a) {
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
                    ((v71) this.f45220b).f50586y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
