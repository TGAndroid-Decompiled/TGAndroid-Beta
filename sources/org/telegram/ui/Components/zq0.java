package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zq0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f41089a;
    public final int f41090b;
    public final KeyEvent.Callback f41091c;

    public zq0(KeyEvent.Callback callback, int i3, int i10) {
        this.f41089a = i10;
        this.f41091c = callback;
        this.f41090b = i3;
    }

    @Override
    public final boolean onPreDraw() {
        int i3 = this.f41089a;
        int i10 = this.f41090b;
        KeyEvent.Callback callback = this.f41091c;
        switch (i3) {
            case 0:
                ws0 ws0Var = (ws0) callback;
                ws0Var.f40108n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                ws0Var.e0(i10);
                return true;
            default:
                v41 v41Var = (v41) callback;
                ci.j1 j1Var = v41Var.f38994l1;
                j1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = j1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = j1Var.getChildAt(i11);
                    j1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && j1Var.getAdapter() == v41Var.m1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(j1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / j1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
