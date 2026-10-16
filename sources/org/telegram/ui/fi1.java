package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
public final class fi1 extends AnimatorListenerAdapter {
    public final int f35544a;
    public final Object f35545b;

    public fi1(Object obj, int i10) {
        this.f35544a = i10;
        this.f35545b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        boolean z10;
        int i11 = this.f35544a;
        int i12 = 4;
        float f7 = 0.0f;
        Object obj = this.f35545b;
        switch (i11) {
            case 0:
                gi1 gi1Var = (gi1) obj;
                gi1Var.d = null;
                gi1Var.f36226a = null;
                gi1Var.f36227b = false;
                gi1Var.f36229f.f32603c.setAllowDrawCursor(true);
                return;
            case 1:
                ((org.telegram.ui.Wallet.y2) obj).K = null;
                return;
            case 2:
                ((org.telegram.ui.Wallet.e3) obj).f();
                return;
            case 3:
                org.telegram.ui.Wallet.y4 y4Var = (org.telegram.ui.Wallet.y4) obj;
                y4Var.h = false;
                y4Var.f33624n = null;
                y4Var.f33621b.setLayerType(0, null);
                return;
            case 4:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                d5Var.J = 0.0f;
                d5Var.K = 0.0f;
                d5Var.R = null;
                return;
            case 5:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                org.telegram.ui.Wallet.l5 l5Var = p5Var.f33336f0;
                l5Var.d = 0.0f;
                l5Var.f45708i = 0.0f;
                p5Var.f33344o0 = null;
                return;
            case 6:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.I = null;
                c6Var.f32753i0 = 1.0f;
                c6Var.f32752h0 = 0.0f;
                c6Var.f32751g0 = 0.0f;
                c6Var.e();
                return;
            case 7:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) obj;
                i8Var.h = null;
                org.telegram.ui.Wallet.c6 c6Var2 = i8Var.f33035c;
                if (i8Var.v) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                c6Var2.setVisibility(i10);
                TextView textView = i8Var.e;
                if (i8Var.f33040w) {
                    i12 = 0;
                }
                textView.setVisibility(i12);
                return;
            case 8:
                org.telegram.ui.Components.ng0 ng0Var = (org.telegram.ui.Components.ng0) obj;
                ((xj1) ng0Var.f27355b).getClass();
                ((xj1) ng0Var.f27355b).f41585c.setVisibility(4);
                return;
            case 9:
                ((org.telegram.ui.web.c1) obj).f41004s.setVisibility(8);
                return;
            case 10:
                qg.d0 d0Var = (qg.d0) obj;
                d0Var.f43149a.getPainting().c(null, d0Var.f43149a.getCurrentColor(), true, null);
                d0Var.f43163r = null;
                return;
            case 11:
                super.onAnimationEnd(animator);
                rg.n0 n0Var = (rg.n0) obj;
                ImageView imageView = n0Var.f44132c;
                n0Var.f44132c = n0Var.d;
                n0Var.d = imageView;
                imageView.bringToFront();
                n0Var.d.setVisibility(8);
                n0Var.h = null;
                return;
            case 12:
                rg.t1 t1Var = (rg.t1) obj;
                if (animator == t1Var.f44315r) {
                    t1Var.f44313f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.f44315r = null;
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
                sg.a2 a2Var = (sg.a2) ((di.c0) obj).f6684b;
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
                bVar.f46280b = 1.0f;
                bVar.invalidate();
                return;
            case 19:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (gVar.f47661c.size() < gVar.d) {
                        gVar.f47661c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f47672q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f47672q = null;
                }
                gVar.f47673r = null;
                gVar.invalidateSelf();
                return;
            case 20:
                ((yh.i0) obj).f48917b.f48932w.setVisibility(8);
                return;
            case 21:
                zh.l2 l2Var = (zh.l2) obj;
                l2Var.E = 1.0f;
                l2Var.F = -1;
                zh.k2 k2Var = l2Var.H;
                if (k2Var != null && (z10 = k2Var.f50756l) && z10) {
                    k2Var.f50756l = false;
                    k2Var.b();
                }
                l2Var.G = null;
                return;
            default:
                x00 x00Var = ((zh.d7) obj).f50390c;
                x00Var.setScaleX(1.0f);
                x00Var.setScaleY(1.0f);
                return;
        }
    }
}
