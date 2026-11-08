package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class hj implements org.telegram.ui.ActionBar.f6 {
    public final int f46390a;
    public final Object f46391b;

    public hj(Object obj, int i7) {
        this.f46390a = i7;
        this.f46391b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f46390a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((hm0) this.f46391b).S;
            default:
                return ((r71) this.f46391b).f49413f.f50520a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f46390a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                return;
            default:
                w61 w61Var = ((r71) this.f46391b).f49413f.f50520a;
                if (w61Var != null) {
                    w61Var.b(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f46390a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.f28184v3;
            case 1:
                return org.telegram.ui.ActionBar.k6.f28184v3;
            default:
                return org.telegram.ui.ActionBar.k6.f28184v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f46390a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                return ((r71) this.f46391b).f49413f.f50520a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f46390a) {
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
        switch (this.f46390a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((r71) this.f46391b).f49413f.f50520a.h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f46390a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((r71) this.f46391b).f49413f.f50520a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f46390a) {
            case 0:
                return null;
            case 1:
                hm0 hm0Var = (hm0) this.f46391b;
                if (str.equals("drawableMsgIn")) {
                    return hm0Var.f46461x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return hm0Var.f46462y;
                }
                org.telegram.ui.ActionBar.f6 f6Var = hm0Var.f46459s;
                if (f6Var != null) {
                    return f6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.R0(str);
            default:
                v71 v71Var = ((r71) this.f46391b).f49413f;
                if (str.equals("drawableMsgOut")) {
                    return v71Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return v71Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return v71Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return v71Var.V;
                }
                w61 w61Var = v71Var.f50520a;
                if (w61Var != null) {
                    return w61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f46390a) {
            case 0:
                return ((an) this.f46391b).getThemedColor(i7);
            case 1:
                hm0 hm0Var = (hm0) this.f46391b;
                int indexOfKey = hm0Var.f46460w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return hm0Var.f46460w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.f6 f6Var = hm0Var.f46459s;
                if (f6Var != null) {
                    return f6Var.h(i7);
                }
                return org.telegram.ui.ActionBar.k6.v0(i7);
            default:
                return ((r71) this.f46391b).f49413f.f50520a.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f46390a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f46390a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((r71) this.f46391b).f49413f.f50520a.j(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
