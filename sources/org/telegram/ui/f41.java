package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class f41 extends AnimatorListenerAdapter {
    public final int f34158a;
    public final org.telegram.ui.Components.mm0 f34159b;

    public f41(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f34158a = i10;
        this.f34159b = mm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34158a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34159b.f27076b;
                secretMediaViewer.W.getNextView().setText((CharSequence) null);
                gt0 gt0Var = secretMediaViewer.X;
                gt0Var.f38746i0 = false;
                if (gt0Var.f38747j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) gt0Var.f38749l0.getLayoutParams()).topMargin = gt0Var.f38747j0;
                    gt0Var.f38747j0 = -1;
                    gt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f34159b.f27076b).W.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34158a) {
            case 0:
                gt0 gt0Var = ((SecretMediaViewer) this.f34159b.f27076b).X;
                Method method = gt0Var.f38740c0;
                if (method != null) {
                    try {
                        method.invoke(gt0Var, null);
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
