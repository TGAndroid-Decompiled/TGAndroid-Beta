package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class iz0 extends AnimatorListenerAdapter {
    public final int f46775a;
    public final org.telegram.ui.Components.nk0 f46776b;

    public iz0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f46775a = i7;
        this.f46776b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46775a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f46776b.f36433b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                up0 up0Var = secretMediaViewer.Y;
                up0Var.f46468l0 = false;
                if (up0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) up0Var.f46470o0.getLayoutParams()).topMargin = up0Var.m0;
                    up0Var.m0 = -1;
                    up0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f46776b.f36433b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46775a) {
            case 0:
                up0 up0Var = ((SecretMediaViewer) this.f46776b.f36433b).Y;
                Method method = up0Var.f46462f0;
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
