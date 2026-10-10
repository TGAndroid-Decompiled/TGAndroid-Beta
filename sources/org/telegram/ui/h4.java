package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class h4 extends AnimatorListenerAdapter {
    public final boolean f38254a;
    public final ArticleViewer$WindowView f38255b;

    public h4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f38255b = articleViewer$WindowView;
        this.f38254a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f38255b;
        i4 i4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.f21755e;
        boolean z11 = this.f38254a;
        if (z10) {
            Object obj = null;
            i4Var.f38559u0[0].setBackgroundDrawable(null);
            if (!z11) {
                m3[] m3VarArr = i4Var.f38559u0;
                m3 m3Var = m3VarArr[1];
                m3VarArr[1] = m3VarArr[0];
                m3VarArr[0] = m3Var;
                i4Var.f38547h0.i();
                i4Var.Z0.a(i4Var.f38559u0[0].getBackgroundColor(), true);
                i4Var.f38540a1.a(i4Var.f38559u0[1].getBackgroundColor(), true);
                v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.m();
                }
                obj = hg.c.x(1, i4Var.f38543d0);
                i4Var.O0.S(i4Var.f38559u0[0].f39796b);
                org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
                o9Var.f22623z0 = i4Var.f38559u0[0].d;
                o9Var.f(true);
                i4Var.i0(false);
                i4Var.f0();
            }
            i4Var.f38559u0[1].b();
            i4Var.f38559u0[1].setVisibility(8);
            if (obj instanceof z2) {
                ((z2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            v3 v3Var2 = i4Var.K;
            if (v3Var2 != null) {
                v3Var2.release();
                i4Var.s();
            } else {
                i4Var.U();
                i4Var.M();
            }
        }
        articleViewer$WindowView.f21755e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
