package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.sj1;
import org.telegram.ui.u00;
public final class z4 extends AnimatorListenerAdapter {
    public final int f35599a;
    public final Object f35600b;

    public z4(Object obj, int i10) {
        this.f35599a = i10;
        this.f35600b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35599a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35600b;
        switch (i11) {
            case 0:
                a5 a5Var = (a5) obj;
                a5Var.h = false;
                a5Var.f34471n = null;
                a5Var.f34467b.setLayerType(0, null);
                return;
            case 1:
                f5 f5Var = (f5) obj;
                f5Var.J = 0.0f;
                f5Var.K = 0.0f;
                f5Var.R = null;
                return;
            case 2:
                r5 r5Var = (r5) obj;
                n5 n5Var = r5Var.f35317f0;
                n5Var.d = 0.0f;
                n5Var.f48285i = 0.0f;
                r5Var.f35325o0 = null;
                return;
            case 3:
                e6 e6Var = (e6) obj;
                e6Var.I = null;
                e6Var.f34672i0 = 1.0f;
                e6Var.f34671h0 = 0.0f;
                e6Var.f34670g0 = 0.0f;
                e6Var.e();
                return;
            case 4:
                k8 k8Var = (k8) obj;
                k8Var.h = null;
                e6 e6Var2 = k8Var.f34984c;
                if (k8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                e6Var2.setVisibility(i10);
                TextView textView = k8Var.f34985e;
                if (k8Var.f34990w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 5:
                oi.i iVar = (oi.i) obj;
                ((sj1) iVar.f16933b).getClass();
                ((sj1) iVar.f16933b).f41944c.setVisibility(4);
                return;
            case 6:
                ((org.telegram.ui.web.b1) obj).f43205s.setVisibility(8);
                return;
            case 7:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f45497a.getPainting().c(null, d0Var.f45497a.getCurrentColor(), true, null);
                d0Var.f45512r = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) obj;
                ImageView imageView = l0Var.f46277c;
                l0Var.f46277c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                if (animator == r1Var.f46481r) {
                    r1Var.f46479f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f46481r = null;
                    return;
                }
                return;
            case 10:
                rg.q0 q0Var = (rg.q0) obj;
                if (q0Var.h) {
                    f7 = 1.0f;
                }
                q0Var.f47622n = f7;
                q0Var.e();
                return;
            case 11:
                rg.a2 a2Var = (rg.a2) ((ci.c0) obj).f4809b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 12:
                int i13 = sg.f.K;
                ((sg.f) ((sg.e) obj).f48267b).d();
                return;
            case 13:
                sg.f fVar = (sg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 14:
                super.onAnimationEnd(animator);
                sg.n nVar = ((sg.i) obj).f48305b;
                nVar.f48317b.d = 0.0f;
                nVar.f48316a0 = null;
                nVar.k(nVar.L);
                return;
            case 15:
                tg.b bVar = (tg.b) obj;
                bVar.f48532b = 1.0f;
                bVar.invalidate();
                return;
            case 16:
                vh.g gVar = (vh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f49918c.size() < gVar.d) {
                        gVar.f49918c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49930q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49930q = null;
                }
                gVar.f49931r = null;
                gVar.invalidateSelf();
                return;
            case 17:
                ((xh.j0) obj).f51544b.f51566w.setVisibility(8);
                return;
            case 18:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.E = 1.0f;
                m2Var.F = -1;
                yh.l2 l2Var = m2Var.H;
                if (l2Var != null && (z10 = l2Var.f53059l) && z10) {
                    l2Var.f53059l = false;
                    l2Var.b();
                }
                m2Var.G = null;
                return;
            case 19:
                u00 u00Var = ((yh.d7) obj).f52631c;
                u00Var.setScaleX(1.0f);
                u00Var.setScaleY(1.0f);
                return;
            case 20:
                ((yh.v4) obj).run();
                return;
            case 21:
                zg.t tVar = (zg.t) obj;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f54895b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f54895b = null;
                }
                tVar.f54897e = null;
                return;
            default:
                ((zg.g0) obj).f54767x.c();
                return;
        }
    }
}
