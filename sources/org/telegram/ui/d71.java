package org.telegram.ui;

import android.graphics.Point;
public final class d71 extends c8.ja {
    public final int f47001a;
    public final org.telegram.messenger.fs f47002b;

    public d71(org.telegram.messenger.fs fsVar, int i7) {
        this.f47001a = i7;
        this.f47002b = fsVar;
    }

    @Override
    public void a() {
        switch (this.f47001a) {
            case 1:
                ((fc1) this.f47002b).f47792w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        boolean z10;
        switch (this.f47001a) {
            case 0:
                Point point = org.telegram.messenger.g0.f24226q;
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
                    ((v71) this.f47002b).f52914z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
