package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
public final class oj1 extends AnimatorListenerAdapter {
    public final int f39272a;
    public final Object f39273b;

    public oj1(Object obj, int i10) {
        this.f39272a = i10;
        this.f39273b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39272a) {
            case 3:
                ((r0.m0) this.f39273b).a();
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
        switch (this.f39272a) {
            case 0:
                fg.i iVar = (fg.i) this.f39273b;
                ((qj1) iVar.f9498b).getClass();
                ((qj1) iVar.f9498b).f39890c.setVisibility(4);
                return;
            case 1:
                ((org.telegram.ui.web.d1) this.f39273b).f42060s.setVisibility(8);
                return;
            case 2:
                qg.d0 d0Var = (qg.d0) this.f39273b;
                d0Var.f44399a.getPainting().c(null, d0Var.f44399a.getCurrentColor(), true, null);
                d0Var.f44414r = null;
                return;
            case 3:
                ((r0.m0) this.f39273b).c();
                return;
            case 4:
                super.onAnimationEnd(animator);
                rg.n0 n0Var = (rg.n0) this.f39273b;
                ImageView imageView = n0Var.f45325c;
                n0Var.f45325c = n0Var.d;
                n0Var.d = imageView;
                imageView.bringToFront();
                n0Var.d.setVisibility(8);
                n0Var.h = null;
                return;
            case 5:
                rg.t1 t1Var = (rg.t1) this.f39273b;
                if (animator == t1Var.f45498r) {
                    t1Var.f45496f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.f45498r = null;
                    return;
                }
                return;
            case 6:
                sg.r0 r0Var = (sg.r0) this.f39273b;
                if (r0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                r0Var.f46241n = f7;
                r0Var.e();
                return;
            case 7:
                sg.c2 c2Var = (sg.c2) ((di.c0) this.f39273b).f6982b;
                c2Var.F = true;
                c2Var.invalidate();
                return;
            case 8:
                super.onAnimationEnd(animator);
                tg.e eVar = (tg.e) ((bi.t5) this.f39273b).f3732b;
                eVar.f46520b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 9:
                ug.b bVar = (ug.b) this.f39273b;
                bVar.f47066b = 1.0f;
                bVar.invalidate();
                return;
            case 10:
                wh.h hVar = (wh.h) this.f39273b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (hVar.f48616c.size() < hVar.d) {
                        hVar.f48616c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f48628q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f48628q = null;
                }
                hVar.f48629r = null;
                hVar.invalidateSelf();
                return;
            case 11:
                ((yh.h0) this.f39273b).f50305b.f50345w.setVisibility(8);
                return;
            case 12:
                zh.q2 q2Var = (zh.q2) this.f39273b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                zh.p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f52414l) && z10) {
                    p2Var.f52414l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            default:
                s00 s00Var = ((zh.j7) this.f39273b).f52113c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39272a) {
            case 3:
                ((r0.m0) this.f39273b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public oj1(r0.m0 m0Var, View view) {
        this.f39272a = 3;
        this.f39273b = m0Var;
    }
}
