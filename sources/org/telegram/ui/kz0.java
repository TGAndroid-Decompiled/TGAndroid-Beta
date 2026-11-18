package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class kz0 extends AnimatorListenerAdapter {
    public final int f49392a;
    public final org.telegram.ui.Components.al0 f49393b;

    public kz0(org.telegram.ui.Components.al0 al0Var, int i7) {
        this.f49392a = i7;
        this.f49393b = al0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49392a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f49393b.f33363b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                wp0 wp0Var = secretMediaViewer.Z;
                wp0Var.m0 = false;
                if (wp0Var.f49043n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) wp0Var.f49045p0.getLayoutParams()).topMargin = wp0Var.f49043n0;
                    wp0Var.f49043n0 = -1;
                    wp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f49393b.f33363b).Y.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f49392a) {
            case 0:
                wp0 wp0Var = ((SecretMediaViewer) this.f49393b.f33363b).Z;
                Method method = wp0Var.f49037g0;
                if (method != null) {
                    try {
                        method.invoke(wp0Var, null);
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
