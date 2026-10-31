package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f24455a;
    public final int f24456b;
    public final KeyEvent.Callback f24457c;

    public as0(KeyEvent.Callback callback, int i10, int i11) {
        this.f24455a = i11;
        this.f24457c = callback;
        this.f24456b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f24455a;
        int i11 = this.f24456b;
        KeyEvent.Callback callback = this.f24457c;
        switch (i10) {
            case 0:
                zt0 zt0Var = (zt0) callback;
                zt0Var.m0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                zt0Var.c0(i11);
                return true;
            default:
                e61 e61Var = (e61) callback;
                ag.b1 b1Var = e61Var.f25719k1;
                b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    b1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && b1Var.getAdapter() == e61Var.l1 && (childAt instanceof org.telegram.ui.Cells.z3)) {
                            childAt = ((org.telegram.ui.Cells.z3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(b1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / b1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
