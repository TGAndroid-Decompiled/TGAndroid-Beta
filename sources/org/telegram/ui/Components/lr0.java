package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class lr0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f37262a;
    public final int f37263b;
    public final KeyEvent.Callback f37264c;

    public lr0(KeyEvent.Callback callback, int i7, int i10) {
        this.f37262a = i10;
        this.f37264c = callback;
        this.f37263b = i7;
    }

    @Override
    public final boolean onPreDraw() {
        int i7 = this.f37262a;
        int i10 = this.f37263b;
        KeyEvent.Callback callback = this.f37264c;
        switch (i7) {
            case 0:
                jt0 jt0Var = (jt0) callback;
                jt0Var.f36656n0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                jt0Var.e0(i10);
                return true;
            default:
                r51 r51Var = (r51) callback;
                di.b1 b1Var = r51Var.f39072o1;
                b1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    b1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && b1Var.getAdapter() == r51Var.f39073p1 && (childAt instanceof org.telegram.ui.Cells.y3)) {
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
