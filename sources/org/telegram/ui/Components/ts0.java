package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f31404a;
    public final int f31405b;
    public final KeyEvent.Callback f31406c;

    public ts0(KeyEvent.Callback callback, int i10, int i11) {
        this.f31404a = i11;
        this.f31406c = callback;
        this.f31405b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f31404a;
        int i11 = this.f31405b;
        KeyEvent.Callback callback = this.f31406c;
        switch (i10) {
            case 0:
                yu0 yu0Var = (yu0) callback;
                yu0Var.f33625h0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                yu0Var.U(i11);
                return true;
            default:
                r61 r61Var = (r61) callback;
                mh.d1 d1Var = r61Var.d;
                d1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = d1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = d1Var.getChildAt(i12);
                    d1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && d1Var.getAdapter() == r61Var.f30666e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(d1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / d1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
