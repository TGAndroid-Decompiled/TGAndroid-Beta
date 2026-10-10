package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m30 extends AnimatorListenerAdapter {
    public final int f28624a;
    public final r30 f28625b;

    public m30(r30 r30Var, int i10) {
        this.f28624a = i10;
        this.f28625b = r30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28624a) {
            case 0:
                r30 r30Var = this.f28625b;
                r30Var.f30356b.setVisibility(8);
                r30Var.f30367y = false;
                r30Var.E = 0.0f;
                return;
            default:
                this.f28625b.f30360e.setVisibility(8);
                return;
        }
    }
}
