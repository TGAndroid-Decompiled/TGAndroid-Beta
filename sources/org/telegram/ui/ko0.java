package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class ko0 implements org.telegram.ui.ActionBar.d6, r0.n, org.telegram.ui.Components.d81, org.telegram.ui.Components.uq0, org.telegram.ui.Components.cp0, org.telegram.ui.Components.so0 {
    public final int f38644a;
    public final Object f38645b;

    public ko0(Object obj, int i10) {
        this.f38644a = i10;
        this.f38645b = obj;
    }

    @Override
    public void B(int i10, int i11) {
        int i12 = this.f38644a;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.f38644a) {
            case 1:
                qv0 qv0Var = (qv0) this.f38645b;
                i0.b g10 = k1Var.f44835a.g(519);
                qv0Var.f40991r = g10;
                qv0Var.d.setPadding(g10.f12283a, g10.f12284b, g10.f12285c, g10.d);
                qv0Var.f40983c.requestLayout();
                return r0.k1.f44834b;
            default:
                yc1 yc1Var = (yc1) this.f38645b;
                i0.b g11 = k1Var.f44835a.g(519);
                yc1Var.f43457n = g11;
                yc1Var.f43452c.setPadding(g11.f12283a, g11.f12284b, g11.f12285c, g11.d);
                yc1Var.f43450b.requestLayout();
                return r0.k1.f44834b;
        }
    }

    @Override
    public int G(int i10) {
        switch (this.f38644a) {
            case 0:
                return w(i10);
            default:
                return ((gc1) this.f38645b).f37278f.f38516a.G(i10);
        }
    }

    @Override
    public void H() {
        ((StickersActivity) this.f38645b).j0();
    }

    @Override
    public void L(float f7, boolean z10) {
        switch (this.f38644a) {
            case 4:
                ka1 ka1Var = (ka1) this.f38645b;
                ThemeActivity.Y(ka1Var.d, Math.round((ka1Var.f38501b * f7) + 0), false);
                return;
            default:
                va1 va1Var = (va1) this.f38645b;
                ThemeActivity themeActivity = va1Var.h;
                int i10 = va1Var.f42158c;
                ThemeActivity.k0(themeActivity, Math.round(((va1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int Y() {
        switch (this.f38644a) {
            case 4:
                return ((ka1) this.f38645b).f38501b;
            default:
                va1 va1Var = (va1) this.f38645b;
                return va1Var.d - va1Var.f42158c;
        }
    }

    @Override
    public boolean a() {
        switch (this.f38644a) {
            case 0:
                return ((ip0) this.f38645b).S;
            default:
                return ((gc1) this.f38645b).f37278f.f38516a.a();
        }
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38645b;
        p31 p31Var = secretMediaViewer.f33837y;
        if (p31Var != null) {
            long p5 = p31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f33837y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f33837y.C();
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38645b;
        p31 p31Var = secretMediaViewer.f33837y;
        if (p31Var != null) {
            p31Var.B();
            long p5 = secretMediaViewer.f33837y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f33837y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.f38644a) {
            case 0:
                org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                return;
            default:
                kb1 kb1Var = ((gc1) this.f38645b).f37278f.f38516a;
                if (kb1Var != null) {
                    kb1Var.d(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ne1) this.f38645b).f39581t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        re1 re1Var = ((ne1) this.f38645b).f39581t0;
        HashSet hashSet = re1.f41147n1;
        re1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ne1) this.f38645b).f39581t0.finishPreviewFragment();
        }
    }

    @Override
    public void g0() {
        ((StickersActivity) this.f38645b).j0();
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38644a) {
            case 4:
                ka1 ka1Var = (ka1) this.f38645b;
                return String.valueOf(Math.round((ka1Var.f38500a.getProgress() * ka1Var.f38501b) + 0));
            default:
                va1 va1Var = (va1) this.f38645b;
                int i10 = va1Var.f42158c;
                return String.valueOf(Math.round((va1Var.f42157b.getProgress() * (va1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f38644a) {
            case 0:
                ip0 ip0Var = (ip0) this.f38645b;
                if (str.equals("drawableMsgIn")) {
                    return ip0Var.f38097w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return ip0Var.f38098x;
                }
                org.telegram.ui.ActionBar.d6 d6Var = ip0Var.f38096s;
                if (d6Var != null) {
                    return d6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.h6.P0(str);
            default:
                kc1 kc1Var = ((gc1) this.f38645b).f37278f;
                if (str.equals("drawableMsgOut")) {
                    return kc1Var.R;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return kc1Var.S;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return kc1Var.T;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return kc1Var.U;
                }
                kb1 kb1Var = kc1Var.f38516a;
                if (kb1Var != null) {
                    return kb1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public ColorFilter j() {
        switch (this.f38644a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.f21320v3;
            default:
                return org.telegram.ui.ActionBar.h6.f21320v3;
        }
    }

    @Override
    public Paint n(String str) {
        switch (this.f38644a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.T0(str);
            default:
                return ((gc1) this.f38645b).f37278f.f38516a.n(str);
        }
    }

    @Override
    public int r(int i10) {
        switch (this.f38644a) {
            case 0:
                return w(i10);
            default:
                return ((gc1) this.f38645b).f37278f.f38516a.w(i10);
        }
    }

    @Override
    public boolean s() {
        switch (this.f38644a) {
            case 0:
                return false;
            default:
                return ((gc1) this.f38645b).f37278f.f38516a.s();
        }
    }

    @Override
    public void v() {
        int i10 = this.f38644a;
    }

    @Override
    public int w(int i10) {
        switch (this.f38644a) {
            case 0:
                ip0 ip0Var = (ip0) this.f38645b;
                int indexOfKey = ip0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return ip0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.d6 d6Var = ip0Var.f38096s;
                if (d6Var != null) {
                    return d6Var.w(i10);
                }
                return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            default:
                return ((gc1) this.f38645b).f37278f.f38516a.w(i10);
        }
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }
}
