package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s11 extends AnimatorListenerAdapter {
    public final int f39448a;
    public final Object f39449b;

    public s11(Object obj, int i7) {
        this.f39448a = i7;
        this.f39449b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39448a) {
            case 0:
                fi.u2 u2Var = ((u11) this.f39449b).f40172f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                return;
            case 1:
                y11 y11Var = (y11) this.f39449b;
                y11Var.M = 1.0f;
                y11Var.h.invalidate();
                return;
            case 2:
                ((h41) this.f39449b).M = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f39449b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                l51 l51Var = (l51) this.f39449b;
                if (l51Var.f37033a.getTag() == null) {
                    l51Var.f37033a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                m51 m51Var = (m51) this.f39449b;
                m51Var.f37371b = 0.0f;
                m51Var.setTranslationY(0.0f);
                m51Var.f37370a = null;
                return;
            case 6:
                f71 f71Var = (f71) this.f39449b;
                f71Var.K = false;
                f71Var.setEnabled(true);
                e71 e71Var = f71Var.E;
                if (e71Var != null) {
                    e71Var.g(1.0f);
                }
                f71Var.invalidate();
                return;
            case 7:
                ((w71) this.f39449b).f41602f0 = null;
                return;
            default:
                ((c81) this.f39449b).L = null;
                return;
        }
    }
}
