package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.c51;
public final class r1 implements h6 {
    public final int f29951a;
    public final Object f29952b;

    public r1(Object obj, int i7) {
        this.f29951a = i7;
        this.f29952b = obj;
    }

    @Override
    public final boolean d() {
        switch (this.f29951a) {
            case 0:
            case 1:
            default:
                return m6.I.q();
        }
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        switch (this.f29951a) {
            case 0:
                m6.r(f10, f11, i7, i10);
                return;
            case 1:
                m6.r(f10, f11, i7, i10);
                return;
            default:
                m6.r(f10, f11, i7, i10);
                return;
        }
    }

    @Override
    public final ColorFilter f() {
        switch (this.f29951a) {
            case 0:
                return m6.f29710v3;
            case 1:
                return m6.f29710v3;
            default:
                return m6.f29710v3;
        }
    }

    @Override
    public final Paint g(String str) {
        switch (this.f29951a) {
            case 0:
                return m6.V0(str);
            case 1:
                return m6.V0(str);
            default:
                return m6.V0(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f29951a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final boolean h() {
        switch (this.f29951a) {
            case 0:
                return bz.H0;
            case 1:
                return bz.H0;
            default:
                return bz.H0;
        }
    }

    @Override
    public final int i(int i7) {
        switch (this.f29951a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                return k(i7);
        }
    }

    @Override
    public final boolean j() {
        switch (this.f29951a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int k(int i7) {
        switch (this.f29951a) {
            case 0:
                return ((t1) this.f29952b).f(i7);
            case 1:
                return ((g2) this.f29952b).getThemedColor(i7);
            default:
                return ((c51) this.f29952b).I(i7);
        }
    }

    @Override
    public final void l(int i7, int i10) {
        int i11 = this.f29951a;
    }

    @Override
    public final int m(int i7) {
        switch (this.f29951a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                return k(i7);
        }
    }

    private final void a(int i7, int i10) {
    }

    private final void b(int i7, int i10) {
    }

    private final void c(int i7, int i10) {
    }
}
