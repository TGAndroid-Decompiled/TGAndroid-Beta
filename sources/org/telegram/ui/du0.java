package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class du0 extends AnimatorListenerAdapter {
    public final int f37102a;
    public final org.telegram.ui.Components.mn0 f37103b;

    public du0(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.f37102a = i10;
        this.f37103b = mn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37102a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37103b.f28805b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                bu0 bu0Var = photoViewer.T1;
                bu0Var.f40622l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f40624o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37103b.f28805b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37102a) {
            case 0:
                bu0 bu0Var = ((PhotoViewer) this.f37103b.f28805b).T1;
                Method method = bu0Var.f40616f0;
                if (method != null) {
                    try {
                        method.invoke(bu0Var, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
