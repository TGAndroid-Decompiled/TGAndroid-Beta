package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class au0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f26620a;
    public final int f26621b;
    public final KeyEvent.Callback f26622c;

    public au0(KeyEvent.Callback callback, int i10, int i11) {
        this.f26620a = i11;
        this.f26622c = callback;
        this.f26621b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f26620a;
        int i11 = this.f26621b;
        KeyEvent.Callback callback = this.f26622c;
        switch (i10) {
            case 0:
                aw0 aw0Var = (aw0) callback;
                aw0Var.m0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                aw0Var.b0(i11);
                return true;
            default:
                b81 b81Var = (b81) callback;
                bi.r1 r1Var = b81Var.d;
                r1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = r1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = r1Var.getChildAt(i12);
                    r1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && r1Var.getAdapter() == b81Var.e && (childAt instanceof org.telegram.ui.Cells.z3)) {
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
