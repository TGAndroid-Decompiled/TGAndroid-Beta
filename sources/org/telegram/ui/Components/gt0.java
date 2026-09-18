package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class gt0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f24488a;
    public final int f24489b;
    public final KeyEvent.Callback f24490c;

    public gt0(KeyEvent.Callback callback, int i10, int i11) {
        this.f24488a = i11;
        this.f24490c = callback;
        this.f24489b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f24488a;
        int i11 = this.f24489b;
        KeyEvent.Callback callback = this.f24490c;
        switch (i10) {
            case 0:
                kv0 kv0Var = (kv0) callback;
                kv0Var.f25824k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                kv0Var.U(i11);
                return true;
            default:
                d71 d71Var = (d71) callback;
                ai.w0 w0Var = d71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i11) {
                        if (S == 1 && w0Var.getAdapter() == d71Var.e && (childAt instanceof org.telegram.ui.Cells.v3)) {
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
