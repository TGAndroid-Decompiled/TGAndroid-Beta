package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 implements r0.n, org.telegram.ui.Components.r81, org.telegram.ui.Components.hr0, org.telegram.ui.Components.pp0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.fp0 {
    public final int f39859a;
    public final Object f39860b;

    public lw0(Object obj, int i10) {
        this.f39859a = i10;
        this.f39860b = obj;
    }

    @Override
    public Paint G(String str) {
        return ((vd1) this.f39860b).f42768f.f44734a.G(str);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.f39859a) {
            case 0:
                ow0 ow0Var = (ow0) this.f39860b;
                i0.b g10 = k1Var.f47000a.g(519);
                ow0Var.f40801r = g10;
                ow0Var.d.setPadding(g10.f11574a, g10.f11575b, g10.f11576c, g10.d);
                ow0Var.f40792c.requestLayout();
                return r0.k1.f46999b;
            default:
                oe1 oe1Var = (oe1) this.f39860b;
                i0.b g11 = k1Var.f47000a.g(519);
                oe1Var.f40697n = g11;
                oe1Var.f40691c.setPadding(g11.f11574a, g11.f11575b, g11.f11576c, g11.d);
                oe1Var.f40689b.requestLayout();
                return r0.k1.f46999b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f39860b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f39859a) {
            case 3:
                zb1 zb1Var = (zb1) this.f39860b;
                ThemeActivity.Y(zb1Var.d, Math.round((zb1Var.f44714b * f7) + 0), false);
                return;
            default:
                kc1 kc1Var = (kc1) this.f39860b;
                ThemeActivity themeActivity = kc1Var.h;
                int i10 = kc1Var.f39453c;
                ThemeActivity.k0(themeActivity, Math.round(((kc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((vd1) this.f39860b).f42768f.f44734a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39860b;
        e51 e51Var = secretMediaViewer.f34306y;
        if (e51Var != null) {
            long p5 = e51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34306y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34306y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39860b;
        e51 e51Var = secretMediaViewer.f34306y;
        if (e51Var != null) {
            e51Var.B();
            long p5 = secretMediaViewer.f34306y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34306y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public int d0(int i10) {
        return ((vd1) this.f39860b).f42768f.f44734a.x0(i10);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((dg1) this.f39860b).f36826t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        hg1 hg1Var = ((dg1) this.f39860b).f36826t0;
        HashSet hashSet = hg1.f38375n1;
        hg1Var.M0(s2Var);
    }

    @Override
    public int f1(int i10) {
        return ((vd1) this.f39860b).f42768f.f44734a.f1(i10);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((dg1) this.f39860b).f36826t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39859a) {
            case 3:
                zb1 zb1Var = (zb1) this.f39860b;
                return String.valueOf(Math.round((zb1Var.f44713a.getProgress() * zb1Var.f44714b) + 0));
            default:
                kc1 kc1Var = (kc1) this.f39860b;
                int i10 = kc1Var.f39453c;
                return String.valueOf(Math.round((kc1Var.f39452b.getProgress() * (kc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        zd1 zd1Var = ((vd1) this.f39860b).f42768f;
        if (str.equals("drawableMsgOut")) {
            return zd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return zd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return zd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return zd1Var.U;
        }
        zc1 zc1Var = zd1Var.f44734a;
        if (zc1Var != null) {
            return zc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override
    public boolean l0() {
        return ((vd1) this.f39860b).f42768f.f44734a.l0();
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        zc1 zc1Var = ((vd1) this.f39860b).f42768f.f44734a;
        if (zc1Var != null) {
            zc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f39859a) {
            case 3:
                return ((zb1) this.f39860b).f44714b;
            default:
                kc1 kc1Var = (kc1) this.f39860b;
                return kc1Var.d - kc1Var.f39453c;
        }
    }

    @Override
    public void q0() {
        ((StickersActivity) this.f39860b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f20890v3;
    }

    @Override
    public int x0(int i10) {
        return ((vd1) this.f39860b).f42768f.f44734a.x0(i10);
    }

    @Override
    public void z() {
        int i10 = this.f39859a;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
