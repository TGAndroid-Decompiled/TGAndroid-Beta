package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class fv0 implements r0.o, org.telegram.ui.Components.l61, org.telegram.ui.Components.gp0, org.telegram.ui.Components.on0, org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.dn0 {
    public final int f38354a;
    public final Object f38355b;

    public fv0(Object obj, int i9) {
        this.f38354a = i9;
        this.f38355b = obj;
    }

    @Override
    public void A() {
        ((StickersActivity) this.f38355b).i0();
    }

    @Override
    public ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.f23317v3;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        switch (this.f38354a) {
            case 0:
                iv0 iv0Var = (iv0) this.f38355b;
                i0.b g10 = m1Var.f46929a.g(519);
                iv0Var.f39304r = g10;
                iv0Var.d.setPadding(g10.f10848a, g10.f10849b, g10.f10850c, g10.d);
                iv0Var.f39299c.requestLayout();
                return r0.m1.f46928b;
            default:
                dd1 dd1Var = (dd1) this.f38355b;
                i0.b g11 = m1Var.f46929a.g(519);
                dd1Var.f37509n = g11;
                dd1Var.f37506c.setPadding(g11.f10848a, g11.f10849b, g11.f10850c, g11.d);
                dd1Var.f37505b.requestLayout();
                return r0.m1.f46928b;
        }
    }

    @Override
    public int N0(int i9) {
        return ((kc1) this.f38355b).f39803f.f41056a.N0(i9);
    }

    @Override
    public Paint O(String str) {
        return ((kc1) this.f38355b).f39803f.f41056a.O(str);
    }

    @Override
    public void Q(float f10, boolean z10) {
        switch (this.f38354a) {
            case 3:
                na1 na1Var = (na1) this.f38355b;
                ThemeActivity.X(na1Var.d, Math.round((na1Var.f40685b * f10) + 0), false);
                return;
            default:
                ya1 ya1Var = (ya1) this.f38355b;
                ThemeActivity themeActivity = ya1Var.h;
                int i9 = ya1Var.f44806c;
                ThemeActivity.j0(themeActivity, Math.round(((ya1Var.d - i9) * f10) + i9));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((kc1) this.f38355b).f39803f.f41056a.a();
    }

    @Override
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38355b;
        v31 v31Var = secretMediaViewer.f36167y;
        if (v31Var != null) {
            long q10 = v31Var.q();
            if (q10 != -9223372036854775807L) {
                secretMediaViewer.f36167y.M(f10 * ((float) q10), false);
            }
            secretMediaViewer.f36167y.D();
        }
    }

    @Override
    public int c0() {
        switch (this.f38354a) {
            case 3:
                return ((na1) this.f38355b).f40685b;
            default:
                ya1 ya1Var = (ya1) this.f38355b;
                return ya1Var.d - ya1Var.f44806c;
        }
    }

    @Override
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((re1) this.f38355b).f42407p0.movePreviewFragment(f10);
        }
    }

    @Override
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38355b;
        v31 v31Var = secretMediaViewer.f36167y;
        if (v31Var != null) {
            v31Var.C();
            long q10 = secretMediaViewer.f36167y.q();
            if (q10 != -9223372036854775807L) {
                secretMediaViewer.f36167y.M(f10 * ((float) q10), false);
            }
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        we1 we1Var = ((re1) this.f38355b).f42407p0;
        HashSet hashSet = we1.f43740j1;
        we1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((re1) this.f38355b).f42407p0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38354a) {
            case 3:
                na1 na1Var = (na1) this.f38355b;
                return String.valueOf(Math.round((na1Var.f40684a.getProgress() * na1Var.f40685b) + 0));
            default:
                ya1 ya1Var = (ya1) this.f38355b;
                int i9 = ya1Var.f44806c;
                return String.valueOf(Math.round((ya1Var.f44805b.getProgress() * (ya1Var.d - i9)) + i9));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        oc1 oc1Var = ((kc1) this.f38355b).f39803f;
        if (str.equals("drawableMsgOut")) {
            return oc1Var.N;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return oc1Var.O;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return oc1Var.P;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return oc1Var.Q;
        }
        ob1 ob1Var = oc1Var.f41056a;
        if (ob1Var != null) {
            return ob1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.f6.O0(str);
    }

    @Override
    public void h0() {
        ((StickersActivity) this.f38355b).i0();
    }

    @Override
    public void n() {
        int i9 = this.f38354a;
    }

    @Override
    public void o(float f10, float f11, int i9, int i10) {
        ob1 ob1Var = ((kc1) this.f38355b).f39803f.f41056a;
        if (ob1Var != null) {
            ob1Var.o(f10, f11, i9, i10);
        } else {
            org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
        }
    }

    @Override
    public int p0(int i9) {
        return ((kc1) this.f38355b).f39803f.f41056a.N0(i9);
    }

    @Override
    public int q1(int i9) {
        return ((kc1) this.f38355b).f39803f.f41056a.q1(i9);
    }

    @Override
    public boolean t0() {
        return ((kc1) this.f38355b).f39803f.f41056a.t0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void c1(int i9, int i10) {
    }
}
