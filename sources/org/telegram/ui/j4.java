package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class j4 extends AnimatorListenerAdapter {
    public final boolean f36922a;
    public final ArticleViewer$WindowView f36923b;

    public j4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f36923b = articleViewer$WindowView;
        this.f36922a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f36923b;
        k4 k4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f36922a;
        if (z10) {
            Object obj = null;
            k4Var.f37278u0[0].setBackgroundDrawable(null);
            if (!z11) {
                o3[] o3VarArr = k4Var.f37278u0;
                o3 o3Var = o3VarArr[1];
                o3VarArr[1] = o3VarArr[0];
                o3VarArr[0] = o3Var;
                k4Var.f37266h0.i();
                k4Var.Z0.a(k4Var.f37278u0[0].getBackgroundColor(), true);
                k4Var.f37259a1.a(k4Var.f37278u0[1].getBackgroundColor(), true);
                x3 x3Var = k4Var.K;
                if (x3Var != null) {
                    x3Var.m();
                }
                obj = i2.d.A(1, k4Var.f37262d0);
                k4Var.O0.S(k4Var.f37278u0[0].f38529b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
                o9Var.f21364z0 = k4Var.f37278u0[0].d;
                o9Var.f(true);
                k4Var.i0(false);
                k4Var.f0();
            }
            k4Var.f37278u0[1].b();
            k4Var.f37278u0[1].setVisibility(8);
            if (obj instanceof b3) {
                ((b3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            x3 x3Var2 = k4Var.K;
            if (x3Var2 != null) {
                x3Var2.release();
                k4Var.s();
            } else {
                k4Var.U();
                k4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        k4Var.T0 = false;
    }
}
