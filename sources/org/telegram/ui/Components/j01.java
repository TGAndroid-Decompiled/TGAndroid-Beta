package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j01 extends AnimatorListenerAdapter {
    public final int f34845a;
    public final Object f34846b;

    public j01(Object obj, int i7) {
        this.f34845a = i7;
        this.f34846b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34845a) {
            case 0:
                n01 n01Var = (n01) this.f34846b;
                if (n01Var.J == animator) {
                    n01Var.J = null;
                    return;
                }
                return;
            case 1:
                di.b3 b3Var = ((b11) this.f34846b).f31971f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 2:
                f11 f11Var = (f11) this.f34846b;
                f11Var.L = 1.0f;
                f11Var.h.invalidate();
                return;
            case 3:
                ((n31) this.f34846b).L = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f34846b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                s41 s41Var = (s41) this.f34846b;
                if (s41Var.f37937a.getTag() == null) {
                    s41Var.f37937a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                u41 u41Var = (u41) this.f34846b;
                u41Var.f38522b = 0.0f;
                u41Var.setTranslationY(0.0f);
                u41Var.f38521a = null;
                return;
            case 7:
                o61 o61Var = (o61) this.f34846b;
                o61Var.J = false;
                o61Var.setEnabled(true);
                n61 n61Var = o61Var.D;
                if (n61Var != null) {
                    ((n) n61Var).y(1.0f);
                }
                o61Var.invalidate();
                return;
            case 8:
                ((f71) this.f34846b).f33523e0 = null;
                return;
            default:
                ((l71) this.f34846b).K = null;
                return;
        }
    }
}
