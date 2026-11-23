package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t11 extends AnimatorListenerAdapter {
    public final int f39706a;
    public final Object f39707b;

    public t11(Object obj, int i7) {
        this.f39706a = i7;
        this.f39707b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39706a) {
            case 0:
                fi.u2 u2Var = ((v11) this.f39707b).f40588f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                return;
            case 1:
                z11 z11Var = (z11) this.f39707b;
                z11Var.M = 1.0f;
                z11Var.h.invalidate();
                return;
            case 2:
                ((k41) this.f39707b).M = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f39707b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                o51 o51Var = (o51) this.f39707b;
                if (o51Var.f38076a.getTag() == null) {
                    o51Var.f38076a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                p51 p51Var = (p51) this.f39707b;
                p51Var.f38467b = 0.0f;
                p51Var.setTranslationY(0.0f);
                p51Var.f38466a = null;
                return;
            case 6:
                i71 i71Var = (i71) this.f39707b;
                i71Var.K = false;
                i71Var.setEnabled(true);
                h71 h71Var = i71Var.E;
                if (h71Var != null) {
                    h71Var.g(1.0f);
                }
                i71Var.invalidate();
                return;
            case 7:
                ((z71) this.f39707b).f42677f0 = null;
                return;
            default:
                ((f81) this.f39707b).L = null;
                return;
        }
    }
}
