package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

public final class gv0 implements r0.o, org.telegram.ui.Components.n61, org.telegram.ui.Components.gp0, org.telegram.ui.Components.pn0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.fn0 {

    public final int f38482a;

    public final Object f38483b;

    public gv0(Object obj, int i10) {
        this.f38482a = i10;
        this.f38483b = obj;
    }

    @Override
    public void B() {
        ((StickersActivity) this.f38483b).j0();
    }

    @Override
    public ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.f23371v3;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        switch (this.f38482a) {
            case 0:
                jv0 jv0Var = (jv0) this.f38483b;
                i0.c cVarG = m1Var.f46619a.g(519);
                jv0Var.f39522r = cVarG;
                jv0Var.d.setPadding(cVarG.f10489a, cVarG.f10490b, cVarG.f10491c, cVarG.d);
                jv0Var.f39517c.requestLayout();
                break;
            default:
                dd1 dd1Var = (dd1) this.f38483b;
                i0.c cVarG2 = m1Var.f46619a.g(519);
                dd1Var.f37369n = cVarG2;
                dd1Var.f37366c.setPadding(cVarG2.f10489a, cVarG2.f10490b, cVarG2.f10491c, cVarG2.d);
                dd1Var.f37365b.requestLayout();
                break;
        }
        return r0.m1.f46618b;
    }

    @Override
    public Paint N(String str) {
        return ((jc1) this.f38483b).f39337f.f40735a.N(str);
    }

    @Override
    public int N0(int i10) {
        return ((jc1) this.f38483b).f39337f.f40735a.N0(i10);
    }

    @Override
    public void P(float f10, boolean z10) {
        switch (this.f38482a) {
            case 3:
                la1 la1Var = (la1) this.f38483b;
                ThemeActivity.Y(la1Var.d, Math.round((la1Var.f40035b * f10) + 0), false);
                break;
            default:
                wa1 wa1Var = (wa1) this.f38483b;
                ThemeActivity themeActivity = wa1Var.h;
                int i10 = wa1Var.f43682c;
                ThemeActivity.k0(themeActivity, Math.round(((wa1Var.d - i10) * f10) + i10));
                break;
        }
    }

    @Override
    public boolean a() {
        return ((jc1) this.f38483b).f39337f.f40735a.a();
    }

    @Override
    public int a0() {
        switch (this.f38482a) {
            case 3:
                return ((la1) this.f38483b).f40035b;
            default:
                wa1 wa1Var = (wa1) this.f38483b;
                return wa1Var.d - wa1Var.f43682c;
        }
    }

    @Override
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38483b;
        u31 u31Var = secretMediaViewer.f36170y;
        if (u31Var != null) {
            long jQ = u31Var.q();
            if (jQ != -9223372036854775807L) {
                secretMediaViewer.f36170y.M((long) (f10 * jQ), false);
            }
            secretMediaViewer.f36170y.D();
        }
    }

    @Override
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((se1) this.f38483b).f42621p0.movePreviewFragment(f10);
        }
    }

    @Override
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38483b;
        u31 u31Var = secretMediaViewer.f36170y;
        if (u31Var != null) {
            u31Var.C();
            long jQ = secretMediaViewer.f36170y.q();
            if (jQ != -9223372036854775807L) {
                secretMediaViewer.f36170y.M((long) (f10 * jQ), false);
            }
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        we1 we1Var = ((se1) this.f38483b).f42621p0;
        HashSet hashSet = we1.f43718j1;
        we1Var.M0(p2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((se1) this.f38483b).f42621p0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38482a) {
            case 3:
                la1 la1Var = (la1) this.f38483b;
                return String.valueOf(Math.round((la1Var.f40034a.getProgress() * la1Var.f40035b) + 0));
            default:
                wa1 wa1Var = (wa1) this.f38483b;
                int i10 = wa1Var.f43682c;
                return String.valueOf(Math.round((wa1Var.f43681b.getProgress() * (wa1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        nc1 nc1Var = ((jc1) this.f38483b).f39337f;
        if (str.equals("drawableMsgOut")) {
            return nc1Var.N;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return nc1Var.O;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return nc1Var.P;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return nc1Var.Q;
        }
        mb1 mb1Var = nc1Var.f40735a;
        return mb1Var != null ? mb1Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override
    public void h0() {
        ((StickersActivity) this.f38483b).j0();
    }

    @Override
    public void m(float f10, float f11, int i10, int i11) {
        mb1 mb1Var = ((jc1) this.f38483b).f39337f.f40735a;
        if (mb1Var != null) {
            mb1Var.m(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
        }
    }

    @Override
    public int o1(int i10) {
        return ((jc1) this.f38483b).f39337f.f40735a.o1(i10);
    }

    @Override
    public int q0(int i10) {
        return ((jc1) this.f38483b).f39337f.f40735a.N0(i10);
    }

    @Override
    public void r() {
        int i10 = this.f38482a;
    }

    @Override
    public boolean u0() {
        return ((jc1) this.f38483b).f39337f.f40735a.u0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void c1(int i10, int i11) {
    }
}
