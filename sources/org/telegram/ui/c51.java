package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class c51 extends AnimatorListenerAdapter {
    public final int f36332a;
    public final org.telegram.ui.Components.qn0 f36333b;

    public c51(org.telegram.ui.Components.qn0 qn0Var, int i10) {
        this.f36332a = i10;
        this.f36333b = qn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36332a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36333b.f29871b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                eu0 eu0Var = secretMediaViewer.f34252a0;
                eu0Var.f41731l0 = false;
                if (eu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) eu0Var.f41733o0.getLayoutParams()).topMargin = eu0Var.m0;
                    eu0Var.m0 = -1;
                    eu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f36333b.f29871b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36332a) {
            case 0:
                eu0 eu0Var = ((SecretMediaViewer) this.f36333b.f29871b).f34252a0;
                Method method = eu0Var.f41725f0;
                if (method != null) {
                    try {
                        method.invoke(eu0Var, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
