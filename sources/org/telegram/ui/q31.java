package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class q31 extends AnimatorListenerAdapter {
    public final int f40704a;
    public final org.telegram.ui.Components.fn0 f40705b;

    public q31(org.telegram.ui.Components.fn0 fn0Var, int i10) {
        this.f40704a = i10;
        this.f40705b = fn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40704a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40705b.f26397b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                jt0 jt0Var = secretMediaViewer.f34088a0;
                jt0Var.f43409l0 = false;
                if (jt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) jt0Var.f43411o0.getLayoutParams()).topMargin = jt0Var.m0;
                    jt0Var.m0 = -1;
                    jt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f40705b.f26397b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40704a) {
            case 0:
                jt0 jt0Var = ((SecretMediaViewer) this.f40705b.f26397b).f34088a0;
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
