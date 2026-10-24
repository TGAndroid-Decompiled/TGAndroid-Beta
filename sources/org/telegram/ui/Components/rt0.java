package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class rt0 implements ViewTreeObserver.OnPreDrawListener {
    public final lm0 f30270a;
    public final SparseBooleanArray f30271b;
    public final View f30272c;
    public final int d;
    public final wv0 e;

    public rt0(wv0 wv0Var, lm0 lm0Var, SparseBooleanArray sparseBooleanArray, z00 z00Var, int i10) {
        this.e = wv0Var;
        this.f30270a = lm0Var;
        this.f30271b = sparseBooleanArray;
        this.f30272c = z00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        wv0 wv0Var = this.e;
        wv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final lm0 lm0Var = this.f30270a;
        s4.g0 adapter = lm0Var.getAdapter();
        if (adapter != wv0Var.H && adapter != wv0Var.K && adapter != wv0Var.M && adapter != wv0Var.L) {
            int childCount = lm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = lm0Var.getChildAt(i10);
                View view = this.f30272c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(lm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / lm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    lm0 lm0Var2 = lm0Var;
                                    if (lm0Var2.c1()) {
                                        lm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    lm0 lm0Var3 = lm0Var;
                                    if (lm0Var3.c1()) {
                                        lm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    lm0 lm0Var4 = lm0Var;
                                    if (lm0Var4.c1()) {
                                        lm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    lm0Var.addView(view);
                    s4.n0 layoutManager = lm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new g60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        lm0 lm0Var2 = lm0Var;
                                        if (lm0Var2.c1()) {
                                            lm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        lm0 lm0Var3 = lm0Var;
                                        if (lm0Var3.c1()) {
                                            lm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        lm0 lm0Var4 = lm0Var;
                                        if (lm0Var4.c1()) {
                                            lm0Var4.invalidate();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        ofFloat2.start();
                    }
                }
            }
            animatorSet.start();
            return true;
        }
        SparseBooleanArray sparseBooleanArray = this.f30271b;
        if (sparseBooleanArray != null) {
            int childCount2 = lm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int q6 = wv0.q(lm0Var.getChildAt(i11));
                if (q6 != 0 && sparseBooleanArray.get(q6, false)) {
                    wv0Var.P1.put(q6, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ei.o4(this, q6, lm0Var));
                    ofFloat3.addListener(new gi.p2(this, q6, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(lm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / lm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    lm0 lm0Var2 = lm0Var;
                                    if (lm0Var2.c1()) {
                                        lm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    lm0 lm0Var3 = lm0Var;
                                    if (lm0Var3.c1()) {
                                        lm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    lm0 lm0Var4 = lm0Var;
                                    if (lm0Var4.c1()) {
                                        lm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                lm0Var.invalidate();
            }
        }
        return true;
    }
}
