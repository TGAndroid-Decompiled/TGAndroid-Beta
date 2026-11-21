package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u11 extends AnimatorListenerAdapter {
    public final int f40210a;
    public final Object f40211b;

    public u11(Object obj, int i7) {
        this.f40210a = i7;
        this.f40211b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40210a) {
            case 0:
                fi.u2 u2Var = ((w11) this.f40211b).f41627f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                return;
            case 1:
                a21 a21Var = (a21) this.f40211b;
                a21Var.M = 1.0f;
                a21Var.h.invalidate();
                return;
            case 2:
                ((k41) this.f40211b).M = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f40211b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                o51 o51Var = (o51) this.f40211b;
                if (o51Var.f38116a.getTag() == null) {
                    o51Var.f38116a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                p51 p51Var = (p51) this.f40211b;
                p51Var.f38511b = 0.0f;
                p51Var.setTranslationY(0.0f);
                p51Var.f38510a = null;
                return;
            case 6:
                i71 i71Var = (i71) this.f40211b;
                i71Var.K = false;
                i71Var.setEnabled(true);
                h71 h71Var = i71Var.E;
                if (h71Var != null) {
                    h71Var.g(1.0f);
                }
                i71Var.invalidate();
                return;
            case 7:
                ((z71) this.f40211b).f42716f0 = null;
                return;
            default:
                ((f81) this.f40211b).L = null;
                return;
        }
    }
}
