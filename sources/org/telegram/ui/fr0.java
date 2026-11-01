package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
public final class fr0 extends AnimatorListenerAdapter {
    public final int f37210a;
    public final org.telegram.ui.Components.sl0 f37211b;

    public fr0(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.f37210a = i10;
        this.f37211b = sl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37210a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37211b.f30331b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                dr0 dr0Var = photoViewer.T1;
                dr0Var.f41452l0 = false;
                if (dr0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) dr0Var.f41454o0.getLayoutParams()).topMargin = dr0Var.m0;
                    dr0Var.m0 = -1;
                    dr0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37211b.f30331b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37210a) {
            case 0:
                dr0 dr0Var = ((PhotoViewer) this.f37211b.f30331b).T1;
                Method method = dr0Var.f41446f0;
                if (method != null) {
                    try {
                        method.invoke(dr0Var, null);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
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
