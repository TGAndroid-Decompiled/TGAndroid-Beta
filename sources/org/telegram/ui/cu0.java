package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class cu0 extends AnimatorListenerAdapter {
    public final int f31778a;
    public final org.telegram.ui.Components.om0 f31779b;

    public cu0(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.f31778a = i10;
        this.f31779b = om0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31778a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f31779b.f25843b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                au0 au0Var = photoViewer.T1;
                au0Var.f35613l0 = false;
                if (au0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) au0Var.f35615o0.getLayoutParams()).topMargin = au0Var.m0;
                    au0Var.m0 = -1;
                    au0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f31779b.f25843b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31778a) {
            case 0:
                au0 au0Var = ((PhotoViewer) this.f31779b.f25843b).T1;
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
