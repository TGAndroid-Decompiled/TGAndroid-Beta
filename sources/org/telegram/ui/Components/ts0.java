package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ts0 implements ViewTreeObserver.OnPreDrawListener {
    public final ll0 f28181a;
    public final SparseBooleanArray f28182b;
    public final View f28183c;
    public final int d;
    public final yu0 e;

    public ts0(yu0 yu0Var, ll0 ll0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = yu0Var;
        this.f28181a = ll0Var;
        this.f28182b = sparseBooleanArray;
        this.f28183c = t00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        yu0 yu0Var = this.e;
        yu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ll0 ll0Var = this.f28181a;
        s4.h0 adapter = ll0Var.getAdapter();
        if (adapter != yu0Var.H && adapter != yu0Var.K && adapter != yu0Var.M && adapter != yu0Var.L) {
            int childCount = ll0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ll0Var.getChildAt(i10);
                View view = this.f28183c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(ll0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ll0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    ll0 ll0Var2 = ll0Var;
                                    if (ll0Var2.b1()) {
                                        ll0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ll0 ll0Var3 = ll0Var;
                                    if (ll0Var3.b1()) {
                                        ll0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ll0 ll0Var4 = ll0Var;
                                    if (ll0Var4.b1()) {
                                        ll0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    ll0Var.addView(view);
                    s4.o0 layoutManager = ll0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new jd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        ll0 ll0Var2 = ll0Var;
                                        if (ll0Var2.b1()) {
                                            ll0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        ll0 ll0Var3 = ll0Var;
                                        if (ll0Var3.b1()) {
                                            ll0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        ll0 ll0Var4 = ll0Var;
                                        if (ll0Var4.b1()) {
                                            ll0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f28182b;
        if (sparseBooleanArray != null) {
            int childCount2 = ll0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = ll0Var.getChildAt(i11);
                int p5 = yu0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    yu0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.x4(this, p5, ll0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(ll0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ll0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    ll0 ll0Var2 = ll0Var;
                                    if (ll0Var2.b1()) {
                                        ll0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ll0 ll0Var3 = ll0Var;
                                    if (ll0Var3.b1()) {
                                        ll0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ll0 ll0Var4 = ll0Var;
                                    if (ll0Var4.b1()) {
                                        ll0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                ll0Var.invalidate();
            }
        }
        return true;
    }
}
