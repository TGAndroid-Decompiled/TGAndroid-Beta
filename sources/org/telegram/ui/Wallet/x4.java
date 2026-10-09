package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.rj1;
import org.telegram.ui.s00;
public final class x4 extends AnimatorListenerAdapter {
    public final int f35663a;
    public final Object f35664b;

    public x4(Object obj, int i10) {
        this.f35663a = i10;
        this.f35664b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35663a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35664b;
        switch (i11) {
            case 0:
                y4 y4Var = (y4) obj;
                y4Var.h = false;
                y4Var.f35695n = null;
                y4Var.f35691b.setLayerType(0, null);
                return;
            case 1:
                d5 d5Var = (d5) obj;
                d5Var.J = 0.0f;
                d5Var.K = 0.0f;
                d5Var.R = null;
                return;
            case 2:
                p5 p5Var = (p5) obj;
                k5 k5Var = p5Var.f35384f0;
                k5Var.d = 0.0f;
                k5Var.f48046i = 0.0f;
                p5Var.f35392o0 = null;
                return;
            case 3:
                c6 c6Var = (c6) obj;
                c6Var.I = null;
                c6Var.f34742i0 = 1.0f;
                c6Var.f34741h0 = 0.0f;
                c6Var.f34740g0 = 0.0f;
                c6Var.e();
                return;
            case 4:
                i8 i8Var = (i8) obj;
                i8Var.h = null;
                c6 c6Var2 = i8Var.f35048c;
                if (i8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                c6Var2.setVisibility(i10);
                TextView textView = i8Var.f35049e;
                if (i8Var.f35054w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 5:
                oi.i iVar = (oi.i) obj;
                ((rj1) iVar.f17181b).getClass();
                ((rj1) iVar.f17181b).f41442c.setVisibility(4);
                return;
            case 6:
                ((org.telegram.ui.web.b1) obj).f43261s.setVisibility(8);
                return;
            case 7:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f45609a.getPainting().c(null, d0Var.f45609a.getCurrentColor(), true, null);
                d0Var.f45624r = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) obj;
                ImageView imageView = l0Var.f46332c;
                l0Var.f46332c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                if (animator == r1Var.f46536r) {
                    r1Var.f46534f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f46536r = null;
                    return;
                }
                return;
            case 10:
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var.h) {
                    f7 = 1.0f;
                }
                p0Var.f47384n = f7;
                p0Var.e();
                return;
            case 11:
                rg.a2 a2Var = (rg.a2) ((ci.c0) obj).f4811b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 12:
                int i13 = sg.f.K;
                ((sg.f) ((sg.e) obj).f48028b).d();
                return;
            case 13:
                sg.f fVar = (sg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 14:
                super.onAnimationEnd(animator);
                sg.n nVar = ((sg.i) obj).f48066b;
                nVar.f48078b.d = 0.0f;
                nVar.f48077a0 = null;
                nVar.k(nVar.L);
                return;
            case 15:
                tg.b bVar = (tg.b) obj;
                bVar.f48293b = 1.0f;
                bVar.invalidate();
                return;
            case 16:
                vh.g gVar = (vh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f49682c.size() < gVar.d) {
                        gVar.f49682c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49694q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49694q = null;
                }
                gVar.f49695r = null;
                gVar.invalidateSelf();
                return;
            case 17:
                ((xh.j0) obj).f51294b.f51339w.setVisibility(8);
                return;
            case 18:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.E = 1.0f;
                m2Var.F = -1;
                yh.l2 l2Var = m2Var.H;
                if (l2Var != null && (z10 = l2Var.f52823l) && z10) {
                    l2Var.f52823l = false;
                    l2Var.b();
                }
                m2Var.G = null;
                return;
            case 19:
                s00 s00Var = ((yh.d7) obj).f52401c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 20:
                ((yh.t5) obj).run();
                return;
            case 21:
                zg.t tVar = (zg.t) obj;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f54663b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f54663b = null;
                }
                tVar.f54665e = null;
                return;
            default:
                ((zg.g0) obj).f54535x.c();
                return;
        }
    }
}
