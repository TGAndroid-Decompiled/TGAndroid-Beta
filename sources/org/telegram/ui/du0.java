package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class du0 extends AnimatorListenerAdapter {
    public final int f33087a;
    public final org.telegram.ui.Components.rm0 f33088b;

    public du0(org.telegram.ui.Components.rm0 rm0Var, int i10) {
        this.f33087a = i10;
        this.f33088b = rm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33087a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f33088b.f27933b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                bu0 bu0Var = photoViewer.T1;
                bu0Var.f36251l0 = false;
                if (bu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) bu0Var.f36253o0.getLayoutParams()).topMargin = bu0Var.m0;
                    bu0Var.m0 = -1;
                    bu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f33088b.f27933b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33087a) {
            case 0:
                bu0 bu0Var = ((PhotoViewer) this.f33088b.f27933b).T1;
                Method method = bu0Var.f36245f0;
                if (method != null) {
                    try {
                        method.invoke(bu0Var, null);
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
