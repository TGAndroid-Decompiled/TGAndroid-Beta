package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class kr0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f36868a;
    public final int f36869b;
    public final KeyEvent.Callback f36870c;

    public kr0(KeyEvent.Callback callback, int i7, int i10) {
        this.f36868a = i10;
        this.f36870c = callback;
        this.f36869b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f36868a;
        int i10 = this.f36869b;
        KeyEvent.Callback callback = this.f36870c;
        switch (i7) {
            case 0:
                it0 it0Var = (it0) callback;
                it0Var.f36133n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                it0Var.e0(i10);
                return true;
            default:
                q51 q51Var = (q51) callback;
                di.b1 b1Var = q51Var.f38698o1;
                b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    b1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && b1Var.getAdapter() == q51Var.f38699p1 && (childAt instanceof org.telegram.ui.Cells.y3)) {
                            childAt = ((org.telegram.ui.Cells.y3) childAt).getTextView();
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
