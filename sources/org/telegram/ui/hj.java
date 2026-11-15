package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class hj implements org.telegram.ui.ActionBar.e6 {
    public final int f47718a;
    public final Object f47719b;

    public hj(Object obj, int i7) {
        this.f47718a = i7;
        this.f47719b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f47718a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.I.q();
            case 1:
                return ((im0) this.f47719b).T;
            default:
                return ((p71) this.f47719b).f50179f.f51408a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f47718a) {
            case 0:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                return;
            default:
                s61 s61Var = ((p71) this.f47719b).f50179f.f51408a;
                if (s61Var != null) {
                    s61Var.b(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f47718a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.f29181v3;
            case 1:
                return org.telegram.ui.ActionBar.j6.f29181v3;
            default:
                return org.telegram.ui.ActionBar.j6.f29181v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f47718a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.j6.V0(str);
            default:
                return ((p71) this.f47719b).f50179f.f51408a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f47718a) {
            case 0:
                return org.telegram.messenger.gz.H0;
            case 1:
                return org.telegram.messenger.gz.H0;
            default:
                return org.telegram.messenger.gz.H0;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f47718a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((p71) this.f47719b).f50179f.f51408a.h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f47718a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((p71) this.f47719b).f50179f.f51408a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f47718a) {
            case 0:
                return null;
            case 1:
                im0 im0Var = (im0) this.f47719b;
                if (str.equals("drawableMsgIn")) {
                    return im0Var.f48098x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return im0Var.f48099y;
                }
                org.telegram.ui.ActionBar.e6 e6Var = im0Var.f48096s;
                if (e6Var != null) {
                    return e6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.j6.R0(str);
            default:
                t71 t71Var = ((p71) this.f47719b).f50179f;
                if (str.equals("drawableMsgOut")) {
                    return t71Var.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return t71Var.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return t71Var.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return t71Var.W;
                }
                s61 s61Var = t71Var.f51408a;
                if (s61Var != null) {
                    return s61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.j6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f47718a) {
            case 0:
                return ((an) this.f47719b).getThemedColor(i7);
            case 1:
                im0 im0Var = (im0) this.f47719b;
                int indexOfKey = im0Var.f48097w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return im0Var.f48097w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.e6 e6Var = im0Var.f48096s;
                if (e6Var != null) {
                    return e6Var.h(i7);
                }
                return org.telegram.ui.ActionBar.j6.v0(i7);
            default:
                return ((p71) this.f47719b).f50179f.f51408a.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f47718a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f47718a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((p71) this.f47719b).f50179f.f51408a.j(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
