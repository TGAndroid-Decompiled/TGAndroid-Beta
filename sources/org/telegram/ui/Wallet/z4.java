package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.pj1;
import org.telegram.ui.r00;
public final class z4 extends AnimatorListenerAdapter {
    public final int f35787a;
    public final Object f35788b;

    public z4(Object obj, int i10) {
        this.f35787a = i10;
        this.f35788b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35787a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35788b;
        switch (i11) {
            case 0:
                a5 a5Var = (a5) obj;
                a5Var.h = false;
                a5Var.f34660n = null;
                a5Var.f34656b.setLayerType(0, null);
                return;
            case 1:
                f5 f5Var = (f5) obj;
                f5Var.J = 0.0f;
                f5Var.K = 0.0f;
                f5Var.R = null;
                return;
            case 2:
                r5 r5Var = (r5) obj;
                m5 m5Var = r5Var.f35504f0;
                m5Var.d = 0.0f;
                m5Var.f48136i = 0.0f;
                r5Var.f35512o0 = null;
                return;
            case 3:
                e6 e6Var = (e6) obj;
                e6Var.I = null;
                e6Var.f34861i0 = 1.0f;
                e6Var.f34860h0 = 0.0f;
                e6Var.f34859g0 = 0.0f;
                e6Var.e();
                return;
            case 4:
                k8 k8Var = (k8) obj;
                k8Var.h = null;
                e6 e6Var2 = k8Var.f35174c;
                if (k8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                e6Var2.setVisibility(i10);
                TextView textView = k8Var.f35175e;
                if (k8Var.f35180w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 5:
                qg0 qg0Var = (qg0) obj;
                ((pj1) qg0Var.f30153b).getClass();
                ((pj1) qg0Var.f30153b).f40894c.setVisibility(4);
                return;
            case 6:
                ((org.telegram.ui.web.b1) obj).f43450s.setVisibility(8);
                return;
            case 7:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f45643a.getPainting().c(null, d0Var.f45643a.getCurrentColor(), true, null);
                d0Var.f45658r = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) obj;
                ImageView imageView = l0Var.f46426c;
                l0Var.f46426c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                if (animator == r1Var.f46615r) {
                    r1Var.f46613f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f46615r = null;
                    return;
                }
                return;
            case 10:
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var.h) {
                    f7 = 1.0f;
                }
                p0Var.f47474n = f7;
                p0Var.e();
                return;
            case 11:
                rg.a2 a2Var = (rg.a2) ((ci.c0) obj).f4810b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 12:
                int i13 = sg.f.K;
                ((sg.f) ((sg.e) obj).f48118b).d();
                return;
            case 13:
                sg.f fVar = (sg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 14:
                super.onAnimationEnd(animator);
                sg.n nVar = ((sg.i) obj).f48156b;
                nVar.f48168b.d = 0.0f;
                nVar.f48167a0 = null;
                nVar.k(nVar.L);
                return;
            case 15:
                tg.b bVar = (tg.b) obj;
                bVar.f48360b = 1.0f;
                bVar.invalidate();
                return;
            case 16:
                vh.g gVar = (vh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f49769c.size() < gVar.d) {
                        gVar.f49769c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49781q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49781q = null;
                }
                gVar.f49782r = null;
                gVar.invalidateSelf();
                return;
            case 17:
                ((xh.j0) obj).f51381b.f51426w.setVisibility(8);
                return;
            case 18:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.E = 1.0f;
                m2Var.F = -1;
                yh.l2 l2Var = m2Var.H;
                if (l2Var != null && (z10 = l2Var.f52910l) && z10) {
                    l2Var.f52910l = false;
                    l2Var.b();
                }
                m2Var.G = null;
                return;
            case 19:
                r00 r00Var = ((yh.d7) obj).f52488c;
                r00Var.setScaleX(1.0f);
                r00Var.setScaleY(1.0f);
                return;
            case 20:
                ((yh.e5) obj).run();
                return;
            case 21:
                zg.t tVar = (zg.t) obj;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f54750b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f54750b = null;
                }
                tVar.f54752e = null;
                return;
            default:
                ((zg.g0) obj).f54622x.c();
                return;
        }
    }
}
