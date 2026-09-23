package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class q41 extends AnimatorListenerAdapter {
    public final int f36285a;
    public final org.telegram.ui.Components.fm0 f36286b;

    public q41(org.telegram.ui.Components.fm0 fm0Var, int i10) {
        this.f36285a = i10;
        this.f36286b = fm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36285a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36286b.f24009b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                ut0 ut0Var = secretMediaViewer.f31408a0;
                ut0Var.f33929l0 = false;
                if (ut0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ut0Var.f33931o0.getLayoutParams()).topMargin = ut0Var.m0;
                    ut0Var.m0 = -1;
                    ut0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f36286b.f24009b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36285a) {
            case 0:
                ut0 ut0Var = ((SecretMediaViewer) this.f36286b.f24009b).f31408a0;
                Method method = ut0Var.f33923f0;
                if (method != null) {
                    try {
                        method.invoke(ut0Var, null);
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
