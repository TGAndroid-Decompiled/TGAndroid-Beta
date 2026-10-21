package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class k4 extends AnimatorListenerAdapter {
    public final boolean f38412a;
    public final ArticleViewer$WindowView f38413b;

    public k4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f38413b = articleViewer$WindowView;
        this.f38412a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f38413b;
        l4 l4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f38412a;
        if (z10) {
            Object obj = null;
            l4Var.f38779u0[0].setBackgroundDrawable(null);
            if (!z11) {
                o3[] o3VarArr = l4Var.f38779u0;
                o3 o3Var = o3VarArr[1];
                o3VarArr[1] = o3VarArr[0];
                o3VarArr[0] = o3Var;
                l4Var.f38767h0.i();
                l4Var.Z0.a(l4Var.f38779u0[0].getBackgroundColor(), true);
                l4Var.f38760a1.a(l4Var.f38779u0[1].getBackgroundColor(), true);
                x3 x3Var = l4Var.K;
                if (x3Var != null) {
                    x3Var.m();
                }
                obj = i2.e.A(1, l4Var.f38763d0);
                l4Var.O0.S(l4Var.f38779u0[0].f39753b);
                org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
                n9Var.f22667z0 = l4Var.f38779u0[0].d;
                n9Var.f(true);
                l4Var.i0(false);
                l4Var.f0();
            }
            l4Var.f38779u0[1].b();
            l4Var.f38779u0[1].setVisibility(8);
            if (obj instanceof b3) {
                ((b3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            x3 x3Var2 = l4Var.K;
            if (x3Var2 != null) {
                x3Var2.release();
                l4Var.s();
            } else {
                l4Var.U();
                l4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        l4Var.T0 = false;
    }
}
