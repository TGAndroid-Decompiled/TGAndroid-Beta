package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f47558a;
    public final org.telegram.ui.Components.sk0 f47559b;

    public gz0(org.telegram.ui.Components.sk0 sk0Var, int i7) {
        this.f47558a = i7;
        this.f47559b = sk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47558a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47559b.f39334b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                up0 up0Var = secretMediaViewer.Z;
                up0Var.m0 = false;
                if (up0Var.f47810n0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) up0Var.f47812p0.getLayoutParams()).topMargin = up0Var.f47810n0;
                    up0Var.f47810n0 = -1;
                    up0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f47559b.f39334b).Y.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f47558a) {
            case 0:
                up0 up0Var = ((SecretMediaViewer) this.f47559b.f39334b).Z;
                Method method = up0Var.f47804g0;
                if (method != null) {
                    try {
                        method.invoke(up0Var, null);
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
