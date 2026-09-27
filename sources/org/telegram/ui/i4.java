package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class i4 extends AnimatorListenerAdapter {
    public final boolean f34350a;
    public final ArticleViewer$WindowView f34351b;

    public i4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f34351b = articleViewer$WindowView;
        this.f34350a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f34351b;
        j4 j4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f34350a;
        if (z10) {
            Object obj = null;
            j4Var.f34627u0[0].setBackgroundDrawable(null);
            if (!z11) {
                n3[] n3VarArr = j4Var.f34627u0;
                n3 n3Var = n3VarArr[1];
                n3VarArr[1] = n3VarArr[0];
                n3VarArr[0] = n3Var;
                j4Var.f34615h0.i();
                j4Var.Z0.a(j4Var.f34627u0[0].getBackgroundColor(), true);
                j4Var.f34608a1.a(j4Var.f34627u0[1].getBackgroundColor(), true);
                w3 w3Var = j4Var.K;
                if (w3Var != null) {
                    w3Var.m();
                }
                obj = hg.k0.x(1, j4Var.f34611d0);
                j4Var.O0.T(j4Var.f34627u0[0].f35795b);
                org.telegram.ui.Cells.q9 q9Var = j4Var.O0;
                q9Var.E0 = j4Var.f34627u0[0].d;
                q9Var.f(true);
                j4Var.i0(false);
                j4Var.f0();
            }
            j4Var.f34627u0[1].b();
            j4Var.f34627u0[1].setVisibility(8);
            if (obj instanceof a3) {
                ((a3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
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
