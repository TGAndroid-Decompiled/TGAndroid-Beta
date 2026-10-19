package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class n31 extends AnimatorListenerAdapter {
    public final int f39401a;
    public final org.telegram.ui.Components.cn0 f39402b;

    public n31(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f39401a = i10;
        this.f39402b = cn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39401a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39402b.f25289b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                ht0 ht0Var = secretMediaViewer.f33776a0;
                ht0Var.f42046l0 = false;
                if (ht0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ht0Var.f42048o0.getLayoutParams()).topMargin = ht0Var.m0;
                    ht0Var.m0 = -1;
                    ht0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f39402b.f25289b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39401a) {
            case 0:
                ht0 ht0Var = ((SecretMediaViewer) this.f39402b.f25289b).f33776a0;
                Method method = ht0Var.f42040f0;
                if (method != null) {
                    try {
                        method.invoke(ht0Var, null);
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
