package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class m41 extends AnimatorListenerAdapter {
    public final int f35975a;
    public final org.telegram.ui.Components.lm0 f35976b;

    public m41(org.telegram.ui.Components.lm0 lm0Var, int i10) {
        this.f35975a = i10;
        this.f35976b = lm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35975a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35976b.f26803b;
                secretMediaViewer.W.getNextView().setText((CharSequence) null);
                nt0 nt0Var = secretMediaViewer.X;
                nt0Var.f32656i0 = false;
                if (nt0Var.f32657j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) nt0Var.f32659l0.getLayoutParams()).topMargin = nt0Var.f32657j0;
                    nt0Var.f32657j0 = -1;
                    nt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f35976b.f26803b).W.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35975a) {
            case 0:
                nt0 nt0Var = ((SecretMediaViewer) this.f35976b.f26803b).X;
                Method method = nt0Var.f32650c0;
                if (method != null) {
                    try {
                        method.invoke(nt0Var, null);
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
