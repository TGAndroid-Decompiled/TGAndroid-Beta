package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class a51 extends AnimatorListenerAdapter {
    public final int f35835a;
    public final org.telegram.ui.Components.kn0 f35836b;

    public a51(org.telegram.ui.Components.kn0 kn0Var, int i10) {
        this.f35835a = i10;
        this.f35836b = kn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35835a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35836b.f28114b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                cu0 cu0Var = secretMediaViewer.f34413a0;
                cu0Var.f40893l0 = false;
                if (cu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) cu0Var.f40895o0.getLayoutParams()).topMargin = cu0Var.m0;
                    cu0Var.m0 = -1;
                    cu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f35836b.f28114b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35835a) {
            case 0:
                cu0 cu0Var = ((SecretMediaViewer) this.f35836b.f28114b).f34413a0;
                Method method = cu0Var.f40887f0;
                if (method != null) {
                    try {
                        method.invoke(cu0Var, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
