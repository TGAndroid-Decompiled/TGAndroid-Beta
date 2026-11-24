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
                sx sxVar = oVar.L;
                if (sxVar != null) {
                    sxVar.z();
                }
                obj = td4.m(1, oVar.e0);
                oVar.Q0.Q(oVar.v0[0].b);
                gkb gkbVar = oVar.Q0;
                gkbVar.z0 = oVar.v0[0].d;
                gkbVar.e(true);
                oVar.g0(false);
                oVar.d0();
            }
            oVar.v0[1].a();
            oVar.v0[1].setVisibility(8);
            if (obj instanceof zw) {
                ((zw) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                dvc.o((TLRPC.WebPage) obj);
            }
        } else if (!z2) {
            sx sxVar2 = oVar.L;
            if (sxVar2 != null) {
                sxVar2.release();
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
