package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class br0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f32395a;
    public final int f32396b;
    public final KeyEvent.Callback f32397c;

    public br0(KeyEvent.Callback callback, int i7, int i10) {
        this.f32395a = i10;
        this.f32397c = callback;
        this.f32396b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f32395a;
        int i10 = this.f32396b;
        KeyEvent.Callback callback = this.f32397c;
        switch (i7) {
            case 0:
                zs0 zs0Var = (zs0) callback;
                zs0Var.m0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                zs0Var.e0(i10);
                return true;
            default:
                c51 c51Var = (c51) callback;
                bi.q1 q1Var = c51Var.f32530k1;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = q1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    q1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && q1Var.getAdapter() == c51Var.l1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
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
