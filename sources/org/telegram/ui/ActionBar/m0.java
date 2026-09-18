package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final int f19396a;
    public final w0 f19397b;

    public m0(w0 w0Var, int i10) {
        this.f19396a = i10;
        this.f19397b = w0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19396a) {
            case 0:
                w0 w0Var = this.f19397b;
                w0Var.f19627s.setVisibility(4);
                w0Var.v = null;
                return;
            default:
                this.f19397b.v = null;
                return;
        }
    }
}
