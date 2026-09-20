package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements r0.n, org.telegram.ui.Components.u71, org.telegram.ui.Components.jq0, org.telegram.ui.Components.ro0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.ho0 {
    public final int f34995a;
    public final Object f34996b;

    public jw0(Object obj, int i10) {
        this.f34995a = i10;
        this.f34996b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f34995a;
    }

    @Override
    public int F0(int i10) {
        return ((td1) this.f34996b).f37734f.f39470a.F0(i10);
    }

    @Override
    public Paint G(String str) {
        return ((td1) this.f34996b).f37734f.f39470a.G(str);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.f34995a) {
            case 0:
                mw0 mw0Var = (mw0) this.f34996b;
                i0.b g10 = l1Var.f42154a.g(519);
                mw0Var.f35839r = g10;
                mw0Var.d.setPadding(g10.f10592a, g10.f10593b, g10.f10594c, g10.d);
                mw0Var.f35831c.requestLayout();
                return r0.l1.f42153b;
            default:
                me1 me1Var = (me1) this.f34996b;
                i0.b g11 = l1Var.f42154a.g(519);
                me1Var.f35705n = g11;
                me1Var.f35700c.setPadding(g11.f10592a, g11.f10593b, g11.f10594c, g11.d);
                me1Var.f35698b.requestLayout();
                return r0.l1.f42153b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f34996b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f34995a) {
            case 3:
                xb1 xb1Var = (xb1) this.f34996b;
                ThemeActivity.Y(xb1Var.d, Math.round((xb1Var.f39454b * f7) + 0), false);
                return;
            default:
                ic1 ic1Var = (ic1) this.f34996b;
                ThemeActivity themeActivity = ic1Var.h;
                int i10 = ic1Var.f34527c;
                ThemeActivity.k0(themeActivity, Math.round(((ic1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((td1) this.f34996b).f37734f.f39470a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34996b;
        d51 d51Var = secretMediaViewer.f31774y;
        if (d51Var != null) {
            long p5 = d51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31774y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31774y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34996b;
        d51 d51Var = secretMediaViewer.f31774y;
        if (d51Var != null) {
            d51Var.B();
            long p5 = secretMediaViewer.f31774y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31774y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f34996b).f32459u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = ((bg1) this.f34996b).f32459u0;
        HashSet hashSet = fg1.f33595n1;
        fg1Var.M0(s2Var);
    }

    @Override
    public int f0(int i10) {
        return ((td1) this.f34996b).f37734f.f39470a.F0(i10);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f34996b).f32459u0.finishPreviewFragment();
        }
    }

    @Override
    public int g1(int i10) {
        return ((td1) this.f34996b).f37734f.f39470a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f34995a) {
            case 3:
                xb1 xb1Var = (xb1) this.f34996b;
                return String.valueOf(Math.round((xb1Var.f39453a.getProgress() * xb1Var.f39454b) + 0));
            default:
                ic1 ic1Var = (ic1) this.f34996b;
                int i10 = ic1Var.f34527c;
                return String.valueOf(Math.round((ic1Var.f34526b.getProgress() * (ic1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        xd1 xd1Var = ((td1) this.f34996b).f37734f;
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
        xc1 xc1Var = xd1Var.f39470a;
        if (xc1Var != null) {
            return xc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int l0() {
        switch (this.f34995a) {
            case 3:
                return ((xb1) this.f34996b).f39454b;
            default:
                ic1 ic1Var = (ic1) this.f34996b;
                return ic1Var.d - ic1Var.f34527c;
        }
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.f34996b).f37734f.f39470a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public boolean n0() {
        return ((td1) this.f34996b).f37734f.f39470a.n0();
    }

    @Override
    public void t0() {
        ((StickersActivity) this.f34996b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19422v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
