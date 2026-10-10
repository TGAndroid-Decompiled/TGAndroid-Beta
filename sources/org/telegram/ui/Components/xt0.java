package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class xt0 implements ViewTreeObserver.OnPreDrawListener {
    public final rm0 f33028a;
    public final SparseBooleanArray f33029b;
    public final View f33030c;
    public final int d;
    public final cw0 f33031e;

    public xt0(cw0 cw0Var, rm0 rm0Var, SparseBooleanArray sparseBooleanArray, k10 k10Var, int i10) {
        this.f33031e = cw0Var;
        this.f33028a = rm0Var;
        this.f33029b = sparseBooleanArray;
        this.f33030c = k10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        cw0 cw0Var = this.f33031e;
        cw0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final rm0 rm0Var = this.f33028a;
        s4.i0 adapter = rm0Var.getAdapter();
        if (adapter != cw0Var.H && adapter != cw0Var.K && adapter != cw0Var.M && adapter != cw0Var.L) {
            int childCount = rm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = rm0Var.getChildAt(i10);
                View view = this.f33030c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(rm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / rm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    rm0 rm0Var2 = rm0Var;
                                    if (rm0Var2.b1()) {
                                        rm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    rm0 rm0Var3 = rm0Var;
                                    if (rm0Var3.b1()) {
                                        rm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    rm0 rm0Var4 = rm0Var;
                                    if (rm0Var4.b1()) {
                                        rm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    rm0Var.addView(view);
                    s4.p0 layoutManager = rm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new wd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        rm0 rm0Var2 = rm0Var;
                                        if (rm0Var2.b1()) {
                                            rm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        rm0 rm0Var3 = rm0Var;
                                        if (rm0Var3.b1()) {
                                            rm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        rm0 rm0Var4 = rm0Var;
                                        if (rm0Var4.b1()) {
                                            rm0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f33029b;
        if (sparseBooleanArray != null) {
            int childCount2 = rm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int p5 = cw0.p(rm0Var.getChildAt(i11));
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    cw0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.v4(this, p5, rm0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(rm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / rm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    rm0 rm0Var2 = rm0Var;
                                    if (rm0Var2.b1()) {
                                        rm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    rm0 rm0Var3 = rm0Var;
                                    if (rm0Var3.b1()) {
                                        rm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    rm0 rm0Var4 = rm0Var;
                                    if (rm0Var4.b1()) {
                                        rm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                rm0Var.invalidate();
            }
        }
        return true;
    }
}
