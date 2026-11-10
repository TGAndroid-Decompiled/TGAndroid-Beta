package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ar0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f31978a;
    public final int f31979b;
    public final KeyEvent.Callback f31980c;

    public ar0(KeyEvent.Callback callback, int i7, int i10) {
        this.f31978a = i10;
        this.f31980c = callback;
        this.f31979b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f31978a;
        int i10 = this.f31979b;
        KeyEvent.Callback callback = this.f31980c;
        switch (i7) {
            case 0:
                ys0 ys0Var = (ys0) callback;
                ys0Var.m0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                ys0Var.e0(i10);
                return true;
            default:
                c51 c51Var = (c51) callback;
                bi.q1 q1Var = c51Var.n1;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = q1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    q1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && q1Var.getAdapter() == c51Var.f32464o1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(q1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / q1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
