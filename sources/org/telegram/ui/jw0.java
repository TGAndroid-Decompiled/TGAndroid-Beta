package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements r0.n, org.telegram.ui.Components.h71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.un0 {
    public final int f35000a;
    public final Object f35001b;

    public jw0(Object obj, int i10) {
        this.f35000a = i10;
        this.f35001b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f35000a;
    }

    @Override
    public Paint G(String str) {
        return ((sd1) this.f35001b).f37375f.f38786a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((sd1) this.f35001b).f37375f.f38786a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f35000a) {
            case 0:
                mw0 mw0Var = (mw0) this.f35001b;
                i0.b g10 = l1Var.f41851a.g(519);
                mw0Var.f35831r = g10;
                mw0Var.d.setPadding(g10.f10590a, g10.f10591b, g10.f10592c, g10.d);
                mw0Var.f35823c.requestLayout();
                return r0.l1.f41850b;
            default:
                le1 le1Var = (le1) this.f35001b;
                i0.b g11 = l1Var.f41851a.g(519);
                le1Var.f35457n = g11;
                le1Var.f35452c.setPadding(g11.f10590a, g11.f10591b, g11.f10592c, g11.d);
                le1Var.f35450b.requestLayout();
                return r0.l1.f41850b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f35001b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f35000a) {
            case 3:
                wb1 wb1Var = (wb1) this.f35001b;
                ThemeActivity.Y(wb1Var.d, Math.round((wb1Var.f38769b * f7) + 0), false);
                return;
            default:
                hc1 hc1Var = (hc1) this.f35001b;
                ThemeActivity themeActivity = hc1Var.h;
                int i10 = hc1Var.f34221c;
                ThemeActivity.k0(themeActivity, Math.round(((hc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((sd1) this.f35001b).f37375f.f38786a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35001b;
        a51 a51Var = secretMediaViewer.f31487y;
        if (a51Var != null) {
            long p5 = a51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31487y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31487y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35001b;
        a51 a51Var = secretMediaViewer.f31487y;
        if (a51Var != null) {
            a51Var.B();
            long p5 = secretMediaViewer.f31487y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31487y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f35001b).f31823t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        eg1 eg1Var = ((ag1) this.f35001b).f31823t0;
        HashSet hashSet = eg1.f33290n1;
        eg1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f35001b).f31823t0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((sd1) this.f35001b).f37375f.f38786a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((sd1) this.f35001b).f37375f.f38786a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f35000a) {
            case 3:
                wb1 wb1Var = (wb1) this.f35001b;
                return String.valueOf(Math.round((wb1Var.f38768a.getProgress() * wb1Var.f38769b) + 0));
            default:
                hc1 hc1Var = (hc1) this.f35001b;
                int i10 = hc1Var.f34221c;
                return String.valueOf(Math.round((hc1Var.f34220b.getProgress() * (hc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        wd1 wd1Var = ((sd1) this.f35001b).f37375f;
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
        wc1 wc1Var = wd1Var.f38786a;
        if (wc1Var != null) {
            return wc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        wc1 wc1Var = ((sd1) this.f35001b).f37375f.f38786a;
        if (wc1Var != null) {
            wc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f35000a) {
            case 3:
                return ((wb1) this.f35001b).f38769b;
            default:
                hc1 hc1Var = (hc1) this.f35001b;
                return hc1Var.d - hc1Var.f34221c;
        }
    }

    @Override
    public boolean p0() {
        return ((sd1) this.f35001b).f37375f.f38786a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f35001b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f19160v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
