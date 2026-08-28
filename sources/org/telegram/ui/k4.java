package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class k4 extends AnimatorListenerAdapter {
    public final boolean f39694a;
    public final ArticleViewer$WindowView f39695b;

    public k4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f39695b = articleViewer$WindowView;
        this.f39694a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f39695b;
        l4 l4Var = articleViewer$WindowView.D;
        boolean z10 = articleViewer$WindowView.f24020e;
        boolean z11 = this.f39694a;
        if (z10) {
            Object obj = null;
            l4Var.f40026q0[0].setBackgroundDrawable(null);
            if (!z11) {
                p3[] p3VarArr = l4Var.f40026q0;
                p3 p3Var = p3VarArr[1];
                p3VarArr[1] = p3VarArr[0];
                p3VarArr[0] = p3Var;
                l4Var.f40014d0.i();
                l4Var.V0.a(l4Var.f40026q0[0].getBackgroundColor(), true);
                l4Var.W0.a(l4Var.f40026q0[1].getBackgroundColor(), true);
                y3 y3Var = l4Var.G;
                if (y3Var != null) {
                    y3Var.m();
                }
                obj = e2.c.k(1, l4Var.Z);
                l4Var.K0.T(l4Var.f40026q0[0].f41320b);
                org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
                n9Var.E0 = l4Var.f40026q0[0].d;
                n9Var.f(true);
                l4Var.i0(false);
                l4Var.f0();
            }
            l4Var.f40026q0[1].b();
            l4Var.f40026q0[1].setVisibility(8);
            if (obj instanceof c3) {
                ((c3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.d2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            y3 y3Var2 = l4Var.G;
            if (y3Var2 != null) {
                y3Var2.release();
                l4Var.s();
            } else {
                l4Var.U();
                l4Var.M();
            }
        }
        articleViewer$WindowView.f24020e = false;
        articleViewer$WindowView.d = false;
        l4Var.P0 = false;
    }
}
