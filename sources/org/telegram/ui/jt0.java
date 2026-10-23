package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class jt0 extends AnimatorListenerAdapter {
    public final int f38350a;
    public final org.telegram.ui.Components.dn0 f38351b;

    public jt0(org.telegram.ui.Components.dn0 dn0Var, int i10) {
        this.f38350a = i10;
        this.f38351b = dn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38350a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38351b.f25578b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                ht0 ht0Var = photoViewer.T1;
                ht0Var.f42055l0 = false;
                if (ht0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ht0Var.f42057o0.getLayoutParams()).topMargin = ht0Var.m0;
                    ht0Var.m0 = -1;
                    ht0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38351b.f25578b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38350a) {
            case 0:
                ht0 ht0Var = ((PhotoViewer) this.f38351b.f25578b).T1;
                Method method = ht0Var.f42049f0;
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
