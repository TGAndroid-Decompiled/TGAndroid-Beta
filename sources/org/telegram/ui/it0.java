package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class it0 extends AnimatorListenerAdapter {
    public final int f35161a;
    public final org.telegram.ui.Components.mm0 f35162b;

    public it0(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f35161a = i10;
        this.f35162b = mm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35161a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f35162b.f27076b;
                photoViewer.N1.getNextView().setText((CharSequence) null);
                gt0 gt0Var = photoViewer.Q1;
                gt0Var.f38746i0 = false;
                if (gt0Var.f38747j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) gt0Var.f38749l0.getLayoutParams()).topMargin = gt0Var.f38747j0;
                    gt0Var.f38747j0 = -1;
                    gt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f35162b.f27076b).N1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35161a) {
            case 0:
                gt0 gt0Var = ((PhotoViewer) this.f35162b.f27076b).Q1;
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
