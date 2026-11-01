package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class as0 implements ViewTreeObserver.OnPreDrawListener {
    public final uk0 f24483a;
    public final SparseBooleanArray f24484b;
    public final View f24485c;
    public final int d;
    public final au0 e;

    public as0(au0 au0Var, uk0 uk0Var, SparseBooleanArray sparseBooleanArray, zz zzVar, int i10) {
        this.e = au0Var;
        this.f24483a = uk0Var;
        this.f24484b = sparseBooleanArray;
        this.f24485c = zzVar;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        au0 au0Var = this.e;
        au0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        final uk0 uk0Var = this.f24483a;
        s4.g0 adapter = uk0Var.getAdapter();
        if (adapter != au0Var.J && adapter != au0Var.M && adapter != au0Var.O && adapter != au0Var.N) {
            int childCount = uk0Var.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = uk0Var.getChildAt(i10);
                View view = this.f24485c;
                if (childAt2 != view && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(uk0Var.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / uk0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    uk0 uk0Var2 = uk0Var;
                                    if (uk0Var2.b1()) {
                                        uk0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    uk0 uk0Var3 = uk0Var;
                                    if (uk0Var3.b1()) {
                                        uk0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    uk0 uk0Var4 = uk0Var;
                                    if (uk0Var4.b1()) {
                                        uk0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (view != null && view.getParent() == null) {
                    uk0Var.addView(view);
                    s4.n0 layoutManager = uk0Var.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new t60(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r1) {
                                    case 0:
                                        uk0 uk0Var2 = uk0Var;
                                        if (uk0Var2.b1()) {
                                            uk0Var2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        uk0 uk0Var3 = uk0Var;
                                        if (uk0Var3.b1()) {
                                            uk0Var3.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        uk0 uk0Var4 = uk0Var;
                                        if (uk0Var4.b1()) {
                                            uk0Var4.invalidate();
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
        SparseBooleanArray sparseBooleanArray = this.f24484b;
        if (sparseBooleanArray != null) {
            int childCount2 = uk0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                int n10 = au0.n(uk0Var.getChildAt(i11));
                if (n10 != 0 && sparseBooleanArray.get(n10, false)) {
                    au0Var.R1.put(n10, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new jg.p(this, n10, uk0Var));
                    ofFloat3.addListener(new bi.d5(this, n10, 12));
                    ofFloat3.setStartDelay((int) ((Math.min(uk0Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / uk0Var.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r1) {
                                case 0:
                                    uk0 uk0Var2 = uk0Var;
                                    if (uk0Var2.b1()) {
                                        uk0Var2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    uk0 uk0Var3 = uk0Var;
                                    if (uk0Var3.b1()) {
                                        uk0Var3.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    uk0 uk0Var4 = uk0Var;
                                    if (uk0Var4.b1()) {
                                        uk0Var4.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                uk0Var.invalidate();
            }
        }
        return true;
    }
}
