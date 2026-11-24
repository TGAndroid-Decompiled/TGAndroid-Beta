package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class e extends AnimatorListenerAdapter {
    public final o a;

    public e(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.a;
        if (oVar.g0.f) {
            oVar.v0[0].setBackgroundDrawable(null);
            m[] mVarArr = oVar.v0;
            m mVar = mVarArr[1];
            mVarArr[1] = mVarArr[0];
            mVarArr[0] = mVar;
            oVar.i0.i();
            oVar.b1.a(oVar.v0[0].getBackgroundColor(), true);
            oVar.c1.a(oVar.v0[1].getBackgroundColor(), true);
            sw swVar = oVar.L;
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
        } else {
            oVar.S();
            oVar.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        oVar.V0 = false;
    }
}
