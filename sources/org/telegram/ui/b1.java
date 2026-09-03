package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b1 extends AnimatorListenerAdapter {
    public final int f32689a;
    public final n4 f32690b;

    public b1(n4 n4Var, int i10) {
        this.f32690b = n4Var;
        this.f32689a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n4 n4Var = this.f32690b;
        ArrayList arrayList = n4Var.f36359a0;
        if (n4Var.f36361c0.f20767f) {
            ArrayList arrayList2 = new ArrayList();
            n4Var.f36375r0[0].setBackgroundDrawable(null);
            r3[] r3VarArr = n4Var.f36375r0;
            r3 r3Var = r3VarArr[1];
            r3VarArr[1] = r3VarArr[0];
            r3VarArr[0] = r3Var;
            n4Var.f36363e0.i();
            n4Var.W0.a(n4Var.f36375r0[0].getBackgroundColor(), true);
            n4Var.X0.a(n4Var.f36375r0[1].getBackgroundColor(), true);
            a4 a4Var = n4Var.H;
            if (a4Var != null) {
                a4Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f32689a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            n4Var.L0.T(n4Var.f36375r0[0].f37684b);
            org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
            l9Var.E0 = n4Var.f36375r0[0].d;
            l9Var.f(true);
            n4Var.i0(false);
            n4Var.f0();
            n4Var.f36375r0[1].b();
            n4Var.f36375r0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof d3) {
                    ((d3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            n4Var.U();
            n4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = n4Var.f36361c0;
        articleViewer$WindowView.f20767f = false;
        articleViewer$WindowView.d = false;
        n4Var.Q0 = false;
    }
}
