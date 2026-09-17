package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 implements r0.n, org.telegram.ui.Components.h71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.un0 {
    public final int f37474a;
    public final Object f37475b;

    public iw0(Object obj, int i10) {
        this.f37474a = i10;
        this.f37475b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f37474a;
    }

    @Override
    public Paint G(String str) {
        return ((sd1) this.f37475b).f40448f.f41942a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((sd1) this.f37475b).f40448f.f41942a.G0(i10);
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        switch (this.f37474a) {
            case 0:
                lw0 lw0Var = (lw0) this.f37475b;
                i0.c g10 = l1Var.f44740a.g(519);
                lw0Var.f38531r = g10;
                lw0Var.d.setPadding(g10.f11451a, g10.f11452b, g10.f11453c, g10.d);
                lw0Var.f38522c.requestLayout();
                return r0.l1.f44739b;
            default:
                le1 le1Var = (le1) this.f37475b;
                i0.c g11 = l1Var.f44740a.g(519);
                le1Var.f38353n = g11;
                le1Var.f38347c.setPadding(g11.f11451a, g11.f11452b, g11.f11453c, g11.d);
                le1Var.f38345b.requestLayout();
                return r0.l1.f44739b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f37475b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f37474a) {
            case 3:
                wb1 wb1Var = (wb1) this.f37475b;
                ThemeActivity.Y(wb1Var.d, Math.round((wb1Var.f41923b * f7) + 0), false);
                return;
            default:
                hc1 hc1Var = (hc1) this.f37475b;
                ThemeActivity themeActivity = hc1Var.h;
                int i10 = hc1Var.f36982c;
                ThemeActivity.k0(themeActivity, Math.round(((hc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((sd1) this.f37475b).f40448f.f41942a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37475b;
        c51 c51Var = secretMediaViewer.f34140y;
        if (c51Var != null) {
            long p5 = c51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34140y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34140y.C();
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37475b;
        c51 c51Var = secretMediaViewer.f34140y;
        if (c51Var != null) {
            c51Var.B();
            long p5 = secretMediaViewer.f34140y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34140y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f37475b).f34473t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        eg1 eg1Var = ((ag1) this.f37475b).f34473t0;
        HashSet hashSet = eg1.f36052n1;
        eg1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f37475b).f34473t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37474a) {
            case 3:
                wb1 wb1Var = (wb1) this.f37475b;
                return String.valueOf(Math.round((wb1Var.f41922a.getProgress() * wb1Var.f41923b) + 0));
            default:
                hc1 hc1Var = (hc1) this.f37475b;
                int i10 = hc1Var.f36982c;
                return String.valueOf(Math.round((hc1Var.f36981b.getProgress() * (hc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        wd1 wd1Var = ((sd1) this.f37475b).f40448f;
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
        wc1 wc1Var = wd1Var.f41942a;
        if (wc1Var != null) {
            return wc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int h0(int i10) {
        return ((sd1) this.f37475b).f40448f.f41942a.G0(i10);
    }

    @Override
    public int h1(int i10) {
        return ((sd1) this.f37475b).f40448f.f41942a.h1(i10);
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        wc1 wc1Var = ((sd1) this.f37475b).f40448f.f41942a;
        if (wc1Var != null) {
            wc1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int l0() {
        switch (this.f37474a) {
            case 3:
                return ((wb1) this.f37475b).f41923b;
            default:
                hc1 hc1Var = (hc1) this.f37475b;
                return hc1Var.d - hc1Var.f36982c;
        }
    }

    @Override
    public boolean o0() {
        return ((sd1) this.f37475b).f40448f.f41942a.o0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f21015v3;
    }

    @Override
    public void z0() {
        ((StickersActivity) this.f37475b).j0();
    }

    private final void d() {
    }

    private final void g() {
    }

    @Override
    public void O0(int i10, int i11) {
    }
}
