package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ss0 implements ViewTreeObserver.OnPreDrawListener {
    public final sl0 f28811a;
    public final SparseBooleanArray f28812b;
    public final View f28813c;
    public final int d;
    public final yu0 e;

    public ss0(yu0 yu0Var, sl0 sl0Var, SparseBooleanArray sparseBooleanArray, t00 t00Var, int i10) {
        this.e = yu0Var;
        this.f28811a = sl0Var;
        this.f28812b = sparseBooleanArray;
        this.f28813c = t00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        yu0 yu0Var = this.e;
        yu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final sl0 sl0Var = this.f28811a;
        f2.o0 adapter = sl0Var.getAdapter();
        if (adapter != yu0Var.E && adapter != yu0Var.H && adapter != yu0Var.J && adapter != yu0Var.I) {
            int childCount = sl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = sl0Var.getChildAt(i10);
                View view = this.f28813c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    sl0 sl0Var2 = sl0Var;
                                    if (sl0Var2.b1()) {
                                        sl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    sl0 sl0Var3 = sl0Var;
                                    if (sl0Var3.b1()) {
                                        sl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    sl0 sl0Var4 = sl0Var;
                                    if (sl0Var4.b1()) {
                                        sl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    sl0Var.addView(view);
                    f2.v0 layoutManager = sl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new nd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        sl0 sl0Var2 = sl0Var;
                                        if (sl0Var2.b1()) {
                                            sl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        sl0 sl0Var3 = sl0Var;
                                        if (sl0Var3.b1()) {
                                            sl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        sl0 sl0Var4 = sl0Var;
                                        if (sl0Var4.b1()) {
                                            sl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f28812b;
        if (sparseBooleanArray != null) {
            int childCount2 = sl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = sl0Var.getChildAt(i11);
                int p10 = yu0.p(childAt2);
                if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                    yu0Var.L1.put(p10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new dg.t(this, p10, sl0Var));
                    ofFloat3.addListener(new org.telegram.ui.Cells.b4(this, p10, 7));
                    ofFloat3.setStartDelay((int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    sl0 sl0Var2 = sl0Var;
                                    if (sl0Var2.b1()) {
                                        sl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    sl0 sl0Var3 = sl0Var;
                                    if (sl0Var3.b1()) {
                                        sl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    sl0 sl0Var4 = sl0Var;
                                    if (sl0Var4.b1()) {
                                        sl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                sl0Var.invalidate();
            }
        }
        return true;
    }
}
