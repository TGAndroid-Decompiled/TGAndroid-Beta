package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 implements r0.n, org.telegram.ui.Components.g71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.un0 {
    public final int f32428a;
    public final Object f32429b;

    public cw0(Object obj, int i10) {
        this.f32428a = i10;
        this.f32429b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f32428a;
    }

    @Override
    public Paint G(String str) {
        return ((kd1) this.f32429b).f34684f.f35780a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((kd1) this.f32429b).f34684f.f35780a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f32428a) {
            case 0:
                fw0 fw0Var = (fw0) this.f32429b;
                i0.b g10 = l1Var.f41807a.g(519);
                fw0Var.f33383r = g10;
                fw0Var.d.setPadding(g10.f10576a, g10.f10577b, g10.f10578c, g10.d);
                fw0Var.f33375c.requestLayout();
                return r0.l1.f41806b;
            default:
                de1 de1Var = (de1) this.f32429b;
                i0.b g11 = l1Var.f41807a.g(519);
                de1Var.f32630n = g11;
                de1Var.f32625c.setPadding(g11.f10576a, g11.f10577b, g11.f10578c, g11.d);
                de1Var.f32623b.requestLayout();
                return r0.l1.f41806b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f32429b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f32428a) {
            case 3:
                ob1 ob1Var = (ob1) this.f32429b;
                ThemeActivity.Y(ob1Var.d, Math.round((ob1Var.f35759b * f7) + 0), false);
                return;
            default:
                zb1 zb1Var = (zb1) this.f32429b;
                ThemeActivity themeActivity = zb1Var.h;
                int i10 = zb1Var.f40100c;
                ThemeActivity.k0(themeActivity, Math.round(((zb1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((kd1) this.f32429b).f34684f.f35780a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32429b;
        s41 s41Var = secretMediaViewer.f31461y;
        if (s41Var != null) {
            long p5 = s41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31461y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31461y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32429b;
        s41 s41Var = secretMediaViewer.f31461y;
        if (s41Var != null) {
            s41Var.B();
            long p5 = secretMediaViewer.f31461y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31461y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f32429b).f37294t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        wf1 wf1Var = ((sf1) this.f32429b).f37294t0;
        HashSet hashSet = wf1.f38935n1;
        wf1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sf1) this.f32429b).f37294t0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((kd1) this.f32429b).f34684f.f35780a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((kd1) this.f32429b).f34684f.f35780a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f32428a) {
            case 3:
                ob1 ob1Var = (ob1) this.f32429b;
                return String.valueOf(Math.round((ob1Var.f35758a.getProgress() * ob1Var.f35759b) + 0));
            default:
                zb1 zb1Var = (zb1) this.f32429b;
                int i10 = zb1Var.f40100c;
                return String.valueOf(Math.round((zb1Var.f40099b.getProgress() * (zb1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        od1 od1Var = ((kd1) this.f32429b).f34684f;
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
        oc1 oc1Var = od1Var.f35780a;
        if (oc1Var != null) {
            return oc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.h6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        oc1 oc1Var = ((kd1) this.f32429b).f34684f.f35780a;
        if (oc1Var != null) {
            oc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f32428a) {
            case 3:
                return ((ob1) this.f32429b).f35759b;
            default:
                zb1 zb1Var = (zb1) this.f32429b;
                return zb1Var.d - zb1Var.f40100c;
        }
    }

    @Override
    public boolean p0() {
        return ((kd1) this.f32429b).f34684f.f35780a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f32429b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f19115v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
