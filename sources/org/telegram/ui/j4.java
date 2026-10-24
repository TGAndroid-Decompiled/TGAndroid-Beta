package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class j4 extends AnimatorListenerAdapter {
    public final boolean f38450a;
    public final ArticleViewer$WindowView f38451b;

    public j4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f38451b = articleViewer$WindowView;
        this.f38450a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f38451b;
        k4 k4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f38450a;
        if (z10) {
            Object obj = null;
            k4Var.f38774u0[0].setBackgroundDrawable(null);
            if (!z11) {
                n3[] n3VarArr = k4Var.f38774u0;
                n3 n3Var = n3VarArr[1];
                n3VarArr[1] = n3VarArr[0];
                n3VarArr[0] = n3Var;
                k4Var.f38762h0.i();
                k4Var.f38754a1.a(k4Var.f38774u0[0].getBackgroundColor(), true);
                k4Var.f38756b1.a(k4Var.f38774u0[1].getBackgroundColor(), true);
                w3 w3Var = k4Var.K;
                if (w3Var != null) {
                    w3Var.m();
                }
                obj = i2.o1.A(1, k4Var.f38758d0);
                k4Var.P0.S(k4Var.f38774u0[0].f39702b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                o9Var.f22872z0 = k4Var.f38774u0[0].d;
                o9Var.f(true);
                k4Var.i0(false);
                k4Var.f0();
            }
            k4Var.f38774u0[1].b();
            k4Var.f38774u0[1].setVisibility(8);
            if (obj instanceof a3) {
                ((a3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            w3 w3Var2 = k4Var.K;
            if (w3Var2 != null) {
                w3Var2.release();
                k4Var.s();
            } else {
                k4Var.U();
                k4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        k4Var.U0 = false;
    }
}
