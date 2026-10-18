package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a1 extends AnimatorListenerAdapter {
    public final int f35227a;
    public final l4 f35228b;

    public a1(l4 l4Var, int i10) {
        this.f35228b = l4Var;
        this.f35227a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.f35228b;
        ArrayList arrayList = l4Var.f38709d0;
        if (l4Var.f38711f0.f21927f) {
            ArrayList arrayList2 = new ArrayList();
            l4Var.f38725u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = l4Var.f38725u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            l4Var.f38713h0.i();
            l4Var.Z0.a(l4Var.f38725u0[0].getBackgroundColor(), true);
            l4Var.f38706a1.a(l4Var.f38725u0[1].getBackgroundColor(), true);
            x3 x3Var = l4Var.K;
            if (x3Var != null) {
                x3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f35227a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            l4Var.O0.S(l4Var.f38725u0[0].f39646b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
            n9Var.f22663z0 = l4Var.f38725u0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.f38725u0[1].b();
            l4Var.f38725u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof b3) {
                    ((b3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38711f0;
        articleViewer$WindowView.f21927f = false;
        articleViewer$WindowView.d = false;
        l4Var.T0 = false;
    }
}
