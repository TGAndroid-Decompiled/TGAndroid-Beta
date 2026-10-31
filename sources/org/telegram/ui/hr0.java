package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class hr0 extends AnimatorListenerAdapter {
    public final int f38019a;
    public final org.telegram.ui.Components.rl0 f38020b;

    public hr0(org.telegram.ui.Components.rl0 rl0Var, int i10) {
        this.f38019a = i10;
        this.f38020b = rl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38019a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38020b.f29952b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                fr0 fr0Var = photoViewer.T1;
                fr0Var.f41929l0 = false;
                if (fr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) fr0Var.f41931o0.getLayoutParams()).topMargin = fr0Var.m0;
                    fr0Var.m0 = -1;
                    fr0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38020b.f29952b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38019a) {
            case 0:
                fr0 fr0Var = ((PhotoViewer) this.f38020b.f29952b).T1;
                Method method = fr0Var.f41923f0;
                if (method != null) {
                    try {
                        method.invoke(fr0Var, null);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
