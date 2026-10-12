package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class h51 extends AnimatorListenerAdapter {
    public final int f36614a;
    public final org.telegram.ui.Components.gn0 f36615b;

    public h51(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f36614a = i10;
        this.f36615b = gn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36614a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36615b.f25369b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                iu0 iu0Var = secretMediaViewer.f32728a0;
                iu0Var.f41083l0 = false;
                if (iu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) iu0Var.f41085o0.getLayoutParams()).topMargin = iu0Var.m0;
                    iu0Var.m0 = -1;
                    iu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f36615b.f25369b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36614a) {
            case 0:
                iu0 iu0Var = ((SecretMediaViewer) this.f36615b.f25369b).f32728a0;
                Method method = iu0Var.f41077f0;
                if (method != null) {
                    try {
                        method.invoke(iu0Var, null);
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
