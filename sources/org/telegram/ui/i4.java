package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class i4 extends AnimatorListenerAdapter {
    public final boolean f33530a;
    public final ArticleViewer$WindowView f33531b;

    public i4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f33531b = articleViewer$WindowView;
        this.f33530a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f33531b;
        j4 j4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f33530a;
        if (z10) {
            Object obj = null;
            j4Var.f33920u0[0].setBackgroundDrawable(null);
            if (!z11) {
                n3[] n3VarArr = j4Var.f33920u0;
                n3 n3Var = n3VarArr[1];
                n3VarArr[1] = n3VarArr[0];
                n3VarArr[0] = n3Var;
                j4Var.f33908h0.i();
                j4Var.Z0.a(j4Var.f33920u0[0].getBackgroundColor(), true);
                j4Var.f33901a1.a(j4Var.f33920u0[1].getBackgroundColor(), true);
                w3 w3Var = j4Var.K;
                if (w3Var != null) {
                    w3Var.m();
                }
                obj = hc.b.z(1, j4Var.f33904d0);
                j4Var.O0.T(j4Var.f33920u0[0].f35102b);
                org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
                s9Var.E0 = j4Var.f33920u0[0].d;
                s9Var.f(true);
                j4Var.i0(false);
                j4Var.f0();
            }
            j4Var.f33920u0[1].b();
            j4Var.f33920u0[1].setVisibility(8);
            if (obj instanceof a3) {
                ((a3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.k2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            w3 w3Var2 = j4Var.K;
            if (w3Var2 != null) {
                w3Var2.release();
                j4Var.s();
            } else {
                j4Var.U();
                j4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        j4Var.T0 = false;
    }
}
