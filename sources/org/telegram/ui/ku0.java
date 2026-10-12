package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class ku0 extends AnimatorListenerAdapter {
    public final int f37741a;
    public final org.telegram.ui.Components.gn0 f37742b;

    public ku0(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f37741a = i10;
        this.f37742b = gn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37741a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37742b.f25369b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                iu0 iu0Var = photoViewer.T1;
                iu0Var.f41083l0 = false;
                if (iu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) iu0Var.f41085o0.getLayoutParams()).topMargin = iu0Var.m0;
                    iu0Var.m0 = -1;
                    iu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37742b.f25369b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37741a) {
            case 0:
                iu0 iu0Var = ((PhotoViewer) this.f37742b.f25369b).T1;
                Method method = iu0Var.f41077f0;
                if (method != null) {
                    try {
                        method.invoke(iu0Var, null);
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
