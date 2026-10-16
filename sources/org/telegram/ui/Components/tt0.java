package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class tt0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f29189a;
    public final int f29190b;
    public final KeyEvent.Callback f29191c;

    public tt0(KeyEvent.Callback callback, int i10, int i11) {
        this.f29189a = i11;
        this.f29191c = callback;
        this.f29190b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f29189a;
        int i11 = this.f29190b;
        KeyEvent.Callback callback = this.f29191c;
        switch (i10) {
            case 0:
                xv0 xv0Var = (xv0) callback;
                xv0Var.f31045k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                xv0Var.U(i11);
                return true;
            default:
                r71 r71Var = (r71) callback;
                bi.o0 o0Var = r71Var.d;
                o0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = o0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = o0Var.getChildAt(i12);
                    o0Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && o0Var.getAdapter() == r71Var.e && (childAt instanceof org.telegram.ui.Cells.v3)) {
                            childAt = ((org.telegram.ui.Cells.v3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(o0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / o0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
