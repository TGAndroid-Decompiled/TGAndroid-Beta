package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.az;
import org.telegram.ui.Components.f41;
public final class q1 implements e6 {
    public final int f28474a;
    public final Object f28475b;

    public q1(Object obj, int i3) {
        this.f28474a = i3;
        this.f28475b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f28474a) {
            case 0:
            case 1:
            default:
                return k6.I.q();
        }
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        switch (this.f28474a) {
            case 0:
                k6.r(f10, f11, i3, i10);
                return;
            case 1:
                k6.r(f10, f11, i3, i10);
                return;
            default:
                k6.r(f10, f11, i3, i10);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f28474a) {
            case 0:
                return k6.f28211v3;
            case 1:
                return k6.f28211v3;
            default:
                return k6.f28211v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f28474a) {
            case 0:
                return k6.V0(str);
            case 1:
                return k6.V0(str);
            default:
                return k6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f28474a) {
            case 0:
                return az.H0;
            case 1:
                return az.H0;
            default:
                return az.H0;
        }
    }

    @Override
    public final int f(int i3) {
        switch (this.f28474a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                return h(i3);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f28474a) {
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
        switch (this.f28474a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int h(int i3) {
        switch (this.f28474a) {
            case 0:
                return ((s1) this.f28475b).f(i3);
            case 1:
                return ((d2) this.f28475b).getThemedColor(i3);
            default:
                return ((f41) this.f28475b).I(i3);
        }
    }

    @Override
    public final void i(int i3, int i10) {
        int i11 = this.f28474a;
    }

    @Override
    public final int j(int i3) {
        switch (this.f28474a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                return h(i3);
        }
    }

    private final void k(int i3, int i10) {
    }

    private final void l(int i3, int i10) {
    }

    private final void m(int i3, int i10) {
    }
}
