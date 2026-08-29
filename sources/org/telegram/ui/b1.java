package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b1 extends AnimatorListenerAdapter {
    public final int f36643a;
    public final m4 f36644b;

    public b1(m4 m4Var, int i10) {
        this.f36644b = m4Var;
        this.f36643a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m4 m4Var = this.f36644b;
        ArrayList arrayList = m4Var.Z;
        if (m4Var.f40390b0.f24041f) {
            ArrayList arrayList2 = new ArrayList();
            m4Var.f40404q0[0].setBackgroundDrawable(null);
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
            for (int size = arrayList.size() - 1; size > this.f36643a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            m4Var.K0.T(m4Var.f40404q0[0].f41513b);
            org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
            k9Var.E0 = m4Var.f40404q0[0].d;
            k9Var.f(true);
            m4Var.i0(false);
            m4Var.f0();
            m4Var.f40404q0[1].b();
            m4Var.f40404q0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof d3) {
                    ((d3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.f2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            m4Var.U();
            m4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40390b0;
        articleViewer$WindowView.f24041f = false;
        articleViewer$WindowView.d = false;
        m4Var.P0 = false;
    }
}
