package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 implements r0.n, org.telegram.ui.Components.i71, org.telegram.ui.Components.xp0, org.telegram.ui.Components.fo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.vn0 {
    public final int f35638a;
    public final Object f35639b;

    public lw0(Object obj, int i10) {
        this.f35638a = i10;
        this.f35639b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f35638a;
    }

    @Override
    public Paint G(String str) {
        return ((td1) this.f35639b).f37722f.f39531a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((td1) this.f35639b).f37722f.f39531a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f35638a) {
            case 0:
                ow0 ow0Var = (ow0) this.f35639b;
                i0.b g10 = l1Var.f41877a.g(519);
                ow0Var.f36447r = g10;
                ow0Var.d.setPadding(g10.f10591a, g10.f10592b, g10.f10593c, g10.d);
                ow0Var.f36439c.requestLayout();
                return r0.l1.f41876b;
            default:
                me1 me1Var = (me1) this.f35639b;
                i0.b g11 = l1Var.f41877a.g(519);
                me1Var.f35782n = g11;
                me1Var.f35777c.setPadding(g11.f10591a, g11.f10592b, g11.f10593c, g11.d);
                me1Var.f35775b.requestLayout();
                return r0.l1.f41876b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f35639b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f35638a) {
            case 3:
                xb1 xb1Var = (xb1) this.f35639b;
                ThemeActivity.Y(xb1Var.d, Math.round((xb1Var.f39514b * f7) + 0), false);
                return;
            default:
                ic1 ic1Var = (ic1) this.f35639b;
                ThemeActivity themeActivity = ic1Var.h;
                int i10 = ic1Var.f34528c;
                ThemeActivity.k0(themeActivity, Math.round(((ic1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((td1) this.f35639b).f37722f.f39531a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35639b;
        c51 c51Var = secretMediaViewer.f31503y;
        if (c51Var != null) {
            long p5 = c51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31503y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31503y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35639b;
        c51 c51Var = secretMediaViewer.f31503y;
        if (c51Var != null) {
            c51Var.B();
            long p5 = secretMediaViewer.f31503y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31503y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f35639b).f32176u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        fg1 fg1Var = ((bg1) this.f35639b).f32176u0;
        HashSet hashSet = fg1.f33635n1;
        fg1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f35639b).f32176u0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((td1) this.f35639b).f37722f.f39531a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((td1) this.f35639b).f37722f.f39531a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f35638a) {
            case 3:
                xb1 xb1Var = (xb1) this.f35639b;
                return String.valueOf(Math.round((xb1Var.f39513a.getProgress() * xb1Var.f39514b) + 0));
            default:
                ic1 ic1Var = (ic1) this.f35639b;
                int i10 = ic1Var.f34528c;
                return String.valueOf(Math.round((ic1Var.f34527b.getProgress() * (ic1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        xd1 xd1Var = ((td1) this.f35639b).f37722f;
        if (str.equals("drawableMsgOut")) {
            return xd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return xd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return xd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return xd1Var.U;
        }
        xc1 xc1Var = xd1Var.f39531a;
        if (xc1Var != null) {
            return xc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.f35639b).f37722f.f39531a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f35638a) {
            case 3:
                return ((xb1) this.f35639b).f39514b;
            default:
                ic1 ic1Var = (ic1) this.f35639b;
                return ic1Var.d - ic1Var.f34528c;
        }
    }

    @Override
    public boolean p0() {
        return ((td1) this.f35639b).f37722f.f39531a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f35639b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19189v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
