package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class bs0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f24915a;
    public final int f24916b;
    public final KeyEvent.Callback f24917c;

    public bs0(KeyEvent.Callback callback, int i10, int i11) {
        this.f24915a = i11;
        this.f24917c = callback;
        this.f24916b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f24915a;
        int i11 = this.f24916b;
        KeyEvent.Callback callback = this.f24917c;
        switch (i10) {
            case 0:
                au0 au0Var = (au0) callback;
                au0Var.m0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                au0Var.d0(i11);
                return true;
            default:
                f61 f61Var = (f61) callback;
                ag.b1 b1Var = f61Var.f26088k1;
                b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    b1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && b1Var.getAdapter() == f61Var.l1 && (childAt instanceof org.telegram.ui.Cells.z3)) {
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
