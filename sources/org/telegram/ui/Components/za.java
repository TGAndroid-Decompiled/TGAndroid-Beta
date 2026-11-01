package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import java.util.LinkedList;
public final class za implements o1.f {
    public final int f33085a;
    public final Object f33086b;
    public final Object f33087c;

    public za(int i10, Object obj, Object obj2) {
        this.f33085a = i10;
        this.f33086b = obj;
        this.f33087c = obj2;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f33085a) {
            case 0:
                tf tfVar = (tf) this.f33087c;
                ((bb) this.f33086b).setInOutOffset(0.0f);
                if (!z10) {
                    tfVar.run();
                    return;
                }
                return;
            case 1:
                jg jgVar = (jg) this.f33087c;
                AnimatorSet animatorSet = ((bi) this.f33086b).f21625z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    jgVar.run();
                    return;
                }
                return;
            case 2:
                bi biVar = (bi) ((jh) this.f33086b).d;
                biVar.f24816t2.setTranslationY(0.0f);
                biVar.f24816t2.l(biVar.f24766f4);
                biVar.X0.g();
                biVar.f21587b.invalidate();
                ((mg) this.f33087c).run();
                biVar.O1(0);
                return;
            case 3:
                zc0 zc0Var = (zc0) this.f33086b;
                jb0 jb0Var = (jb0) this.f33087c;
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
                xh.i3 i3Var = (xh.i3) this.f33086b;
                Runnable runnable = (Runnable) this.f33087c;
                if (jVar == i3Var.G) {
                    i3Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = i3Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = i3Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = i3Var.f53826s;
                        i3Var.f53826s = true;
                        i3Var.setOffsetY(f11);
                        i3Var.h = -1.0f;
                        i3Var.f53826s = z11;
                    }
                    i3Var.f53824n = -2.1474836E9f;
                    return;
                }
                return;
        }
    }
}
