package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class cu0 extends AnimatorListenerAdapter {
    public final int f35538a;
    public final org.telegram.ui.Components.em0 f35539b;

    public cu0(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f35538a = i10;
        this.f35539b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35538a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f35539b.f25734b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                au0 au0Var = photoViewer.T1;
                au0Var.f39032l0 = false;
                if (au0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) au0Var.f39034o0.getLayoutParams()).topMargin = au0Var.m0;
                    au0Var.m0 = -1;
                    au0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f35539b.f25734b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35538a) {
            case 0:
                au0 au0Var = ((PhotoViewer) this.f35539b.f25734b).T1;
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
