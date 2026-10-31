package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import java.util.LinkedList;
public final class za implements o1.f {
    public final int f32989a;
    public final Object f32990b;
    public final Object f32991c;

    public za(int i10, Object obj, Object obj2) {
        this.f32989a = i10;
        this.f32990b = obj;
        this.f32991c = obj2;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f32989a) {
            case 0:
                tf tfVar = (tf) this.f32991c;
                ((bb) this.f32990b).setInOutOffset(0.0f);
                if (!z10) {
                    tfVar.run();
                    return;
                }
                return;
            case 1:
                jg jgVar = (jg) this.f32991c;
                AnimatorSet animatorSet = ((bi) this.f32990b).f21624z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    jgVar.run();
                    return;
                }
                return;
            case 2:
                bi biVar = (bi) ((jh) this.f32990b).d;
                biVar.f24725t2.setTranslationY(0.0f);
                biVar.f24725t2.l(biVar.f24675f4);
                biVar.X0.g();
                biVar.f21586b.invalidate();
                ((mg) this.f32991c).run();
                biVar.O1(0);
                return;
            case 3:
                zc0 zc0Var = (zc0) this.f32990b;
                jb0 jb0Var = (jb0) this.f32991c;
                LinkedList linkedList = zc0Var.U;
                zc0Var.T = null;
                jb0Var.D = null;
                jb0Var.y();
                if (!z10) {
                    jb0Var.h = 1.0f;
                    jb0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        zc0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
            default:
                xh.h3 h3Var = (xh.h3) this.f32990b;
                Runnable runnable = (Runnable) this.f32991c;
                if (jVar == h3Var.G) {
                    h3Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = h3Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = h3Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = h3Var.f53792s;
                        h3Var.f53792s = true;
                        h3Var.setOffsetY(f11);
                        h3Var.h = -1.0f;
                        h3Var.f53792s = z11;
                    }
                    h3Var.f53790n = -2.1474836E9f;
                    return;
                }
                return;
        }
    }
}
