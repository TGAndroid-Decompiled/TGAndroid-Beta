package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class d51 extends AnimatorListenerAdapter {
    public final int f31834a;
    public final org.telegram.ui.Components.om0 f31835b;

    public d51(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.f31834a = i10;
        this.f31835b = om0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31834a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f31835b.f25843b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                au0 au0Var = secretMediaViewer.f30549a0;
                au0Var.f35613l0 = false;
                if (au0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) au0Var.f35615o0.getLayoutParams()).topMargin = au0Var.m0;
                    au0Var.m0 = -1;
                    au0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f31835b.f25843b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31834a) {
            case 0:
                au0 au0Var = ((SecretMediaViewer) this.f31835b.f25843b).f30549a0;
                Method method = au0Var.f35607f0;
                if (method != null) {
                    try {
                        method.invoke(au0Var, null);
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
