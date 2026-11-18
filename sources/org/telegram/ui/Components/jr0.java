package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class jr0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f36517a;
    public final int f36518b;
    public final KeyEvent.Callback f36519c;

    public jr0(KeyEvent.Callback callback, int i7, int i10) {
        this.f36517a = i10;
        this.f36519c = callback;
        this.f36518b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f36517a;
        int i10 = this.f36518b;
        KeyEvent.Callback callback = this.f36519c;
        switch (i7) {
            case 0:
                gt0 gt0Var = (gt0) callback;
                gt0Var.f35609n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                gt0Var.e0(i10);
                return true;
            default:
                o51 o51Var = (o51) callback;
                di.b1 b1Var = o51Var.f37984o1;
                b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    b1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && b1Var.getAdapter() == o51Var.f37985p1 && (childAt instanceof org.telegram.ui.Cells.x3)) {
                            childAt = ((org.telegram.ui.Cells.x3) childAt).getTextView();
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
