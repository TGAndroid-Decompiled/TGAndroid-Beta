package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class yt0 implements ViewTreeObserver.OnPreDrawListener {
    public final sm0 f33332a;
    public final SparseBooleanArray f33333b;
    public final View f33334c;
    public final int d;
    public final dw0 f33335e;

    public yt0(dw0 dw0Var, sm0 sm0Var, SparseBooleanArray sparseBooleanArray, k10 k10Var, int i10) {
        this.f33335e = dw0Var;
        this.f33332a = sm0Var;
        this.f33333b = sparseBooleanArray;
        this.f33334c = k10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        dw0 dw0Var = this.f33335e;
        dw0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final sm0 sm0Var = this.f33332a;
        s4.i0 adapter = sm0Var.getAdapter();
        if (adapter != dw0Var.H && adapter != dw0Var.K && adapter != dw0Var.M && adapter != dw0Var.L) {
            int childCount = sm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = sm0Var.getChildAt(i10);
                View view = this.f33334c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(sm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / sm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    sm0 sm0Var2 = sm0Var;
                                    if (sm0Var2.b1()) {
                                        sm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    sm0 sm0Var3 = sm0Var;
                                    if (sm0Var3.b1()) {
                                        sm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    sm0 sm0Var4 = sm0Var;
                                    if (sm0Var4.b1()) {
                                        sm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    sm0Var.addView(view);
                    s4.p0 layoutManager = sm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new wd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        sm0 sm0Var2 = sm0Var;
                                        if (sm0Var2.b1()) {
                                            sm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        sm0 sm0Var3 = sm0Var;
                                        if (sm0Var3.b1()) {
                                            sm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        sm0 sm0Var4 = sm0Var;
                                        if (sm0Var4.b1()) {
                                            sm0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f33333b;
        if (sparseBooleanArray != null) {
            int childCount2 = sm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int p5 = dw0.p(sm0Var.getChildAt(i11));
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    dw0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.v4(this, p5, sm0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(sm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / sm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    sm0 sm0Var2 = sm0Var;
                                    if (sm0Var2.b1()) {
                                        sm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    sm0 sm0Var3 = sm0Var;
                                    if (sm0Var3.b1()) {
                                        sm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    sm0 sm0Var4 = sm0Var;
                                    if (sm0Var4.b1()) {
                                        sm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                sm0Var.invalidate();
            }
        }
        return true;
    }
}
