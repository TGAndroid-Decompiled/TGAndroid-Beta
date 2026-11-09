package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class jj implements org.telegram.ui.ActionBar.g6 {
    public final int f46978a;
    public final Object f46979b;

    public jj(Object obj, int i7) {
        this.f46978a = i7;
        this.f46979b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f46978a) {
            case 0:
                return org.telegram.ui.ActionBar.l6.I.q();
            case 1:
                return ((jm0) this.f46979b).S;
            default:
                return ((s71) this.f46979b).f49822f.f50902a.a();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f46978a) {
            case 0:
                org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
                return;
            default:
                x61 x61Var = ((s71) this.f46979b).f49822f.f50902a;
                if (x61Var != null) {
                    x61Var.b(f10, f11, i7, i10);
                    return;
                } else {
                    org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f46978a) {
            case 0:
                return org.telegram.ui.ActionBar.l6.f28197v3;
            case 1:
                return org.telegram.ui.ActionBar.l6.f28197v3;
            default:
                return org.telegram.ui.ActionBar.l6.f28197v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f46978a) {
            case 0:
                return org.telegram.ui.ActionBar.l6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.l6.V0(str);
            default:
                return ((s71) this.f46979b).f49822f.f50902a.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f46978a) {
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
        switch (this.f46978a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((s71) this.f46979b).f49822f.f50902a.h(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f46978a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((s71) this.f46979b).f49822f.f50902a.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f46978a) {
            case 0:
                return null;
            case 1:
                jm0 jm0Var = (jm0) this.f46979b;
                if (str.equals("drawableMsgIn")) {
                    return jm0Var.f47049x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return jm0Var.f47050y;
                }
                org.telegram.ui.ActionBar.g6 g6Var = jm0Var.f47047s;
                if (g6Var != null) {
                    return g6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.l6.R0(str);
            default:
                w71 w71Var = ((s71) this.f46979b).f49822f;
                if (str.equals("drawableMsgOut")) {
                    return w71Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return w71Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return w71Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return w71Var.V;
                }
                x61 x61Var = w71Var.f50902a;
                if (x61Var != null) {
                    return x61Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.l6.R0(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f46978a) {
            case 0:
                return ((cn) this.f46979b).getThemedColor(i7);
            case 1:
                jm0 jm0Var = (jm0) this.f46979b;
                int indexOfKey = jm0Var.f47048w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return jm0Var.f47048w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.g6 g6Var = jm0Var.f47047s;
                if (g6Var != null) {
                    return g6Var.h(i7);
                }
                return org.telegram.ui.ActionBar.l6.v0(i7);
            default:
                return ((s71) this.f46979b).f49822f.f50902a.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        int i11 = this.f46978a;
    }

    @Override
    public final int j(int i7) {
        switch (this.f46978a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((s71) this.f46979b).f49822f.f50902a.j(i7);
        }
    }

    private final void k(int i7, int i10) {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
