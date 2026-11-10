package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zq0 implements ViewTreeObserver.OnPreDrawListener {
    public final pj0 f41094a;
    public final SparseBooleanArray f41095b;
    public final View f41096c;
    public final int d;
    public final ys0 f41097e;

    public zq0(ys0 ys0Var, pj0 pj0Var, SparseBooleanArray sparseBooleanArray, lz lzVar, int i7) {
        this.f41097e = ys0Var;
        this.f41094a = pj0Var;
        this.f41095b = sparseBooleanArray;
        this.f41096c = lzVar;
        this.d = i7;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        ys0 ys0Var = this.f41097e;
        ys0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final pj0 pj0Var = this.f41094a;
        v4.g0 adapter = pj0Var.getAdapter();
        if (adapter != ys0Var.J && adapter != ys0Var.M && adapter != ys0Var.O && adapter != ys0Var.N) {
            int childCount = pj0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = pj0Var.getChildAt(i7);
                View view = this.f41096c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(pj0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / pj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    pj0 pj0Var2 = pj0Var;
                                    if (pj0Var2.b1()) {
                                        pj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    pj0 pj0Var3 = pj0Var;
                                    if (pj0Var3.b1()) {
                                        pj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    pj0 pj0Var4 = pj0Var;
                                    if (pj0Var4.b1()) {
                                        pj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    pj0Var.addView(view);
                    v4.n0 layoutManager = pj0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new e60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        pj0 pj0Var2 = pj0Var;
                                        if (pj0Var2.b1()) {
                                            pj0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        pj0 pj0Var3 = pj0Var;
                                        if (pj0Var3.b1()) {
                                            pj0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        pj0 pj0Var4 = pj0Var;
                                        if (pj0Var4.b1()) {
                                            pj0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f41095b;
        if (sparseBooleanArray != null) {
            int childCount2 = pj0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o4 = ys0.o(pj0Var.getChildAt(i10));
                if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                    ys0Var.R1.put(o4, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new fi.e4(this, o4, pj0Var));
                    ofFloat3.addListener(new hi.m2(this, o4, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(pj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / pj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    pj0 pj0Var2 = pj0Var;
                                    if (pj0Var2.b1()) {
                                        pj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    pj0 pj0Var3 = pj0Var;
                                    if (pj0Var3.b1()) {
                                        pj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    pj0 pj0Var4 = pj0Var;
                                    if (pj0Var4.b1()) {
                                        pj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                pj0Var.invalidate();
            }
        }
        return true;
    }
}
