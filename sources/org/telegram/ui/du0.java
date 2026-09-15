package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class du0 extends AnimatorListenerAdapter {
    public final int f33129a;
    public final org.telegram.ui.Components.em0 f33130b;

    public du0(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f33129a = i10;
        this.f33130b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33129a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f33130b.f23694b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                bu0 bu0Var = photoViewer.T1;
                bu0Var.f36351l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36353o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f33130b.f23694b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33129a) {
            case 0:
                bu0 bu0Var = ((PhotoViewer) this.f33130b.f23694b).T1;
                Method method = bu0Var.f36345f0;
                if (method != null) {
                    try {
                        method.invoke(bu0Var, null);
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
