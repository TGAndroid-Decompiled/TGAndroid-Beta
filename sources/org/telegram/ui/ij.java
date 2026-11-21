package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class ij implements org.telegram.ui.ActionBar.h6 {
    public final int f48761a;
    public final Object f48762b;

    public ij(Object obj, int i7) {
        this.f48761a = i7;
        this.f48762b = obj;
    }

    @Override
    public final boolean d() {
        switch (this.f48761a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.I.q();
            case 1:
                return ((lm0) this.f48762b).T;
            default:
                return ((t71) this.f48762b).f52253f.f53711a.d();
        }
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        switch (this.f48761a) {
            case 0:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                return;
            default:
                w61 w61Var = ((t71) this.f48762b).f52253f.f53711a;
                if (w61Var != null) {
                    w61Var.e(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter f() {
        switch (this.f48761a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.f29710v3;
            case 1:
                return org.telegram.ui.ActionBar.m6.f29710v3;
            default:
                return org.telegram.ui.ActionBar.m6.f29710v3;
        }
    }

    @Override
    public final Paint g(String str) {
        switch (this.f48761a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.m6.V0(str);
            default:
                return ((t71) this.f48762b).f52253f.f53711a.g(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f48761a) {
            case 0:
                return null;
            case 1:
                lm0 lm0Var = (lm0) this.f48762b;
                if (str.equals("drawableMsgIn")) {
                    return lm0Var.f49656x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return lm0Var.f49657y;
                }
                org.telegram.ui.ActionBar.h6 h6Var = lm0Var.f49654s;
                if (h6Var != null) {
                    return h6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.m6.R0(str);
            default:
                x71 x71Var = ((t71) this.f48762b).f52253f;
                if (str.equals("drawableMsgOut")) {
                    return x71Var.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return x71Var.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return x71Var.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return x71Var.W;
                }
                w61 w61Var = x71Var.f53711a;
                if (w61Var != null) {
                    return w61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.m6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        switch (this.f48761a) {
            case 0:
                return org.telegram.messenger.bz.H0;
            case 1:
                return org.telegram.messenger.bz.H0;
            default:
                return org.telegram.messenger.bz.H0;
        }
    }

    @Override
    public final int i(int i7) {
        switch (this.f48761a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                return ((t71) this.f48762b).f52253f.f53711a.k(i7);
        }
    }

    @Override
    public final boolean j() {
        switch (this.f48761a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((t71) this.f48762b).f52253f.f53711a.j();
        }
    }

    @Override
    public final int k(int i7) {
        switch (this.f48761a) {
            case 0:
                return ((bn) this.f48762b).getThemedColor(i7);
            case 1:
                lm0 lm0Var = (lm0) this.f48762b;
                int indexOfKey = lm0Var.f49655w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return lm0Var.f49655w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.h6 h6Var = lm0Var.f49654s;
                if (h6Var != null) {
                    return h6Var.k(i7);
                }
                return org.telegram.ui.ActionBar.m6.v0(i7);
            default:
                return ((t71) this.f48762b).f52253f.f53711a.k(i7);
        }
    }

    @Override
    public final void l(int i7, int i10) {
        int i11 = this.f48761a;
    }

    @Override
    public final int m(int i7) {
        switch (this.f48761a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                return ((t71) this.f48762b).f52253f.f53711a.m(i7);
        }
    }

    private final void a(int i7, int i10) {
    }

    private final void b(int i7, int i10) {
    }

    private final void c(int i7, int i10) {
    }
}
