package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class iz0 extends AnimatorListenerAdapter {
    public final int f46799a;
    public final org.telegram.ui.Components.nk0 f46800b;

    public iz0(org.telegram.ui.Components.nk0 nk0Var, int i7) {
        this.f46799a = i7;
        this.f46800b = nk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46799a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f46800b.f36327b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                vp0 vp0Var = secretMediaViewer.Y;
                vp0Var.f46727l0 = false;
                if (vp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) vp0Var.f46729o0.getLayoutParams()).topMargin = vp0Var.m0;
                    vp0Var.m0 = -1;
                    vp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f46800b.f36327b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46799a) {
            case 0:
                vp0 vp0Var = ((SecretMediaViewer) this.f46800b.f36327b).Y;
                Method method = vp0Var.f46721f0;
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
