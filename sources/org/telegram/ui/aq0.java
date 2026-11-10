package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class aq0 extends AnimatorListenerAdapter {
    public final int f43793a;
    public final org.telegram.ui.Components.nk0 f43794b;

    public aq0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f43793a = i7;
        this.f43794b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43793a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f43794b.f36328b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                yp0 yp0Var = photoViewer.T1;
                yp0Var.f47674l0 = false;
                if (yp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) yp0Var.f47676o0.getLayoutParams()).topMargin = yp0Var.m0;
                    yp0Var.m0 = -1;
                    yp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f43794b.f36328b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43793a) {
            case 0:
                yp0 yp0Var = ((PhotoViewer) this.f43794b.f36328b).T1;
                Method method = yp0Var.f47668f0;
                if (method != null) {
                    try {
                        method.invoke(yp0Var, null);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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
