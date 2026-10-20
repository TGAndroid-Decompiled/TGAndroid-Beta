package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class n31 extends AnimatorListenerAdapter {
    public final int f39403a;
    public final org.telegram.ui.Components.dn0 f39404b;

    public n31(org.telegram.ui.Components.dn0 dn0Var, int i10) {
        this.f39403a = i10;
        this.f39404b = dn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39403a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39404b.f25574b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                ht0 ht0Var = secretMediaViewer.f33784a0;
                ht0Var.f42051l0 = false;
                if (ht0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ht0Var.f42053o0.getLayoutParams()).topMargin = ht0Var.m0;
                    ht0Var.m0 = -1;
                    ht0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f39404b.f25574b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39403a) {
            case 0:
                ht0 ht0Var = ((SecretMediaViewer) this.f39404b.f25574b).f33784a0;
                Method method = ht0Var.f42045f0;
                if (method != null) {
                    try {
                        method.invoke(ht0Var, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
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
