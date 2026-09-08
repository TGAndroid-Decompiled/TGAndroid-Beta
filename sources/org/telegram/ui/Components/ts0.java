package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f30722a;
    public final int f30723b;
    public final KeyEvent.Callback f30724c;

    public ts0(KeyEvent.Callback callback, int i10, int i11) {
        this.f30722a = i11;
        this.f30724c = callback;
        this.f30723b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f30722a;
        int i11 = this.f30723b;
        KeyEvent.Callback callback = this.f30724c;
        switch (i10) {
            case 0:
                xu0 xu0Var = (xu0) callback;
                xu0Var.f32729k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                xu0Var.U(i11);
                return true;
            default:
                o61 o61Var = (o61) callback;
                bi.o0 o0Var = o61Var.d;
                o0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = o0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = o0Var.getChildAt(i12);
                    o0Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && o0Var.getAdapter() == o61Var.f29004e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
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
