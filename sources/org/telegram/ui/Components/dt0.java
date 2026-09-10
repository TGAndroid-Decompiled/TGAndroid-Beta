package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class dt0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f22478a;
    public final int f22479b;
    public final KeyEvent.Callback f22480c;

    public dt0(KeyEvent.Callback callback, int i10, int i11) {
        this.f22478a = i11;
        this.f22480c = callback;
        this.f22479b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f22478a;
        int i11 = this.f22479b;
        KeyEvent.Callback callback = this.f22480c;
        switch (i10) {
            case 0:
                iv0 iv0Var = (iv0) callback;
                iv0Var.f24107k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                iv0Var.U(i11);
                return true;
            default:
                b71 b71Var = (b71) callback;
                bi.y1 y1Var = b71Var.d;
                y1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = y1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = y1Var.getChildAt(i12);
                    y1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i11) {
                        if (R == 1 && y1Var.getAdapter() == b71Var.e && (childAt instanceof org.telegram.ui.Cells.u3)) {
                            childAt = ((org.telegram.ui.Cells.u3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(y1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / y1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
