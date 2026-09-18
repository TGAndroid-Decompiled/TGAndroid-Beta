package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class vs0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f29401a;
    public final int f29402b;
    public final KeyEvent.Callback f29403c;

    public vs0(KeyEvent.Callback callback, int i10, int i11) {
        this.f29401a = i11;
        this.f29403c = callback;
        this.f29402b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f29401a;
        int i11 = this.f29402b;
        KeyEvent.Callback callback = this.f29403c;
        switch (i10) {
            case 0:
                zu0 zu0Var = (zu0) callback;
                zu0Var.f30635k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                zu0Var.U(i11);
                return true;
            default:
                p61 p61Var = (p61) callback;
                ai.w0 w0Var = p61Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i11) {
                        if (S == 1 && w0Var.getAdapter() == p61Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
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
