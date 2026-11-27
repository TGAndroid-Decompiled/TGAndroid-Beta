package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class n extends AnimatorListenerAdapter {
    public final boolean a;
    public final ArticleViewer$WindowView b;

    public n(ArticleViewer$WindowView articleViewer$WindowView, boolean z) {
        this.b = articleViewer$WindowView;
        this.a = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.b;
        o oVar = articleViewer$WindowView.I;
        boolean z = articleViewer$WindowView.e;
        boolean z2 = this.a;
        if (z) {
            Object obj = null;
            oVar.v0[0].setBackgroundDrawable(null);
            if (!z2) {
                m[] mVarArr = oVar.v0;
                m mVar = mVarArr[1];
                mVarArr[1] = mVarArr[0];
                mVarArr[0] = mVar;
                oVar.i0.i();
                oVar.b1.a(oVar.v0[0].getBackgroundColor(), true);
                oVar.c1.a(oVar.v0[1].getBackgroundColor(), true);
                tw twVar = oVar.L;
                if (twVar != null) {
                    twVar.y();
                }
                obj = qd4.l(1, oVar.e0);
                oVar.Q0.Q(oVar.v0[0].b);
                amb ambVar = oVar.Q0;
                ambVar.z0 = oVar.v0[0].d;
                ambVar.e(true);
                oVar.g0(false);
                oVar.d0();
            }
            oVar.v0[1].a();
            oVar.v0[1].setVisibility(8);
            if (obj instanceof aw) {
                ((aw) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                rxc.o((TLRPC.WebPage) obj);
            }
        } else if (!z2) {
            tw twVar2 = oVar.L;
            if (twVar2 != null) {
                twVar2.release();
                oVar.p();
            } else {
                oVar.S();
                oVar.K();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        oVar.V0 = false;
    }
}
