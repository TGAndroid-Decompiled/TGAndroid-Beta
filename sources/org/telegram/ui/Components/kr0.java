package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class kr0 implements ViewTreeObserver.OnPreDrawListener {
    public final ek0 f36960a;
    public final SparseBooleanArray f36961b;
    public final View f36962c;
    public final int d;
    public final jt0 f36963e;

    public kr0(jt0 jt0Var, ek0 ek0Var, SparseBooleanArray sparseBooleanArray, yz yzVar, int i7) {
        this.f36963e = jt0Var;
        this.f36960a = ek0Var;
        this.f36961b = sparseBooleanArray;
        this.f36962c = yzVar;
        this.d = i7;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        jt0 jt0Var = this.f36963e;
        jt0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final ek0 ek0Var = this.f36960a;
        v4.i0 adapter = ek0Var.getAdapter();
        if (adapter != jt0Var.K && adapter != jt0Var.N && adapter != jt0Var.P && adapter != jt0Var.O) {
            int childCount = ek0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = ek0Var.getChildAt(i7);
                View view = this.f36962c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    ek0 ek0Var2 = ek0Var;
                                    if (ek0Var2.b1()) {
                                        ek0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ek0 ek0Var3 = ek0Var;
                                    if (ek0Var3.b1()) {
                                        ek0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ek0 ek0Var4 = ek0Var;
                                    if (ek0Var4.b1()) {
                                        ek0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    ek0Var.addView(view);
                    v4.p0 layoutManager = ek0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new s60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        ek0 ek0Var2 = ek0Var;
                                        if (ek0Var2.b1()) {
                                            ek0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        ek0 ek0Var3 = ek0Var;
                                        if (ek0Var3.b1()) {
                                            ek0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        ek0 ek0Var4 = ek0Var;
                                        if (ek0Var4.b1()) {
                                            ek0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f36961b;
        if (sparseBooleanArray != null) {
            int childCount2 = ek0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o4 = jt0.o(ek0Var.getChildAt(i10));
                if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                    jt0Var.S1.put(o4, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new hi.z3(this, o4, ek0Var));
                    ofFloat3.addListener(new ki.e2(this, o4, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    ek0 ek0Var2 = ek0Var;
                                    if (ek0Var2.b1()) {
                                        ek0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    ek0 ek0Var3 = ek0Var;
                                    if (ek0Var3.b1()) {
                                        ek0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    ek0 ek0Var4 = ek0Var;
                                    if (ek0Var4.b1()) {
                                        ek0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                ek0Var.invalidate();
            }
        }
        return true;
    }
}
