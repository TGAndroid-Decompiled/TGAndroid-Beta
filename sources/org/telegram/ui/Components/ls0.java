package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ls0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f30424a;
    public final int f30425b;
    public final KeyEvent.Callback f30426c;

    public ls0(KeyEvent.Callback callback, int i10, int i11) {
        this.f30424a = i11;
        this.f30426c = callback;
        this.f30425b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f30424a;
        int i11 = this.f30425b;
        KeyEvent.Callback callback = this.f30426c;
        switch (i10) {
            case 0:
                qu0 qu0Var = (qu0) callback;
                qu0Var.f32070g0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                qu0Var.U(i11);
                return true;
            default:
                f61 f61Var = (f61) callback;
                jh.e1 e1Var = f61Var.d;
                e1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = e1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = e1Var.getChildAt(i12);
                    e1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && e1Var.getAdapter() == f61Var.f28330e && (childAt instanceof org.telegram.ui.Cells.s3)) {
                            childAt = ((org.telegram.ui.Cells.s3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(e1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
