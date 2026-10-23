package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class tt0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f30904a;
    public final int f30905b;
    public final KeyEvent.Callback f30906c;

    public tt0(KeyEvent.Callback callback, int i10, int i11) {
        this.f30904a = i11;
        this.f30906c = callback;
        this.f30905b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f30904a;
        int i11 = this.f30905b;
        KeyEvent.Callback callback = this.f30906c;
        switch (i10) {
            case 0:
                xv0 xv0Var = (xv0) callback;
                xv0Var.f32687k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                xv0Var.V(i11);
                return true;
            default:
                s71 s71Var = (s71) callback;
                ai.u1 u1Var = s71Var.d;
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = u1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = u1Var.getChildAt(i12);
                    u1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && u1Var.getAdapter() == s71Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(u1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / u1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
