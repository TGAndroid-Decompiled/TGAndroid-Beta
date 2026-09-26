package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ft0 implements ViewTreeObserver.OnPreDrawListener {
    public final xl0 f24313a;
    public final SparseBooleanArray f24314b;
    public final View f24315c;
    public final int d;
    public final kv0 e;

    public ft0(kv0 kv0Var, xl0 xl0Var, SparseBooleanArray sparseBooleanArray, v00 v00Var, int i10) {
        this.e = kv0Var;
        this.f24313a = xl0Var;
        this.f24314b = sparseBooleanArray;
        this.f24315c = v00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        kv0 kv0Var = this.e;
        kv0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final xl0 xl0Var = this.f24313a;
        s4.h0 adapter = xl0Var.getAdapter();
        if (adapter != kv0Var.H && adapter != kv0Var.K && adapter != kv0Var.M && adapter != kv0Var.L) {
            int childCount = xl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xl0Var.getChildAt(i10);
                View view = this.f24315c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(xl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / xl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xl0 xl0Var2 = xl0Var;
                                    if (xl0Var2.b1()) {
                                        xl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    xl0 xl0Var3 = xl0Var;
                                    if (xl0Var3.b1()) {
                                        xl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xl0 xl0Var4 = xl0Var;
                                    if (xl0Var4.b1()) {
                                        xl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    xl0Var.addView(view);
                    s4.o0 layoutManager = xl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new gd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        xl0 xl0Var2 = xl0Var;
                                        if (xl0Var2.b1()) {
                                            xl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        xl0 xl0Var3 = xl0Var;
                                        if (xl0Var3.b1()) {
                                            xl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        xl0 xl0Var4 = xl0Var;
                                        if (xl0Var4.b1()) {
                                            xl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f24314b;
        if (sparseBooleanArray != null) {
            int childCount2 = xl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = xl0Var.getChildAt(i11);
                int p5 = kv0.p(childAt2);
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    kv0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.w4(this, p5, xl0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 10));
                    ofFloat3.setStartDelay((int) ((Math.min(xl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / xl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xl0 xl0Var2 = xl0Var;
                                    if (xl0Var2.b1()) {
                                        xl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    xl0 xl0Var3 = xl0Var;
                                    if (xl0Var3.b1()) {
                                        xl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xl0 xl0Var4 = xl0Var;
                                    if (xl0Var4.b1()) {
                                        xl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                xl0Var.invalidate();
            }
        }
        return true;
    }
}
