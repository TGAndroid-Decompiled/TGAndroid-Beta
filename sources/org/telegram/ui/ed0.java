package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ed0 extends AnimatorListenerAdapter {
    public final int f36880a;
    public final hg0 f36881b;

    public ed0(hg0 hg0Var, int i10) {
        this.f36880a = i10;
        this.f36881b = hg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36880a) {
            case 0:
                hg0 hg0Var = this.f36881b;
                if (hg0Var.d == animator) {
                    hg0Var.d = null;
                    return;
                }
                return;
            default:
                hg0 hg0Var2 = this.f36881b;
                hg0Var2.f37837c.setVisibility(8);
                if (hg0Var2.d == animator) {
                    hg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36880a) {
            case 0:
                this.f36881b.f37837c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
