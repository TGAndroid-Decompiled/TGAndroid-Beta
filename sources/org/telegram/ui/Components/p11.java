package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p11 extends AnimatorListenerAdapter {
    public final int f29263a;
    public final Object f29264b;

    public p11(Object obj, int i10) {
        this.f29263a = i10;
        this.f29264b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29263a) {
            case 0:
                t11 t11Var = (t11) this.f29264b;
                if (t11Var.I == animator) {
                    t11Var.I = null;
                    return;
                }
                return;
            case 1:
                ih.c cVar = ((j21) this.f29264b).f27202f;
                cVar.setScaleX(1.0f);
                cVar.setScaleY(1.0f);
                cVar.invalidate();
                return;
            case 2:
                n21 n21Var = (n21) this.f29264b;
                n21Var.L = 1.0f;
                n21Var.h.invalidate();
                return;
            case 3:
                ((w41) this.f29264b).L = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f29264b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                b61 b61Var = (b61) this.f29264b;
                if (b61Var.f24555a.getTag() == null) {
                    b61Var.f24555a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                c61 c61Var = (c61) this.f29264b;
                c61Var.f25011b = 0.0f;
                c61Var.setTranslationY(0.0f);
                c61Var.f25010a = null;
                return;
            case 7:
                v71 v71Var = (v71) this.f29264b;
                v71Var.J = false;
                v71Var.setEnabled(true);
                u71 u71Var = v71Var.D;
                if (u71Var != null) {
                    ((n2.u) u71Var).J(1.0f);
                }
                v71Var.invalidate();
                return;
            case 8:
                ((m81) this.f29264b).f28366e0 = null;
                return;
            default:
                ((s81) this.f29264b).K = null;
                return;
        }
    }
}
