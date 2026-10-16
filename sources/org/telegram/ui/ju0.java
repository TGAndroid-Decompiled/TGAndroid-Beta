package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class ju0 extends AnimatorListenerAdapter {
    public final int f37142a;
    public final org.telegram.ui.Components.gn0 f37143b;

    public ju0(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f37142a = i10;
        this.f37143b = gn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37142a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37143b.f25057b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                hu0 hu0Var = photoViewer.T1;
                hu0Var.f40489l0 = false;
                if (hu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) hu0Var.f40491o0.getLayoutParams()).topMargin = hu0Var.m0;
                    hu0Var.m0 = -1;
                    hu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37143b.f25057b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37142a) {
            case 0:
                hu0 hu0Var = ((PhotoViewer) this.f37143b.f25057b).T1;
                Method method = hu0Var.f40483f0;
                if (method != null) {
                    try {
                        method.invoke(hu0Var, null);
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
