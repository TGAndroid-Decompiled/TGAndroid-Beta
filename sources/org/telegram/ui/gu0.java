package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class gu0 extends AnimatorListenerAdapter {
    public final int f38144a;
    public final org.telegram.ui.Components.qn0 f38145b;

    public gu0(org.telegram.ui.Components.qn0 qn0Var, int i10) {
        this.f38144a = i10;
        this.f38145b = qn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38144a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38145b.f29871b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                eu0 eu0Var = photoViewer.T1;
                eu0Var.f41731l0 = false;
                if (eu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) eu0Var.f41733o0.getLayoutParams()).topMargin = eu0Var.m0;
                    eu0Var.m0 = -1;
                    eu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38145b.f29871b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38144a) {
            case 0:
                eu0 eu0Var = ((PhotoViewer) this.f38145b.f29871b).T1;
                Method method = eu0Var.f41725f0;
                if (method != null) {
                    try {
                        method.invoke(eu0Var, null);
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
