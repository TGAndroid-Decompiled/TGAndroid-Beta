package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.b51;
public final class r1 implements i6 {
    public final int f30016a;
    public final Object f30017b;

    public r1(Object obj, int i7) {
        this.f30016a = i7;
        this.f30017b = obj;
    }

    @Override
    public final boolean b() {
        switch (this.f30016a) {
            case 0:
            case 1:
            default:
                return n6.I.q();
        }
    }

    @Override
    public final void c(float f10, float f11, int i7, int i10) {
        switch (this.f30016a) {
            case 0:
                n6.r(f10, f11, i7, i10);
                return;
            case 1:
                n6.r(f10, f11, i7, i10);
                return;
            default:
                n6.r(f10, f11, i7, i10);
                return;
        }
    }

    @Override
    public final ColorFilter d() {
        switch (this.f30016a) {
            case 0:
                return n6.f29783v3;
            case 1:
                return n6.f29783v3;
            default:
                return n6.f29783v3;
        }
    }

    @Override
    public final Paint e(String str) {
        switch (this.f30016a) {
            case 0:
                return n6.V0(str);
            case 1:
                return n6.V0(str);
            default:
                return n6.V0(str);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f30016a) {
            case 0:
                return bz.H0;
            case 1:
                return bz.H0;
            default:
                return bz.H0;
        }
    }

    @Override
    public final int g(int i7) {
        switch (this.f30016a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                return i(i7);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f30016a) {
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
        switch (this.f30016a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int i(int i7) {
        switch (this.f30016a) {
            case 0:
                return ((t1) this.f30017b).f(i7);
            case 1:
                return ((g2) this.f30017b).getThemedColor(i7);
            default:
                return ((b51) this.f30017b).I(i7);
        }
    }

    @Override
    public final void j(int i7, int i10) {
        int i11 = this.f30016a;
    }

    @Override
    public final int k(int i7) {
        switch (this.f30016a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                return i(i7);
        }
    }

    private final void a(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
