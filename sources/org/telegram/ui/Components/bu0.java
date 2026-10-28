package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class bu0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f26915a;
    public final int f26916b;
    public final KeyEvent.Callback f26917c;

    public bu0(KeyEvent.Callback callback, int i10, int i11) {
        this.f26915a = i11;
        this.f26917c = callback;
        this.f26916b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f26915a;
        int i11 = this.f26916b;
        KeyEvent.Callback callback = this.f26917c;
        switch (i10) {
            case 0:
                bw0 bw0Var = (bw0) callback;
                bw0Var.m0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                bw0Var.b0(i11);
                return true;
            default:
                c81 c81Var = (c81) callback;
                bi.r1 r1Var = c81Var.d;
                r1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = r1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = r1Var.getChildAt(i12);
                    r1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && r1Var.getAdapter() == c81Var.e && (childAt instanceof org.telegram.ui.Cells.z3)) {
                            childAt = ((org.telegram.ui.Cells.z3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(r1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / r1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
