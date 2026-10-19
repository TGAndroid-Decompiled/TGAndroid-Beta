package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class jt0 extends AnimatorListenerAdapter {
    public final int f38338a;
    public final org.telegram.ui.Components.cn0 f38339b;

    public jt0(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f38338a = i10;
        this.f38339b = cn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38338a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38339b.f25289b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ht0 ht0Var = photoViewer.T1;
                ht0Var.f42046l0 = false;
                if (ht0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ht0Var.f42048o0.getLayoutParams()).topMargin = ht0Var.m0;
                    ht0Var.m0 = -1;
                    ht0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38339b.f25289b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38338a) {
            case 0:
                ht0 ht0Var = ((PhotoViewer) this.f38339b.f25289b).T1;
                Method method = ht0Var.f42040f0;
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
