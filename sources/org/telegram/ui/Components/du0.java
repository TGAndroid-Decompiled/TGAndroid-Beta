package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class du0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f25462a;
    public final int f25463b;
    public final KeyEvent.Callback f25464c;

    public du0(KeyEvent.Callback callback, int i10, int i11) {
        this.f25462a = i11;
        this.f25464c = callback;
        this.f25463b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f25462a;
        int i11 = this.f25463b;
        KeyEvent.Callback callback = this.f25464c;
        switch (i10) {
            case 0:
                hw0 hw0Var = (hw0) callback;
                hw0Var.f26948k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                hw0Var.U(i11);
                return true;
            default:
                y71 y71Var = (y71) callback;
                ai.w0 w0Var = y71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && w0Var.getAdapter() == y71Var.f32971e && (childAt instanceof org.telegram.ui.Cells.v3)) {
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
