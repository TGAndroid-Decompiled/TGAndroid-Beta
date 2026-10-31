package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.p51;
public final class v1 implements p6 {
    public final int f21404a;
    public final Object f21405b;

    public v1(Object obj, int i10) {
        this.f21404a = i10;
        this.f21405b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f21404a) {
            case 0:
            case 1:
            default:
                return t6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f21404a) {
            case 0:
                t6.r(f7, f10, i10, i11);
                return;
            case 1:
                t6.r(f7, f10, i10, i11);
                return;
            default:
                t6.r(f7, f10, i10, i11);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f21404a) {
            case 0:
                return t6.f21256v3;
            case 1:
                return t6.f21256v3;
            default:
                return t6.f21256v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f21404a) {
            case 0:
                return t6.V0(str);
            case 1:
                return t6.V0(str);
            default:
                return t6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f21404a) {
            case 0:
                return tz.H0;
            case 1:
                return tz.H0;
            default:
                return tz.H0;
        }
    }

    @Override
    public final int f(int i10) {
        switch (this.f21404a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return h(i10);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f21404a) {
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
        switch (this.f21404a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f21404a) {
            case 0:
                return ((x1) this.f21405b).f(i10);
            case 1:
                return ((k2) this.f21405b).getThemedColor(i10);
            default:
                return ((p51) this.f21405b).I(i10);
        }
    }

    @Override
    public final void i(int i10, int i11) {
        int i12 = this.f21404a;
    }

    @Override
    public final int j(int i10) {
        switch (this.f21404a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return h(i10);
        }
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }

    private final void m(int i10, int i11) {
    }
}
