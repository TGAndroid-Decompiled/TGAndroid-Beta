package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class c2 implements u6 {
    public final int f22496a;
    public final Object f22497b;

    public c2(Object obj, int i10) {
        this.f22496a = i10;
        this.f22497b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f22496a) {
            case 0:
            default:
                return y6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f22496a) {
            case 0:
                y6.q(f7, f10, i10, i11);
                return;
            default:
                y6.q(f7, f10, i10, i11);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f22496a) {
            case 0:
                return y6.f23689v3;
            default:
                return y6.f23689v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f22496a) {
            case 0:
                return y6.U0(str);
            default:
                return y6.U0(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f22496a) {
            case 0:
                return g(i10);
            default:
                return g(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f22496a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f22496a) {
            case 0:
                return ((e2) this.f22497b).f(i10);
            default:
                return ((r2) this.f22497b).getThemedColor(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f22496a) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final void h(int i10, int i11) {
        int i12 = this.f22496a;
    }

    @Override
    public final int i(int i10) {
        switch (this.f22496a) {
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
