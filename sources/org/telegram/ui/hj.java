package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class hj implements org.telegram.ui.ActionBar.e6 {
    public final int f47708a;
    public final Object f47709b;

    public hj(Object obj, int i7) {
        this.f47708a = i7;
        this.f47709b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f47708a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.I.q();
            case 1:
                return ((jm0) this.f47709b).T;
            default:
                return ((p71) this.f47709b).f50156f.f51409a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f47708a) {
            case 0:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                return;
            default:
                s61 s61Var = ((p71) this.f47709b).f50156f.f51409a;
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
        switch (this.f47708a) {
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
        switch (this.f47708a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.j6.V0(str);
            default:
                return ((p71) this.f47709b).f50156f.f51409a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f47708a) {
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
        switch (this.f47708a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((p71) this.f47709b).f50156f.f51409a.h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f47708a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((p71) this.f47709b).f50156f.f51409a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f47708a) {
            case 0:
                return null;
            case 1:
                jm0 jm0Var = (jm0) this.f47709b;
                if (str.equals("drawableMsgIn")) {
                    return jm0Var.f48382x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return jm0Var.f48383y;
                }
                org.telegram.ui.ActionBar.e6 e6Var = jm0Var.f48380s;
                if (e6Var != null) {
                    return e6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.j6.R0(str);
            default:
                t71 t71Var = ((p71) this.f47709b).f50156f;
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
                s61 s61Var = t71Var.f51409a;
                if (s61Var != null) {
                    return s61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.j6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f47708a) {
            case 0:
                return ((an) this.f47709b).getThemedColor(i7);
            case 1:
                jm0 jm0Var = (jm0) this.f47709b;
                int indexOfKey = jm0Var.f48381w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return jm0Var.f48381w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.e6 e6Var = jm0Var.f48380s;
                if (e6Var != null) {
                    return e6Var.h(i7);
                }
                return org.telegram.ui.ActionBar.j6.v0(i7);
            default:
                return ((p71) this.f47709b).f50156f.f51409a.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f47708a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f47708a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((p71) this.f47709b).f50156f.f51409a.j(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
