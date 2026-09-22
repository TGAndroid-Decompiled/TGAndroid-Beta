package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ht0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f24888a;
    public final int f24889b;
    public final KeyEvent.Callback f24890c;

    public ht0(KeyEvent.Callback callback, int i10, int i11) {
        this.f24888a = i11;
        this.f24890c = callback;
        this.f24889b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f24888a;
        int i11 = this.f24889b;
        KeyEvent.Callback callback = this.f24890c;
        switch (i10) {
            case 0:
                lv0 lv0Var = (lv0) callback;
                lv0Var.f26210k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                lv0Var.U(i11);
                return true;
            default:
                e71 e71Var = (e71) callback;
                ai.w0 w0Var = e71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i11) {
                        if (S == 1 && w0Var.getAdapter() == e71Var.e && (childAt instanceof org.telegram.ui.Cells.w3)) {
                            childAt = ((org.telegram.ui.Cells.w3) childAt).getTextView();
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
