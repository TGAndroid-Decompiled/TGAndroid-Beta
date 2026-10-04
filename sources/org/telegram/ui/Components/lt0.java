package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class lt0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f28429a;
    public final int f28430b;
    public final KeyEvent.Callback f28431c;

    public lt0(KeyEvent.Callback callback, int i10, int i11) {
        this.f28429a = i11;
        this.f28431c = callback;
        this.f28430b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f28429a;
        int i11 = this.f28430b;
        KeyEvent.Callback callback = this.f28431c;
        switch (i10) {
            case 0:
                pv0 pv0Var = (pv0) callback;
                pv0Var.f29777k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                pv0Var.U(i11);
                return true;
            default:
                n71 n71Var = (n71) callback;
                ai.w0 w0Var = n71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && w0Var.getAdapter() == n71Var.f28890e && (childAt instanceof org.telegram.ui.Cells.v3)) {
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
