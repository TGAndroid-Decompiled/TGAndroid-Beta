package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 implements r0.n, org.telegram.ui.Components.n81, org.telegram.ui.Components.dr0, org.telegram.ui.Components.lp0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.bp0 {
    public final int f38789a;
    public final Object f38790b;

    public iw0(Object obj, int i10) {
        this.f38789a = i10;
        this.f38790b = obj;
    }

    @Override
    public Paint F(String str) {
        return ((sd1) this.f38790b).f41713f.f43325a.F(str);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.f38789a) {
            case 0:
                lw0 lw0Var = (lw0) this.f38790b;
                i0.b g10 = k1Var.f46867a.g(519);
                lw0Var.f39758r = g10;
                lw0Var.d.setPadding(g10.f11575a, g10.f11576b, g10.f11577c, g10.d);
                lw0Var.f39749c.requestLayout();
                return r0.k1.f46866b;
            default:
                le1 le1Var = (le1) this.f38790b;
                i0.b g11 = k1Var.f46867a.g(519);
                le1Var.f39642n = g11;
                le1Var.f39636c.setPadding(g11.f11575a, g11.f11576b, g11.f11577c, g11.d);
                le1Var.f39634b.requestLayout();
                return r0.k1.f46866b;
        }
    }

    @Override
    public void P() {
        ((StickersActivity) this.f38790b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f38789a) {
            case 3:
                wb1 wb1Var = (wb1) this.f38790b;
                ThemeActivity.Y(wb1Var.d, Math.round((wb1Var.f43305b * f7) + 0), false);
                return;
            default:
                hc1 hc1Var = (hc1) this.f38790b;
                ThemeActivity themeActivity = hc1Var.h;
                int i10 = hc1Var.f38377c;
                ThemeActivity.k0(themeActivity, Math.round(((hc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((sd1) this.f38790b).f41713f.f43325a.a();
    }

    @Override
    public int a1(int i10) {
        return ((sd1) this.f38790b).f41713f.f43325a.a1(i10);
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38790b;
        b51 b51Var = secretMediaViewer.f34495y;
        if (b51Var != null) {
            long p5 = b51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34495y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34495y.C();
        }
    }

    @Override
    public int c0(int i10) {
        return ((sd1) this.f38790b).f41713f.f43325a.x0(i10);
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38790b;
        b51 b51Var = secretMediaViewer.f34495y;
        if (b51Var != null) {
            b51Var.B();
            long p5 = secretMediaViewer.f34495y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34495y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f38790b).f36088t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        eg1 eg1Var = ((ag1) this.f38790b).f36088t0;
        HashSet hashSet = eg1.f37310n1;
        eg1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f38790b).f36088t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38789a) {
            case 3:
                wb1 wb1Var = (wb1) this.f38790b;
                return String.valueOf(Math.round((wb1Var.f43304a.getProgress() * wb1Var.f43305b) + 0));
            default:
                hc1 hc1Var = (hc1) this.f38790b;
                int i10 = hc1Var.f38377c;
                return String.valueOf(Math.round((hc1Var.f38376b.getProgress() * (hc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        wd1 wd1Var = ((sd1) this.f38790b).f41713f;
        if (str.equals("drawableMsgOut")) {
            return wd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return wd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return wd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return wd1Var.U;
        }
        wc1 wc1Var = wd1Var.f43325a;
        if (wc1Var != null) {
            return wc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override
    public int i0() {
        switch (this.f38789a) {
            case 3:
                return ((wb1) this.f38790b).f43305b;
            default:
                hc1 hc1Var = (hc1) this.f38790b;
                return hc1Var.d - hc1Var.f38377c;
        }
    }

    @Override
    public boolean k0() {
        return ((sd1) this.f38790b).f41713f.f43325a.k0();
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        wc1 wc1Var = ((sd1) this.f38790b).f41713f.f43325a;
        if (wc1Var != null) {
            wc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public void q0() {
        ((StickersActivity) this.f38790b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f21115v3;
    }

    @Override
    public int x0(int i10) {
        return ((sd1) this.f38790b).f41713f.f43325a.x0(i10);
    }

    @Override
    public void z() {
        int i10 = this.f38789a;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void I0(int i10, int i11) {
    }
}
