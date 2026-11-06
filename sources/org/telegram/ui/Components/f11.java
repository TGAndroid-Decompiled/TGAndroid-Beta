package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f11 extends AnimatorListenerAdapter {
    public final int f33435a;
    public final Object f33436b;

    public f11(Object obj, int i7) {
        this.f33435a = i7;
        this.f33436b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33435a) {
            case 0:
                di.b3 b3Var = ((h11) this.f33436b).f34148f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 1:
                l11 l11Var = (l11) this.f33436b;
                l11Var.L = 1.0f;
                l11Var.h.invalidate();
                return;
            case 2:
                ((t31) this.f33436b).L = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f33436b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                y41 y41Var = (y41) this.f33436b;
                if (y41Var.f40542a.getTag() == null) {
                    y41Var.f40542a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                z41 z41Var = (z41) this.f33436b;
                z41Var.f40872b = 0.0f;
                z41Var.setTranslationY(0.0f);
                z41Var.f40871a = null;
                return;
            case 6:
                u61 u61Var = (u61) this.f33436b;
                u61Var.J = false;
                u61Var.setEnabled(true);
                t61 t61Var = u61Var.D;
                if (t61Var != null) {
                    ((n) t61Var).y(1.0f);
                }
                u61Var.invalidate();
                return;
            case 7:
                ((l71) this.f33436b).f35560e0 = null;
                return;
            default:
                ((r71) this.f33436b).K = null;
                return;
        }
    }
}
