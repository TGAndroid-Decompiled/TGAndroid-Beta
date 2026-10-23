package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class a2 implements g6 {
    public final int f20686a;
    public final Object f20687b;

    public a2(Object obj, int i10) {
        this.f20686a = i10;
        this.f20687b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f20686a) {
            case 0:
            default:
                return k6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f20686a) {
            case 0:
                k6.q(f7, f10, i10, i11);
                return;
            default:
                k6.q(f7, f10, i10, i11);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f20686a) {
            case 0:
                return k6.f21513v3;
            default:
                return k6.f21513v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f20686a) {
            case 0:
                return k6.U0(str);
            default:
                return k6.U0(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f20686a) {
            case 0:
                return g(i10);
            default:
                return g(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f20686a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f20686a) {
            case 0:
                return ((c2) this.f20687b).f(i10);
            default:
                return ((o2) this.f20687b).getThemedColor(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f20686a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final void h(int i10, int i11) {
        int i12 = this.f20686a;
    }

    @Override
    public final int i(int i10) {
        switch (this.f20686a) {
            case 0:
                return g(i10);
            default:
                return g(i10);
        }
    }

    private final void j(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }
}
