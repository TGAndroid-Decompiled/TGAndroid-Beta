package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.m41;
public final class s1 implements g6 {
    public final int f28486a;
    public final Object f28487b;

    public s1(Object obj, int i7) {
        this.f28486a = i7;
        this.f28487b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f28486a) {
            case 0:
            case 1:
            default:
                return l6.I.q();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f28486a) {
            case 0:
                l6.r(f10, f11, i7, i10);
                return;
            case 1:
                l6.r(f10, f11, i7, i10);
                return;
            default:
                l6.r(f10, f11, i7, i10);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f28486a) {
            case 0:
                return l6.f28197v3;
            case 1:
                return l6.f28197v3;
            default:
                return l6.f28197v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f28486a) {
            case 0:
                return l6.V0(str);
            case 1:
                return l6.V0(str);
            default:
                return l6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f28486a) {
            case 0:
                return iz.H0;
            case 1:
                return iz.H0;
            default:
                return iz.H0;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f28486a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f28486a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f28486a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f28486a) {
            case 0:
                return ((u1) this.f28487b).f(i7);
            case 1:
                return ((f2) this.f28487b).getThemedColor(i7);
            default:
                return ((m41) this.f28487b).I(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f28486a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f28486a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return h(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
