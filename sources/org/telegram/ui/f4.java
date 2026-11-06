package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class f4 extends AnimatorListenerAdapter {
    public final boolean f45469a;
    public final ArticleViewer$WindowView f45470b;

    public f4(ArticleViewer$WindowView articleViewer$WindowView, boolean z9) {
        this.f45470b = articleViewer$WindowView;
        this.f45469a = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f45470b;
        g4 g4Var = articleViewer$WindowView.H;
        boolean z9 = articleViewer$WindowView.f28838e;
        boolean z10 = this.f45469a;
        if (z9) {
            Object obj = null;
            g4Var.f45816u0[0].setBackgroundDrawable(null);
            if (!z10) {
                k3[] k3VarArr = g4Var.f45816u0;
                k3 k3Var = k3VarArr[1];
                k3VarArr[1] = k3VarArr[0];
                k3VarArr[0] = k3Var;
                g4Var.f45804h0.i();
                g4Var.f45796a1.a(g4Var.f45816u0[0].getBackgroundColor(), true);
                g4Var.f45798b1.a(g4Var.f45816u0[1].getBackgroundColor(), true);
                t3 t3Var = g4Var.K;
                if (t3Var != null) {
                    t3Var.z();
                }
                obj = org.telegram.ui.Cells.f1.k(1, g4Var.f45800d0);
                g4Var.P0.S(g4Var.f45816u0[0].f47065b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                i9Var.f29323z0 = g4Var.f45816u0[0].d;
                i9Var.f(true);
                g4Var.g0(false);
                g4Var.d0();
            }
            g4Var.f45816u0[1].b();
            g4Var.f45816u0[1].setVisibility(8);
            if (obj instanceof x2) {
                ((x2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.w1.o((TLRPC.WebPage) obj);
            }
        } else if (!z10) {
            t3 t3Var2 = g4Var.K;
            if (t3Var2 != null) {
                t3Var2.release();
                g4Var.q();
            } else {
                g4Var.S();
                g4Var.K();
            }
        }
        articleViewer$WindowView.f28838e = false;
        articleViewer$WindowView.d = false;
        g4Var.U0 = false;
    }
}
