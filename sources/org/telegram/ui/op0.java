package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class op0 extends AnimatorListenerAdapter {
    public final int f48327a;
    public final org.telegram.ui.Components.rk0 f48328b;

    public op0(org.telegram.ui.Components.rk0 rk0Var, int i3) {
        this.f48327a = i3;
        this.f48328b = rk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48327a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f48328b.f37747b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                mp0 mp0Var = photoViewer.U1;
                mp0Var.m0 = false;
                if (mp0Var.f52736n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) mp0Var.f52738p0.getLayoutParams()).topMargin = mp0Var.f52736n0;
                    mp0Var.f52736n0 = -1;
                    mp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f48328b.f37747b).R1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f48327a) {
            case 0:
                mp0 mp0Var = ((PhotoViewer) this.f48328b.f37747b).U1;
                Method method = mp0Var.f52730g0;
                if (method != null) {
                    try {
                        method.invoke(mp0Var, null);
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
