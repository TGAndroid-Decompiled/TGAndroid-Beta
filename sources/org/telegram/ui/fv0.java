package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class fv0 implements r0.o, org.telegram.ui.Components.y61, org.telegram.ui.Components.rp0, org.telegram.ui.Components.zn0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.pn0 {
    public final int f38239a;
    public final Object f38240b;

    public fv0(Object obj, int i10) {
        this.f38239a = i10;
        this.f38240b = obj;
    }

    @Override
    public ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.f23380v3;
    }

    @Override
    public int C0(int i10) {
        return ((mc1) this.f38240b).f40525f.f41623a.C0(i10);
    }

    @Override
    public Paint G(String str) {
        return ((mc1) this.f38240b).f40525f.f41623a.G(str);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        switch (this.f38239a) {
            case 0:
                iv0 iv0Var = (iv0) this.f38240b;
                i0.b g10 = m1Var.f46843a.g(519);
                iv0Var.f39350r = g10;
                iv0Var.d.setPadding(g10.f8186a, g10.f8187b, g10.f8188c, g10.d);
                iv0Var.f39345c.requestLayout();
                return r0.m1.f46842b;
            default:
                fd1 fd1Var = (fd1) this.f38240b;
                i0.b g11 = m1Var.f46843a.g(519);
                fd1Var.f38114n = g11;
                fd1Var.f38111c.setPadding(g11.f8186a, g11.f8187b, g11.f8188c, g11.d);
                fd1Var.f38110b.requestLayout();
                return r0.m1.f46842b;
        }
    }

    @Override
    public void M() {
        ((StickersActivity) this.f38240b).j0();
    }

    @Override
    public void W(float f9, boolean z10) {
        switch (this.f38239a) {
            case 3:
                oa1 oa1Var = (oa1) this.f38240b;
                ThemeActivity.Y(oa1Var.d, Math.round((oa1Var.f41040b * f9) + 0), false);
                return;
            default:
                za1 za1Var = (za1) this.f38240b;
                ThemeActivity themeActivity = za1Var.h;
                int i10 = za1Var.f45122c;
                ThemeActivity.k0(themeActivity, Math.round(((za1Var.d - i10) * f9) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((mc1) this.f38240b).f40525f.f41623a.a();
    }

    @Override
    public void c(float f9) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38240b;
        x31 x31Var = secretMediaViewer.f36232y;
        if (x31Var != null) {
            long q6 = x31Var.q();
            if (q6 != -9223372036854775807L) {
                secretMediaViewer.f36232y.M(f9 * ((float) q6), false);
            }
            secretMediaViewer.f36232y.D();
        }
    }

    @Override
    public void d(float f9) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38240b;
        x31 x31Var = secretMediaViewer.f36232y;
        if (x31Var != null) {
            x31Var.C();
            long q6 = secretMediaViewer.f36232y.q();
            if (q6 != -9223372036854775807L) {
                secretMediaViewer.f36232y.M(f9 * ((float) q6), false);
            }
        }
    }

    @Override
    public void e(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ve1) this.f38240b).f43574p0.movePreviewFragment(f9);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        ze1 ze1Var = ((ve1) this.f38240b).f43574p0;
        HashSet hashSet = ze1.f45154j1;
        ze1Var.M0(p2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ve1) this.f38240b).f43574p0.finishPreviewFragment();
        }
    }

    @Override
    public int g1(int i10) {
        return ((mc1) this.f38240b).f40525f.f41623a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38239a) {
            case 3:
                oa1 oa1Var = (oa1) this.f38240b;
                return String.valueOf(Math.round((oa1Var.f41039a.getProgress() * oa1Var.f41040b) + 0));
            default:
                za1 za1Var = (za1) this.f38240b;
                int i10 = za1Var.f45122c;
                return String.valueOf(Math.round((za1Var.f45121b.getProgress() * (za1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        qc1 qc1Var = ((mc1) this.f38240b).f40525f;
        if (str.equals("drawableMsgOut")) {
            return qc1Var.N;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return qc1Var.O;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return qc1Var.P;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return qc1Var.Q;
        }
        pb1 pb1Var = qc1Var.f41623a;
        if (pb1Var != null) {
            return pb1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public int h0(int i10) {
        return ((mc1) this.f38240b).f40525f.f41623a.C0(i10);
    }

    @Override
    public int k0() {
        switch (this.f38239a) {
            case 3:
                return ((oa1) this.f38240b).f41040b;
            default:
                za1 za1Var = (za1) this.f38240b;
                return za1Var.d - za1Var.f45122c;
        }
    }

    @Override
    public void l(float f9, float f10, int i10, int i11) {
        pb1 pb1Var = ((mc1) this.f38240b).f40525f.f41623a;
        if (pb1Var != null) {
            pb1Var.l(f9, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
        }
    }

    @Override
    public boolean l0() {
        return ((mc1) this.f38240b).f40525f.f41623a.l0();
    }

    @Override
    public void r0() {
        ((StickersActivity) this.f38240b).j0();
    }

    @Override
    public void v() {
        int i10 = this.f38239a;
    }

    private final void b() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
