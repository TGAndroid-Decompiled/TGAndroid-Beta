package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q11 extends AnimatorListenerAdapter {
    public final int f29607a;
    public final Object f29608b;

    public q11(Object obj, int i10) {
        this.f29607a = i10;
        this.f29608b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29607a) {
            case 0:
                u11 u11Var = (u11) this.f29608b;
                if (u11Var.J == animator) {
                    u11Var.J = null;
                    return;
                }
                return;
            case 1:
                ih.c cVar = ((k21) this.f29608b).f27714f;
                cVar.setScaleX(1.0f);
                cVar.setScaleY(1.0f);
                cVar.invalidate();
                return;
            case 2:
                o21 o21Var = (o21) this.f29608b;
                o21Var.L = 1.0f;
                o21Var.h.invalidate();
                return;
            case 3:
                ((x41) this.f29608b).L = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f29608b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                c61 c61Var = (c61) this.f29608b;
                if (c61Var.f25035a.getTag() == null) {
                    c61Var.f25035a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                d61 d61Var = (d61) this.f29608b;
                d61Var.f25420b = 0.0f;
                d61Var.setTranslationY(0.0f);
                d61Var.f25419a = null;
                return;
            case 7:
                w71 w71Var = (w71) this.f29608b;
                w71Var.J = false;
                w71Var.setEnabled(true);
                v71 v71Var = w71Var.D;
                if (v71Var != null) {
                    ((n2.u) v71Var).J(1.0f);
                }
                w71Var.invalidate();
                return;
            case 8:
                ((n81) this.f29608b).f28732e0 = null;
                return;
            default:
                ((t81) this.f29608b).K = null;
                return;
        }
    }
}
