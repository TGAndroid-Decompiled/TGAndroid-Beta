package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class i4 extends AnimatorListenerAdapter {
    public final boolean f40132a;
    public final ArticleViewer$WindowView f40133b;

    public i4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f40133b = articleViewer$WindowView;
        this.f40132a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f40133b;
        j4 j4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f40132a;
        if (z10) {
            Object obj = null;
            j4Var.f40446u0[0].setBackgroundDrawable(null);
            if (!z11) {
                m3[] m3VarArr = j4Var.f40446u0;
                m3 m3Var = m3VarArr[1];
                m3VarArr[1] = m3VarArr[0];
                m3VarArr[0] = m3Var;
                j4Var.f40434h0.i();
                j4Var.f40426a1.a(j4Var.f40446u0[0].getBackgroundColor(), true);
                j4Var.f40428b1.a(j4Var.f40446u0[1].getBackgroundColor(), true);
                v3 v3Var = j4Var.K;
                if (v3Var != null) {
                    v3Var.m();
                }
                obj = ic.a.y(1, j4Var.f40430d0);
                j4Var.P0.S(j4Var.f40446u0[0].f41440b);
                org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
                s9Var.f25418z0 = j4Var.f40446u0[0].d;
                s9Var.f(true);
                j4Var.i0(false);
                j4Var.f0();
            }
            j4Var.f40446u0[1].b();
            j4Var.f40446u0[1].setVisibility(8);
            if (obj instanceof y2) {
                ((y2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            v3 v3Var2 = j4Var.K;
            if (v3Var2 != null) {
                v3Var2.release();
                j4Var.s();
            } else {
                j4Var.U();
                j4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        j4Var.U0 = false;
    }
}
