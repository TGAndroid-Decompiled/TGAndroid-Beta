package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

public final class l4 extends AnimatorListenerAdapter {

    public final boolean f39935a;

    public final ArticleViewer$WindowView f39936b;

    public l4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f39936b = articleViewer$WindowView;
        this.f39935a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f39936b;
        m4 m4Var = articleViewer$WindowView.D;
        boolean z10 = articleViewer$WindowView.f24027e;
        boolean z11 = this.f39935a;
        if (z10) {
            Object objK = null;
            m4Var.f40347q0[0].setBackgroundDrawable(null);
            if (!z11) {
                q3[] q3VarArr = m4Var.f40347q0;
                q3 q3Var = q3VarArr[1];
                q3VarArr[1] = q3VarArr[0];
                q3VarArr[0] = q3Var;
                m4Var.f40335d0.i();
                m4Var.V0.a(m4Var.f40347q0[0].getBackgroundColor(), true);
                m4Var.W0.a(m4Var.f40347q0[1].getBackgroundColor(), true);
                z3 z3Var = m4Var.G;
                if (z3Var != null) {
                    z3Var.m();
                }
                objK = com.google.android.recaptcha.internal.a.k(1, m4Var.Z);
                m4Var.K0.T(m4Var.f40347q0[0].f41496b);
                org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
                j9Var.E0 = m4Var.f40347q0[0].d;
                j9Var.f(true);
                m4Var.i0(false);
                m4Var.f0();
            }
            m4Var.f40347q0[1].b();
            m4Var.f40347q0[1].setVisibility(8);
            if (objK instanceof d3) {
                ((d3) objK).a();
            }
            if (objK instanceof TLRPC.WebPage) {
                org.telegram.ui.web.e2.o((TLRPC.WebPage) objK);
            }
        } else if (!z11) {
            z3 z3Var2 = m4Var.G;
            if (z3Var2 != null) {
                z3Var2.release();
                m4Var.s();
            } else {
                m4Var.U();
                m4Var.M();
            }
        }
        articleViewer$WindowView.f24027e = false;
        articleViewer$WindowView.d = false;
        m4Var.P0 = false;
    }
}
