package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ar0 implements ViewTreeObserver.OnPreDrawListener {
    public final qj0 f31957a;
    public final SparseBooleanArray f31958b;
    public final View f31959c;
    public final int d;
    public final zs0 f31960e;

    public ar0(zs0 zs0Var, qj0 qj0Var, SparseBooleanArray sparseBooleanArray, mz mzVar, int i7) {
        this.f31960e = zs0Var;
        this.f31957a = qj0Var;
        this.f31958b = sparseBooleanArray;
        this.f31959c = mzVar;
        this.d = i7;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        zs0 zs0Var = this.f31960e;
        zs0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final qj0 qj0Var = this.f31957a;
        v4.g0 adapter = qj0Var.getAdapter();
        if (adapter != zs0Var.J && adapter != zs0Var.M && adapter != zs0Var.O && adapter != zs0Var.N) {
            int childCount = qj0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = qj0Var.getChildAt(i7);
                View view = this.f31959c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(qj0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / qj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    qj0 qj0Var2 = qj0Var;
                                    if (qj0Var2.b1()) {
                                        qj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    qj0 qj0Var3 = qj0Var;
                                    if (qj0Var3.b1()) {
                                        qj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    qj0 qj0Var4 = qj0Var;
                                    if (qj0Var4.b1()) {
                                        qj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    qj0Var.addView(view);
                    v4.n0 layoutManager = qj0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new f60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        qj0 qj0Var2 = qj0Var;
                                        if (qj0Var2.b1()) {
                                            qj0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        qj0 qj0Var3 = qj0Var;
                                        if (qj0Var3.b1()) {
                                            qj0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        qj0 qj0Var4 = qj0Var;
                                        if (qj0Var4.b1()) {
                                            qj0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f31958b;
        if (sparseBooleanArray != null) {
            int childCount2 = qj0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                int o4 = zs0.o(qj0Var.getChildAt(i10));
                if (o4 != 0 && sparseBooleanArray.get(o4, false)) {
                    zs0Var.R1.put(o4, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new fi.e4(this, o4, qj0Var));
                    ofFloat3.addListener(new hi.m2(this, o4, 13));
                    ofFloat3.setStartDelay((int) ((Math.min(qj0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qj0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    qj0 qj0Var2 = qj0Var;
                                    if (qj0Var2.b1()) {
                                        qj0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    qj0 qj0Var3 = qj0Var;
                                    if (qj0Var3.b1()) {
                                        qj0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    qj0 qj0Var4 = qj0Var;
                                    if (qj0Var4.b1()) {
                                        qj0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                qj0Var.invalidate();
            }
        }
        return true;
    }
}
