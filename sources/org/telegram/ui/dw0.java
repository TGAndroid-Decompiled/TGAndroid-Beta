package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements r0.n, org.telegram.ui.Components.v71, org.telegram.ui.Components.kq0, org.telegram.ui.Components.so0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.io0 {
    public final int f33053a;
    public final Object f33054b;

    public dw0(Object obj, int i10) {
        this.f33053a = i10;
        this.f33054b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f33053a;
    }

    @Override
    public Paint G(String str) {
        return ((ld1) this.f33054b).f35320f.f36390a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((ld1) this.f33054b).f35320f.f36390a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f33053a) {
            case 0:
                gw0 gw0Var = (gw0) this.f33054b;
                i0.b g10 = l1Var.f42185a.g(519);
                gw0Var.f34059r = g10;
                gw0Var.d.setPadding(g10.f10579a, g10.f10580b, g10.f10581c, g10.d);
                gw0Var.f34051c.requestLayout();
                return r0.l1.f42184b;
            default:
                ee1 ee1Var = (ee1) this.f33054b;
                i0.b g11 = l1Var.f42185a.g(519);
                ee1Var.f33240n = g11;
                ee1Var.f33235c.setPadding(g11.f10579a, g11.f10580b, g11.f10581c, g11.d);
                ee1Var.f33233b.requestLayout();
                return r0.l1.f42184b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f33054b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f33053a) {
            case 3:
                ob1 ob1Var = (ob1) this.f33054b;
                ThemeActivity.Y(ob1Var.d, Math.round((ob1Var.f36177b * f7) + 0), false);
                return;
            default:
                zb1 zb1Var = (zb1) this.f33054b;
                ThemeActivity themeActivity = zb1Var.h;
                int i10 = zb1Var.f40461c;
                ThemeActivity.k0(themeActivity, Math.round(((zb1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((ld1) this.f33054b).f35320f.f36390a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f33054b;
        w41 w41Var = secretMediaViewer.f31778y;
        if (w41Var != null) {
            long p5 = w41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31778y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31778y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f33054b;
        w41 w41Var = secretMediaViewer.f31778y;
        if (w41Var != null) {
            w41Var.B();
            long p5 = secretMediaViewer.f31778y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31778y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f33054b).f37444u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        wf1 wf1Var = ((sf1) this.f33054b).f37444u0;
        HashSet hashSet = wf1.f39286n1;
        wf1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f33054b).f37444u0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((ld1) this.f33054b).f35320f.f36390a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((ld1) this.f33054b).f35320f.f36390a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f33053a) {
            case 3:
                ob1 ob1Var = (ob1) this.f33054b;
                return String.valueOf(Math.round((ob1Var.f36176a.getProgress() * ob1Var.f36177b) + 0));
            default:
                zb1 zb1Var = (zb1) this.f33054b;
                int i10 = zb1Var.f40461c;
                return String.valueOf(Math.round((zb1Var.f40460b.getProgress() * (zb1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        pd1 pd1Var = ((ld1) this.f33054b).f35320f;
        if (str.equals("drawableMsgOut")) {
            return pd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return pd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return pd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return pd1Var.U;
        }
        pc1 pc1Var = pd1Var.f36390a;
        if (pc1Var != null) {
            return pc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        pc1 pc1Var = ((ld1) this.f33054b).f35320f.f36390a;
        if (pc1Var != null) {
            pc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f33053a) {
            case 3:
                return ((ob1) this.f33054b).f36177b;
            default:
                zb1 zb1Var = (zb1) this.f33054b;
                return zb1Var.d - zb1Var.f40461c;
        }
    }

    @Override
    public boolean p0() {
        return ((ld1) this.f33054b).f35320f.f36390a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f33054b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f19387v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
