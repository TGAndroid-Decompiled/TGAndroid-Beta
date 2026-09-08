package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class cu0 extends AnimatorListenerAdapter {
    public final int f35565a;
    public final org.telegram.ui.Components.em0 f35566b;

    public cu0(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f35565a = i10;
        this.f35566b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35565a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f35566b.f25761b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                au0 au0Var = photoViewer.T1;
                au0Var.f39059l0 = false;
                if (au0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) au0Var.f39061o0.getLayoutParams()).topMargin = au0Var.m0;
                    au0Var.m0 = -1;
                    au0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f35566b.f25761b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35565a) {
            case 0:
                au0 au0Var = ((PhotoViewer) this.f35566b.f25761b).T1;
                Method method = au0Var.f39053f0;
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
