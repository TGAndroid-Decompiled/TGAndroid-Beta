package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f26894a;
    public final int f26895b;
    public final KeyEvent.Callback f26896c;

    public as0(KeyEvent.Callback callback, int i9, int i10) {
        this.f26894a = i10;
        this.f26896c = callback;
        this.f26895b = i9;
    }

    @Override
    public final boolean onPreDraw() {
        int i9 = this.f26894a;
        int i10 = this.f26895b;
        KeyEvent.Callback callback = this.f26896c;
        switch (i9) {
            case 0:
                eu0 eu0Var = (eu0) callback;
                eu0Var.f28137g0[i10].getViewTreeObserver().removeOnPreDrawListener(this);
                eu0Var.U(i10);
                return true;
            default:
                s51 s51Var = (s51) callback;
                gh.f1 f1Var = s51Var.d;
                f1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = f1Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = f1Var.getChildAt(i11);
                    f1Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i10) {
                        if (R == 1 && f1Var.getAdapter() == s51Var.f32371e && (childAt instanceof org.telegram.ui.Cells.v3)) {
                            childAt = ((org.telegram.ui.Cells.v3) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / f1Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
