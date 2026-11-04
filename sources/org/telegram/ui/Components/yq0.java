package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class yq0 implements ViewTreeObserver.OnPreDrawListener {
    public final tj0 f40805a;
    public final SparseBooleanArray f40806b;
    public final View f40807c;
    public final int d;
    public final ws0 f40808e;

    public yq0(ws0 ws0Var, tj0 tj0Var, SparseBooleanArray sparseBooleanArray, iz izVar, int i3) {
        this.f40808e = ws0Var;
        this.f40805a = tj0Var;
        this.f40806b = sparseBooleanArray;
        this.f40807c = izVar;
        this.d = i3;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        ws0 ws0Var = this.f40808e;
        ws0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final tj0 tj0Var = this.f40805a;
        u4.h0 adapter = tj0Var.getAdapter();
        if (adapter != ws0Var.K && adapter != ws0Var.N && adapter != ws0Var.P && adapter != ws0Var.O) {
            int childCount = tj0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = tj0Var.getChildAt(i3);
                View view = this.f40807c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(tj0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / tj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    tj0 tj0Var2 = tj0Var;
                                    if (tj0Var2.b1()) {
                                        tj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    tj0 tj0Var3 = tj0Var;
                                    if (tj0Var3.b1()) {
                                        tj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tj0 tj0Var4 = tj0Var;
                                    if (tj0Var4.b1()) {
                                        tj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    tj0Var.addView(view);
                    u4.o0 layoutManager = tj0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new a60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        tj0 tj0Var2 = tj0Var;
                                        if (tj0Var2.b1()) {
                                            tj0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        tj0 tj0Var3 = tj0Var;
                                        if (tj0Var3.b1()) {
                                            tj0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        tj0 tj0Var4 = tj0Var;
                                        if (tj0Var4.b1()) {
                                            tj0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f40806b;
        if (sparseBooleanArray != null) {
            int childCount2 = tj0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o10 = ws0.o(tj0Var.getChildAt(i10));
                if (o10 != 0 && sparseBooleanArray.get(o10, false)) {
                    ws0Var.S1.put(o10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new gi.b4(this, o10, tj0Var));
                    ofFloat3.addListener(new ii.m2(this, o10, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(tj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / tj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    tj0 tj0Var2 = tj0Var;
                                    if (tj0Var2.b1()) {
                                        tj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    tj0 tj0Var3 = tj0Var;
                                    if (tj0Var3.b1()) {
                                        tj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tj0 tj0Var4 = tj0Var;
                                    if (tj0Var4.b1()) {
                                        tj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                tj0Var.invalidate();
            }
        }
        return true;
    }
}
