package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class ij implements org.telegram.ui.ActionBar.i6 {
    public final int f48823a;
    public final Object f48824b;

    public ij(Object obj, int i7) {
        this.f48823a = i7;
        this.f48824b = obj;
    }

    @Override
    public final boolean b() {
        switch (this.f48823a) {
            case 0:
                return org.telegram.ui.ActionBar.n6.I.q();
            case 1:
                return ((jm0) this.f48824b).T;
            default:
                return ((r71) this.f48824b).f51654f.f52845a.b();
        }
    }

    @Override
    public final void c(float f10, float f11, int i7, int i10) {
        switch (this.f48823a) {
            case 0:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                return;
            default:
                u61 u61Var = ((r71) this.f48824b).f51654f.f52845a;
                if (u61Var != null) {
                    u61Var.c(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter d() {
        switch (this.f48823a) {
            case 0:
                return org.telegram.ui.ActionBar.n6.f29783v3;
            case 1:
                return org.telegram.ui.ActionBar.n6.f29783v3;
            default:
                return org.telegram.ui.ActionBar.n6.f29783v3;
        }
    }

    @Override
    public final Paint e(String str) {
        switch (this.f48823a) {
            case 0:
                return org.telegram.ui.ActionBar.n6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.n6.V0(str);
            default:
                return ((r71) this.f48824b).f51654f.f52845a.e(str);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f48823a) {
            case 0:
                return org.telegram.messenger.bz.H0;
            case 1:
                return org.telegram.messenger.bz.H0;
            default:
                return org.telegram.messenger.bz.H0;
        }
    }

    @Override
    public final int g(int i7) {
        switch (this.f48823a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                return ((r71) this.f48824b).f51654f.f52845a.i(i7);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f48823a) {
            case 0:
                return null;
            case 1:
                jm0 jm0Var = (jm0) this.f48824b;
                if (str.equals("drawableMsgIn")) {
                    return jm0Var.f49168x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return jm0Var.f49169y;
                }
                org.telegram.ui.ActionBar.i6 i6Var = jm0Var.f49166s;
                if (i6Var != null) {
                    return i6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.n6.R0(str);
            default:
                v71 v71Var = ((r71) this.f48824b).f51654f;
                if (str.equals("drawableMsgOut")) {
                    return v71Var.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return v71Var.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return v71Var.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return v71Var.W;
                }
                u61 u61Var = v71Var.f52845a;
                if (u61Var != null) {
                    return u61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.n6.R0(str);
        }
    }

    @Override
    public final boolean h() {
        switch (this.f48823a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((r71) this.f48824b).f51654f.f52845a.h();
        }
    }

    @Override
    public final int i(int i7) {
        switch (this.f48823a) {
            case 0:
                return ((bn) this.f48824b).getThemedColor(i7);
            case 1:
                jm0 jm0Var = (jm0) this.f48824b;
                int indexOfKey = jm0Var.f49167w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return jm0Var.f49167w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.i6 i6Var = jm0Var.f49166s;
                if (i6Var != null) {
                    return i6Var.i(i7);
                }
                return org.telegram.ui.ActionBar.n6.v0(i7);
            default:
                return ((r71) this.f48824b).f51654f.f52845a.i(i7);
        }
    }

    @Override
    public final void j(int i7, int i10) {
        int i11 = this.f48823a;
    }

    @Override
    public final int k(int i7) {
        switch (this.f48823a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                return ((r71) this.f48824b).f51654f.f52845a.k(i7);
        }
    }

    private final void a(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
