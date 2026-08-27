package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class p7 extends AnimatorListenerAdapter {

    public final int f31537a;

    public final b8 f31538b;

    public p7(b8 b8Var, int i10) {
        this.f31537a = i10;
        this.f31538b = b8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31537a) {
            case 2:
                this.f31538b.f27043y0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31537a) {
            case 0:
                this.f31538b.f27022i0 = false;
                break;
            case 1:
                b8 b8Var = this.f31538b;
                b8Var.f27017e0.setVisibility(4);
                b8Var.f27019f0.setImageBitmap(null);
                b8Var.f27022i0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
