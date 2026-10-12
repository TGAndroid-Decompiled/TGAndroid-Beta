package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class fu0 extends AnimatorListenerAdapter {
    public final int f37850a;
    public final org.telegram.ui.Components.qn0 f37851b;

    public fu0(org.telegram.ui.Components.qn0 qn0Var, int i10) {
        this.f37850a = i10;
        this.f37851b = qn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37850a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37851b.f29869b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                du0 du0Var = photoViewer.T1;
                du0Var.f41731l0 = false;
                if (du0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) du0Var.f41733o0.getLayoutParams()).topMargin = du0Var.m0;
                    du0Var.m0 = -1;
                    du0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37851b.f29869b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37850a) {
            case 0:
                du0 du0Var = ((PhotoViewer) this.f37851b.f29869b).T1;
                Method method = du0Var.f41725f0;
                if (method != null) {
                    try {
                        method.invoke(du0Var, null);
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
