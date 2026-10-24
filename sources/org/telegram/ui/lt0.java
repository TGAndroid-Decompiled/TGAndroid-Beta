package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class lt0 extends AnimatorListenerAdapter {
    public final int f39378a;
    public final org.telegram.ui.Components.fn0 f39379b;

    public lt0(org.telegram.ui.Components.fn0 fn0Var, int i10) {
        this.f39378a = i10;
        this.f39379b = fn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39378a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f39379b.f26397b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                jt0 jt0Var = photoViewer.T1;
                jt0Var.f43409l0 = false;
                if (jt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) jt0Var.f43411o0.getLayoutParams()).topMargin = jt0Var.m0;
                    jt0Var.m0 = -1;
                    jt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f39379b.f26397b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39378a) {
            case 0:
                jt0 jt0Var = ((PhotoViewer) this.f39379b.f26397b).T1;
                Method method = jt0Var.f43403f0;
                if (method != null) {
                    try {
                        method.invoke(jt0Var, null);
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
