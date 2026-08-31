package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class us0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f31724a;
    public final int f31725b;
    public final KeyEvent.Callback f31726c;

    public us0(KeyEvent.Callback callback, int i10, int i11) {
        this.f31724a = i11;
        this.f31726c = callback;
        this.f31725b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f31724a;
        int i11 = this.f31725b;
        KeyEvent.Callback callback = this.f31726c;
        switch (i10) {
            case 0:
                zu0 zu0Var = (zu0) callback;
                zu0Var.f33980h0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                zu0Var.U(i11);
                return true;
            default:
                s61 s61Var = (s61) callback;
                mh.d1 d1Var = s61Var.d;
                d1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = d1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = d1Var.getChildAt(i12);
                    d1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && d1Var.getAdapter() == s61Var.f30989e && (childAt instanceof org.telegram.ui.Cells.u3)) {
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
