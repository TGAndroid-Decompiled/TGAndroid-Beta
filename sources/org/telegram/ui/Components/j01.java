package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j01 extends AnimatorListenerAdapter {
    public final int f34902a;
    public final Object f34903b;

    public j01(Object obj, int i3) {
        this.f34902a = i3;
        this.f34903b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34902a) {
            case 0:
                n01 n01Var = (n01) this.f34903b;
                if (n01Var.K == animator) {
                    n01Var.K = null;
                    return;
                }
                return;
            case 1:
                ei.e3 e3Var = ((b11) this.f34903b).f32051f;
                e3Var.setScaleX(1.0f);
                e3Var.setScaleY(1.0f);
                e3Var.invalidate();
                return;
            case 2:
                f11 f11Var = (f11) this.f34903b;
                f11Var.M = 1.0f;
                f11Var.h.invalidate();
                return;
            case 3:
                ((n31) this.f34903b).M = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f34903b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                s41 s41Var = (s41) this.f34903b;
                if (s41Var.f37903a.getTag() == null) {
                    s41Var.f37903a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                t41 t41Var = (t41) this.f34903b;
                t41Var.f38249b = 0.0f;
                t41Var.setTranslationY(0.0f);
                t41Var.f38248a = null;
                return;
            case 7:
                m61 m61Var = (m61) this.f34903b;
                m61Var.K = false;
                m61Var.setEnabled(true);
                l61 l61Var = m61Var.E;
                if (l61Var != null) {
                    ((y00) l61Var).x(1.0f);
                }
                m61Var.invalidate();
                return;
            case 8:
                ((d71) this.f34903b).f33006f0 = null;
                return;
            default:
                ((j71) this.f34903b).L = null;
                return;
        }
    }
}
