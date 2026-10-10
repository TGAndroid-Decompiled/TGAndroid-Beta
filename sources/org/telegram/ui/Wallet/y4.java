package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.rj1;
import org.telegram.ui.s00;
public final class y4 extends AnimatorListenerAdapter {
    public final int f35757a;
    public final Object f35758b;

    public y4(Object obj, int i10) {
        this.f35757a = i10;
        this.f35758b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35757a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35758b;
        switch (i11) {
            case 0:
                z4 z4Var = (z4) obj;
                z4Var.h = false;
                z4Var.f35797n = null;
                z4Var.f35793b.setLayerType(0, null);
                return;
            case 1:
                e5 e5Var = (e5) obj;
                e5Var.J = 0.0f;
                e5Var.K = 0.0f;
                e5Var.R = null;
                return;
            case 2:
                q5 q5Var = (q5) obj;
                l5 l5Var = q5Var.f35474f0;
                l5Var.d = 0.0f;
                l5Var.f48090i = 0.0f;
                q5Var.f35482o0 = null;
                return;
            case 3:
                d6 d6Var = (d6) obj;
                d6Var.I = null;
                d6Var.f34831i0 = 1.0f;
                d6Var.f34830h0 = 0.0f;
                d6Var.f34829g0 = 0.0f;
                d6Var.e();
                return;
            case 4:
                j8 j8Var = (j8) obj;
                j8Var.h = null;
                d6 d6Var2 = j8Var.f35144c;
                if (j8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                d6Var2.setVisibility(i10);
                TextView textView = j8Var.f35145e;
                if (j8Var.f35150w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 5:
                oi.i iVar = (oi.i) obj;
                ((rj1) iVar.f17185b).getClass();
                ((rj1) iVar.f17185b).f41486c.setVisibility(4);
                return;
            case 6:
                ((org.telegram.ui.web.b1) obj).f43305s.setVisibility(8);
                return;
            case 7:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f45653a.getPainting().c(null, d0Var.f45653a.getCurrentColor(), true, null);
                d0Var.f45668r = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) obj;
                ImageView imageView = l0Var.f46376c;
                l0Var.f46376c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                if (animator == r1Var.f46580r) {
                    r1Var.f46578f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f46580r = null;
                    return;
                }
                return;
            case 10:
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var.h) {
                    f7 = 1.0f;
                }
                p0Var.f47428n = f7;
                p0Var.e();
                return;
            case 11:
                rg.a2 a2Var = (rg.a2) ((ci.c0) obj).f4811b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 12:
                int i13 = sg.f.K;
                ((sg.f) ((sg.e) obj).f48072b).d();
                return;
            case 13:
                sg.f fVar = (sg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 14:
                super.onAnimationEnd(animator);
                sg.n nVar = ((sg.i) obj).f48110b;
                nVar.f48122b.d = 0.0f;
                nVar.f48121a0 = null;
                nVar.k(nVar.L);
                return;
            case 15:
                tg.b bVar = (tg.b) obj;
                bVar.f48337b = 1.0f;
                bVar.invalidate();
                return;
            case 16:
                vh.g gVar = (vh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f49726c.size() < gVar.d) {
                        gVar.f49726c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49738q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49738q = null;
                }
                gVar.f49739r = null;
                gVar.invalidateSelf();
                return;
            case 17:
                ((xh.j0) obj).f51338b.f51383w.setVisibility(8);
                return;
            case 18:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.E = 1.0f;
                m2Var.F = -1;
                yh.l2 l2Var = m2Var.H;
                if (l2Var != null && (z10 = l2Var.f52867l) && z10) {
                    l2Var.f52867l = false;
                    l2Var.b();
                }
                m2Var.G = null;
                return;
            case 19:
                s00 s00Var = ((yh.d7) obj).f52445c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 20:
                ((yh.t5) obj).run();
                return;
            case 21:
                zg.t tVar = (zg.t) obj;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f54707b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f54707b = null;
                }
                tVar.f54709e = null;
                return;
            default:
                ((zg.g0) obj).f54579x.c();
                return;
        }
    }
}
