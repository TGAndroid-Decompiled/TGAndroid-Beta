package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class ov0 implements r0.o, org.telegram.ui.Components.j71, org.telegram.ui.Components.aq0, org.telegram.ui.Components.jo0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.zn0 {
    public final int f36986a;
    public final Object f36987b;

    public ov0(Object obj, int i10) {
        this.f36986a = i10;
        this.f36987b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f36986a;
    }

    @Override
    public Paint G(String str) {
        return ((yc1) this.f36987b).f40478f.f33287a.G(str);
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        switch (this.f36986a) {
            case 0:
                rv0 rv0Var = (rv0) this.f36987b;
                i0.b g10 = m1Var.f43130a.g(519);
                rv0Var.f38126r = g10;
                rv0Var.d.setPadding(g10.f7213a, g10.f7214b, g10.f7215c, g10.d);
                rv0Var.f38121c.requestLayout();
                return r0.m1.f43129b;
            default:
                rd1 rd1Var = (rd1) this.f36987b;
                i0.b g11 = m1Var.f43130a.g(519);
                rd1Var.f37993n = g11;
                rd1Var.f37991c.setPadding(g11.f7213a, g11.f7214b, g11.f7215c, g11.d);
                rd1Var.f37989b.requestLayout();
                return r0.m1.f43129b;
        }
    }

    @Override
    public void V() {
        ((StickersActivity) this.f36987b).j0();
    }

    @Override
    public void Y(float f10, boolean z4) {
        switch (this.f36986a) {
            case 3:
                bb1 bb1Var = (bb1) this.f36987b;
                ThemeActivity.Y(bb1Var.d, Math.round((bb1Var.f32892b * f10) + 0), false);
                return;
            default:
                mb1 mb1Var = (mb1) this.f36987b;
                ThemeActivity themeActivity = mb1Var.h;
                int i10 = mb1Var.f36261c;
                ThemeActivity.k0(themeActivity, Math.round(((mb1Var.d - i10) * f10) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((yc1) this.f36987b).f40478f.f33287a.a();
    }

    @Override
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36987b;
        h41 h41Var = secretMediaViewer.f32275y;
        if (h41Var != null) {
            long p10 = h41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f32275y.L(f10 * ((float) p10), false);
            }
            secretMediaViewer.f32275y.C();
        }
    }

    @Override
    public int c0(int i10) {
        return ((yc1) this.f36987b).f40478f.f33287a.x0(i10);
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36987b;
        h41 h41Var = secretMediaViewer.f32275y;
        if (h41Var != null) {
            h41Var.B();
            long p10 = secretMediaViewer.f32275y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f32275y.L(f10 * ((float) p10), false);
            }
        }
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gf1) this.f36987b).f34610q0.movePreviewFragment(f10);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        kf1 kf1Var = ((gf1) this.f36987b).f34610q0;
        HashSet hashSet = kf1.f35667k1;
        kf1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gf1) this.f36987b).f34610q0.finishPreviewFragment();
        }
    }

    @Override
    public int g1(int i10) {
        return ((yc1) this.f36987b).f40478f.f33287a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f36986a) {
            case 3:
                bb1 bb1Var = (bb1) this.f36987b;
                return String.valueOf(Math.round((bb1Var.f32891a.getProgress() * bb1Var.f32892b) + 0));
            default:
                mb1 mb1Var = (mb1) this.f36987b;
                int i10 = mb1Var.f36261c;
                return String.valueOf(Math.round((mb1Var.f36260b.getProgress() * (mb1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        cd1 cd1Var = ((yc1) this.f36987b).f40478f;
        if (str.equals("drawableMsgOut")) {
            return cd1Var.O;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return cd1Var.P;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return cd1Var.Q;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return cd1Var.R;
        }
        cc1 cc1Var = cd1Var.f33287a;
        if (cc1Var != null) {
            return cc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int j0() {
        switch (this.f36986a) {
            case 3:
                return ((bb1) this.f36987b).f32892b;
            default:
                mb1 mb1Var = (mb1) this.f36987b;
                return mb1Var.d - mb1Var.f36261c;
        }
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        cc1 cc1Var = ((yc1) this.f36987b).f40478f.f33287a;
        if (cc1Var != null) {
            cc1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
        }
    }

    @Override
    public boolean m0() {
        return ((yc1) this.f36987b).f40478f.f33287a.m0();
    }

    @Override
    public void t0() {
        ((StickersActivity) this.f36987b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20222v3;
    }

    @Override
    public int x0(int i10) {
        return ((yc1) this.f36987b).f40478f.f33287a.x0(i10);
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void K0(int i10, int i11) {
    }
}
