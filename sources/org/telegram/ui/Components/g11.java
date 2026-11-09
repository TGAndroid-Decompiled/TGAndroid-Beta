package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g11 extends AnimatorListenerAdapter {
    public final int f33846a;
    public final Object f33847b;

    public g11(Object obj, int i7) {
        this.f33846a = i7;
        this.f33847b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33846a) {
            case 0:
                di.b3 b3Var = ((i11) this.f33847b).f34524f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 1:
                m11 m11Var = (m11) this.f33847b;
                m11Var.L = 1.0f;
                m11Var.h.invalidate();
                return;
            case 2:
                ((u31) this.f33847b).L = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f33847b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                z41 z41Var = (z41) this.f33847b;
                if (z41Var.f40904a.getTag() == null) {
                    z41Var.f40904a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                a51 a51Var = (a51) this.f33847b;
                a51Var.f31712b = 0.0f;
                a51Var.setTranslationY(0.0f);
                a51Var.f31711a = null;
                return;
            case 6:
                v61 v61Var = (v61) this.f33847b;
                v61Var.J = false;
                v61Var.setEnabled(true);
                u61 u61Var = v61Var.D;
                if (u61Var != null) {
                    ((n) u61Var).y(1.0f);
                }
                v61Var.invalidate();
                return;
            case 7:
                ((m71) this.f33847b).f36004e0 = null;
                return;
            default:
                ((s71) this.f33847b).K = null;
                return;
        }
    }
}
