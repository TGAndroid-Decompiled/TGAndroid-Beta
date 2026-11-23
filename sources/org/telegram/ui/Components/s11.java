package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s11 extends AnimatorListenerAdapter {
    public final int f39464a;
    public final Object f39465b;

    public s11(Object obj, int i7) {
        this.f39464a = i7;
        this.f39465b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39464a) {
            case 0:
                fi.u2 u2Var = ((u11) this.f39465b).f40227f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                return;
            case 1:
                y11 y11Var = (y11) this.f39465b;
                y11Var.M = 1.0f;
                y11Var.h.invalidate();
                return;
            case 2:
                ((j41) this.f39465b).M = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f39465b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                n51 n51Var = (n51) this.f39465b;
                if (n51Var.f37676a.getTag() == null) {
                    n51Var.f37676a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                o51 o51Var = (o51) this.f39465b;
                o51Var.f38036b = 0.0f;
                o51Var.setTranslationY(0.0f);
                o51Var.f38035a = null;
                return;
            case 6:
                j71 j71Var = (j71) this.f39465b;
                j71Var.K = false;
                j71Var.setEnabled(true);
                i71 i71Var = j71Var.E;
                if (i71Var != null) {
                    i71Var.c(1.0f);
                }
                j71Var.invalidate();
                return;
            case 7:
                ((a81) this.f39465b).f33407f0 = null;
                return;
            default:
                ((g81) this.f39465b).L = null;
                return;
        }
    }
}
