package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class l4 extends AnimatorListenerAdapter {
    public final boolean f40084a;
    public final ArticleViewer$WindowView f40085b;

    public l4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.f40085b = articleViewer$WindowView;
        this.f40084a = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.f40085b;
        m4 m4Var = articleViewer$WindowView.D;
        boolean z10 = articleViewer$WindowView.f24040e;
        boolean z11 = this.f40084a;
        if (z10) {
            Object obj = null;
            m4Var.f40404q0[0].setBackgroundDrawable(null);
            if (!z11) {
                q3[] q3VarArr = m4Var.f40404q0;
                q3 q3Var = q3VarArr[1];
                q3VarArr[1] = q3VarArr[0];
                q3VarArr[0] = q3Var;
                m4Var.f40392d0.i();
                m4Var.V0.a(m4Var.f40404q0[0].getBackgroundColor(), true);
                m4Var.W0.a(m4Var.f40404q0[1].getBackgroundColor(), true);
                z3 z3Var = m4Var.G;
                if (z3Var != null) {
                    z3Var.m();
                }
                obj = com.google.android.recaptcha.internal.a.j(1, m4Var.Z);
                m4Var.K0.T(m4Var.f40404q0[0].f41513b);
                org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
                k9Var.E0 = m4Var.f40404q0[0].d;
                k9Var.f(true);
                m4Var.i0(false);
                m4Var.f0();
            }
            m4Var.f40404q0[1].b();
            m4Var.f40404q0[1].setVisibility(8);
            if (obj instanceof d3) {
                ((d3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.f2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            z3 z3Var2 = m4Var.G;
            if (z3Var2 != null) {
                z3Var2.release();
                m4Var.s();
            } else {
                m4Var.U();
                m4Var.M();
            }
        }
        articleViewer$WindowView.f24040e = false;
        articleViewer$WindowView.d = false;
        m4Var.P0 = false;
    }
}
