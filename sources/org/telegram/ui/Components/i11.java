package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i11 extends AnimatorListenerAdapter {
    public final int f35426a;
    public final Object f35427b;

    public i11(Object obj, int i7) {
        this.f35426a = i7;
        this.f35427b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35426a) {
            case 0:
                fi.w2 w2Var = ((k11) this.f35427b).f36240f;
                w2Var.setScaleX(1.0f);
                w2Var.setScaleY(1.0f);
                w2Var.invalidate();
                return;
            case 1:
                o11 o11Var = (o11) this.f35427b;
                o11Var.M = 1.0f;
                o11Var.h.invalidate();
                return;
            case 2:
                ((x31) this.f35427b).M = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f35427b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                b51 b51Var = (b51) this.f35427b;
                if (b51Var.f33201a.getTag() == null) {
                    b51Var.f33201a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                c51 c51Var = (c51) this.f35427b;
                c51Var.f33509b = 0.0f;
                c51Var.setTranslationY(0.0f);
                c51Var.f33508a = null;
                return;
            case 6:
                v61 v61Var = (v61) this.f35427b;
                v61Var.K = false;
                v61Var.setEnabled(true);
                u61 u61Var = v61Var.E;
                if (u61Var != null) {
                    ((cf) u61Var).q(1.0f);
                }
                v61Var.invalidate();
                return;
            case 7:
                ((m71) this.f35427b).f37148f0 = null;
                return;
            default:
                ((s71) this.f35427b).L = null;
                return;
        }
    }
}
