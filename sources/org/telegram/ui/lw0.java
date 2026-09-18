package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 implements r0.n, org.telegram.ui.Components.i71, org.telegram.ui.Components.xp0, org.telegram.ui.Components.fo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.vn0 {
    public final int f35643a;
    public final Object f35644b;

    public lw0(Object obj, int i10) {
        this.f35643a = i10;
        this.f35644b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f35643a;
    }

    @Override
    public Paint G(String str) {
        return ((td1) this.f35644b).f37727f.f39536a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((td1) this.f35644b).f37727f.f39536a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f35643a) {
            case 0:
                ow0 ow0Var = (ow0) this.f35644b;
                i0.b g10 = l1Var.f41882a.g(519);
                ow0Var.f36452r = g10;
                ow0Var.d.setPadding(g10.f10591a, g10.f10592b, g10.f10593c, g10.d);
                ow0Var.f36444c.requestLayout();
                return r0.l1.f41881b;
            default:
                me1 me1Var = (me1) this.f35644b;
                i0.b g11 = l1Var.f41882a.g(519);
                me1Var.f35787n = g11;
                me1Var.f35782c.setPadding(g11.f10591a, g11.f10592b, g11.f10593c, g11.d);
                me1Var.f35780b.requestLayout();
                return r0.l1.f41881b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f35644b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f35643a) {
            case 3:
                xb1 xb1Var = (xb1) this.f35644b;
                ThemeActivity.Y(xb1Var.d, Math.round((xb1Var.f39519b * f7) + 0), false);
                return;
            default:
                ic1 ic1Var = (ic1) this.f35644b;
                ThemeActivity themeActivity = ic1Var.h;
                int i10 = ic1Var.f34533c;
                ThemeActivity.k0(themeActivity, Math.round(((ic1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((td1) this.f35644b).f37727f.f39536a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35644b;
        c51 c51Var = secretMediaViewer.f31507y;
        if (c51Var != null) {
            long p5 = c51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31507y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31507y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35644b;
        c51 c51Var = secretMediaViewer.f31507y;
        if (c51Var != null) {
            c51Var.B();
            long p5 = secretMediaViewer.f31507y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31507y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f35644b).f32180u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        fg1 fg1Var = ((bg1) this.f35644b).f32180u0;
        HashSet hashSet = fg1.f33639n1;
        fg1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f35644b).f32180u0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((td1) this.f35644b).f37727f.f39536a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((td1) this.f35644b).f37727f.f39536a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f35643a) {
            case 3:
                xb1 xb1Var = (xb1) this.f35644b;
                return String.valueOf(Math.round((xb1Var.f39518a.getProgress() * xb1Var.f39519b) + 0));
            default:
                ic1 ic1Var = (ic1) this.f35644b;
                int i10 = ic1Var.f34533c;
                return String.valueOf(Math.round((ic1Var.f34532b.getProgress() * (ic1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        xd1 xd1Var = ((td1) this.f35644b).f37727f;
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
        xc1 xc1Var = xd1Var.f39536a;
        if (xc1Var != null) {
            return xc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.f35644b).f37727f.f39536a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f35643a) {
            case 3:
                return ((xb1) this.f35644b).f39519b;
            default:
                ic1 ic1Var = (ic1) this.f35644b;
                return ic1Var.d - ic1Var.f34533c;
        }
    }

    @Override
    public boolean p0() {
        return ((td1) this.f35644b).f37727f.f39536a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f35644b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19190v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
