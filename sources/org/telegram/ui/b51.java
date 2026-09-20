package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class b51 extends AnimatorListenerAdapter {
    public final int f32261a;
    public final org.telegram.ui.Components.qm0 f32262b;

    public b51(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.f32261a = i10;
        this.f32262b = qm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32261a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32262b.f27614b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                bu0 bu0Var = secretMediaViewer.f31721a0;
                bu0Var.f36379l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36381o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f32262b.f27614b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32261a) {
            case 0:
                bu0 bu0Var = ((SecretMediaViewer) this.f32262b.f27614b).f31721a0;
                Method method = bu0Var.f36373f0;
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
