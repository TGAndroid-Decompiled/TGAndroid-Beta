package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class mt0 extends AnimatorListenerAdapter {
    public final int f39687a;
    public final org.telegram.ui.Components.gn0 f39688b;

    public mt0(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f39687a = i10;
        this.f39688b = gn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39687a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f39688b.f26682b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                kt0 kt0Var = photoViewer.T1;
                kt0Var.f43654l0 = false;
                if (kt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) kt0Var.f43656o0.getLayoutParams()).topMargin = kt0Var.m0;
                    kt0Var.m0 = -1;
                    kt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f39688b.f26682b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39687a) {
            case 0:
                kt0 kt0Var = ((PhotoViewer) this.f39688b.f26682b).T1;
                Method method = kt0Var.f43648f0;
                if (method != null) {
                    try {
                        method.invoke(kt0Var, null);
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
