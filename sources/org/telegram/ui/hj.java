package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class hj implements org.telegram.ui.ActionBar.f6 {
    public final int f46372a;
    public final Object f46373b;

    public hj(Object obj, int i7) {
        this.f46372a = i7;
        this.f46373b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f46372a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((hm0) this.f46373b).S;
            default:
                return ((q71) this.f46373b).f49138f.f50244a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f46372a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                return;
            default:
                v61 v61Var = ((q71) this.f46373b).f49138f.f50244a;
                if (v61Var != null) {
                    v61Var.b(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f46372a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.f28180v3;
            case 1:
                return org.telegram.ui.ActionBar.k6.f28180v3;
            default:
                return org.telegram.ui.ActionBar.k6.f28180v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f46372a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                return ((q71) this.f46373b).f49138f.f50244a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f46372a) {
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
        switch (this.f46372a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((q71) this.f46373b).f49138f.f50244a.h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f46372a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((q71) this.f46373b).f49138f.f50244a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f46372a) {
            case 0:
                return null;
            case 1:
                hm0 hm0Var = (hm0) this.f46373b;
                if (str.equals("drawableMsgIn")) {
                    return hm0Var.f46443x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return hm0Var.f46444y;
                }
                org.telegram.ui.ActionBar.f6 f6Var = hm0Var.f46441s;
                if (f6Var != null) {
                    return f6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.R0(str);
            default:
                u71 u71Var = ((q71) this.f46373b).f49138f;
                if (str.equals("drawableMsgOut")) {
                    return u71Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return u71Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return u71Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return u71Var.V;
                }
                v61 v61Var = u71Var.f50244a;
                if (v61Var != null) {
                    return v61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f46372a) {
            case 0:
                return ((an) this.f46373b).getThemedColor(i7);
            case 1:
                hm0 hm0Var = (hm0) this.f46373b;
                int indexOfKey = hm0Var.f46442w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return hm0Var.f46442w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.f6 f6Var = hm0Var.f46441s;
                if (f6Var != null) {
                    return f6Var.h(i7);
                }
                return org.telegram.ui.ActionBar.k6.v0(i7);
            default:
                return ((q71) this.f46373b).f49138f.f50244a.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f46372a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f46372a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((q71) this.f46373b).f49138f.f50244a.j(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
