package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements r0.n, org.telegram.ui.Components.v71, org.telegram.ui.Components.kq0, org.telegram.ui.Components.so0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.ho0 {
    public final int f34950a;
    public final Object f34951b;

    public jw0(Object obj, int i10) {
        this.f34950a = i10;
        this.f34951b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f34950a;
    }

    @Override
    public Paint G(String str) {
        return ((rd1) this.f34951b).f37041f.f38467a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((rd1) this.f34951b).f37041f.f38467a.G0(i10);
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        switch (this.f34950a) {
            case 0:
                mw0 mw0Var = (mw0) this.f34951b;
                i0.b g10 = m1Var.f42109a.g(519);
                mw0Var.f35764r = g10;
                mw0Var.d.setPadding(g10.f10591a, g10.f10592b, g10.f10593c, g10.d);
                mw0Var.f35756c.requestLayout();
                return r0.m1.f42108b;
            default:
                ke1 ke1Var = (ke1) this.f34951b;
                i0.b g11 = m1Var.f42109a.g(519);
                ke1Var.f35078n = g11;
                ke1Var.f35073c.setPadding(g11.f10591a, g11.f10592b, g11.f10593c, g11.d);
                ke1Var.f35071b.requestLayout();
                return r0.m1.f42108b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f34951b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f34950a) {
            case 3:
                vb1 vb1Var = (vb1) this.f34951b;
                ThemeActivity.Y(vb1Var.d, Math.round((vb1Var.f38447b * f7) + 0), false);
                return;
            default:
                gc1 gc1Var = (gc1) this.f34951b;
                ThemeActivity themeActivity = gc1Var.h;
                int i10 = gc1Var.f33810c;
                ThemeActivity.k0(themeActivity, Math.round(((gc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((rd1) this.f34951b).f37041f.f38467a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34951b;
        a51 a51Var = secretMediaViewer.f31734y;
        if (a51Var != null) {
            long p5 = a51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31734y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31734y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34951b;
        a51 a51Var = secretMediaViewer.f31734y;
        if (a51Var != null) {
            a51Var.B();
            long p5 = secretMediaViewer.f31734y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31734y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((zf1) this.f34951b).f40133u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        dg1 dg1Var = ((zf1) this.f34951b).f40133u0;
        HashSet hashSet = dg1.f32969n1;
        dg1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((zf1) this.f34951b).f40133u0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((rd1) this.f34951b).f37041f.f38467a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((rd1) this.f34951b).f37041f.f38467a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f34950a) {
            case 3:
                vb1 vb1Var = (vb1) this.f34951b;
                return String.valueOf(Math.round((vb1Var.f38446a.getProgress() * vb1Var.f38447b) + 0));
            default:
                gc1 gc1Var = (gc1) this.f34951b;
                int i10 = gc1Var.f33810c;
                return String.valueOf(Math.round((gc1Var.f33809b.getProgress() * (gc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        vd1 vd1Var = ((rd1) this.f34951b).f37041f;
        if (str.equals("drawableMsgOut")) {
            return vd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return vd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return vd1Var.U;
        }
        vc1 vc1Var = vd1Var.f38467a;
        if (vc1Var != null) {
            return vc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        vc1 vc1Var = ((rd1) this.f34951b).f37041f.f38467a;
        if (vc1Var != null) {
            vc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f34950a) {
            case 3:
                return ((vb1) this.f34951b).f38447b;
            default:
                gc1 gc1Var = (gc1) this.f34951b;
                return gc1Var.d - gc1Var.f33810c;
        }
    }

    @Override
    public boolean p0() {
        return ((rd1) this.f34951b).f37041f.f38467a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f34951b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19390v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
