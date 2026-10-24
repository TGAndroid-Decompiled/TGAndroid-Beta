package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v7 extends AnimatorListenerAdapter {
    public final int f31344a;
    public final i8 f31345b;

    public v7(i8 i8Var, int i10) {
        this.f31344a = i10;
        this.f31345b = i8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31344a) {
            case 2:
                this.f31345b.B0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31344a) {
            case 0:
                this.f31345b.f27339l0 = false;
                return;
            case 1:
                i8 i8Var = this.f31345b;
                i8Var.f27335h0.setVisibility(4);
                i8Var.f27336i0.setImageBitmap(null);
                i8Var.f27339l0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
