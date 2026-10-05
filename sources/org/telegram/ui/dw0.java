package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements r0.n, org.telegram.ui.Components.f81, org.telegram.ui.Components.qq0, org.telegram.ui.Components.yo0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.mo0 {
    public final int f35892a;
    public final Object f35893b;

    public dw0(Object obj, int i10) {
        this.f35892a = i10;
        this.f35893b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f35892a;
    }

    @Override
    public Paint H(String str) {
        return ((ld1) this.f35893b).f38289f.f39487a.H(str);
    }

    @Override
    public int H0(int i10) {
        return ((ld1) this.f35893b).f38289f.f39487a.H0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f35892a) {
            case 0:
                gw0 gw0Var = (gw0) this.f35893b;
                i0.b g10 = l1Var.f45624a.g(519);
                gw0Var.f36784r = g10;
                gw0Var.d.setPadding(g10.f11526a, g10.f11527b, g10.f11528c, g10.d);
                gw0Var.f36775c.requestLayout();
                return r0.l1.f45623b;
            default:
                ee1 ee1Var = (ee1) this.f35893b;
                i0.b g11 = l1Var.f45624a.g(519);
                ee1Var.f36034n = g11;
                ee1Var.f36028c.setPadding(g11.f11526a, g11.f11527b, g11.f11528c, g11.d);
                ee1Var.f36026b.requestLayout();
                return r0.l1.f45623b;
        }
    }

    @Override
    public void V() {
        ((StickersActivity) this.f35893b).j0();
    }

    @Override
    public void Y(float f7, boolean z10) {
        switch (this.f35892a) {
            case 3:
                pb1 pb1Var = (pb1) this.f35893b;
                ThemeActivity.X(pb1Var.d, Math.round((pb1Var.f39463b * f7) + 0), false);
                return;
            default:
                ac1 ac1Var = (ac1) this.f35893b;
                ThemeActivity themeActivity = ac1Var.h;
                int i10 = ac1Var.f34837c;
                ThemeActivity.k0(themeActivity, Math.round(((ac1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((ld1) this.f35893b).f38289f.f39487a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35893b;
        u41 u41Var = secretMediaViewer.f34477y;
        if (u41Var != null) {
            long p5 = u41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34477y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34477y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35893b;
        u41 u41Var = secretMediaViewer.f34477y;
        if (u41Var != null) {
            u41Var.B();
            long p5 = secretMediaViewer.f34477y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34477y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f35893b).f40489v0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        wf1 wf1Var = ((sf1) this.f35893b).f40489v0;
        HashSet hashSet = wf1.f42466n1;
        wf1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f35893b).f40489v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f35892a) {
            case 3:
                pb1 pb1Var = (pb1) this.f35893b;
                return String.valueOf(Math.round((pb1Var.f39462a.getProgress() * pb1Var.f39463b) + 0));
            default:
                ac1 ac1Var = (ac1) this.f35893b;
                int i10 = ac1Var.f34837c;
                return String.valueOf(Math.round((ac1Var.f34836b.getProgress() * (ac1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        pd1 pd1Var = ((ld1) this.f35893b).f38289f;
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
        pc1 pc1Var = pd1Var.f39487a;
        if (pc1Var != null) {
            return pc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public int j0(int i10) {
        return ((ld1) this.f35893b).f38289f.f39487a.H0(i10);
    }

    @Override
    public int j1(int i10) {
        return ((ld1) this.f35893b).f38289f.f39487a.j1(i10);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        pc1 pc1Var = ((ld1) this.f35893b).f38289f.f39487a;
        if (pc1Var != null) {
            pc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int p0() {
        switch (this.f35892a) {
            case 3:
                return ((pb1) this.f35893b).f39463b;
            default:
                ac1 ac1Var = (ac1) this.f35893b;
                return ac1Var.d - ac1Var.f34837c;
        }
    }

    @Override
    public boolean r0() {
        return ((ld1) this.f35893b).f38289f.f39487a.r0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21159v3;
    }

    @Override
    public void x0() {
        ((StickersActivity) this.f35893b).j0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
