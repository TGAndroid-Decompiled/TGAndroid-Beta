package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class g4 extends AnimatorListenerAdapter {
    public final boolean f37411a;
    public final ArticleViewer$WindowView f37412b;

    public g4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f37412b = articleViewer$WindowView;
        this.f37411a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f37412b;
        h4 h4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f37411a;
        if (z10) {
            Object obj = null;
            h4Var.f37746u0[0].setBackgroundDrawable(null);
            if (!z11) {
                l3[] l3VarArr = h4Var.f37746u0;
                l3 l3Var = l3VarArr[1];
                l3VarArr[1] = l3VarArr[0];
                l3VarArr[0] = l3Var;
                h4Var.f37734h0.i();
                h4Var.f37726a1.a(h4Var.f37746u0[0].getBackgroundColor(), true);
                h4Var.f37728b1.a(h4Var.f37746u0[1].getBackgroundColor(), true);
                u3 u3Var = h4Var.K;
                if (u3Var != null) {
                    u3Var.y();
                }
                obj = i0.a.v(1, h4Var.f37730d0);
                h4Var.P0.S(h4Var.f37746u0[0].f39038b);
                org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
                k9Var.f22196z0 = h4Var.f37746u0[0].d;
                k9Var.f(true);
                h4Var.g0(false);
                h4Var.d0();
            }
            h4Var.f37746u0[1].b();
            h4Var.f37746u0[1].setVisibility(8);
            if (obj instanceof x2) {
                ((x2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.y1.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            u3 u3Var2 = h4Var.K;
            if (u3Var2 != null) {
                u3Var2.release();
                h4Var.q();
            } else {
                h4Var.S();
                h4Var.K();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        h4Var.U0 = false;
    }
}
