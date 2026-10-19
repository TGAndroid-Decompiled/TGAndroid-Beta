package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class jt0 extends AnimatorListenerAdapter {
    public final int f38339a;
    public final org.telegram.ui.Components.cn0 f38340b;

    public jt0(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f38339a = i10;
        this.f38340b = cn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38339a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38340b.f25287b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ht0 ht0Var = photoViewer.T1;
                ht0Var.f42045l0 = false;
                if (ht0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ht0Var.f42047o0.getLayoutParams()).topMargin = ht0Var.m0;
                    ht0Var.m0 = -1;
                    ht0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38340b.f25287b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38339a) {
            case 0:
                ht0 ht0Var = ((PhotoViewer) this.f38340b.f25287b).T1;
                Method method = ht0Var.f42039f0;
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
