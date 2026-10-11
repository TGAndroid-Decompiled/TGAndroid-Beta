package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class yt0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f33458a;
    public final int f33459b;
    public final KeyEvent.Callback f33460c;

    public yt0(KeyEvent.Callback callback, int i10, int i11) {
        this.f33458a = i11;
        this.f33460c = callback;
        this.f33459b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f33458a;
        int i11 = this.f33459b;
        KeyEvent.Callback callback = this.f33460c;
        switch (i10) {
            case 0:
                cw0 cw0Var = (cw0) callback;
                cw0Var.f25512k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                cw0Var.U(i11);
                return true;
            default:
                u71 u71Var = (u71) callback;
                ai.w0 w0Var = u71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && w0Var.getAdapter() == u71Var.f31468e && (childAt instanceof org.telegram.ui.Cells.v3)) {
                            childAt = ((org.telegram.ui.Cells.v3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(w0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / w0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
