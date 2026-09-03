package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class pt0 extends AnimatorListenerAdapter {
    public final int f37230a;
    public final org.telegram.ui.Components.lm0 f37231b;

    public pt0(org.telegram.ui.Components.lm0 lm0Var, int i10) {
        this.f37230a = i10;
        this.f37231b = lm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37230a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37231b.f26803b;
                photoViewer.N1.getNextView().setText((CharSequence) null);
                nt0 nt0Var = photoViewer.Q1;
                nt0Var.f32656i0 = false;
                if (nt0Var.f32657j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) nt0Var.f32659l0.getLayoutParams()).topMargin = nt0Var.f32657j0;
                    nt0Var.f32657j0 = -1;
                    nt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37231b.f26803b).N1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37230a) {
            case 0:
                nt0 nt0Var = ((PhotoViewer) this.f37231b.f26803b).Q1;
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
