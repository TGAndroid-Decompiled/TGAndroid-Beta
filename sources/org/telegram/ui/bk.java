package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class bk implements org.telegram.ui.ActionBar.p6 {
    public final int f36271a;
    public final Object f36272b;

    public bk(Object obj, int i10) {
        this.f36271a = i10;
        this.f36272b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f36271a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.I.q();
            case 1:
                return ((tn0) this.f36272b).S;
            default:
                return ((i91) this.f36272b).f38217f.f39537a.a();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f36271a) {
            case 0:
                org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                return;
            case 1:
                org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                return;
            default:
                n81 n81Var = ((i91) this.f36272b).f38217f.f39537a;
                if (n81Var != null) {
                    n81Var.b(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f36271a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.f21256v3;
            case 1:
                return org.telegram.ui.ActionBar.t6.f21256v3;
            default:
                return org.telegram.ui.ActionBar.t6.f21256v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f36271a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.t6.V0(str);
            default:
                return ((i91) this.f36272b).f38217f.f39537a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f36271a) {
            case 0:
                return org.telegram.messenger.tz.H0;
            case 1:
                return org.telegram.messenger.tz.H0;
            default:
                return org.telegram.messenger.tz.H0;
        }
    }

    @Override
    public final int f(int i10) {
        switch (this.f36271a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return ((i91) this.f36272b).f38217f.f39537a.h(i10);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f36271a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((i91) this.f36272b).f38217f.f39537a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f36271a) {
            case 0:
                return null;
            case 1:
                tn0 tn0Var = (tn0) this.f36272b;
                if (str.equals("drawableMsgIn")) {
                    return tn0Var.f41880x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return tn0Var.f41881y;
                }
                org.telegram.ui.ActionBar.p6 p6Var = tn0Var.f41878s;
                if (p6Var != null) {
                    return p6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.t6.R0(str);
            default:
                m91 m91Var = ((i91) this.f36272b).f38217f;
                if (str.equals("drawableMsgOut")) {
                    return m91Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return m91Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return m91Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return m91Var.V;
                }
                n81 n81Var = m91Var.f39537a;
                if (n81Var != null) {
                    return n81Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.t6.R0(str);
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f36271a) {
            case 0:
                return ((un) this.f36272b).getThemedColor(i10);
            case 1:
                tn0 tn0Var = (tn0) this.f36272b;
                int indexOfKey = tn0Var.f41879w.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return tn0Var.f41879w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.p6 p6Var = tn0Var.f41878s;
                if (p6Var != null) {
                    return p6Var.h(i10);
                }
                return org.telegram.ui.ActionBar.t6.v0(i10);
            default:
                return ((i91) this.f36272b).f38217f.f39537a.h(i10);
        }
    }

    @Override
    public final void i(int i10, int i11) {
        int i12 = this.f36271a;
    }

    @Override
    public final int j(int i10) {
        switch (this.f36271a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return ((i91) this.f36272b).f38217f.f39537a.j(i10);
        }
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }

    private final void m(int i10, int i11) {
    }
}
