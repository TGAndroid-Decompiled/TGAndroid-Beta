package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class bk implements org.telegram.ui.ActionBar.p6 {
    public final int f36075a;
    public final Object f36076b;

    public bk(Object obj, int i10) {
        this.f36075a = i10;
        this.f36076b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f36075a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.I.q();
            case 1:
                return ((rn0) this.f36076b).S;
            default:
                return ((g91) this.f36076b).f37436f.f38712a.a();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f36075a) {
            case 0:
                org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                return;
            case 1:
                org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                return;
            default:
                l81 l81Var = ((g91) this.f36076b).f37436f.f38712a;
                if (l81Var != null) {
                    l81Var.b(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f36075a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.f21257v3;
            case 1:
                return org.telegram.ui.ActionBar.t6.f21257v3;
            default:
                return org.telegram.ui.ActionBar.t6.f21257v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f36075a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.t6.V0(str);
            default:
                return ((g91) this.f36076b).f37436f.f38712a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f36075a) {
            case 0:
                return org.telegram.messenger.uz.H0;
            case 1:
                return org.telegram.messenger.uz.H0;
            default:
                return org.telegram.messenger.uz.H0;
        }
    }

    @Override
    public final int f(int i10) {
        switch (this.f36075a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return ((g91) this.f36076b).f37436f.f38712a.h(i10);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f36075a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((g91) this.f36076b).f37436f.f38712a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f36075a) {
            case 0:
                return null;
            case 1:
                rn0 rn0Var = (rn0) this.f36076b;
                if (str.equals("drawableMsgIn")) {
                    return rn0Var.f41122x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return rn0Var.f41123y;
                }
                org.telegram.ui.ActionBar.p6 p6Var = rn0Var.f41120s;
                if (p6Var != null) {
                    return p6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.t6.R0(str);
            default:
                k91 k91Var = ((g91) this.f36076b).f37436f;
                if (str.equals("drawableMsgOut")) {
                    return k91Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return k91Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return k91Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return k91Var.V;
                }
                l81 l81Var = k91Var.f38712a;
                if (l81Var != null) {
                    return l81Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.t6.R0(str);
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f36075a) {
            case 0:
                return ((un) this.f36076b).getThemedColor(i10);
            case 1:
                rn0 rn0Var = (rn0) this.f36076b;
                int indexOfKey = rn0Var.f41121w.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return rn0Var.f41121w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.p6 p6Var = rn0Var.f41120s;
                if (p6Var != null) {
                    return p6Var.h(i10);
                }
                return org.telegram.ui.ActionBar.t6.v0(i10);
            default:
                return ((g91) this.f36076b).f37436f.f38712a.h(i10);
        }
    }

    @Override
    public final void i(int i10, int i11) {
        int i12 = this.f36075a;
    }

    @Override
    public final int j(int i10) {
        switch (this.f36075a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return ((g91) this.f36076b).f37436f.f38712a.j(i10);
        }
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }

    private final void m(int i10, int i11) {
    }
}
