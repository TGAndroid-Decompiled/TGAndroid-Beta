package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e11 extends AnimatorListenerAdapter {
    public final int f33108a;
    public final Object f33109b;

    public e11(Object obj, int i7) {
        this.f33108a = i7;
        this.f33109b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33108a) {
            case 0:
                di.b3 b3Var = ((g11) this.f33109b).f33726f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 1:
                k11 k11Var = (k11) this.f33109b;
                k11Var.L = 1.0f;
                k11Var.h.invalidate();
                return;
            case 2:
                ((s31) this.f33109b).L = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f33109b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                x41 x41Var = (x41) this.f33109b;
                if (x41Var.f40161a.getTag() == null) {
                    x41Var.f40161a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                y41 y41Var = (y41) this.f33109b;
                y41Var.f40521b = 0.0f;
                y41Var.setTranslationY(0.0f);
                y41Var.f40520a = null;
                return;
            case 6:
                t61 t61Var = (t61) this.f33109b;
                t61Var.J = false;
                t61Var.setEnabled(true);
                s61 s61Var = t61Var.D;
                if (s61Var != null) {
                    ((n) s61Var).y(1.0f);
                }
                t61Var.invalidate();
                return;
            case 7:
                ((k71) this.f33109b).f35220e0 = null;
                return;
            default:
                ((q71) this.f33109b).K = null;
                return;
        }
    }
}
