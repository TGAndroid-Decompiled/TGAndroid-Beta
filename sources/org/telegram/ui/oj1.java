package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
public final class oj1 extends AnimatorListenerAdapter {
    public final int f39298a;
    public final Object f39299b;

    public oj1(Object obj, int i10) {
        this.f39298a = i10;
        this.f39299b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39298a) {
            case 3:
                ((r0.m0) this.f39299b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        boolean z10;
        switch (this.f39298a) {
            case 0:
                fg.i iVar = (fg.i) this.f39299b;
                ((qj1) iVar.f9526b).getClass();
                ((qj1) iVar.f9526b).f39916c.setVisibility(4);
                return;
            case 1:
                ((org.telegram.ui.web.d1) this.f39299b).f42086s.setVisibility(8);
                return;
            case 2:
                qg.d0 d0Var = (qg.d0) this.f39299b;
                d0Var.f44426a.getPainting().c(null, d0Var.f44426a.getCurrentColor(), true, null);
                d0Var.f44441r = null;
                return;
            case 3:
                ((r0.m0) this.f39299b).c();
                return;
            case 4:
                super.onAnimationEnd(animator);
                rg.n0 n0Var = (rg.n0) this.f39299b;
                ImageView imageView = n0Var.f45352c;
                n0Var.f45352c = n0Var.d;
                n0Var.d = imageView;
                imageView.bringToFront();
                n0Var.d.setVisibility(8);
                n0Var.h = null;
                return;
            case 5:
                rg.t1 t1Var = (rg.t1) this.f39299b;
                if (animator == t1Var.f45525r) {
                    t1Var.f45523f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.f45525r = null;
                    return;
                }
                return;
            case 6:
                sg.r0 r0Var = (sg.r0) this.f39299b;
                if (r0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                r0Var.f46268n = f7;
                r0Var.e();
                return;
            case 7:
                sg.c2 c2Var = (sg.c2) ((di.c0) this.f39299b).f7010b;
                c2Var.F = true;
                c2Var.invalidate();
                return;
            case 8:
                super.onAnimationEnd(animator);
                tg.e eVar = (tg.e) ((bi.t5) this.f39299b).f3759b;
                eVar.f46547b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 9:
                ug.b bVar = (ug.b) this.f39299b;
                bVar.f47093b = 1.0f;
                bVar.invalidate();
                return;
            case 10:
                wh.h hVar = (wh.h) this.f39299b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (hVar.f48644c.size() < hVar.d) {
                        hVar.f48644c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f48656q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f48656q = null;
                }
                hVar.f48657r = null;
                hVar.invalidateSelf();
                return;
            case 11:
                ((yh.h0) this.f39299b).f50333b.f50373w.setVisibility(8);
                return;
            case 12:
                zh.q2 q2Var = (zh.q2) this.f39299b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                zh.p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f52444l) && z10) {
                    p2Var.f52444l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            default:
                s00 s00Var = ((zh.j7) this.f39299b).f52143c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39298a) {
            case 3:
                ((r0.m0) this.f39299b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public oj1(r0.m0 m0Var, View view) {
        this.f39298a = 3;
        this.f39299b = m0Var;
    }
}
