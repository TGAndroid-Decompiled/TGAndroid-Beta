package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
public final class fi1 extends AnimatorListenerAdapter {
    public final int f35843a;
    public final Object f35844b;

    public fi1(Object obj, int i10) {
        this.f35843a = i10;
        this.f35844b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35843a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35844b;
        switch (i11) {
            case 0:
                gi1 gi1Var = (gi1) obj;
                gi1Var.d = null;
                gi1Var.f36412a = null;
                gi1Var.f36413b = false;
                gi1Var.f36415f.f32901c.setAllowDrawCursor(true);
                return;
            case 1:
                ((org.telegram.ui.Wallet.x2) obj).K = null;
                return;
            case 2:
                ((org.telegram.ui.Wallet.d3) obj).f();
                return;
            case 3:
                org.telegram.ui.Wallet.x4 x4Var = (org.telegram.ui.Wallet.x4) obj;
                x4Var.h = false;
                x4Var.f33852n = null;
                x4Var.f33849b.setLayerType(0, null);
                return;
            case 4:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                c5Var.J = 0.0f;
                c5Var.K = 0.0f;
                c5Var.R = null;
                return;
            case 5:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                org.telegram.ui.Wallet.j5 j5Var = o5Var.f33562f0;
                j5Var.d = 0.0f;
                j5Var.f45708i = 0.0f;
                o5Var.f33570o0 = null;
                return;
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                b6Var.I = null;
                b6Var.f32977i0 = 1.0f;
                b6Var.f32976h0 = 0.0f;
                b6Var.f32975g0 = 0.0f;
                b6Var.e();
                return;
            case 7:
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) obj;
                h8Var.h = null;
                org.telegram.ui.Wallet.b6 b6Var2 = h8Var.f33252c;
                if (h8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                b6Var2.setVisibility(i10);
                TextView textView = h8Var.e;
                if (h8Var.f33257w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 8:
                org.telegram.ui.Components.mg0 mg0Var = (org.telegram.ui.Components.mg0) obj;
                ((yj1) mg0Var.f27393b).getClass();
                ((yj1) mg0Var.f27393b).f42181c.setVisibility(4);
                return;
            case 9:
                ((org.telegram.ui.web.b1) obj).f41305s.setVisibility(8);
                return;
            case 10:
                qg.d0 d0Var = (qg.d0) obj;
                d0Var.f43407a.getPainting().c(null, d0Var.f43407a.getCurrentColor(), true, null);
                d0Var.f43421r = null;
                return;
            case 11:
                super.onAnimationEnd(animator);
                rg.n0 n0Var = (rg.n0) obj;
                ImageView imageView = n0Var.f44373c;
                n0Var.f44373c = n0Var.d;
                n0Var.d = imageView;
                imageView.bringToFront();
                n0Var.d.setVisibility(8);
                n0Var.h = null;
                return;
            case 12:
                rg.t1 t1Var = (rg.t1) obj;
                if (animator == t1Var.f44556r) {
                    t1Var.f44554f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.f44556r = null;
                    return;
                }
                return;
            case 13:
                sg.q0 q0Var = (sg.q0) obj;
                if (q0Var.h) {
                    f7 = 1.0f;
                }
                q0Var.f45313n = f7;
                q0Var.e();
                return;
            case 14:
                sg.a2 a2Var = (sg.a2) ((di.c0) obj).f6681b;
                a2Var.F = true;
                a2Var.invalidate();
                return;
            case 15:
                int i13 = tg.f.K;
                ((tg.f) ((tg.e) obj).f45692b).d();
                return;
            case 16:
                tg.f fVar = (tg.f) obj;
                fVar.d = null;
                fVar.e();
                return;
            case 17:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).f45728b;
                nVar.f45740b.d = 0.0f;
                nVar.f45739a0 = null;
                nVar.k(nVar.L);
                return;
            case 18:
                ug.b bVar = (ug.b) obj;
                bVar.f46281b = 1.0f;
                bVar.invalidate();
                return;
            case 19:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f47662c.size() < gVar.d) {
                        gVar.f47662c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f47673q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f47673q = null;
                }
                gVar.f47674r = null;
                gVar.invalidateSelf();
                return;
            case 20:
                ((yh.i0) obj).f48918b.f48933w.setVisibility(8);
                return;
            case 21:
                zh.l2 l2Var = (zh.l2) obj;
                l2Var.E = 1.0f;
                l2Var.F = -1;
                zh.k2 k2Var = l2Var.H;
                if (k2Var != null && (z10 = k2Var.f50755l) && z10) {
                    k2Var.f50755l = false;
                    k2Var.b();
                }
                l2Var.G = null;
                return;
            default:
                y00 y00Var = ((zh.d7) obj).f50389c;
                y00Var.setScaleX(1.0f);
                y00Var.setScaleY(1.0f);
                return;
        }
    }
}
