package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class aw0 implements r0.n, org.telegram.ui.Components.t71, org.telegram.ui.Components.jq0, org.telegram.ui.Components.ro0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.ho0 {
    public final int f32233a;
    public final Object f32234b;

    public aw0(Object obj, int i10) {
        this.f32233a = i10;
        this.f32234b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f32233a;
    }

    @Override
    public Paint G(String str) {
        return ((kd1) this.f32234b).f35025f.f36128a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((kd1) this.f32234b).f35025f.f36128a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f32233a) {
            case 0:
                dw0 dw0Var = (dw0) this.f32234b;
                i0.b g10 = l1Var.f42126a.g(519);
                dw0Var.f33187r = g10;
                dw0Var.d.setPadding(g10.f10576a, g10.f10577b, g10.f10578c, g10.d);
                dw0Var.f33179c.requestLayout();
                return r0.l1.f42125b;
            default:
                de1 de1Var = (de1) this.f32234b;
                i0.b g11 = l1Var.f42126a.g(519);
                de1Var.f33082n = g11;
                de1Var.f33077c.setPadding(g11.f10576a, g11.f10577b, g11.f10578c, g11.d);
                de1Var.f33075b.requestLayout();
                return r0.l1.f42125b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f32234b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f32233a) {
            case 3:
                ob1 ob1Var = (ob1) this.f32234b;
                ThemeActivity.Y(ob1Var.d, Math.round((ob1Var.f36108b * f7) + 0), false);
                return;
            default:
                zb1 zb1Var = (zb1) this.f32234b;
                ThemeActivity themeActivity = zb1Var.h;
                int i10 = zb1Var.f40425c;
                ThemeActivity.k0(themeActivity, Math.round(((zb1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((kd1) this.f32234b).f35025f.f36128a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32234b;
        t41 t41Var = secretMediaViewer.f31762y;
        if (t41Var != null) {
            long p5 = t41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31762y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31762y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32234b;
        t41 t41Var = secretMediaViewer.f31762y;
        if (t41Var != null) {
            t41Var.B();
            long p5 = secretMediaViewer.f31762y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31762y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f32234b).f37738t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        wf1 wf1Var = ((sf1) this.f32234b).f37738t0;
        HashSet hashSet = wf1.f39292n1;
        wf1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f32234b).f37738t0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((kd1) this.f32234b).f35025f.f36128a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((kd1) this.f32234b).f35025f.f36128a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f32233a) {
            case 3:
                ob1 ob1Var = (ob1) this.f32234b;
                return String.valueOf(Math.round((ob1Var.f36107a.getProgress() * ob1Var.f36108b) + 0));
            default:
                zb1 zb1Var = (zb1) this.f32234b;
                int i10 = zb1Var.f40425c;
                return String.valueOf(Math.round((zb1Var.f40424b.getProgress() * (zb1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        od1 od1Var = ((kd1) this.f32234b).f35025f;
        if (str.equals("drawableMsgOut")) {
            return od1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return od1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return od1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return od1Var.U;
        }
        oc1 oc1Var = od1Var.f36128a;
        if (oc1Var != null) {
            return oc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        oc1 oc1Var = ((kd1) this.f32234b).f35025f.f36128a;
        if (oc1Var != null) {
            oc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f32233a) {
            case 3:
                return ((ob1) this.f32234b).f36108b;
            default:
                zb1 zb1Var = (zb1) this.f32234b;
                return zb1Var.d - zb1Var.f40425c;
        }
    }

    @Override
    public boolean p0() {
        return ((kd1) this.f32234b).f35025f.f36128a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f32234b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f19373v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
