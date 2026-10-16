package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class h51 extends AnimatorListenerAdapter {
    public final int f36404a;
    public final org.telegram.ui.Components.gn0 f36405b;

    public h51(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f36404a = i10;
        this.f36405b = gn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36404a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36405b.f25057b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                hu0 hu0Var = secretMediaViewer.f32430a0;
                hu0Var.f40489l0 = false;
                if (hu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) hu0Var.f40491o0.getLayoutParams()).topMargin = hu0Var.m0;
                    hu0Var.m0 = -1;
                    hu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f36405b.f25057b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36404a) {
            case 0:
                hu0 hu0Var = ((SecretMediaViewer) this.f36405b.f25057b).f32430a0;
                Method method = hu0Var.f40483f0;
                if (method != null) {
                    try {
                        method.invoke(hu0Var, null);
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
