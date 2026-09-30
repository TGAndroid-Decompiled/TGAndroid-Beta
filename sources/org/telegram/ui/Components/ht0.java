package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ht0 implements ViewTreeObserver.OnPreDrawListener {
    public final zl0 f24940a;
    public final SparseBooleanArray f24941b;
    public final View f24942c;
    public final int d;
    public final mv0 e;

    public ht0(mv0 mv0Var, zl0 zl0Var, SparseBooleanArray sparseBooleanArray, w00 w00Var, int i10) {
        this.e = mv0Var;
        this.f24940a = zl0Var;
        this.f24941b = sparseBooleanArray;
        this.f24942c = w00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        mv0 mv0Var = this.e;
        mv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final zl0 zl0Var = this.f24940a;
        s4.h0 adapter = zl0Var.getAdapter();
        if (adapter != mv0Var.H && adapter != mv0Var.K && adapter != mv0Var.M && adapter != mv0Var.L) {
            int childCount = zl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zl0Var.getChildAt(i10);
                View view = this.f24942c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(zl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / zl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    zl0 zl0Var2 = zl0Var;
                                    if (zl0Var2.c1()) {
                                        zl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    zl0 zl0Var3 = zl0Var;
                                    if (zl0Var3.c1()) {
                                        zl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    zl0 zl0Var4 = zl0Var;
                                    if (zl0Var4.c1()) {
                                        zl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    zl0Var.addView(view);
                    s4.o0 layoutManager = zl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new id0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        zl0 zl0Var2 = zl0Var;
                                        if (zl0Var2.c1()) {
                                            zl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        zl0 zl0Var3 = zl0Var;
                                        if (zl0Var3.c1()) {
                                            zl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        zl0 zl0Var4 = zl0Var;
                                        if (zl0Var4.c1()) {
                                            zl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f24941b;
        if (sparseBooleanArray != null) {
            int childCount2 = zl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = zl0Var.getChildAt(i11);
                int p5 = mv0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    mv0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.w4(this, p5, zl0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(zl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / zl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    zl0 zl0Var2 = zl0Var;
                                    if (zl0Var2.c1()) {
                                        zl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    zl0 zl0Var3 = zl0Var;
                                    if (zl0Var3.c1()) {
                                        zl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    zl0 zl0Var4 = zl0Var;
                                    if (zl0Var4.c1()) {
                                        zl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                zl0Var.invalidate();
            }
        }
        return true;
    }
}
