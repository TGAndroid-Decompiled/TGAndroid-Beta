package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class eu0 extends AnimatorListenerAdapter {
    public final int f37343a;
    public final org.telegram.ui.Components.kn0 f37344b;

    public eu0(org.telegram.ui.Components.kn0 kn0Var, int i10) {
        this.f37343a = i10;
        this.f37344b = kn0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37343a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37344b.f28114b;
                photoViewer.Q1.getNextView().setText((CharSequence) null);
                cu0 cu0Var = photoViewer.T1;
                cu0Var.f40893l0 = false;
                if (cu0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) cu0Var.f40895o0.getLayoutParams()).topMargin = cu0Var.m0;
                    cu0Var.m0 = -1;
                    cu0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f37344b.f28114b).Q1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37343a) {
            case 0:
                cu0 cu0Var = ((PhotoViewer) this.f37344b.f28114b).T1;
                Method method = cu0Var.f40887f0;
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
