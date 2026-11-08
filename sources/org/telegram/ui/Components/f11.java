package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f11 extends AnimatorListenerAdapter {
    public final int f33442a;
    public final Object f33443b;

    public f11(Object obj, int i7) {
        this.f33442a = i7;
        this.f33443b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33442a) {
            case 0:
                di.b3 b3Var = ((h11) this.f33443b).f34085f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 1:
                l11 l11Var = (l11) this.f33443b;
                l11Var.L = 1.0f;
                l11Var.h.invalidate();
                return;
            case 2:
                ((t31) this.f33443b).L = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f33443b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                y41 y41Var = (y41) this.f33443b;
                if (y41Var.f40568a.getTag() == null) {
                    y41Var.f40568a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                z41 z41Var = (z41) this.f33443b;
                z41Var.f40891b = 0.0f;
                z41Var.setTranslationY(0.0f);
                z41Var.f40890a = null;
                return;
            case 6:
                u61 u61Var = (u61) this.f33443b;
                u61Var.J = false;
                u61Var.setEnabled(true);
                t61 t61Var = u61Var.D;
                if (t61Var != null) {
                    ((n) t61Var).y(1.0f);
                }
                u61Var.invalidate();
                return;
            case 7:
                ((l71) this.f33443b).f35578e0 = null;
                return;
            default:
                ((r71) this.f33443b).K = null;
                return;
        }
    }
}
