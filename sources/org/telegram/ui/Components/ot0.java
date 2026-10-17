package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ot0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f29065a;
    public final int f29066b;
    public final KeyEvent.Callback f29067c;

    public ot0(KeyEvent.Callback callback, int i10, int i11) {
        this.f29065a = i11;
        this.f29067c = callback;
        this.f29066b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f29065a;
        int i11 = this.f29066b;
        KeyEvent.Callback callback = this.f29067c;
        switch (i10) {
            case 0:
                sv0 sv0Var = (sv0) callback;
                sv0Var.f30364k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                sv0Var.U(i11);
                return true;
            default:
                j71 j71Var = (j71) callback;
                ai.u1 u1Var = j71Var.d;
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = u1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = u1Var.getChildAt(i12);
                    u1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && u1Var.getAdapter() == j71Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
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
