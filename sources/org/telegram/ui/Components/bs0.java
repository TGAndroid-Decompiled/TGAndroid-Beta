package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

public final class bs0 implements ViewTreeObserver.OnPreDrawListener {

    public final int f27205a;

    public final int f27206b;

    public final KeyEvent.Callback f27207c;

    public bs0(KeyEvent.Callback callback, int i10, int i11) {
        this.f27205a = i11;
        this.f27207c = callback;
        this.f27206b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f27205a;
        int i11 = this.f27206b;
        KeyEvent.Callback callback = this.f27207c;
        switch (i10) {
            case 0:
                hu0 hu0Var = (hu0) callback;
                hu0Var.f29122g0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                hu0Var.U(i11);
                break;
            default:
                u51 u51Var = (u51) callback;
                hh.f1 f1Var = u51Var.d;
                f1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = f1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = f1Var.getChildAt(i12);
                    f1Var.getClass();
                    int iR = RecyclerView.R(childAt);
                    if (iR >= i11) {
                        if (iR == 1 && f1Var.getAdapter() == u51Var.f32979e && (childAt instanceof org.telegram.ui.Cells.s3)) {
                            childAt = ((org.telegram.ui.Cells.s3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        int iMin = (int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / f1Var.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(iMin);
                        objectAnimatorOfFloat.setDuration(200L);
                        animatorSet.playTogether(objectAnimatorOfFloat);
                    }
                }
                animatorSet.start();
                break;
        }
        return true;
    }
}
