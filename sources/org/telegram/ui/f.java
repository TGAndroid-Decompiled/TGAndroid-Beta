package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class f extends AnimatorListenerAdapter {
    public final o a;

    public f(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.a;
        ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
        sx sxVar = oVar.L;
        if (articleViewer$WindowView.e) {
            oVar.v0[0].setBackgroundDrawable(null);
            m[] mVarArr = oVar.v0;
            m mVar = mVarArr[1];
            mVarArr[1] = mVarArr[0];
            mVarArr[0] = mVar;
            oVar.i0.i();
            oVar.b1.a(oVar.v0[0].getBackgroundColor(), true);
            oVar.c1.a(oVar.v0[1].getBackgroundColor(), true);
            if (sxVar != null) {
                sxVar.z();
            }
            Object m = td4.m(1, oVar.e0);
            oVar.Q0.Q(oVar.v0[0].b);
            gkb gkbVar = oVar.Q0;
            gkbVar.z0 = oVar.v0[0].d;
            gkbVar.e(true);
            oVar.g0(false);
            oVar.d0();
            oVar.v0[1].a();
            oVar.v0[1].setVisibility(8);
            if (m instanceof zw) {
                ((zw) m).a();
            }
            if (m instanceof TLRPC.WebPage) {
                dvc.o((TLRPC.WebPage) m);
            }
        } else if (sxVar != null) {
            sxVar.release();
            oVar.p();
        } else {
            oVar.S();
            oVar.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = oVar.g0;
        articleViewer$WindowView2.e = false;
        articleViewer$WindowView2.d = false;
        oVar.V0 = false;
    }
}
