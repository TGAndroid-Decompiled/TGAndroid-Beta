package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g extends AnimatorListenerAdapter {
    public final int a;
    public final o b;

    public g(o oVar, int i) {
        this.b = oVar;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.b;
        ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
        ArrayList arrayList = oVar.e0;
        if (articleViewer$WindowView.f) {
            ArrayList arrayList2 = new ArrayList();
            oVar.v0[0].setBackgroundDrawable(null);
            m[] mVarArr = oVar.v0;
            m mVar = mVarArr[1];
            mVarArr[1] = mVarArr[0];
            mVarArr[0] = mVar;
            oVar.i0.i();
            oVar.b1.a(oVar.v0[0].getBackgroundColor(), true);
            oVar.c1.a(oVar.v0[1].getBackgroundColor(), true);
            sx sxVar = oVar.L;
            if (sxVar != null) {
                sxVar.z();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            oVar.Q0.Q(oVar.v0[0].b);
            gkb gkbVar = oVar.Q0;
            gkbVar.z0 = oVar.v0[0].d;
            gkbVar.e(true);
            oVar.g0(false);
            oVar.d0();
            oVar.v0[1].a();
            oVar.v0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (obj instanceof zw) {
                    ((zw) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    dvc.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            oVar.S();
            oVar.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = oVar.g0;
        articleViewer$WindowView2.f = false;
        articleViewer$WindowView2.d = false;
        oVar.V0 = false;
    }
}
