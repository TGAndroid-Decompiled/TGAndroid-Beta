package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ft0 implements ViewTreeObserver.OnPreDrawListener {
    public final int f24185a;
    public final int f24186b;
    public final KeyEvent.Callback f24187c;

    public ft0(KeyEvent.Callback callback, int i10, int i11) {
        this.f24185a = i11;
        this.f24187c = callback;
        this.f24186b = i10;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f24185a;
        int i11 = this.f24186b;
        KeyEvent.Callback callback = this.f24187c;
        switch (i10) {
            case 0:
                jv0 jv0Var = (jv0) callback;
                jv0Var.f25504k0[i11].getViewTreeObserver().removeOnPreDrawListener(this);
                jv0Var.U(i11);
                return true;
            default:
                c71 c71Var = (c71) callback;
                ai.w0 w0Var = c71Var.d;
                w0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = w0Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = w0Var.getChildAt(i12);
                    w0Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i11) {
                        if (S == 1 && w0Var.getAdapter() == c71Var.e && (childAt instanceof org.telegram.ui.Cells.w3)) {
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
