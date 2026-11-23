package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class f4 extends AnimatorListenerAdapter {
    public final boolean f47675a;
    public final ArticleViewer$WindowView f47676b;

    public f4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f47676b = articleViewer$WindowView;
        this.f47675a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f47676b;
        g4 g4Var = articleViewer$WindowView.I;
        boolean z10 = articleViewer$WindowView.f30420e;
        boolean z11 = this.f47675a;
        if (z10) {
            Object obj = null;
            g4Var.f48084v0[0].setBackgroundDrawable(null);
            if (!z11) {
                k3[] k3VarArr = g4Var.f48084v0;
                k3 k3Var = k3VarArr[1];
                k3VarArr[1] = k3VarArr[0];
                k3VarArr[0] = k3Var;
                g4Var.f48072i0.i();
                g4Var.f48064b1.a(g4Var.f48084v0[0].getBackgroundColor(), true);
                g4Var.f48066c1.a(g4Var.f48084v0[1].getBackgroundColor(), true);
                t3 t3Var = g4Var.L;
                if (t3Var != null) {
                    t3Var.z();
                }
                obj = p5.c.g(1, g4Var.f48068e0);
                g4Var.Q0.S(g4Var.f48084v0[0].f49288b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
                i9Var.f30933z0 = g4Var.f48084v0[0].d;
                i9Var.f(true);
                g4Var.g0(false);
                g4Var.d0();
            }
            g4Var.f48084v0[1].b();
            g4Var.f48084v0[1].setVisibility(8);
            if (obj instanceof x2) {
                ((x2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.w1.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            t3 t3Var2 = g4Var.L;
            if (t3Var2 != null) {
                t3Var2.release();
                g4Var.q();
            } else {
                g4Var.S();
                g4Var.K();
            }
        }
        articleViewer$WindowView.f30420e = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
