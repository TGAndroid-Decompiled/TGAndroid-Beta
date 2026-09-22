package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class gt0 implements ViewTreeObserver.OnPreDrawListener {
    public final yl0 f24619a;
    public final SparseBooleanArray f24620b;
    public final View f24621c;
    public final int d;
    public final lv0 e;

    public gt0(lv0 lv0Var, yl0 yl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = lv0Var;
        this.f24619a = yl0Var;
        this.f24620b = sparseBooleanArray;
        this.f24621c = t00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        lv0 lv0Var = this.e;
        lv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final yl0 yl0Var = this.f24619a;
        s4.h0 adapter = yl0Var.getAdapter();
        if (adapter != lv0Var.H && adapter != lv0Var.K && adapter != lv0Var.M && adapter != lv0Var.L) {
            int childCount = yl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yl0Var.getChildAt(i10);
                View view = this.f24621c;
                if (childAt != view && RecyclerView.S(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(yl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / yl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    yl0 yl0Var2 = yl0Var;
                                    if (yl0Var2.c1()) {
                                        yl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    yl0 yl0Var3 = yl0Var;
                                    if (yl0Var3.c1()) {
                                        yl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    yl0 yl0Var4 = yl0Var;
                                    if (yl0Var4.c1()) {
                                        yl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    yl0Var.addView(view);
                    s4.o0 layoutManager = yl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new gd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        yl0 yl0Var2 = yl0Var;
                                        if (yl0Var2.c1()) {
                                            yl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        yl0 yl0Var3 = yl0Var;
                                        if (yl0Var3.c1()) {
                                            yl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        yl0 yl0Var4 = yl0Var;
                                        if (yl0Var4.c1()) {
                                            yl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f24620b;
        if (sparseBooleanArray != null) {
            int childCount2 = yl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = yl0Var.getChildAt(i11);
                int p5 = lv0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    lv0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.x4(this, p5, yl0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(yl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / yl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    yl0 yl0Var2 = yl0Var;
                                    if (yl0Var2.c1()) {
                                        yl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    yl0 yl0Var3 = yl0Var;
                                    if (yl0Var3.c1()) {
                                        yl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    yl0 yl0Var4 = yl0Var;
                                    if (yl0Var4.c1()) {
                                        yl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                yl0Var.invalidate();
            }
        }
        return true;
    }
}
