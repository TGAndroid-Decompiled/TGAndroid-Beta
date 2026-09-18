package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class fu0 extends AnimatorListenerAdapter {
    public final int f33762a;
    public final org.telegram.ui.Components.fm0 f33763b;

    public fu0(org.telegram.ui.Components.fm0 fm0Var, int i10) {
        this.f33762a = i10;
        this.f33763b = fm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33762a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f33763b.f23966b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                du0 du0Var = photoViewer.T1;
                du0Var.f37037l0 = false;
                if (du0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) du0Var.f37039o0.getLayoutParams()).topMargin = du0Var.m0;
                    du0Var.m0 = -1;
                    du0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f33763b.f23966b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33762a) {
            case 0:
                du0 du0Var = ((PhotoViewer) this.f33763b.f23966b).T1;
                Method method = du0Var.f37031f0;
                if (method != null) {
                    try {
                        method.invoke(du0Var, null);
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
