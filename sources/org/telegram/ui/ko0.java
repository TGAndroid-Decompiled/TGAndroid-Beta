package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class ko0 implements org.telegram.ui.ActionBar.d6, r0.n, org.telegram.ui.Components.c81, org.telegram.ui.Components.tq0, org.telegram.ui.Components.bp0, org.telegram.ui.Components.ro0 {
    public final int f38638a;
    public final Object f38639b;

    public ko0(Object obj, int i10) {
        this.f38638a = i10;
        this.f38639b = obj;
    }

    @Override
    public void B(int i10, int i11) {
        int i12 = this.f38638a;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.f38638a) {
            case 1:
                qv0 qv0Var = (qv0) this.f38639b;
                i0.b g10 = k1Var.f44827a.g(519);
                qv0Var.f40985r = g10;
                qv0Var.d.setPadding(g10.f12283a, g10.f12284b, g10.f12285c, g10.d);
                qv0Var.f40977c.requestLayout();
                return r0.k1.f44826b;
            default:
                yc1 yc1Var = (yc1) this.f38639b;
                i0.b g11 = k1Var.f44827a.g(519);
                yc1Var.f43451n = g11;
                yc1Var.f43446c.setPadding(g11.f12283a, g11.f12284b, g11.f12285c, g11.d);
                yc1Var.f43444b.requestLayout();
                return r0.k1.f44826b;
        }
    }

    @Override
    public int G(int i10) {
        switch (this.f38638a) {
            case 0:
                return w(i10);
            default:
                return ((gc1) this.f38639b).f37272f.f38510a.G(i10);
        }
    }

    @Override
    public void H() {
        ((StickersActivity) this.f38639b).j0();
    }

    @Override
    public void L(float f7, boolean z10) {
        switch (this.f38638a) {
            case 4:
                ka1 ka1Var = (ka1) this.f38639b;
                ThemeActivity.Y(ka1Var.d, Math.round((ka1Var.f38495b * f7) + 0), false);
                return;
            default:
                va1 va1Var = (va1) this.f38639b;
                ThemeActivity themeActivity = va1Var.h;
                int i10 = va1Var.f42152c;
                ThemeActivity.k0(themeActivity, Math.round(((va1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int Y() {
        switch (this.f38638a) {
            case 4:
                return ((ka1) this.f38639b).f38495b;
            default:
                va1 va1Var = (va1) this.f38639b;
                return va1Var.d - va1Var.f42152c;
        }
    }

    @Override
    public boolean a() {
        switch (this.f38638a) {
            case 0:
                return ((ip0) this.f38639b).S;
            default:
                return ((gc1) this.f38639b).f37272f.f38510a.a();
        }
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38639b;
        p31 p31Var = secretMediaViewer.f33831y;
        if (p31Var != null) {
            long p5 = p31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f33831y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f33831y.C();
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38639b;
        p31 p31Var = secretMediaViewer.f33831y;
        if (p31Var != null) {
            p31Var.B();
            long p5 = secretMediaViewer.f33831y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f33831y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.f38638a) {
            case 0:
                org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                return;
            default:
                kb1 kb1Var = ((gc1) this.f38639b).f37272f.f38510a;
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
            ((ne1) this.f38639b).f39575t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        re1 re1Var = ((ne1) this.f38639b).f39575t0;
        HashSet hashSet = re1.f41141n1;
        re1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ne1) this.f38639b).f39575t0.finishPreviewFragment();
        }
    }

    @Override
    public void g0() {
        ((StickersActivity) this.f38639b).j0();
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38638a) {
            case 4:
                ka1 ka1Var = (ka1) this.f38639b;
                return String.valueOf(Math.round((ka1Var.f38494a.getProgress() * ka1Var.f38495b) + 0));
            default:
                va1 va1Var = (va1) this.f38639b;
                int i10 = va1Var.f42152c;
                return String.valueOf(Math.round((va1Var.f42151b.getProgress() * (va1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f38638a) {
            case 0:
                ip0 ip0Var = (ip0) this.f38639b;
                if (str.equals("drawableMsgIn")) {
                    return ip0Var.f38091w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return ip0Var.f38092x;
                }
                org.telegram.ui.ActionBar.d6 d6Var = ip0Var.f38090s;
                if (d6Var != null) {
                    return d6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.h6.P0(str);
            default:
                kc1 kc1Var = ((gc1) this.f38639b).f37272f;
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
                kb1 kb1Var = kc1Var.f38510a;
                if (kb1Var != null) {
                    return kb1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public ColorFilter j() {
        switch (this.f38638a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.f21317v3;
            default:
                return org.telegram.ui.ActionBar.h6.f21317v3;
        }
    }

    @Override
    public Paint n(String str) {
        switch (this.f38638a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.T0(str);
            default:
                return ((gc1) this.f38639b).f37272f.f38510a.n(str);
        }
    }

    @Override
    public int r(int i10) {
        switch (this.f38638a) {
            case 0:
                return w(i10);
            default:
                return ((gc1) this.f38639b).f37272f.f38510a.w(i10);
        }
    }

    @Override
    public boolean s() {
        switch (this.f38638a) {
            case 0:
                return false;
            default:
                return ((gc1) this.f38639b).f37272f.f38510a.s();
        }
    }

    @Override
    public void v() {
        int i10 = this.f38638a;
    }

    @Override
    public int w(int i10) {
        switch (this.f38638a) {
            case 0:
                ip0 ip0Var = (ip0) this.f38639b;
                int indexOfKey = ip0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return ip0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.d6 d6Var = ip0Var.f38090s;
                if (d6Var != null) {
                    return d6Var.w(i10);
                }
                return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            default:
                return ((gc1) this.f38639b).f37272f.f38510a.w(i10);
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
