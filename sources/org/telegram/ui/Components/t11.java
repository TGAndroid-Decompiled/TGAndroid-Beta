package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t11 extends AnimatorListenerAdapter {
    public final int f39752a;
    public final Object f39753b;

    public t11(Object obj, int i7) {
        this.f39752a = i7;
        this.f39753b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39752a) {
            case 0:
                fi.u2 u2Var = ((v11) this.f39753b).f40637f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                return;
            case 1:
                z11 z11Var = (z11) this.f39753b;
                z11Var.M = 1.0f;
                z11Var.h.invalidate();
                return;
            case 2:
                ((k41) this.f39753b).M = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f39753b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                o51 o51Var = (o51) this.f39753b;
                if (o51Var.f38110a.getTag() == null) {
                    o51Var.f38110a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                p51 p51Var = (p51) this.f39753b;
                p51Var.f38510b = 0.0f;
                p51Var.setTranslationY(0.0f);
                p51Var.f38509a = null;
                return;
            case 6:
                i71 i71Var = (i71) this.f39753b;
                i71Var.K = false;
                i71Var.setEnabled(true);
                h71 h71Var = i71Var.E;
                if (h71Var != null) {
                    h71Var.g(1.0f);
                }
                i71Var.invalidate();
                return;
            case 7:
                ((z71) this.f39753b).f42720f0 = null;
                return;
            default:
                ((f81) this.f39753b).L = null;
                return;
        }
    }
}
