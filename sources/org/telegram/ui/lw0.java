package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 implements r0.n, org.telegram.ui.Components.u71, org.telegram.ui.Components.hq0, org.telegram.ui.Components.no0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.do0 {
    public final int f34796a;
    public final Object f34797b;

    public lw0(Object obj, int i10) {
        this.f34796a = i10;
        this.f34797b = obj;
    }

    @Override
    public Paint F(String str) {
        return ((wd1) this.f34797b).f37837f.f30914a.F(str);
    }

    @Override
    public int F0(int i10) {
        return ((wd1) this.f34797b).f37837f.f30914a.F0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f34796a) {
            case 0:
                ow0 ow0Var = (ow0) this.f34797b;
                i0.c g10 = l1Var.f41074a.g(519);
                ow0Var.f35635r = g10;
                ow0Var.d.setPadding(g10.f10074a, g10.f10075b, g10.f10076c, g10.d);
                ow0Var.f35627c.requestLayout();
                return r0.l1.f41073b;
            default:
                pe1 pe1Var = (pe1) this.f34797b;
                i0.c g11 = l1Var.f41074a.g(519);
                pe1Var.f35817n = g11;
                pe1Var.f35812c.setPadding(g11.f10074a, g11.f10075b, g11.f10076c, g11.d);
                pe1Var.f35810b.requestLayout();
                return r0.l1.f41073b;
        }
    }

    @Override
    public void T() {
        ((StickersActivity) this.f34797b).j0();
    }

    @Override
    public void W(float f7, boolean z10) {
        switch (this.f34796a) {
            case 3:
                ac1 ac1Var = (ac1) this.f34797b;
                ThemeActivity.Y(ac1Var.d, Math.round((ac1Var.f30889b * f7) + 0), false);
                return;
            default:
                lc1 lc1Var = (lc1) this.f34797b;
                ThemeActivity themeActivity = lc1Var.h;
                int i10 = lc1Var.f34654c;
                ThemeActivity.k0(themeActivity, Math.round(((lc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((wd1) this.f34797b).f37837f.f30914a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34797b;
        f51 f51Var = secretMediaViewer.f30602y;
        if (f51Var != null) {
            long p5 = f51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f30602y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f30602y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34797b;
        f51 f51Var = secretMediaViewer.f30602y;
        if (f51Var != null) {
            f51Var.B();
            long p5 = secretMediaViewer.f30602y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f30602y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((eg1) this.f34797b).f32205t0.movePreviewFragment(f7);
        }
    }

    @Override
    public int e0(int i10) {
        return ((wd1) this.f34797b).f37837f.f30914a.F0(i10);
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        ig1 ig1Var = ((eg1) this.f34797b).f32205t0;
        HashSet hashSet = ig1.f33680n1;
        ig1Var.M0(r2Var);
    }

    @Override
    public int f1(int i10) {
        return ((wd1) this.f34797b).f37837f.f30914a.f1(i10);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((eg1) this.f34797b).f32205t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f34796a) {
            case 3:
                ac1 ac1Var = (ac1) this.f34797b;
                return String.valueOf(Math.round((ac1Var.f30888a.getProgress() * ac1Var.f30889b) + 0));
            default:
                lc1 lc1Var = (lc1) this.f34797b;
                int i10 = lc1Var.f34654c;
                return String.valueOf(Math.round((lc1Var.f34653b.getProgress() * (lc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        ae1 ae1Var = ((wd1) this.f34797b).f37837f;
        if (str.equals("drawableMsgOut")) {
            return ae1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ae1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return ae1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return ae1Var.U;
        }
        ad1 ad1Var = ae1Var.f30914a;
        if (ad1Var != null) {
            return ad1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int k0() {
        switch (this.f34796a) {
            case 3:
                return ((ac1) this.f34797b).f30889b;
            default:
                lc1 lc1Var = (lc1) this.f34797b;
                return lc1Var.d - lc1Var.f34654c;
        }
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        ad1 ad1Var = ((wd1) this.f34797b).f37837f.f30914a;
        if (ad1Var != null) {
            ad1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public boolean m0() {
        return ((wd1) this.f34797b).f37837f.f30914a.m0();
    }

    @Override
    public void s0() {
        ((StickersActivity) this.f34797b).j0();
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.f18251v3;
    }

    @Override
    public void y() {
        int i10 = this.f34796a;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
