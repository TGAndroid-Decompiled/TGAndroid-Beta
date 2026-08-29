package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class a1 extends AnimatorListenerAdapter {
    public final m4 f36393a;

    public a1(m4 m4Var) {
        this.f36393a = m4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m4 m4Var = this.f36393a;
        z3 z3Var = m4Var.G;
        if (m4Var.f40390b0.f24040e) {
            m4Var.f40404q0[0].setBackgroundDrawable(null);
            q3[] q3VarArr = m4Var.f40404q0;
            q3 q3Var = q3VarArr[1];
            q3VarArr[1] = q3VarArr[0];
            q3VarArr[0] = q3Var;
            m4Var.f40392d0.i();
            m4Var.V0.a(m4Var.f40404q0[0].getBackgroundColor(), true);
            m4Var.W0.a(m4Var.f40404q0[1].getBackgroundColor(), true);
            if (z3Var != null) {
                z3Var.m();
            }
            Object j10 = com.google.android.recaptcha.internal.a.j(1, m4Var.Z);
            m4Var.K0.T(m4Var.f40404q0[0].f41513b);
            org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
            k9Var.E0 = m4Var.f40404q0[0].d;
            k9Var.f(true);
            m4Var.i0(false);
            m4Var.f0();
            m4Var.f40404q0[1].b();
            m4Var.f40404q0[1].setVisibility(8);
            if (j10 instanceof d3) {
                ((d3) j10).a();
            }
            if (j10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.f2.o((TLRPC.WebPage) j10);
            }
        } else if (z3Var != null) {
            z3Var.release();
            m4Var.s();
        } else {
            m4Var.U();
            m4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40390b0;
        articleViewer$WindowView.f24040e = false;
        articleViewer$WindowView.d = false;
        m4Var.P0 = false;
    }
}
