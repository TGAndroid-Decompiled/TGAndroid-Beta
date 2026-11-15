package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class br0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33352a;
    public final int f33353b;
    public final KeyEvent.Callback f33354c;

    public br0(KeyEvent.Callback callback, int i7, int i10) {
        this.f33352a = i10;
        this.f33354c = callback;
        this.f33353b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f33352a;
        int i10 = this.f33353b;
        KeyEvent.Callback callback = this.f33354c;
        switch (i7) {
            case 0:
                ys0 ys0Var = (ys0) callback;
                ys0Var.f42117n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                ys0Var.e0(i10);
                return true;
            default:
                e51 e51Var = (e51) callback;
                di.c1 c1Var = e51Var.f34204o1;
                c1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = c1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = c1Var.getChildAt(i11);
                    c1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && c1Var.getAdapter() == e51Var.f34205p1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(c1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / c1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
