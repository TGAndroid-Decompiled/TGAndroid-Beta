package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class wt0 implements ViewTreeObserver.OnPreDrawListener {
    public final qm0 f32673a;
    public final SparseBooleanArray f32674b;
    public final View f32675c;
    public final int d;
    public final bw0 f32676e;

    public wt0(bw0 bw0Var, qm0 qm0Var, SparseBooleanArray sparseBooleanArray, j10 j10Var, int i10) {
        this.f32676e = bw0Var;
        this.f32673a = qm0Var;
        this.f32674b = sparseBooleanArray;
        this.f32675c = j10Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        bw0 bw0Var = this.f32676e;
        bw0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final qm0 qm0Var = this.f32673a;
        s4.i0 adapter = qm0Var.getAdapter();
        if (adapter != bw0Var.H && adapter != bw0Var.K && adapter != bw0Var.M && adapter != bw0Var.L) {
            int childCount = qm0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = qm0Var.getChildAt(i10);
                View view = this.f32675c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(qm0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / qm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    qm0 qm0Var2 = qm0Var;
                                    if (qm0Var2.b1()) {
                                        qm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    qm0 qm0Var3 = qm0Var;
                                    if (qm0Var3.b1()) {
                                        qm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    qm0 qm0Var4 = qm0Var;
                                    if (qm0Var4.b1()) {
                                        qm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    qm0Var.addView(view);
                    s4.p0 layoutManager = qm0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new vd0(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        qm0 qm0Var2 = qm0Var;
                                        if (qm0Var2.b1()) {
                                            qm0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        qm0 qm0Var3 = qm0Var;
                                        if (qm0Var3.b1()) {
                                            qm0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        qm0 qm0Var4 = qm0Var;
                                        if (qm0Var4.b1()) {
                                            qm0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f32674b;
        if (sparseBooleanArray != null) {
            int childCount2 = qm0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int p5 = bw0.p(qm0Var.getChildAt(i11));
                if (p5 != 0 && sparseBooleanArray.get(p5, false)) {
                    bw0Var.O1.put(p5, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ci.v4(this, p5, qm0Var));
                    ofFloat3.addListener(new ei.v2(this, p5, 11));
                    ofFloat3.setStartDelay((int) ((Math.min(qm0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qm0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    qm0 qm0Var2 = qm0Var;
                                    if (qm0Var2.b1()) {
                                        qm0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    qm0 qm0Var3 = qm0Var;
                                    if (qm0Var3.b1()) {
                                        qm0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    qm0 qm0Var4 = qm0Var;
                                    if (qm0Var4.b1()) {
                                        qm0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                qm0Var.invalidate();
            }
        }
        return true;
    }
}
