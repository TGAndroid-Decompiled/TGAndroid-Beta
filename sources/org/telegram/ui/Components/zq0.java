package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zq0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f41107a;
    public final int f41108b;
    public final KeyEvent.Callback f41109c;

    public zq0(KeyEvent.Callback callback, int i7, int i10) {
        this.f41107a = i10;
        this.f41109c = callback;
        this.f41108b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f41107a;
        int i10 = this.f41108b;
        KeyEvent.Callback callback = this.f41109c;
        switch (i7) {
            case 0:
                xs0 xs0Var = (xs0) callback;
                xs0Var.m0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                xs0Var.e0(i10);
                return true;
            default:
                b51 b51Var = (b51) callback;
                bi.q1 q1Var = b51Var.f32022k1;
                q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = q1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    q1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && q1Var.getAdapter() == b51Var.l1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
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
