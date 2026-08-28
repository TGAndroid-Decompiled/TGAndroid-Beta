package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a1 extends AnimatorListenerAdapter {
    public final int f36325a;
    public final l4 f36326b;

    public a1(l4 l4Var, int i9) {
        this.f36326b = l4Var;
        this.f36325a = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.f36326b;
        ArrayList arrayList = l4Var.Z;
        if (l4Var.f40012b0.f24021f) {
            ArrayList arrayList2 = new ArrayList();
            l4Var.f40026q0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.f40026q0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.f40014d0.i();
            l4Var.V0.a(l4Var.f40026q0[0].getBackgroundColor(), true);
            l4Var.W0.a(l4Var.f40026q0[1].getBackgroundColor(), true);
            y3 y3Var = l4Var.G;
            if (y3Var != null) {
                y3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f36325a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            l4Var.K0.T(l4Var.f40026q0[0].f41320b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
            n9Var.E0 = l4Var.f40026q0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.f40026q0[1].b();
            l4Var.f40026q0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList2.get(i9);
                i9++;
                if (obj instanceof c3) {
                    ((c3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.d2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f40012b0;
        articleViewer$WindowView.f24021f = false;
        articleViewer$WindowView.d = false;
        l4Var.P0 = false;
    }
}
