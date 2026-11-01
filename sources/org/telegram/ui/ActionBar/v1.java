package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.q51;
public final class v1 implements p6 {
    public final int f21405a;
    public final Object f21406b;

    public v1(Object obj, int i10) {
        this.f21405a = i10;
        this.f21406b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f21405a) {
            case 0:
            case 1:
            default:
                return t6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f21405a) {
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
        switch (this.f21405a) {
            case 0:
                return t6.f21257v3;
            case 1:
                return t6.f21257v3;
            default:
                return t6.f21257v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f21405a) {
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
        switch (this.f21405a) {
            case 0:
                return uz.H0;
            case 1:
                return uz.H0;
            default:
                return uz.H0;
        }
    }

    @Override
    public final int f(int i10) {
        switch (this.f21405a) {
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
        switch (this.f21405a) {
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
        switch (this.f21405a) {
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
        switch (this.f21405a) {
            case 0:
                return ((x1) this.f21406b).f(i10);
            case 1:
                return ((k2) this.f21406b).getThemedColor(i10);
            default:
                return ((q51) this.f21406b).I(i10);
        }
    }

    @Override
    public final void i(int i10, int i11) {
        int i12 = this.f21405a;
    }

    @Override
    public final int j(int i10) {
        switch (this.f21405a) {
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
