package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class lt0 extends AnimatorListenerAdapter {
    public final int f38956a;
    public final org.telegram.ui.Components.cn0 f38957b;

    public lt0(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f38956a = i10;
        this.f38957b = cn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38956a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38957b.f25318b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                jt0 jt0Var = photoViewer.T1;
                jt0Var.f42953l0 = false;
                if (jt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) jt0Var.f42955o0.getLayoutParams()).topMargin = jt0Var.m0;
                    jt0Var.m0 = -1;
                    jt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38957b.f25318b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38956a) {
            case 0:
                jt0 jt0Var = ((PhotoViewer) this.f38957b.f25318b).T1;
                Method method = jt0Var.f42947f0;
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
