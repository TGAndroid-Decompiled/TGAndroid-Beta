package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class kz0 extends AnimatorListenerAdapter {
    public final int f49412a;
    public final org.telegram.ui.Components.cl0 f49413b;

    public kz0(org.telegram.ui.Components.cl0 cl0Var, int i7) {
        this.f49412a = i7;
        this.f49413b = cl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49412a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f49413b.f34184b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                xp0 xp0Var = secretMediaViewer.Z;
                xp0Var.m0 = false;
                if (xp0Var.f49341n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xp0Var.f49343p0.getLayoutParams()).topMargin = xp0Var.f49341n0;
                    xp0Var.f49341n0 = -1;
                    xp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f49413b.f34184b).Y.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f49412a) {
            case 0:
                xp0 xp0Var = ((SecretMediaViewer) this.f49413b.f34184b).Z;
                Method method = xp0Var.f49335g0;
                if (method != null) {
                    try {
                        method.invoke(xp0Var, null);
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
