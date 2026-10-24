package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class st0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f30622a;
    public final int f30623b;
    public final KeyEvent.Callback f30624c;

    public st0(KeyEvent.Callback callback, int i10, int i11) {
        this.f30622a = i11;
        this.f30624c = callback;
        this.f30623b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f30622a;
        int i11 = this.f30623b;
        KeyEvent.Callback callback = this.f30624c;
        switch (i10) {
            case 0:
                wv0 wv0Var = (wv0) callback;
                wv0Var.f32386k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                wv0Var.V(i11);
                return true;
            default:
                r71 r71Var = (r71) callback;
                ai.u1 u1Var = r71Var.d;
                u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = u1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = u1Var.getChildAt(i12);
                    u1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && u1Var.getAdapter() == r71Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
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
