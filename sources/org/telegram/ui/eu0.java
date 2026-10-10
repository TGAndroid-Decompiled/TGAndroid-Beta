package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class eu0 extends AnimatorListenerAdapter {
    public final int f37389a;
    public final org.telegram.ui.Components.ln0 f37390b;

    public eu0(org.telegram.ui.Components.ln0 ln0Var, int i10) {
        this.f37389a = i10;
        this.f37390b = ln0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37389a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37390b.f28432b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                cu0 cu0Var = photoViewer.T1;
                cu0Var.f40939l0 = false;
                if (cu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) cu0Var.f40941o0.getLayoutParams()).topMargin = cu0Var.m0;
                    cu0Var.m0 = -1;
                    cu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37390b.f28432b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37389a) {
            case 0:
                cu0 cu0Var = ((PhotoViewer) this.f37390b.f28432b).T1;
                Method method = cu0Var.f40933f0;
                if (method != null) {
                    try {
                        method.invoke(cu0Var, null);
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
