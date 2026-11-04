package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class mr0 implements r0.m, org.telegram.ui.Components.n51, org.telegram.ui.Components.eo0, org.telegram.ui.Components.om0, org.telegram.ui.Components.em0 {
    public final int f47770a;
    public final Object f47771b;

    public mr0(Object obj, int i3) {
        this.f47770a = i3;
        this.f47771b = obj;
    }

    @Override
    public void C0() {
        ((StickersActivity) this.f47771b).o0();
    }

    @Override
    public void D() {
        int i3 = this.f47770a;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        switch (this.f47770a) {
            case 0:
                pr0 pr0Var = (pr0) this.f47771b;
                i0.b g7 = k1Var.f54026a.g(519);
                pr0Var.f48651r = g7;
                pr0Var.d.setPadding(g7.f14495a, g7.f14496b, g7.f14497c, g7.d);
                pr0Var.f48641c.requestLayout();
                return r0.k1.f54025b;
            default:
                w71 w71Var = (w71) this.f47771b;
                i0.b g10 = k1Var.f54026a.g(519);
                w71Var.f50742n = g10;
                w71Var.f50735c.setPadding(g10.f14495a, g10.f14496b, g10.f14497c, g10.d);
                w71Var.f50733b.requestLayout();
                return r0.k1.f54025b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f47771b).o0();
    }

    @Override
    public void Y(org.telegram.ui.Cells.t2 t2Var) {
        m91 m91Var = ((i91) this.f47771b).f46222w0;
        HashSet hashSet = m91.f47574r1;
        m91Var.Q0(t2Var);
    }

    @Override
    public void c(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47771b;
        bp0 bp0Var = secretMediaViewer.E;
        if (bp0Var != null) {
            long U = bp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47771b;
        bp0 bp0Var = secretMediaViewer.E;
        if (bp0Var != null) {
            bp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            ((i91) this.f47771b).f46222w0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f47770a) {
            case 3:
                m51 m51Var = (m51) this.f47771b;
                return String.valueOf(Math.round((m51Var.f47527a.getProgress() * m51Var.f47528b) + 0));
            default:
                w51 w51Var = (w51) this.f47771b;
                int i3 = w51Var.d;
                return String.valueOf(Math.round((w51Var.f50714b.getProgress() * (w51Var.f50716e - i3)) + i3));
        }
    }

    @Override
    public void k(boolean z10, float f10) {
        switch (this.f47770a) {
            case 3:
                m51 m51Var = (m51) this.f47771b;
                ThemeActivity.d0(m51Var.f47530e, Math.round((m51Var.f47528b * f10) + 0), false);
                return;
            default:
                w51 w51Var = (w51) this.f47771b;
                ThemeActivity themeActivity = w51Var.f50719r;
                int i3 = w51Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((w51Var.f50716e - i3) * f10) + i3));
                return;
        }
    }

    @Override
    public void m(float f10) {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            ((i91) this.f47771b).f46222w0.movePreviewFragment(f10);
        }
    }

    @Override
    public int q0() {
        switch (this.f47770a) {
            case 3:
                return ((m51) this.f47771b).f47528b;
            default:
                w51 w51Var = (w51) this.f47771b;
                return w51Var.f50716e - w51Var.d;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
