package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class iw0 implements r0.n, org.telegram.ui.Components.h71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.un0 {
    public final int f37447a;
    public final Object f37448b;

    public iw0(Object obj, int i10) {
        this.f37447a = i10;
        this.f37448b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f37447a;
    }

    @Override
    public Paint G(String str) {
        return ((sd1) this.f37448b).f40421f.f41915a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((sd1) this.f37448b).f40421f.f41915a.G0(i10);
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        switch (this.f37447a) {
            case 0:
                lw0 lw0Var = (lw0) this.f37448b;
                i0.c g10 = l1Var.f44712a.g(519);
                lw0Var.f38504r = g10;
                lw0Var.d.setPadding(g10.f11425a, g10.f11426b, g10.f11427c, g10.d);
                lw0Var.f38495c.requestLayout();
                return r0.l1.f44711b;
            default:
                le1 le1Var = (le1) this.f37448b;
                i0.c g11 = l1Var.f44712a.g(519);
                le1Var.f38326n = g11;
                le1Var.f38320c.setPadding(g11.f11425a, g11.f11426b, g11.f11427c, g11.d);
                le1Var.f38318b.requestLayout();
                return r0.l1.f44711b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f37448b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f37447a) {
            case 3:
                wb1 wb1Var = (wb1) this.f37448b;
                ThemeActivity.Y(wb1Var.d, Math.round((wb1Var.f41896b * f7) + 0), false);
                return;
            default:
                hc1 hc1Var = (hc1) this.f37448b;
                ThemeActivity themeActivity = hc1Var.h;
                int i10 = hc1Var.f36955c;
                ThemeActivity.k0(themeActivity, Math.round(((hc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((sd1) this.f37448b).f40421f.f41915a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37448b;
        c51 c51Var = secretMediaViewer.f34113y;
        if (c51Var != null) {
            long p5 = c51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34113y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34113y.C();
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37448b;
        c51 c51Var = secretMediaViewer.f34113y;
        if (c51Var != null) {
            c51Var.B();
            long p5 = secretMediaViewer.f34113y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34113y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f37448b).f34446t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        eg1 eg1Var = ((ag1) this.f37448b).f34446t0;
        HashSet hashSet = eg1.f36025n1;
        eg1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ag1) this.f37448b).f34446t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37447a) {
            case 3:
                wb1 wb1Var = (wb1) this.f37448b;
                return String.valueOf(Math.round((wb1Var.f41895a.getProgress() * wb1Var.f41896b) + 0));
            default:
                hc1 hc1Var = (hc1) this.f37448b;
                int i10 = hc1Var.f36955c;
                return String.valueOf(Math.round((hc1Var.f36954b.getProgress() * (hc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        wd1 wd1Var = ((sd1) this.f37448b).f40421f;
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
        wc1 wc1Var = wd1Var.f41915a;
        if (wc1Var != null) {
            return wc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int h0(int i10) {
        return ((sd1) this.f37448b).f40421f.f41915a.G0(i10);
    }

    @Override
    public int h1(int i10) {
        return ((sd1) this.f37448b).f40421f.f41915a.h1(i10);
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        wc1 wc1Var = ((sd1) this.f37448b).f40421f.f41915a;
        if (wc1Var != null) {
            wc1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int l0() {
        switch (this.f37447a) {
            case 3:
                return ((wb1) this.f37448b).f41896b;
            default:
                hc1 hc1Var = (hc1) this.f37448b;
                return hc1Var.d - hc1Var.f36955c;
        }
    }

    @Override
    public boolean o0() {
        return ((sd1) this.f37448b).f40421f.f41915a.o0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20988v3;
    }

    @Override
    public void z0() {
        ((StickersActivity) this.f37448b).j0();
    }

    private final void d() {
    }

    private final void g() {
    }

    @Override
    public void O0(int i10, int i11) {
    }
}
