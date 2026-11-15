package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.p41;
public final class r1 implements e6 {
    public final int f29540a;
    public final Object f29541b;

    public r1(Object obj, int i7) {
        this.f29540a = i7;
        this.f29541b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f29540a) {
            case 0:
            case 1:
            default:
                return j6.I.q();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f29540a) {
            case 0:
                j6.r(f10, f11, i7, i10);
                return;
            case 1:
                j6.r(f10, f11, i7, i10);
                return;
            default:
                j6.r(f10, f11, i7, i10);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f29540a) {
            case 0:
                return j6.f29181v3;
            case 1:
                return j6.f29181v3;
            default:
                return j6.f29181v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f29540a) {
            case 0:
                return j6.V0(str);
            case 1:
                return j6.V0(str);
            default:
                return j6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f29540a) {
            case 0:
                return gz.H0;
            case 1:
                return gz.H0;
            default:
                return gz.H0;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f29540a) {
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
        switch (this.f29540a) {
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
        switch (this.f29540a) {
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
        switch (this.f29540a) {
            case 0:
                return ((t1) this.f29541b).f(i7);
            case 1:
                return ((e2) this.f29541b).getThemedColor(i7);
            default:
                return ((p41) this.f29541b).I(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f29540a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f29540a) {
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
