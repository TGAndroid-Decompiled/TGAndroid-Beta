package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f29033a;
    public final int f29034b;
    public final KeyEvent.Callback f29035c;

    public ts0(KeyEvent.Callback callback, int i10, int i11) {
        this.f29033a = i11;
        this.f29035c = callback;
        this.f29034b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f29033a;
        int i11 = this.f29034b;
        KeyEvent.Callback callback = this.f29035c;
        switch (i10) {
            case 0:
                yu0 yu0Var = (yu0) callback;
                yu0Var.f31120h0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                yu0Var.U(i11);
                return true;
            default:
                q61 q61Var = (q61) callback;
                lh.e1 e1Var = q61Var.d;
                e1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = e1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = e1Var.getChildAt(i12);
                    e1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && e1Var.getAdapter() == q61Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
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
