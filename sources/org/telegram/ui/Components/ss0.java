package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ss0 implements ViewTreeObserver.OnPreDrawListener {
    public final rl0 f28802a;
    public final SparseBooleanArray f28803b;
    public final View f28804c;
    public final int d;
    public final yu0 e;

    public ss0(yu0 yu0Var, rl0 rl0Var, SparseBooleanArray sparseBooleanArray, u00 u00Var, int i10) {
        this.e = yu0Var;
        this.f28802a = rl0Var;
        this.f28803b = sparseBooleanArray;
        this.f28804c = u00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        yu0 yu0Var = this.e;
        yu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final rl0 rl0Var = this.f28802a;
        f2.o0 adapter = rl0Var.getAdapter();
        if (adapter != yu0Var.E && adapter != yu0Var.H && adapter != yu0Var.J && adapter != yu0Var.I) {
            int childCount = rl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = rl0Var.getChildAt(i10);
                View view = this.f28804c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(rl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / rl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    rl0 rl0Var2 = rl0Var;
                                    if (rl0Var2.a1()) {
                                        rl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    rl0 rl0Var3 = rl0Var;
                                    if (rl0Var3.a1()) {
                                        rl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    rl0 rl0Var4 = rl0Var;
                                    if (rl0Var4.a1()) {
                                        rl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    rl0Var.addView(view);
                    f2.v0 layoutManager = rl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new od0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        rl0 rl0Var2 = rl0Var;
                                        if (rl0Var2.a1()) {
                                            rl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rl0 rl0Var3 = rl0Var;
                                        if (rl0Var3.a1()) {
                                            rl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        rl0 rl0Var4 = rl0Var;
                                        if (rl0Var4.a1()) {
                                            rl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f28803b;
        if (sparseBooleanArray != null) {
            int childCount2 = rl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = rl0Var.getChildAt(i11);
                int p10 = yu0.p(childAt2);
                if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                    yu0Var.L1.put(p10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new dg.t(this, p10, rl0Var));
                    ofFloat3.addListener(new org.telegram.ui.Cells.a4(this, p10, 7));
                    ofFloat3.setStartDelay((int) ((Math.min(rl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / rl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    rl0 rl0Var2 = rl0Var;
                                    if (rl0Var2.a1()) {
                                        rl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    rl0 rl0Var3 = rl0Var;
                                    if (rl0Var3.a1()) {
                                        rl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    rl0 rl0Var4 = rl0Var;
                                    if (rl0Var4.a1()) {
                                        rl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                rl0Var.invalidate();
            }
        }
        return true;
    }
}
