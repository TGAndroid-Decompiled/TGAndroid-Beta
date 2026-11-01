package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class gt0 implements r0.m, org.telegram.ui.Components.w61, org.telegram.ui.Components.fp0, org.telegram.ui.Components.nn0, org.telegram.ui.Components.dn0 {
    public final int f37564a;
    public final Object f37565b;

    public gt0(Object obj, int i10) {
        this.f37564a = i10;
        this.f37565b = obj;
    }

    @Override
    public void B0() {
        ((StickersActivity) this.f37565b).o0();
    }

    @Override
    public void C() {
        int i10 = this.f37564a;
    }

    @Override
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        nb1 nb1Var = ((jb1) this.f37565b).f38356v0;
        HashSet hashSet = nb1.f39796q1;
        nb1Var.Q0(v2Var);
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        switch (this.f37564a) {
            case 0:
                jt0 jt0Var = (jt0) this.f37565b;
                i0.c g10 = j1Var.f46143a.g(519);
                jt0Var.f38552r = g10;
                jt0Var.d.setPadding(g10.f7766a, g10.f7767b, g10.f7768c, g10.d);
                jt0Var.f38544c.requestLayout();
                return r0.j1.f46142b;
            default:
                v91 v91Var = (v91) this.f37565b;
                i0.c g11 = j1Var.f46143a.g(519);
                v91Var.f42457n = g11;
                v91Var.f42452c.setPadding(g11.f7766a, g11.f7767b, g11.f7768c, g11.d);
                v91Var.f42450b.requestLayout();
                return r0.j1.f46142b;
        }
    }

    @Override
    public void V() {
        ((StickersActivity) this.f37565b).o0();
    }

    @Override
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            ((jb1) this.f37565b).f38356v0.movePreviewFragment(f7);
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37565b;
        sq0 sq0Var = secretMediaViewer.D;
        if (sq0Var != null) {
            long U = sq0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f7 * ((float) U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37565b;
        sq0 sq0Var = secretMediaViewer.D;
        if (sq0Var != null) {
            sq0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f7 * ((float) U), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            ((jb1) this.f37565b).f38356v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f37564a) {
            case 3:
                m71 m71Var = (m71) this.f37565b;
                return String.valueOf(Math.round((m71Var.f39461a.getProgress() * m71Var.f39462b) + 0));
            default:
                w71 w71Var = (w71) this.f37565b;
                int i10 = w71Var.d;
                return String.valueOf(Math.round((w71Var.f42717b.getProgress() * (w71Var.e - i10)) + i10));
        }
    }

    @Override
    public void k(boolean z10, float f7) {
        switch (this.f37564a) {
            case 3:
                m71 m71Var = (m71) this.f37565b;
                ThemeActivity.d0(m71Var.e, Math.round((m71Var.f39462b * f7) + 0), false);
                return;
            default:
                w71 w71Var = (w71) this.f37565b;
                ThemeActivity themeActivity = w71Var.f42721r;
                int i10 = w71Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((w71Var.e - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int p0() {
        switch (this.f37564a) {
            case 3:
                return ((m71) this.f37565b).f39462b;
            default:
                w71 w71Var = (w71) this.f37565b;
                return w71Var.e - w71Var.d;
        }
    }

    private final void b() {
    }

    private final void e() {
    }
}
