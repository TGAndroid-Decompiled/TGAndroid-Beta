package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class c51 extends AnimatorListenerAdapter {
    public final int f36330a;
    public final org.telegram.ui.Components.qn0 f36331b;

    public c51(org.telegram.ui.Components.qn0 qn0Var, int i10) {
        this.f36330a = i10;
        this.f36331b = qn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36330a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36331b.f29869b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                du0 du0Var = secretMediaViewer.f34250a0;
                du0Var.f41731l0 = false;
                if (du0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) du0Var.f41733o0.getLayoutParams()).topMargin = du0Var.m0;
                    du0Var.m0 = -1;
                    du0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f36331b.f29869b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36330a) {
            case 0:
                du0 du0Var = ((SecretMediaViewer) this.f36331b.f29869b).f34250a0;
                Method method = du0Var.f41725f0;
                if (method != null) {
                    try {
                        method.invoke(du0Var, null);
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
