package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class m41 extends AnimatorListenerAdapter {
    public final int f38850a;
    public final org.telegram.ui.Components.mm0 f38851b;

    public m41(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f38850a = i10;
        this.f38851b = mm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38850a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38851b.f29180b;
                secretMediaViewer.W.getNextView().setText((CharSequence) null);
                nt0 nt0Var = secretMediaViewer.X;
                nt0Var.f35260i0 = false;
                if (nt0Var.f35261j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) nt0Var.f35263l0.getLayoutParams()).topMargin = nt0Var.f35261j0;
                    nt0Var.f35261j0 = -1;
                    nt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f38851b.f29180b).W.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38850a) {
            case 0:
                nt0 nt0Var = ((SecretMediaViewer) this.f38851b.f29180b).X;
                Method method = nt0Var.f35254c0;
                if (method != null) {
                    try {
                        method.invoke(nt0Var, null);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
