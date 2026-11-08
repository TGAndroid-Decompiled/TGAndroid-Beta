package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class iz0 extends AnimatorListenerAdapter {
    public final int f46801a;
    public final org.telegram.ui.Components.nk0 f46802b;

    public iz0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f46801a = i7;
        this.f46802b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46801a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f46802b.f36382b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                vp0 vp0Var = secretMediaViewer.Y;
                vp0Var.f46729l0 = false;
                if (vp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) vp0Var.f46731o0.getLayoutParams()).topMargin = vp0Var.m0;
                    vp0Var.m0 = -1;
                    vp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f46802b.f36382b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46801a) {
            case 0:
                vp0 vp0Var = ((SecretMediaViewer) this.f46802b.f36382b).Y;
                Method method = vp0Var.f46723f0;
                if (method != null) {
                    try {
                        method.invoke(vp0Var, null);
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
