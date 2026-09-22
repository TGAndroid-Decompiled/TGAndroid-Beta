package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class du0 extends AnimatorListenerAdapter {
    public final int f33091a;
    public final org.telegram.ui.Components.em0 f33092b;

    public du0(org.telegram.ui.Components.em0 em0Var, int i10) {
        this.f33091a = i10;
        this.f33092b = em0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33091a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f33092b.f23691b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                bu0 bu0Var = photoViewer.T1;
                bu0Var.f36354l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36356o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f33092b.f23691b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33091a) {
            case 0:
                bu0 bu0Var = ((PhotoViewer) this.f33092b.f23691b).T1;
                Method method = bu0Var.f36348f0;
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
