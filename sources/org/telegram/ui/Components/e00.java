package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e00 extends AnimatorListenerAdapter {
    public final int f25582a;

    public e00(int i10) {
        this.f25582a = i10;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f25582a) {
            case 0:
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f25582a) {
            case 1:
                jf.f fVar = th.w0.Z.L;
                if (fVar == null || (view = fVar.f9868j) == null) {
                    return;
                }
                fVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
