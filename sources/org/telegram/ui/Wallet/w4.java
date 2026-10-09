package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import org.telegram.ui.rj1;
import org.telegram.ui.s00;
public final class w4 extends AnimatorListenerAdapter {
    public final int f35593a;
    public final Object f35594b;

    public w4(Object obj, int i10) {
        this.f35593a = i10;
        this.f35594b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35593a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35594b;
        switch (i11) {
            case 0:
                x4 x4Var = (x4) obj;
                x4Var.h = false;
                x4Var.f35629n = null;
                x4Var.f35625b.setLayerType(0, null);
                return;
            case 1:
                c5 c5Var = (c5) obj;
                c5Var.J = 0.0f;
                c5Var.K = 0.0f;
                c5Var.R = null;
                return;
            case 2:
                o5 o5Var = (o5) obj;
                j5 j5Var = o5Var.f35315f0;
                j5Var.d = 0.0f;
                j5Var.f48044i = 0.0f;
                o5Var.f35323o0 = null;
                return;
            case 3:
                b6 b6Var = (b6) obj;
                b6Var.I = null;
                b6Var.f34671i0 = 1.0f;
                b6Var.f34670h0 = 0.0f;
                b6Var.f34669g0 = 0.0f;
                b6Var.e();
                return;
            case 4:
                h8 h8Var = (h8) obj;
                h8Var.h = null;
                b6 b6Var2 = h8Var.f34985c;
                if (h8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                b6Var2.setVisibility(i10);
                TextView textView = h8Var.f34986e;
                if (h8Var.f34991w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 5:
                oi.i iVar = (oi.i) obj;
                ((rj1) iVar.f17181b).getClass();
                ((rj1) iVar.f17181b).f41440c.setVisibility(4);
                return;
            case 6:
                ((org.telegram.ui.web.b1) obj).f43259s.setVisibility(8);
                return;
            case 7:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f45607a.getPainting().c(null, d0Var.f45607a.getCurrentColor(), true, null);
                d0Var.f45622r = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) obj;
                ImageView imageView = l0Var.f46330c;
                l0Var.f46330c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                if (animator == r1Var.f46534r) {
                    r1Var.f46532f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f46534r = null;
                    return;
                }
                return;
            case 10:
                rg.p0 p0Var = (rg.p0) obj;
                if (p0Var.h) {
                    f7 = 1.0f;
                }
                p0Var.f47382n = f7;
                p0Var.e();
                return;
            case 11:
                rg.a2 a2Var = (rg.a2) ((ci.c0) obj).f4811b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 12:
                int i13 = sg.f.K;
                ((sg.f) ((sg.e) obj).f48026b).d();
                return;
            case 13:
                sg.f fVar = (sg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 14:
                super.onAnimationEnd(animator);
                sg.n nVar = ((sg.i) obj).f48064b;
                nVar.f48076b.d = 0.0f;
                nVar.f48075a0 = null;
                nVar.k(nVar.L);
                return;
            case 15:
                tg.b bVar = (tg.b) obj;
                bVar.f48291b = 1.0f;
                bVar.invalidate();
                return;
            case 16:
                vh.g gVar = (vh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f49680c.size() < gVar.d) {
                        gVar.f49680c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f49692q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f49692q = null;
                }
                gVar.f49693r = null;
                gVar.invalidateSelf();
                return;
            case 17:
                ((xh.j0) obj).f51292b.f51337w.setVisibility(8);
                return;
            case 18:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.E = 1.0f;
                m2Var.F = -1;
                yh.l2 l2Var = m2Var.H;
                if (l2Var != null && (z10 = l2Var.f52821l) && z10) {
                    l2Var.f52821l = false;
                    l2Var.b();
                }
                m2Var.G = null;
                return;
            case 19:
                s00 s00Var = ((yh.d7) obj).f52399c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 20:
                ((yh.t5) obj).run();
                return;
            case 21:
                zg.t tVar = (zg.t) obj;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f54661b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f54661b = null;
                }
                tVar.f54663e = null;
                return;
            default:
                ((zg.g0) obj).f54533x.c();
                return;
        }
    }
}
