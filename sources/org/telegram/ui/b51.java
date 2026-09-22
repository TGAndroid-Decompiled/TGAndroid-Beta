package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class b51 extends AnimatorListenerAdapter {
    public final int f32279a;
    public final org.telegram.ui.Components.sm0 f32280b;

    public b51(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f32279a = i10;
        this.f32280b = sm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32279a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32280b.f28278b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                bu0 bu0Var = secretMediaViewer.f31742a0;
                bu0Var.f36406l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36408o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f32280b.f28278b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32279a) {
            case 0:
                bu0 bu0Var = ((SecretMediaViewer) this.f32280b.f28278b).f31742a0;
                Method method = bu0Var.f36400f0;
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
