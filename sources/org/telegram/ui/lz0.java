package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class lz0 extends AnimatorListenerAdapter {
    public final int f47708a;
    public final org.telegram.ui.Components.ok0 f47709b;

    public lz0(org.telegram.ui.Components.ok0 ok0Var, int i7) {
        this.f47708a = i7;
        this.f47709b = ok0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47708a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47709b.f36738b;
                secretMediaViewer.X.getNextView().setText((CharSequence) null);
                xp0 xp0Var = secretMediaViewer.Y;
                xp0Var.f47350l0 = false;
                if (xp0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) xp0Var.f47352o0.getLayoutParams()).topMargin = xp0Var.m0;
                    xp0Var.m0 = -1;
                    xp0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f47709b.f36738b).X.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f47708a) {
            case 0:
                xp0 xp0Var = ((SecretMediaViewer) this.f47709b.f36738b).Y;
                Method method = xp0Var.f47344f0;
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
