package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class d extends AnimatorListenerAdapter {
    public final o a;

    public d(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.a;
        sw swVar = oVar.L;
        if (oVar.g0.e) {
            oVar.v0[0].setBackgroundDrawable(null);
            m[] mVarArr = oVar.v0;
            m mVar = mVarArr[1];
            mVarArr[1] = mVarArr[0];
            mVarArr[0] = mVar;
            oVar.i0.i();
            oVar.b1.a(oVar.v0[0].getBackgroundColor(), true);
            oVar.c1.a(oVar.v0[1].getBackgroundColor(), true);
            if (swVar != null) {
                swVar.y();
            }
            Object l = tb4.l(1, oVar.e0);
            oVar.Q0.Q(oVar.v0[0].b);
            fib fibVar = oVar.Q0;
            fibVar.z0 = oVar.v0[0].d;
            fibVar.e(true);
            oVar.g0(false);
            oVar.d0();
            oVar.v0[1].a();
            oVar.v0[1].setVisibility(8);
            if (l instanceof zv) {
                ((zv) l).a();
            }
            if (l instanceof TLRPC.WebPage) {
                ctc.o((TLRPC.WebPage) l);
            }
        } else if (swVar != null) {
            swVar.release();
            oVar.p();
        } else {
            oVar.S();
            oVar.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        oVar.V0 = false;
    }
}
