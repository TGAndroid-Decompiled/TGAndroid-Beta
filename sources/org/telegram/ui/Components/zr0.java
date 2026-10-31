package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zr0 implements ViewTreeObserver.OnPreDrawListener {
    public final tk0 f33155a;
    public final SparseBooleanArray f33156b;
    public final View f33157c;
    public final int d;
    public final zt0 e;

    public zr0(zt0 zt0Var, tk0 tk0Var, SparseBooleanArray sparseBooleanArray, zz zzVar, int i10) {
        this.e = zt0Var;
        this.f33155a = tk0Var;
        this.f33156b = sparseBooleanArray;
        this.f33157c = zzVar;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        zt0 zt0Var = this.e;
        zt0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final tk0 tk0Var = this.f33155a;
        s4.g0 adapter = tk0Var.getAdapter();
        if (adapter != zt0Var.J && adapter != zt0Var.M && adapter != zt0Var.O && adapter != zt0Var.N) {
            int childCount = tk0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = tk0Var.getChildAt(i10);
                View view = this.f33157c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(tk0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / tk0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    tk0 tk0Var2 = tk0Var;
                                    if (tk0Var2.b1()) {
                                        tk0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    tk0 tk0Var3 = tk0Var;
                                    if (tk0Var3.b1()) {
                                        tk0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tk0 tk0Var4 = tk0Var;
                                    if (tk0Var4.b1()) {
                                        tk0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    tk0Var.addView(view);
                    s4.n0 layoutManager = tk0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new t60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        tk0 tk0Var2 = tk0Var;
                                        if (tk0Var2.b1()) {
                                            tk0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        tk0 tk0Var3 = tk0Var;
                                        if (tk0Var3.b1()) {
                                            tk0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        tk0 tk0Var4 = tk0Var;
                                        if (tk0Var4.b1()) {
                                            tk0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f33156b;
        if (sparseBooleanArray != null) {
            int childCount2 = tk0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int n10 = zt0.n(tk0Var.getChildAt(i11));
                if (n10 != 0 && sparseBooleanArray.get(n10, false)) {
                    zt0Var.R1.put(n10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new jg.p(this, n10, tk0Var));
                    ofFloat3.addListener(new bi.d5(this, n10, 12));
                    ofFloat3.setStartDelay((int) ((Math.min(tk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / tk0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    tk0 tk0Var2 = tk0Var;
                                    if (tk0Var2.b1()) {
                                        tk0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    tk0 tk0Var3 = tk0Var;
                                    if (tk0Var3.b1()) {
                                        tk0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    tk0 tk0Var4 = tk0Var;
                                    if (tk0Var4.b1()) {
                                        tk0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                tk0Var.invalidate();
            }
        }
        return true;
    }
}
