package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class dj implements org.telegram.ui.ActionBar.e6 {
    public final int f44720a;
    public final Object f44721b;

    public dj(Object obj, int i3) {
        this.f44720a = i3;
        this.f44721b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f44720a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((cm0) this.f44721b).T;
            default:
                return ((h71) this.f44721b).f45849f.f47141a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        switch (this.f44720a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                return;
            default:
                l61 l61Var = ((h71) this.f44721b).f45849f.f47141a;
                if (l61Var != null) {
                    l61Var.b(f10, f11, i3, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f44720a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.f28211v3;
            case 1:
                return org.telegram.ui.ActionBar.k6.f28211v3;
            default:
                return org.telegram.ui.ActionBar.k6.f28211v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f44720a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                return ((h71) this.f44721b).f45849f.f47141a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f44720a) {
            case 0:
                return org.telegram.messenger.az.H0;
            case 1:
                return org.telegram.messenger.az.H0;
            default:
                return org.telegram.messenger.az.H0;
        }
    }

    @Override
    public final int f(int i3) {
        switch (this.f44720a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                return ((h71) this.f44721b).f45849f.f47141a.h(i3);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f44720a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((h71) this.f44721b).f45849f.f47141a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f44720a) {
            case 0:
                return null;
            case 1:
                cm0 cm0Var = (cm0) this.f44721b;
                if (str.equals("drawableMsgIn")) {
                    return cm0Var.f44402x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return cm0Var.f44403y;
                }
                org.telegram.ui.ActionBar.e6 e6Var = cm0Var.f44400s;
                if (e6Var != null) {
                    return e6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.R0(str);
            default:
                l71 l71Var = ((h71) this.f44721b).f45849f;
                if (str.equals("drawableMsgOut")) {
                    return l71Var.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return l71Var.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return l71Var.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return l71Var.W;
                }
                l61 l61Var = l71Var.f47141a;
                if (l61Var != null) {
                    return l61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.R0(str);
        }
    }

    @Override
    public final int h(int i3) {
        switch (this.f44720a) {
            case 0:
                return ((wm) this.f44721b).getThemedColor(i3);
            case 1:
                cm0 cm0Var = (cm0) this.f44721b;
                int indexOfKey = cm0Var.f44401w.indexOfKey(i3);
                if (indexOfKey >= 0) {
                    return cm0Var.f44401w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.e6 e6Var = cm0Var.f44400s;
                if (e6Var != null) {
                    return e6Var.h(i3);
                }
                return org.telegram.ui.ActionBar.k6.v0(i3);
            default:
                return ((h71) this.f44721b).f45849f.f47141a.h(i3);
        }
    }

    @Override
    public final void i(int i3, int i10) {
        int i11 = this.f44720a;
    }

    @Override
    public final int j(int i3) {
        switch (this.f44720a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                return ((h71) this.f44721b).f45849f.f47141a.j(i3);
        }
    }

    private final void k(int i3, int i10) {
    }

    private final void l(int i3, int i10) {
    }

    private final void m(int i3, int i10) {
    }
}
