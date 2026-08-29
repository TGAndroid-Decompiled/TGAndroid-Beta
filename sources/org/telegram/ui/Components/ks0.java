package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class ks0 implements ViewTreeObserver.OnPreDrawListener {
    public final jl0 f30141a;
    public final SparseBooleanArray f30142b;
    public final View f30143c;
    public final int d;
    public final qu0 f30144e;

    public ks0(qu0 qu0Var, jl0 jl0Var, SparseBooleanArray sparseBooleanArray, p00 p00Var, int i10) {
        this.f30144e = qu0Var;
        this.f30141a = jl0Var;
        this.f30142b = sparseBooleanArray;
        this.f30143c = p00Var;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        qu0 qu0Var = this.f30144e;
        qu0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final jl0 jl0Var = this.f30141a;
        f2.p0 adapter = jl0Var.getAdapter();
        if (adapter != qu0Var.D && adapter != qu0Var.G && adapter != qu0Var.I && adapter != qu0Var.H) {
            int childCount = jl0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = jl0Var.getChildAt(i10);
                View view = this.f30143c;
                if (childAt != view && RecyclerView.R(childAt) >= this.d - 1) {
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(jl0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    jl0 jl0Var2 = jl0Var;
                                    if (jl0Var2.b1()) {
                                        jl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    jl0 jl0Var3 = jl0Var;
                                    if (jl0Var3.b1()) {
                                        jl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    jl0 jl0Var4 = jl0Var;
                                    if (jl0Var4.b1()) {
                                        jl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    jl0Var.addView(view);
                    f2.w0 layoutManager = jl0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new zz(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        jl0 jl0Var2 = jl0Var;
                                        if (jl0Var2.b1()) {
                                            jl0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        jl0 jl0Var3 = jl0Var;
                                        if (jl0Var3.b1()) {
                                            jl0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        jl0 jl0Var4 = jl0Var;
                                        if (jl0Var4.b1()) {
                                            jl0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f30142b;
        if (sparseBooleanArray != null) {
            int childCount2 = jl0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = jl0Var.getChildAt(i11);
                int p10 = qu0.p(childAt2);
                if (p10 != 0 && sparseBooleanArray.get(p10, false)) {
                    qu0Var.K1.put(p10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new bg.u(this, p10, jl0Var));
                    ofFloat3.addListener(new org.telegram.ui.Cells.z3(this, p10, 7));
                    ofFloat3.setStartDelay((int) ((Math.min(jl0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jl0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    jl0 jl0Var2 = jl0Var;
                                    if (jl0Var2.b1()) {
                                        jl0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    jl0 jl0Var3 = jl0Var;
                                    if (jl0Var3.b1()) {
                                        jl0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    jl0 jl0Var4 = jl0Var;
                                    if (jl0Var4.b1()) {
                                        jl0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                jl0Var.invalidate();
            }
        }
        return true;
    }
}
