package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class a51 extends AnimatorListenerAdapter {
    public final int f34336a;
    public final org.telegram.ui.Components.em0 f34337b;

    public a51(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f34336a = i10;
        this.f34337b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34336a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34337b.f25734b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                au0 au0Var = secretMediaViewer.f34058a0;
                au0Var.f39032l0 = false;
                if (au0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) au0Var.f39034o0.getLayoutParams()).topMargin = au0Var.m0;
                    au0Var.m0 = -1;
                    au0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f34337b.f25734b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34336a) {
            case 0:
                au0 au0Var = ((SecretMediaViewer) this.f34337b.f25734b).f34058a0;
                Method method = au0Var.f39026f0;
                if (method != null) {
                    try {
                        method.invoke(au0Var, null);
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
