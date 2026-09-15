package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class g4 extends AnimatorListenerAdapter {
    public final boolean f33752a;
    public final ArticleViewer$WindowView f33753b;

    public g4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f33753b = articleViewer$WindowView;
        this.f33752a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f33753b;
        h4 h4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f33752a;
        if (z10) {
            Object obj = null;
            h4Var.f34151u0[0].setBackgroundDrawable(null);
            if (!z11) {
                l3[] l3VarArr = h4Var.f34151u0;
                l3 l3Var = l3VarArr[1];
                l3VarArr[1] = l3VarArr[0];
                l3VarArr[0] = l3Var;
                h4Var.f34139h0.i();
                h4Var.Z0.a(h4Var.f34151u0[0].getBackgroundColor(), true);
                h4Var.f34132a1.a(h4Var.f34151u0[1].getBackgroundColor(), true);
                u3 u3Var = h4Var.K;
                if (u3Var != null) {
                    u3Var.m();
                }
                obj = hg.k0.z(1, h4Var.f34135d0);
                h4Var.O0.T(h4Var.f34151u0[0].f35311b);
                org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
                q9Var.E0 = h4Var.f34151u0[0].d;
                q9Var.f(true);
                h4Var.i0(false);
                h4Var.f0();
            }
            h4Var.f34151u0[1].b();
            h4Var.f34151u0[1].setVisibility(8);
            if (obj instanceof y2) {
                ((y2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            u3 u3Var2 = h4Var.K;
            if (u3Var2 != null) {
                u3Var2.release();
                h4Var.s();
            } else {
                h4Var.U();
                h4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
