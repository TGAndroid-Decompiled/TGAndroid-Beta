package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class jj implements org.telegram.ui.ActionBar.h6 {
    public final int f47021a;
    public final Object f47022b;

    public jj(Object obj, int i7) {
        this.f47021a = i7;
        this.f47022b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f47021a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.I.q();
            case 1:
                return ((km0) this.f47022b).S;
            default:
                return ((t71) this.f47022b).f50196f.f51561a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f47021a) {
            case 0:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                return;
            default:
                y61 y61Var = ((t71) this.f47022b).f50196f.f51561a;
                if (y61Var != null) {
                    y61Var.b(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f47021a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.f28222v3;
            case 1:
                return org.telegram.ui.ActionBar.m6.f28222v3;
            default:
                return org.telegram.ui.ActionBar.m6.f28222v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f47021a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.m6.V0(str);
            default:
                return ((t71) this.f47022b).f50196f.f51561a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f47021a) {
            case 0:
                return org.telegram.messenger.iz.H0;
            case 1:
                return org.telegram.messenger.iz.H0;
            default:
                return org.telegram.messenger.iz.H0;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f47021a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((t71) this.f47022b).f50196f.f51561a.h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f47021a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((t71) this.f47022b).f50196f.f51561a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f47021a) {
            case 0:
                return null;
            case 1:
                km0 km0Var = (km0) this.f47022b;
                if (str.equals("drawableMsgIn")) {
                    return km0Var.f47380x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return km0Var.f47381y;
                }
                org.telegram.ui.ActionBar.h6 h6Var = km0Var.f47378s;
                if (h6Var != null) {
                    return h6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.m6.R0(str);
            default:
                x71 x71Var = ((t71) this.f47022b).f50196f;
                if (str.equals("drawableMsgOut")) {
                    return x71Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return x71Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return x71Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return x71Var.V;
                }
                y61 y61Var = x71Var.f51561a;
                if (y61Var != null) {
                    return y61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.m6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f47021a) {
            case 0:
                return ((cn) this.f47022b).getThemedColor(i7);
            case 1:
                km0 km0Var = (km0) this.f47022b;
                int indexOfKey = km0Var.f47379w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return km0Var.f47379w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.h6 h6Var = km0Var.f47378s;
                if (h6Var != null) {
                    return h6Var.h(i7);
                }
                return org.telegram.ui.ActionBar.m6.v0(i7);
            default:
                return ((t71) this.f47022b).f50196f.f51561a.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f47021a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f47021a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((t71) this.f47022b).f50196f.f51561a.j(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
