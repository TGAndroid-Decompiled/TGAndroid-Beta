package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class mz0 extends AnimatorListenerAdapter {
    public final int f48083a;
    public final org.telegram.ui.Components.nk0 f48084b;

    public mz0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f48083a = i7;
        this.f48084b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48083a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f48084b.f36328b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                yp0 yp0Var = secretMediaViewer.Y;
                yp0Var.f47674l0 = false;
                if (yp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) yp0Var.f47676o0.getLayoutParams()).topMargin = yp0Var.m0;
                    yp0Var.m0 = -1;
                    yp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f48084b.f36328b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f48083a) {
            case 0:
                yp0 yp0Var = ((SecretMediaViewer) this.f48084b.f36328b).Y;
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
