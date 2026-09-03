package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class k4 extends AnimatorListenerAdapter {
    public final boolean f38185a;
    public final ArticleViewer$WindowView f38186b;

    public k4(ArticleViewer$WindowView articleViewer$WindowView, boolean z4) {
        this.f38186b = articleViewer$WindowView;
        this.f38185a = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f38186b;
        l4 l4Var = articleViewer$WindowView.E;
        boolean z4 = articleViewer$WindowView.f22512e;
        boolean z10 = this.f38185a;
        if (z4) {
            Object obj = null;
            l4Var.f38524r0[0].setBackgroundDrawable(null);
            if (!z10) {
                p3[] p3VarArr = l4Var.f38524r0;
                p3 p3Var = p3VarArr[1];
                p3VarArr[1] = p3VarArr[0];
                p3VarArr[0] = p3Var;
                l4Var.f38512e0.i();
                l4Var.W0.a(l4Var.f38524r0[0].getBackgroundColor(), true);
                l4Var.X0.a(l4Var.f38524r0[1].getBackgroundColor(), true);
                y3 y3Var = l4Var.H;
                if (y3Var != null) {
                    y3Var.m();
                }
                obj = e2.c.g(1, l4Var.f38508a0);
                l4Var.L0.T(l4Var.f38524r0[0].f39862b);
                org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
                m9Var.E0 = l4Var.f38524r0[0].d;
                m9Var.f(true);
                l4Var.i0(false);
                l4Var.f0();
            }
            l4Var.f38524r0[1].b();
            l4Var.f38524r0[1].setVisibility(8);
            if (obj instanceof b3) {
                ((b3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
            }
        } else if (!z10) {
            y3 y3Var2 = l4Var.H;
            if (y3Var2 != null) {
                y3Var2.release();
                l4Var.s();
            } else {
                l4Var.U();
                l4Var.M();
            }
        }
        articleViewer$WindowView.f22512e = false;
        articleViewer$WindowView.d = false;
        l4Var.Q0 = false;
    }
}
