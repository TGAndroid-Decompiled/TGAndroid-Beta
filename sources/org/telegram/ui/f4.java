package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class f4 extends AnimatorListenerAdapter {
    public final boolean f46974a;
    public final ArticleViewer$WindowView f46975b;

    public f4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f46975b = articleViewer$WindowView;
        this.f46974a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f46975b;
        g4 g4Var = articleViewer$WindowView.I;
        boolean z10 = articleViewer$WindowView.f29955e;
        boolean z11 = this.f46974a;
        if (z10) {
            Object obj = null;
            g4Var.f47326v0[0].setBackgroundDrawable(null);
            if (!z11) {
                k3[] k3VarArr = g4Var.f47326v0;
                k3 k3Var = k3VarArr[1];
                k3VarArr[1] = k3VarArr[0];
                k3VarArr[0] = k3Var;
                g4Var.f47314i0.i();
                g4Var.f47306b1.a(g4Var.f47326v0[0].getBackgroundColor(), true);
                g4Var.f47308c1.a(g4Var.f47326v0[1].getBackgroundColor(), true);
                t3 t3Var = g4Var.L;
                if (t3Var != null) {
                    t3Var.z();
                }
                obj = r.b.g(1, g4Var.f47310e0);
                g4Var.Q0.S(g4Var.f47326v0[0].f48503b);
                org.telegram.ui.Cells.h9 h9Var = g4Var.Q0;
                h9Var.f30421z0 = g4Var.f47326v0[0].d;
                h9Var.f(true);
                g4Var.g0(false);
                g4Var.d0();
            }
            g4Var.f47326v0[1].b();
            g4Var.f47326v0[1].setVisibility(8);
            if (obj instanceof x2) {
                ((x2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.v1.o((TLRPC.WebPage) obj);
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
        articleViewer$WindowView.f29955e = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
