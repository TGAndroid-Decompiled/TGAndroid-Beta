package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class a51 extends AnimatorListenerAdapter {
    public final int f35881a;
    public final org.telegram.ui.Components.ln0 f35882b;

    public a51(org.telegram.ui.Components.ln0 ln0Var, int i10) {
        this.f35881a = i10;
        this.f35882b = ln0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35881a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35882b.f28432b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                cu0 cu0Var = secretMediaViewer.f34451a0;
                cu0Var.f40939l0 = false;
                if (cu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) cu0Var.f40941o0.getLayoutParams()).topMargin = cu0Var.m0;
                    cu0Var.m0 = -1;
                    cu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f35882b.f28432b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35881a) {
            case 0:
                cu0 cu0Var = ((SecretMediaViewer) this.f35882b.f28432b).f34451a0;
                Method method = cu0Var.f40933f0;
                if (method != null) {
                    try {
                        method.invoke(cu0Var, null);
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
