package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class mo0 implements org.telegram.ui.ActionBar.d6, r0.n, org.telegram.ui.Components.b81, org.telegram.ui.Components.sq0, org.telegram.ui.Components.bp0, org.telegram.ui.Components.ro0 {
    public final int f39250a;
    public final Object f39251b;

    public mo0(Object obj, int i10) {
        this.f39250a = i10;
        this.f39251b = obj;
    }

    @Override
    public void B(int i10, int i11) {
        int i12 = this.f39250a;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.f39250a) {
            case 1:
                sv0 sv0Var = (sv0) this.f39251b;
                i0.b g10 = k1Var.f44873a.g(519);
                sv0Var.f41544r = g10;
                sv0Var.d.setPadding(g10.f12286a, g10.f12287b, g10.f12288c, g10.d);
                sv0Var.f41536c.requestLayout();
                return r0.k1.f44872b;
            default:
                ad1 ad1Var = (ad1) this.f39251b;
                i0.b g11 = k1Var.f44873a.g(519);
                ad1Var.f35425n = g11;
                ad1Var.f35420c.setPadding(g11.f12286a, g11.f12287b, g11.f12288c, g11.d);
                ad1Var.f35418b.requestLayout();
                return r0.k1.f44872b;
        }
    }

    @Override
    public void H() {
        ((StickersActivity) this.f39251b).j0();
    }

    @Override
    public int I(int i10) {
        switch (this.f39250a) {
            case 0:
                return u(i10);
            default:
                return ((ic1) this.f39251b).f37860f.f39122a.I(i10);
        }
    }

    @Override
    public void L(float f7, boolean z10) {
        switch (this.f39250a) {
            case 4:
                ma1 ma1Var = (ma1) this.f39251b;
                ThemeActivity.Y(ma1Var.d, Math.round((ma1Var.f39107b * f7) + 0), false);
                return;
            default:
                xa1 xa1Var = (xa1) this.f39251b;
                ThemeActivity themeActivity = xa1Var.h;
                int i10 = xa1Var.f43060c;
                ThemeActivity.k0(themeActivity, Math.round(((xa1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int Y() {
        switch (this.f39250a) {
            case 4:
                return ((ma1) this.f39251b).f39107b;
            default:
                xa1 xa1Var = (xa1) this.f39251b;
                return xa1Var.d - xa1Var.f43060c;
        }
    }

    @Override
    public boolean a() {
        switch (this.f39250a) {
            case 0:
                return ((kp0) this.f39251b).S;
            default:
                return ((ic1) this.f39251b).f37860f.f39122a.a();
        }
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39251b;
        r31 r31Var = secretMediaViewer.f33830y;
        if (r31Var != null) {
            long p5 = r31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f33830y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f33830y.C();
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39251b;
        r31 r31Var = secretMediaViewer.f33830y;
        if (r31Var != null) {
            r31Var.B();
            long p5 = secretMediaViewer.f33830y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f33830y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.f39250a) {
            case 0:
                org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                return;
            default:
                mb1 mb1Var = ((ic1) this.f39251b).f37860f.f39122a;
                if (mb1Var != null) {
                    mb1Var.d(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((pe1) this.f39251b).f40139t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        te1 te1Var = ((pe1) this.f39251b).f40139t0;
        HashSet hashSet = te1.f41704n1;
        te1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((pe1) this.f39251b).f40139t0.finishPreviewFragment();
        }
    }

    @Override
    public void g0() {
        ((StickersActivity) this.f39251b).j0();
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39250a) {
            case 4:
                ma1 ma1Var = (ma1) this.f39251b;
                return String.valueOf(Math.round((ma1Var.f39106a.getProgress() * ma1Var.f39107b) + 0));
            default:
                xa1 xa1Var = (xa1) this.f39251b;
                int i10 = xa1Var.f43060c;
                return String.valueOf(Math.round((xa1Var.f43059b.getProgress() * (xa1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f39250a) {
            case 0:
                kp0 kp0Var = (kp0) this.f39251b;
                if (str.equals("drawableMsgIn")) {
                    return kp0Var.f38656w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return kp0Var.f38657x;
                }
                org.telegram.ui.ActionBar.d6 d6Var = kp0Var.f38655s;
                if (d6Var != null) {
                    return d6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.h6.P0(str);
            default:
                mc1 mc1Var = ((ic1) this.f39251b).f37860f;
                if (str.equals("drawableMsgOut")) {
                    return mc1Var.R;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return mc1Var.S;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return mc1Var.T;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return mc1Var.U;
                }
                mb1 mb1Var = mc1Var.f39122a;
                if (mb1Var != null) {
                    return mb1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.h6.P0(str);
        }
    }

    @Override
    public ColorFilter j() {
        switch (this.f39250a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.f21323v3;
            default:
                return org.telegram.ui.ActionBar.h6.f21323v3;
        }
    }

    @Override
    public Paint n(String str) {
        switch (this.f39250a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.T0(str);
            default:
                return ((ic1) this.f39251b).f37860f.f39122a.n(str);
        }
    }

    @Override
    public int r(int i10) {
        switch (this.f39250a) {
            case 0:
                return u(i10);
            default:
                return ((ic1) this.f39251b).f37860f.f39122a.u(i10);
        }
    }

    @Override
    public boolean s() {
        switch (this.f39250a) {
            case 0:
                return false;
            default:
                return ((ic1) this.f39251b).f37860f.f39122a.s();
        }
    }

    @Override
    public int u(int i10) {
        switch (this.f39250a) {
            case 0:
                kp0 kp0Var = (kp0) this.f39251b;
                int indexOfKey = kp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return kp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.d6 d6Var = kp0Var.f38655s;
                if (d6Var != null) {
                    return d6Var.u(i10);
                }
                return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            default:
                return ((ic1) this.f39251b).f37860f.f39122a.u(i10);
        }
    }

    @Override
    public void v() {
        int i10 = this.f39250a;
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }
}
