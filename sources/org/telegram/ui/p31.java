package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class p31 extends AnimatorListenerAdapter {
    public final int f39970a;
    public final org.telegram.ui.Components.cn0 f39971b;

    public p31(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f39970a = i10;
        this.f39971b = cn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39970a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39971b.f25318b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                jt0 jt0Var = secretMediaViewer.f33777a0;
                jt0Var.f42953l0 = false;
                if (jt0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) jt0Var.f42955o0.getLayoutParams()).topMargin = jt0Var.m0;
                    jt0Var.m0 = -1;
                    jt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f39971b.f25318b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39970a) {
            case 0:
                jt0 jt0Var = ((SecretMediaViewer) this.f39971b.f25318b).f33777a0;
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
