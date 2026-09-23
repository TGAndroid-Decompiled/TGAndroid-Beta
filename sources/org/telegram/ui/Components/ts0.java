package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final ml0 f28299a;
    public final SparseBooleanArray f28300b;
    public final View f28301c;
    public final int d;
    public final yu0 e;

    public ts0(yu0 yu0Var, ml0 ml0Var, SparseBooleanArray sparseBooleanArray, u00 u00Var, int i10) {
        this.e = yu0Var;
        this.f28299a = ml0Var;
        this.f28300b = sparseBooleanArray;
        this.f28301c = u00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        yu0 yu0Var = this.e;
        yu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ml0 ml0Var = this.f28299a;
        s4.h0 adapter = ml0Var.getAdapter();
        if (adapter != yu0Var.H && adapter != yu0Var.K && adapter != yu0Var.M && adapter != yu0Var.L) {
            int childCount = ml0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ml0Var.getChildAt(i10);
                View view = this.f28301c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(ml0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ml0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    ml0 ml0Var2 = ml0Var;
                                    if (ml0Var2.b1()) {
                                        ml0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ml0 ml0Var3 = ml0Var;
                                    if (ml0Var3.b1()) {
                                        ml0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ml0 ml0Var4 = ml0Var;
                                    if (ml0Var4.b1()) {
                                        ml0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    ml0Var.addView(view);
                    s4.o0 layoutManager = ml0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new jd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        ml0 ml0Var2 = ml0Var;
                                        if (ml0Var2.b1()) {
                                            ml0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        ml0 ml0Var3 = ml0Var;
                                        if (ml0Var3.b1()) {
                                            ml0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        ml0 ml0Var4 = ml0Var;
                                        if (ml0Var4.b1()) {
                                            ml0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f28300b;
        if (sparseBooleanArray != null) {
            int childCount2 = ml0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = ml0Var.getChildAt(i11);
                int p5 = yu0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    yu0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.w4(this, p5, ml0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(ml0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ml0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    ml0 ml0Var2 = ml0Var;
                                    if (ml0Var2.b1()) {
                                        ml0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ml0 ml0Var3 = ml0Var;
                                    if (ml0Var3.b1()) {
                                        ml0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ml0 ml0Var4 = ml0Var;
                                    if (ml0Var4.b1()) {
                                        ml0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                ml0Var.invalidate();
            }
        }
        return true;
    }
}
