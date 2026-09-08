package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class h4 extends AnimatorListenerAdapter {
    public final boolean f36901a;
    public final ArticleViewer$WindowView f36902b;

    public h4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f36902b = articleViewer$WindowView;
        this.f36901a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f36902b;
        i4 i4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.f21595e;
        boolean z11 = this.f36901a;
        if (z10) {
            Object obj = null;
            i4Var.f37259u0[0].setBackgroundDrawable(null);
            if (!z11) {
                m3[] m3VarArr = i4Var.f37259u0;
                m3 m3Var = m3VarArr[1];
                m3VarArr[1] = m3VarArr[0];
                m3VarArr[0] = m3Var;
                i4Var.f37247h0.i();
                i4Var.Z0.a(i4Var.f37259u0[0].getBackgroundColor(), true);
                i4Var.f37240a1.a(i4Var.f37259u0[1].getBackgroundColor(), true);
                v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.m();
                }
                obj = i2.g.z(1, i4Var.f37243d0);
                i4Var.O0.T(i4Var.f37259u0[0].f38578b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                q9Var.E0 = i4Var.f37259u0[0].d;
                q9Var.f(true);
                i4Var.i0(false);
                i4Var.f0();
            }
            i4Var.f37259u0[1].b();
            i4Var.f37259u0[1].setVisibility(8);
            if (obj instanceof z2) {
                ((z2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            v3 v3Var2 = i4Var.K;
            if (v3Var2 != null) {
                v3Var2.release();
                i4Var.s();
            } else {
                i4Var.U();
                i4Var.M();
            }
        }
        articleViewer$WindowView.f21595e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
