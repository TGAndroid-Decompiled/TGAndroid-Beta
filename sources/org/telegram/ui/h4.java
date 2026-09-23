package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class h4 extends AnimatorListenerAdapter {
    public final boolean f33726a;
    public final ArticleViewer$WindowView f33727b;

    public h4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f33727b = articleViewer$WindowView;
        this.f33726a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f33727b;
        i4 i4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.f33726a;
        if (z10) {
            Object obj = null;
            i4Var.f34021u0[0].setBackgroundDrawable(null);
            if (!z11) {
                m3[] m3VarArr = i4Var.f34021u0;
                m3 m3Var = m3VarArr[1];
                m3VarArr[1] = m3VarArr[0];
                m3VarArr[0] = m3Var;
                i4Var.f34009h0.i();
                i4Var.Z0.a(i4Var.f34021u0[0].getBackgroundColor(), true);
                i4Var.f34002a1.a(i4Var.f34021u0[1].getBackgroundColor(), true);
                v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.m();
                }
                obj = hg.c.z(1, i4Var.f34005d0);
                i4Var.O0.T(i4Var.f34021u0[0].f35130b);
                org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
                r9Var.E0 = i4Var.f34021u0[0].d;
                r9Var.f(true);
                i4Var.i0(false);
                i4Var.f0();
            }
            i4Var.f34021u0[1].b();
            i4Var.f34021u0[1].setVisibility(8);
            if (obj instanceof z2) {
                ((z2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
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
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
